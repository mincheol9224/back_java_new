package controlStatement;
// .equals
// 문자열 매서드
// == : 주소를 비교하는 연산자!
public class EqualsTest {
	public static void main(String[] args) {
		System.out.println(10 == 10); // true
		System.out.println('A' == 'A'); // true
		System.out.println('B' == 'B'); // true
//  steck 영역안에는 홍길동이라는 값을 저장한다
//  값을 비교한때는 "=="을 사용하면 안된다
//  sc.next()는 외부에서 불러온 주소이므로 
//  문자열에서만 값끼리 사용할때만 .equlas()을 사용한다
//  .equals는 서로의 값끼리만 비교
	   String name1 = "홍길동", name2 = "홍길동"; 
	   System.out.println(name1 == name2); // true
	   System.out.println(name1 == new String("홍길동")); // fals *다른 주소
	   
	}
}
