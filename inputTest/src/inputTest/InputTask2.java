package inputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
//	3개의 정수를 한 번에 입력 받은 후
// 	세 정수의 곱셈을 출력
//  sc.next()만 사용
		
		Scanner sc = new Scanner(System.in);
		String message = "정수 세 개를 입력하세요.\nex) 10 20 30",
				format = "%d * %d * %d = %d";
		int num1 = 0, num2 = 0, num3 = 0, result = 0;
		
		System.out.println(message);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		// sc.close 외부장치를 다쓰고 나면 닫아준다.
		sc.close();
		result = num1 * num2 * num3;
		
		System.out.printf(format, num1, num2, num3, result);
	}
}
