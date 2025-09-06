package formatTest;

public class FormatTest {
      public static void main(String[] args) {
	   // 전민철
       // 33
       // 177
       // 변수에 담기
    	  
    	String name = "전민철", result = "저의 이름은 %s이고, 나이는 %d이고, 키는 %.1fcm입니다";
    	int age = 33;
    	double height = 177.7;
    	
    	
//    	System.out.println("저의 이름은" + name + "입니다");
//    	System.out.printf("저의 이름은 %s입니다.", name);
//    	System.out.printf("저의 이름은 %s이고 나이는 %d, 키는 %fcm입니다.", name, age, height);
//    	System.out.println("");
//    	System.out.printf("저의 이름은 %s이고, 나이는 %d이고, 키는 %.1fcm입니다", name, age, height);
    	System.out.printf(result, name, age, height);
    	
	}
}
