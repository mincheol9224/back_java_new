package controlStatement;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
// switch 문은 답을 이미 알고 있을 때 사용한다.
		Scanner sc = new Scanner(System.in);
		String message ="MBTI를 입력하세요.\nex) ISFP", mbti = null;
		
		System.out.println(message);
		mbti = sc.next();
		
		switch(mbti) {
		case "ENFP":
			System.out.println("게으르고 노답!");
			 break;
		case "ISTP":
			System.out.println("반항가 기질이 있음!");
			break;
		case "ESFP":
			System.out.println("고집이 쎄다!");
		case "ESTJ":
			System.out.println("설명충!");
			break;
		  default:
			  break;
		}
	}
}
