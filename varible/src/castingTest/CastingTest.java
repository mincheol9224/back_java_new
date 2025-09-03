package castingTest;

public class CastingTest {
      public static void main(String[] args) {
//      정수 + 실수 = 실수
//		자동 형변환	  
		System.out.println(1 + 2.5); // 3.5 자동응로 형변환됨
		
//		정수 + 정수 = 정수
		System.out.println(5 + 3); //8 정수가 나온다.
		
//		정수 / 정수 = 정수
		System.out.println(5 / 2); // 2 정수가 나온다 출력된다.
		System.out.println(5.0 / 2); // 2.5 실수가 출력된다.
		
// 		강제 형변환
		System.out.println(5 / (double)2); // 2.0 실수로 바뀐다.
        System.out.println((int)(5 / (double)2));
        


		
	}
}
