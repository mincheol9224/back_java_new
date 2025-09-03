package varibleTest;
// 실습
// 각 데이터에 맞는 타입 선언 후 출력해보기
// 5, false, 7845.15, B, 85.10F, 자바, S, 98590, D, true, 107L, 공백문자

public class VariableTask01 {
	public static void main(String[] args) {
		// 내가 값을 모를 때 -> 초기값을 최상단에 선언한다.
		int num1 = 0, num2 = 0;
		boolean istrue = false, isfalse = false;
		double num3 = 0.0;
		char data1 = ' ', data2 = ' ', data3 = ' ', data4 = ' ';
		float num4 = 0.0F;
		long num5 = 0L;
		String str1 = "";
	
	 
	  num1 = 5;
	  System.out.println(num1);
	  
	  num2 = 98590;
	  System.out.println(num2);
	  
	  num3 = 7845.15;
	  System.out.println(num3);
	  
	  num4 = 85.10F;
	  System.out.println(num4);
	  
	  data1 = 'B';
	  System.out.println(data1);
	  
	  data2 = 'S';
	  System.out.println(data2);
	  
	  data3 = 'D';
	  System.out.println(data3);
	  
	  str1 = "자바";
	  System.out.println(str1);
	  
	  num5 = 107L;
	  System.out.println(num5);
	  
	
		
	}

}
