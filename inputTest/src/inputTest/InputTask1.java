package inputTest;

import java.util.Scanner;

public class InputTask1 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String message = "두수의 정수를 입력하세요\nex) 30 40", str1 = null, str2 = null,
    			           resultMessage = "첫 번째 정수: %s\n두 번째 정수:%s\n두수의 합: %d + %d = %d";
    	int num1 = 0, num2 = 0, result = 0;
    	
    	
    	
    	System.out.println(message );
         str1 =	sc.next();
         str2 =	sc.next();
         num1 = Integer.parseInt(str1);
         num2 = Integer.parseInt(str2);
         result = num1 + num2;
         
         System.out.printf(resultMessage, str1, str2, num1, num2, result);
    	
    
		
	}

  
	  
    }

