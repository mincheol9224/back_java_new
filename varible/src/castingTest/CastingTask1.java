package castingTest;
//8.43 + 2.59를 더한 값이 10이 되도록 출력 (형변환)


public class CastingTask1 {
    public static void main(String[] args) {
    	double num1 = 8.43, num2 = 2.59;
    	int result = 0;
    	
    	result = (int)num1 + (int)num2;
    	System.out.printf("%.1f + %.1f = %d로 강제 형변환", num1, num2, result);
    	
       System.out.println("");
       
//		 자동 형변환
//       문자형(char) + 정수(int) = 정수
       System.out.println('A' * 100);
       System.out.println((char) ('A' * 100));
	}
}
