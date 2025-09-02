package inputTest;

import java.util.Scanner;

// ctrl + shift + o
// 자동 import



public class InputTest {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "이름을 입력하세요", name = null,
			lastName = null, firstName = null;
				
		
		System.out.println(message);
//		lastName = sc.next();
//		firstName = sc.next();
		name = sc.nextLine(); // 공배 문자까지를 하나로 값으로 처리하는 next
		
		
		
		System.out.println(lastName + firstName + "님 환영합니다.");
	}
}
