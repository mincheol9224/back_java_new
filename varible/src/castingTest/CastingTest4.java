package castingTest;

public class CastingTest4 {
	public static void main(String[] ars) {
	   Integer.parseInt("10"); // 10
        Double.parseDouble("8.8"); //8.8        
        Boolean.parseBoolean("true"); // true
        Integer.parseInt("8");
        
    // "8.8" => 8.8 => 8  일단 문자열 "8.8"을 실수 8.8로 강제변환후 정수 8로 변환한다
         System.out.println((int)Double.parseDouble("8.8"));
    //"true" -> true
		
	}
}
