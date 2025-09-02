package operater;

import java.util.Scanner;

public class OperTask2 {
   public static void main(String[] args) {
//      3개의 입력값 중 중간값 찾기
//      17 25 35
//      10 3 8
//      sc.next();
//      sc.nextint();
//      입력예시: 10 3 8
//      출력예시: 중간값: 8
		Scanner sc = new Scanner(System.in);
		String message = "3개의 입력값을 입력사이오.\nex) 10 20 30",
				resultMessage = "중간 값: %d";
		int num1 = 0, num2 = 0, num3 = 0, maxnum = 0, middlenum = 0, minnum = 0;
		System.out.println(message);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
	maxnum = num1 > num2 ?
			    num1 > num3 ? num1 : num3 :
						num2 > num3 ? num2 : num3;
						
	minnum = num1 < num2 ? 
			num1 < num3 ? 
					num1 : num3 : 
		                num2 < num3 ? num2 : num3;
	
	middlenum = num1 + num3 + num3 - maxnum - minnum;
	System.out.printf(resultMessage, middlenum);
  
      
   }
}







