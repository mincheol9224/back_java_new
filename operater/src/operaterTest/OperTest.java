package operaterTest;

public class OperTest {
	public static void main(String[] args) {
		boolean isTrue = 10 != 11; // true
		
		System.out.println(10 == 11); // false
		System.out.println(10 != 11); // true
		System.out.println(isTrue); // true
		System.out.println(isTrue && 10 == 10); // true
		System.out.println(!isTrue || 10 != 11); // true
		System.out.println(isTrue && !(10 != 10)); // true
	}
}
