package castingTest;

public class CastingTask3 {
   public static void main(String[] args) {
//      String.valueOf(값);
//      어떤 값을 문자열로 형변환시켜주는 메서드
      
//      모두 대문자로 바꿔서 출력
//      아스키코드
//      'A', 'J', 'K'
//      A = 65 / a = 97
//      J = 74 / j = 106
//      K = 75 / k = 107
    
	  char a = 'a', j = 'j', k= 'k', A = 'A', J = ' ', K = ' ';
	  String result = "%c, %c, %c";
	  int gap = 0;
	  gap = a - A;
	  
	  A = (char)(a - gap);
	  J = (char)(J - gap);
	  K = (char)(K - gap);
	  
	  System.out.printf(result, A, J, K);
  
   }
}
