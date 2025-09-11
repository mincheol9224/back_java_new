package inputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
		// 사용자에게 정수를 2개를 입력 받고,
		// 두 수를 더해서 출력하기
		// 30
		// 50
		// 출력: 80
//	Scanner sc = new Scanner(System.in);
//	String message = "두 수의 정수를 입력하시오.\nex)10 20", resultMessage = "첫 번째 정수: %s\n두 번째 정수: %s\n + %d + %d = %d",
//			str1 = null, str2 = null;
//	int num1 = 0, num2 = 0, result = 0;
//	
//	System.out.println(message);
//	str1 = sc.next();
//	str2 = sc.next();
//	num1 = Integer.parseInt(str1);
//	num2 = Integer.parseInt(str2);
//	result = num1 + num2;
//	
//	System.out.printf(resultMessage, str1, str2,num1,num2,result);
	
	  Scanner sc = new Scanner(System.in);
	  String message = "정수 2개를 입력하세요.\nex) 10 20", str1 = null, str2 = null,
			   resultMessage = "첫번째 정수: %s\n두번째 정수: %s\n%d + %d = %d", integerResult = null;
	  int num1 = 0, num2 = 0, result = 0;
	  
	  System.out.println(message);
	  str1 = sc.next();
	  str2 = sc.next();
	  num1 = Integer.parseInt(str1);
	  num2 = Integer.parseInt(str2);
	  result = num1 + num2;
	  
	  System.out.printf(resultMessage,str1, str2, num1, num2 , result );
		
		
	}
}
