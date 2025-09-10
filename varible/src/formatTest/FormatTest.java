package formatTest;

public class FormatTest {
	public static void main(String[] args) {
	// 전민철
	// 나이
	// 키
		String name = "전민철";
		int age = 33;
		double height = 178.2;
		
		System.out.println("저의 이름은" + name + "입니다.");
		System.out.println("");
	    System.out.printf("저의 이름은 %s 이고, 나이는 %d이고, 키는 %.1fcm입니다.", name, age, height );
		
		
	}
}
