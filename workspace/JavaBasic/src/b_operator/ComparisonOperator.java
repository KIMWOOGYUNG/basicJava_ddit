package b_operator;

public class ComparisonOperator {

	public static void main(String[] args) {
		/*
		 * <<비교 연산자>>
		 * < : 작다
		 * > : 크다
		 * <= : 작거나 같다
		 * >= : 크거나 같다
		 * == : 같다
		 * != : 같지 않다
		 */
		
		boolean b = 10 < 20; // 비교연산자의 연산결과는 boolean이다.
		System.out.println(b);
		
		b = 10 < 20 -15;
		System.out.println(b);
		
		b = 10 <= 10.0; 
		// 비교 연산자도 타입이 일치해야함
		// 이항 연산자는 타입을 일치시킨 후 연산한다.
		System.out.println(b);
		
		b = 65 >= 'B';
		System.out.println(b);
		
		b = 10.0f == 10.0;
		System.out.println(b);
		b = 10.1f == 10.1;
		System.out.println(b);
		System.out.printf("%22.20f%n", 10.1f); //22자리를 표현하는데 그중 20자리가 소수점자리, %n은 줄바꿈)
		System.out.printf("%22.20f%n", 10.1);  //출력문자의 형을 정해줄땐 printf로!
		//float타입은 소수점7자리까지 근사치를 나타내므로 정확히 같지 않다.
		b = 10.1f == (float)10.1; //float으로 형변환 해주면 동일해짐
		System.out.println(b);
		
		//대소비교는 boolean을 제외한 기본형 타입만 비교할 수 있지만 등가비교는 모든 타입을 비교할 수 있다.
		b = 'A' == 65;
		System.out.println(b);
		b = true != false;
		System.out.println(b);
		
		b = "abc" == "abc";
		System.out.println(b);
		b = "abc" == new String("abc"); //new의 역할은 새로운주소 생성
		//참조형 타입은저장된 메모리 주소를 비교하기 때문에 string은 등가비교 연산자로 내용을 비교할 수 없다.
		//new로 새 주소를 만들었기때문에 두 주소가 다름
		System.out.println(b);
		
		b = "abc".equals(new String("abc")); //equals를 사용하면 String의 내용을 비교할 수 있다.
		System.out.println(b);
		b = !"abc".equals("ABC"); //같지 않다의 결과를 얻기 위해서는 !(not)을 앞에 붙여준다.
		System.out.println(b);
		
		//다음의 문장들을 코드로 작성해주세요.
		//1보다 2가 큰가?
		System.out.println(1 < 2);
		//0은 100보다작거나 같은가?
		System.out.println(0 <= 100);
		//3.14f와 3.14는 다른가?
		System.out.println(3.14f != 3.14);
		//"남자"와 "여자"는 다른가?                                       
		System.out.println(!"남자".equals("여자")); //-------주의!!
		
		
	}

}
