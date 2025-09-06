package inputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
	// 3개의 정수를 한 번에 입력 받은 후
	// 세 정수의 곱셉을 출력
	// sc.next()만 사용
	
		Scanner sc = new Scanner(System.in);
		String message = "3개의 정수를 입력하시오.\nex) 10 20 30", str1 = null, str2 = null, str3 = null,
				format = "%d * %d * %d = %d";
		int num1 = 0, num2 = 0, num3 = 0;
	
		System.out.println(message);
		str1 = sc.next();
		str2 = sc.next();
		str3 = sc.next();
		num1 = Integer.parseInt(str1);
		num2 = Integer.parseInt(str2);
		num3 = Integer.parseInt(str3);
		
		System.out.printf(format, str1, str2, str3, num1, num2, num3);
		
	}

}
