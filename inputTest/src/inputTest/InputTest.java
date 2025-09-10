package inputTest;

import java.util.Scanner;

// ctrl + shift + o
// 자동 import

public class InputTest {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "이름을 입력하세요!", firstname = null, lastname = null, name = null;
		
		System.out.println(message);
//		firstname = sc.next();
//		lastname = sc.next();
		name = sc.nextLine();
		
		// sc.nextLine(); 공백문자까지 하나로 봄 ,sc.next(); 는 공백이 발생하면
		// 하나를 더써줘야 하는데
		
		System.out.println(name + "님 환형합니다.");
	}
}
