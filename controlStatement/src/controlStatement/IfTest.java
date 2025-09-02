package controlStatement;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//      "백반", "돈까스", "짜장면", "우동", "해장국", "샐러드"
//      점심메뉴 입력을 받아서
//      백반이 나오면 "오늘의 점심!" 이라고 출력
//      아니라면 "잘하는 배승원 컨펌!"

		Scanner sc = new Scanner(System.in);

		String message = "오늘의 점심 메뉴를 입력하세요.\nex)짜장면", menu = null;

		System.out.println(message);

		menu = sc.next();

		if (menu == "백반") {
			System.out.println("오늘의 점심 메뉴는 백반입니다.");
		} else if (menu == "돈까스") {
			System.out.println("오늘의 점심 메뉴는 돈까스입니다.");
		} else if (menu == "짜장면") {
			System.out.println("오늘의 점심 메뉴는 짜장면입니다.");
		} else if (menu == "우동") {
			System.out.println("오늘의 점심 메뉴는 우동입니다.");
		} else if (menu == "해장국") {
			System.out.println("오늘의 점심 메뉴는 해장국입니다.");
		} else if (menu == "샐러드") {
			System.out.println("오늘의 점심 메뉴는 샐러드입니다.");
		} else {
			System.out.println("쳐먹지 마세요.");
		}
		
	}
}
