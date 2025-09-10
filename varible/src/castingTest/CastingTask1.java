package castingTest;

public class CastingTask1 {
  public static void main(String[] args) {
	// 8.43 + 2.59를 더한 값이 10이 되로록 출력 (형변환)
//	 String message = "%.1f + %.1f = %d = 강제형변환";
//     double num1 = 8.43, num2 = 2.59;
//     int result = 0;
//     
//      result = (int)num1 + (int)num2;
//      System.out.printf(message,num1, num2, result);
	  String message = "%.1f + %.1f = %d로 강제 형변환";
	  double num1 = 8.43, num2 = 2.59;
	  int result = 0;
	  
	  
	  result = (int)8.43 + (int)2.59;
	  System.out.printf(message, num1, num2, result);
	  
  
      
//      System.out.println((int)'A' + 10);
//      System.out.println("");
//      
//      // 자동 형변환
//      // 문자형(char) +정수(int) = 정수
//      System.out.println('A' * 100); // 6500
//      System.out.println((char)('A' * 100)); // * 비밀번호 만들때나 실무에서 쓰임
      
 }
}
