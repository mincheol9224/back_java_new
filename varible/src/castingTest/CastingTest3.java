package castingTest;

public class CastingTest3 {
	public static void main(String[] args) {
		int a = 0;
		char b = ' ';
		String c = "";
		
		// 문자열의 강제 형변환
		// 엄마 클래스 로 변환
		System.out.println(Integer.parseInt("10") - 5);
		System.out.println(Float.parseFloat("10") - 5);
		System.out.println(Double.parseDouble("10")-5);
		System.out.println(Boolean.parseBoolean("10"));
		System.out.println(Boolean.parseBoolean("true"));
		System.out.println(Boolean.parseBoolean("TRUE"));
		
		System.out.println(Integer.parseInt( "16" )- 6);
		System.out.println(Float.parseFloat("16") -6);
		System.out.println(Double.parseDouble("16" ) - 10);
		System.out.println(Boolean.parseBoolean("16"));
	}

}
