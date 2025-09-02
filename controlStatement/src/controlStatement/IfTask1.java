package controlStatement;

import java.util.Scanner;

public class IfTask1 {
    public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String message = "두 수의 크기 비교할 두수를 입력하세요.\nex) 10 20",
				 resutlMessage = "큰값: %d 작은값: %d";
		   int num1 = 0, num2 = 0, bignum = 0, smallnum = 0;
		 
		System.out.println(message);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			bignum = num1;
			smallnum = num2;
		}else if(num1 < num2) {
			bignum = num2;
			smallnum = num1;
		}
		System.out.printf("큰값: %d 작은값: %d", bignum, smallnum);	 
//		System.out.printf(resutlMessage, bignum, smallnum);	 
	}
}
