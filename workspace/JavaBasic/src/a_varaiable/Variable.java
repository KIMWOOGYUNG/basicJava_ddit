 package a_varaiable;

import java.util.Scanner;



public class Variable {

	public static void main(String[] args) {
	
		byte _byte;
		char _char;
		short _short;
		int _int;
		long _long;
		float _float;
		double _double;
		boolean _boolean;
		
		//모든 기본형 타입을 사용해서 8개의 변수를 선언해주세요.
//		System.out.println(b);
		
		_byte = 127;
		_short = 30000;
		_int = 20;
		_long = 900L;//long 접미사:L
		_float =3.14f;//float 접미사 :f
		_double = 3.14;//double 접미사:d(생략가능)
		_char = '가';
		_boolean = true;
		
		System.out.println(_int);
		
		_int = 30;
		System.out.println(_int);
		_int = 30 + 40;
		System.out.println(_int);
		_int = _short;
		System.out.println(_int);
		
		//위에서 초기화한 변수에 새로운 값을 저장하고 출력해주세요.
		
		_byte = 1;
		_short = 10;
		_int = 100;
		_long = 100L;
		_float = 1.25f;
		_double = 1.25;
		_boolean = false;
		_char = 'a';
		
		System.out.println(_byte);
		System.out.println(_short);
		System.out.println(_int);
		System.out.println(_long);
		System.out.println(_float);
		System.out.println(_double);
		System.out.println(_boolean);
		System.out.println(_char);
		
		String _String = new String("abcd");
		System.out.println(_String);
		_String = "1234";
		System.out.println(_String);
		
		//경우에 따라 변수에 타입이 다른 값을 저장하기도 한다.
		_byte =127;
		_int =128;
		_byte = (byte)_int;
		System.out.println(_byte); //128->-128(오버플로우)
		
		_byte = -128;
		_int = -129;
		_byte = (byte)_int;
		System.out.println(_byte); //-129-> 127(언더플로우)
		
		/*표현범위가 큰 타입에서 작은 타입으로 형변환 할 경우 데이터가 손실될 수 있다.
		표현범위가 작은 타입에서 큰 타입으로 형변환 할 경우 데이터가 손실될 염려가 없다.
		그러므로 형변환을 생략할 수 있다.*/
		_int = _byte;
		_long = _int;
		_double = _int;
		_double = _float;
		
		//위에서 만든 변수들을 표현범위가 작은 타입으로 형변환 해주세요.(3번이상)
		_short = (short)_int;
		_long = (long)_double;
		_byte = (byte)_float;
		
		//위에서 만든 변수들을 표현범위가 큰 타입으로 형변환 해주세요.(3번이상)
		_long = _byte;
		_int =_short;
		_double = _float;
		
//		final int MAX_NUMBER;
		
		final int MAX_NUMBER;
		MAX_NUMBER = 10; //초기화
//		MAX_NUMBER = 100; //변수 값 다시 지정하면 컴파일 에러 발생
		
		//콘솔창에서 입력받는 방법
		Scanner s = new Scanner(System.in);
//		System.out.println("문자열을 입력해주세요>");
//		String input1 = s.nextLine();
//		System.out.println("입력받은 문자열 : "+ input1);
		
//		System.out.println("숫자를 입력해주세요>");
//		int input2 = Integer.parseInt(s.nextLine());
//		System.out.println("입력받은 숫자 : "+ input2);
		
		//문자열을 입력받고 입력받은 문자열을 출력해주세요.
		System.out.println("문자열을 입력해주세요>");
		String input1 = s.nextLine();
		System.out.println("입력받은 문자 : " + input1);
		
		System.out.println("숫자를 입력해주세요>");
		int input2 = Integer.parseInt(s.nextLine());
		System.out.println("입력받은 숫자 : " + input2);
	}

}
