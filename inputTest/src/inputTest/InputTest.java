package inputTest;

// ctrl + shift + o
// 자동 임포트
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "이름을 입력하세요", name = null,
				lastName = null, firstName = null;
		
		System.out.println(message);
//		lastName = sc.next();
//		firstName = sc.next();
	    name = sc.nextLine(); // 공백문자까지 값을로 인식한다.
	    
		System.out.println(name + "님 환영합니다.");
		
	}
}
