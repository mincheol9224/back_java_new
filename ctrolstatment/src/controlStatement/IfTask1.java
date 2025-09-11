package controlStatement;

import java.util.Scanner;

public class IfTask1 {
	public static void main(String[] args) {
//		두 수의 크기 비교
//  	입력: 10 20
//		출력: 큰 값:20, 작은 값: 10
//		if문으로
     	Scanner sc = new Scanner(System.in);
//		String message = "두수를 입력하세요.\nex) 10 20", 
//			equalsMessage = "두 수가 같습니다.",
//			resultMessage = "입력\n출력\n큰값: %d, 작은 값: %d",
//			result = "";
//		int num1 = 0, num2 = 0, min = 0, max = 0;
//		
//		System.out.println(message);
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		sc.close();
//// 		* 주소를 사용해야하는 이유
//		if(num1 == num2) {
//			System.out.println(equalsMessage);
//		}else if(num1 > num2) {
//			 max = num1;
//			 min = num2;
//		}else if(num1 < num2) {
//			max = num2;
//			min = num1;
//		}else {
//			
//		}
//		result = resultMessage;
//		System.out.printf(result,num1, num2, min, max);
//		
		
		
		
		
		
		
		
		
		
		
		String message = "두 수의 정수를 입력하세요\nex) 10 20",data1 = null, data2 = null,
		 equalsMessage = "두 수가 같습니다",
		 resultMessage = "입력\n첫 번재 정수: %d\n두 번째 정수: %d\n큰 값: %d, 작은 값: %d",
		 result = "";
		int num1 = 0, num2 = 0, min = 0, max = 0;
		
		System.out.println(message);
		data1 = sc.next();
		data2 = sc.next();
		num1 = Integer.parseInt(data1); // 정수
		num2 = Integer.parseInt(data2); // 정수
		
		if(num1 == num2) {
			System.out.println(equalsMessage);
		}else if(num1 > num2) {
			max = num1;
			min = num2;
		}else if(num1 < num2) {
			max = num2;
			min = num1;
		}else {
			
		}  
		   result = resultMessage;
		   System.out.printf(result, num1, num2, max, min);
//		
		
		
//		String message = "두 정수를 입력하시오.\nex) 10 20",
//				result = "", equalsMessage = "두 수가 같습니다.",
//			resultMessag = "입력\n첫 번째 정수: %d\n두 번째 정수: %d\n큰 값: %d, 작은 값: %d";
//		int num1 = 0, num2 = 0, min = 0, max = 0;
//		
//		System.out.println(message);
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//	    
//		if(num1 == num2) {
//			System.out.println(equalsMessage);
//		}else if(num1 > num2) {
//			min = num2;
//			max = num1;
//		}else if(num1 < num2) {
//			min = num1;
//			max = num2;
//		}else {
//			
//		}
//		result = resultMessag;
//		System.out.printf(result, num1, num2, min, max);
		
	}
}
