package castingTest;

public class CastingTaks3 {
	public static void main(String[] args) {
	 // String.valueOf(값);
	 // 어떤 값을 문자열로 형변환시켜주 매서드
		
		// 모두 대문자로 바꿔서 출력
		// 아스키코드 
		// 'A', 'J', 'K'
	 String message = "%c, %c, %c";
	 char a = 'a', j = 'j', k = 'k', A = 'A', J = ' ', K = ' ';
	 int gap = 0;
	 gap = a - A; // 32
	 
	 A = (char)(a - gap);
	 J = (char)(j - gap);
	 K = (char)(k - gap);
	
	 
     System.out.printf(message, A, J, K);
	 
	
	 
	 
	 
		
//	char a = 'a', j = 'j', k = 'k', A = 'A', J = ' ', K = ' ';
//	String result = "%c, %c, %c";
//	int gap = 0;
//	gap = a - A; // 32
//	
//	a = (char)(a - gap);
//    j = (char)(j - gap);
//	k = (char)(k - gap);
//	
//	System.out.printf(result, a, j, k);
	
	 
	
//    System.out.println((char)(a - gap));
//    System.out.println((char)(j - gap));
//    System.out.println((char)(k - gap));

    

		
	}
}
