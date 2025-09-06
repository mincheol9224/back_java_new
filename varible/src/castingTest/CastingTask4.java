package castingTest;

public class CastingTask4 {
	public static void main(String[] args) {
// "12.123"
// "345.789"
// "6789"
// 3개 값을 더해서 123456789 출력하기
		
//	String str1 = "12.123", str2 = "345.789", str3 = "6789";
//	 double dou1 = 0.0, dou2 = 0.0;
//	 int num1 = 0, num2 = 0, num3 = 0;
//	 
//	
//	   dou1 = Double.parseDouble(str1);
//	   dou2 = Double.parseDouble(str2);
//	   num1 = (int)dou1;
//	   num2 = (int)dou2;
//	   num3 = Integer.parseInt(str3);
//	   str1 = String.valueOf(num1);
//
//	   System.out.println(str1 + num2 + num3);
		
    
//   String str1 = "12.123", str2 = "345.789", str3 = "6789", result = "";
//   double dou1 = 0.0, dou2 = 0.0;
//   int num1 = 0, num2 = 0, num3 = 0;
//   
//   dou1 = Double.parseDouble(str1);
//   dou2 = Double.parseDouble(str2);
//   num1 = (int)dou1;//
//   num2 = (int)dou2;
//   num3 = Integer.parseInt(str3);
//   str1 = String.valueOf(num1);
//   result = str1 + num2 + num3;
//   
//   System.out.println(result);
	
	 
// "21.123"
// "543.789"
// "9876"
// 3개 값을 더해서 987654321 출력하기
   
   
   String str1 = "21.123", str2 = "543.789", str3 = "9876", result = "%s%d%d";
   double dou1 = 0.0, dou2 = 0.0;
   int num1 = 0, num2 = 0;
   
      dou1 = Double.parseDouble(str1); // dou1 = 21.123
      dou2 = Double.parseDouble(str2); // dou2 = 543.789
      num1 = (int)dou1; // num1 = 21
      num2 = (int)dou2; // num2 = 543
      
      System.out.printf(result,str3,num2,num1);
      
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
	 
	  
	
	     
	   
	
	}

}
