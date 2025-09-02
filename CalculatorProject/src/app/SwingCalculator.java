package app; // 소스 파일이 속한 패키지 이름

import javax.swing.*; // Swing GUI 컴포넌트들(JButton, JFrame, JTextField 등)
import java.awt.*;    // 레이아웃/폰트 등 AWT 관련 클래스
import java.awt.event.ActionEvent; // 버튼 클릭 시 전달되는 이벤트 객체

public class SwingCalculator extends JFrame { // JFrame을 상속한 계산기 창 클래스
    private final JTextField display = new JTextField("0"); // 결과/입력 표시창, 초기값 "0"
    private double currentValue = 0.0;   // 누적 값(왼쪽 피연산자) 보관
    private String pendingOp = null;     // 직전에 눌린 연산자("+", "-", "*", "/") 보관
    private boolean startNew = true;     // 다음 숫자 입력 시 새로 시작할지 여부(표시창 교체/추가 결정)

    public SwingCalculator() {           // 생성자: UI 구성
        super("계산기");                  // JFrame 제목 설정
        setDefaultCloseOperation(EXIT_ON_CLOSE); // 창 닫으면 프로그램 종료
        setLayout(new BorderLayout(8, 8));       // 여백 8px짜리 BorderLayout 사용

        display.setHorizontalAlignment(SwingConstants.RIGHT); // 숫자 오른쪽 정렬
        display.setEditable(false);                            // 직접 타이핑 금지(버튼만 입력)
        display.setFont(display.getFont().deriveFont(Font.BOLD, 28f)); // 표시창 폰트 굵게/크게
        add(display, BorderLayout.NORTH);  // 표시창을 상단 영역에 배치

        JPanel topRow = new JPanel(new GridLayout(1, 2, 8, 8)); // 1행 2열: C, ± 버튼 구역
        topRow.add(makeButton("C", e -> clearAll())); // C(초기화) 버튼 생성/핸들러 연결
        topRow.add(makeButton("±", e -> toggleSign())); // ±(부호 변경) 버튼
        add(topRow, BorderLayout.WEST); // 왼쪽에 배치(배치는 취향대로 바꿔도 됨)

        JPanel grid = new JPanel(new GridLayout(4, 4, 8, 8)); // 4x4 버튼 그리드
        String[] labels = { // 버튼 표시 텍스트 배열(순서대로 배치됨)
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "0",".","=","+"
        };
        for (String lb : labels) {                       // 각 텍스트에 대해
            grid.add(makeButton(lb, this::handleCommand)); // 버튼 만들고 공용 핸들러 연결
        }
        add(grid, BorderLayout.CENTER); // 숫자/연산 버튼 그리드를 가운데 배치

        setSize(500, 500);     // 창 크기
        setLocationRelativeTo(null); // 화면 중앙 배치
    }

    private JButton makeButton(String text, java.util.function.Consumer<ActionEvent> handler) {
        JButton btn = new JButton(text);                           // 라벨이 text인 버튼 생성
        btn.setFont(btn.getFont().deriveFont(Font.PLAIN, 20f));    // 버튼 폰트 크기 조정
        btn.addActionListener(e -> handler.accept(e));             // 클릭 시 전달받은 핸들러 실행
        return btn;                                                // 만들어진 버튼 반환
    }

    private void handleCommand(ActionEvent e) { // 숫자/점/연산/= 모두 처리하는 공용 핸들러
        String cmd = ((JButton)e.getSource()).getText(); // 어떤 버튼인지 텍스트로 구분

        if (isDigitOrDot(cmd)) { // 숫자 또는 '.' 인가?
            if (startNew || display.getText().equals("0")) {          // 새 입력 시작이거나 현재 "0"이면
                display.setText(cmd.equals(".") ? "0." : cmd);         // "0." 또는 숫자로 교체
                startNew = false;                                      // 이제 이어쓰기 모드
            } else {                                                   // 이어쓰기
                if (cmd.equals(".") && display.getText().contains(".")) return; // 점 중복 방지
                display.setText(display.getText() + cmd);              // 뒤에 이어 붙임
            }
            return; // 숫자/점 처리 끝났으니 종료
        }

        double value = parseDisplay(); // 현재 표시창 숫자 파싱(오른쪽 피연산자)
        if ("=".equals(cmd)) {         // = 인가?
            if (pendingOp != null) {   // 이전에 대기 중인 연산이 있으면 계산
                currentValue = compute(currentValue, value, pendingOp); // 누적값 (op) 현재값
                displayResult(currentValue); // 결과 표시(정수면 .0 제거)
                pendingOp = null;      // 연산 대기 해제
                startNew = true;       // 다음 숫자는 새로 입력 시작
            }
        } else { // +, -, *, / 중 하나인 경우
            if (pendingOp == null) { // 아직 대기 연산 없으면
                currentValue = value; // 현재 값을 누적값으로 채택
            } else if (!startNew) {  // 대기 연산이 있고, 방금 숫자를 새로 입력했다면
                currentValue = compute(currentValue, value, pendingOp); // 중간 계산
                displayResult(currentValue); // 중간 결과 표시
            }
            pendingOp = cmd;   // 방금 누른 연산을 다음을 위한 대기 연산으로 설정
            startNew = true;   // 다음 숫자는 새로 입력 시작
        }
    }

    private boolean isDigitOrDot(String s) { // 한 글자 숫자 또는 '.' 인지 검사
        return s.length() == 1 && (Character.isDigit(s.charAt(0)) || ".".equals(s));
    }

    private double parseDisplay() { // 표시창의 문자열을 double로 변환
        try {
            return Double.parseDouble(display.getText());
        } catch (NumberFormatException e) {
            return 0.0; // 혹시 파싱 실패하면 0으로
        }
    }

    private void displayResult(double v) { // 결과를 표시창 문자열로 예쁘게 세팅
        String text = (Math.floor(v) == v) ? String.valueOf((long)v) : String.valueOf(v); // 정수면 소수점 제거
        display.setText(text); // 표시
    }

    private double compute(double a, double b, String op) { // 실제 사칙연산 수행
        switch (op) {
            case "+": return a + b; // 덧셈
            case "-": return a - b; // 뺄셈
            case "*": return a * b; // 곱셈
            case "/":               // 나눗셈
                if (b == 0) { // 0으로 나누기 방지
                    JOptionPane.showMessageDialog(this, "0으로 나눌 수 없습니다.", "오류", JOptionPane.ERROR_MESSAGE);
                    return a; // 에러 안내 후 기존 값 유지
                }
                return a / b;
            default:  return b; // 알 수 없는 op면 오른쪽 값 그대로 반환
        }
    }

    private void clearAll() {   // C: 모든 상태 초기화
        display.setText("0");
        currentValue = 0.0;
        pendingOp = null;
        startNew = true;
    }

    private void toggleSign() { // ±: 부호 반전
        double v = parseDisplay(); // 현재 표시 숫자
        v = -v;                    // 부호 반전
        displayResult(v);          // 표시
    }

    public static void main(String[] args) { // 프로그램 진입점
        SwingUtilities.invokeLater(() -> new SwingCalculator().setVisible(true)); // EDT에서 창 띄우기
    }
}
