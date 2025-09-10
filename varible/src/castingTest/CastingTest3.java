package castingTest;

public class CastingTest3 {
	public static void main(String[] args) {
		int a = 0;
		char b = ' ';
		
		// String 은 클래스형 자료형
		String c = "";
		
		// 문자열의 강제 형변환
	   // System.out.println((int)"10")); 클래스형 문자형은 일반 타입으로 강제 형볂환 불가능
		System.out.println((Integer.parseInt("10") - 5)); // 5 
		System.out.println((Double.parseDouble("10") - 5)); // 5.0
		System.out.println((Float.parseFloat("10") - 6)); // 4.0
		System.out.println((Boolean.parseBoolean("10"))); // false
	}
}
