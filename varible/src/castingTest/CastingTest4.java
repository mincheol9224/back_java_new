package castingTest;

public class CastingTest4 {
	public static void main(String[] args) {
		 Integer.parseInt("10"); // 10 정수 10으로 강제형변환
		 Double.parseDouble("8.8"); // 8.8 실수 8.8로 강제형변환
		 Boolean.parseBoolean("true"); 
//  문자열 "8.8" 실수로 우선 변황하고 8.8로 만들고 그다음에 정수인 8로 변환
		 System.out.println((int)Double.parseDouble("8.8"));
		 
		
		
	}
}
