package controlStatement;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//	"백반", "돈까스", "짜장면", "우동", "해장국", "샐러드"
//	점심네류 입력받아서
//	백반이 아노면 "오늘의 점심!" 이라고 출력
// 	아니라면 "배승원 컨펌!"
		Scanner sc = new Scanner(System.in);
	 String message = "점심메뉴를 입력하세요\nex)잘하는 배승원의 베스트메뉴", menu = null;
	 System.out.println(message);
	 
	 menu = sc.next();
	 if(menu .equals("백반")) {
		 System.out.println("오늘의 점심!");
	 }else if(menu .equals( "돈까스")) {
		 System.out.println("배승원 개돼지!");
	 }else if(menu .equals("짜장면")) {
		 System.out.println("배승원 짱깨 개좋아함!");
	 }else if(menu .equals( "우동")) {
		 System.out.println("통통한 배승원의 먹방쇼!");
	 }else if(menu .equals("해장국")) {
		 System.out.println("술고래 배승원은 해장국!");
	 }else if(menu .equals( "샐려드")) {
		 System.out.println("배승원 개돼지 다이어트 필요!");
	 }else {
		 System.out.println("그게 아니면 굶어");
	 }
	 
	}
}
