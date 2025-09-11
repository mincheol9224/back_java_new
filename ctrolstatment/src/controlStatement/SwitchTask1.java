package controlStatement;

import java.util.Scanner;

public class SwitchTask1 {
	public static void main(String[] args) {
//	계절을 맞추는 프로그램
//	겨울 12 1 2      //0
//	봄	3 4 5      // 1
//	여름 6 7 8      // 2
//	가을 9 10 11    // 3
//  입력) 10
//  출력) 10월은 가을 입니다.
	Scanner sc = new Scanner(System.in);
	String message = "알고 싶은 계절의 달을 입력하시오\nex) 10",
			seasonMessag = "";
	int month = 0, season = 0;
	
	System.out.println(message);
	month = sc.nextInt();
	season = month / 3 % 4;
	
	switch(season) {
	case 0:
		seasonMessag = month + "월은 겨울 입니다.";
		break;
	case 1:
		seasonMessag = month + "월은 봄 입니다.";
		break;
	case 2:
		seasonMessag = month + "월은 여름 입니다.";
		break;
	case 3:
		seasonMessag = month + "월은 가을 입니다.";
	   default:
		 break;
	}
	
	System.out.println(seasonMessag);
	
		
		
		
		
		
//	Scanner sc = new Scanner(System.in);
//    String message = "알고 싶은 계절의 달을 입력 하세요\nex) 10",
//    		seasonMssage = "";
//    int month = 0, season = 0;
//    
//    System.out.println(message);
//    month = sc.nextInt();
//    season = month / 3 % 4;
//
//    switch(season) {
//    case 0:
//    	seasonMssage = month + "월은 겨울입니다.";
//    	break;
//    case 1:
//    	seasonMssage = month + "월은 봄입니다.";
//    	break;
//    case 2:
//    	seasonMssage = month + "월은 여음입니다.";
//    	break;
//    case 3:
//    	seasonMssage = month + "월은 가을입니다.";
//    	break;
//      default:
//    	break;
//    }
//    
//      System.out.printf(seasonMssage);
		
    
    
	
	}
}
