package castingTest;

public class CastingTest {
	public static void main(String[] args) {
		// 정수 + 실수 = 실수
	    // 자동 형변환
		System.out.println(1 + 2.5); // 3.5
		
		// 정수 + 정수 = 정수
		System.out.println(5 + 3); // 8
		
		 // 정수 / 정수 = 정수
		System.out.println(5 / 2); // 2
		System.out.println(5.0 / 2); // 2.5
		
		// 강제 형벼환
		System.out.println(5 / (double)2); 
		System.out.println((int)(5 / (double)2)); 
		System.out.println(6 / (double)2);
		System.out.println((int)(6 / (double)2));
		
		
		
		
	}
}
