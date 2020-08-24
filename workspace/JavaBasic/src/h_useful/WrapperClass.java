package h_useful;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		/*
		 * Wrapper 클래스 : 기본형 타입을 객체로 사용해야 할때 대신 사용하는 클래스
		 * 
		 * boolean  : Boolean
		 * char		: Character
		 * byte		: Byte
		 * short	: Short
		 * int		: Integer
		 * long 	: Long
		 * float	: Float
		 * double	: Double
		 */
		
		int i = 10;
		Integer iw = new Integer(20);
		
		System.out.println(i + iw); 
		//원래 기본형과 참조형은 연산이 안되는데 Wrapper 클래스는 가능
		
		System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		
		System.out.println(i + Integer.parseInt("20")); //문자열을 정수타입으로 바꿔주는 메서드
		
		System.out.println(i + String.valueOf(20)); //숫자를 문자열로 변환
		
		System.out.println(i + Integer.valueOf("20")); //문자를 정수타입으로 변환
		
		ArrayList<Integer> list = new ArrayList<Integer>(); //0부터 시작해서 배열의 길이가 값을 넣거나 빼면 늘어나고 줄어든다
		//<>안에 타입 지정
		//그러나 기본형 타입은 넣을 수 없고 객체만 넣을 수 있다.
		//기본형을 넣고 싶으면 WrapperClass를 넣어준다.
		
		list.add(new Integer(10));
		list.add(10); //오토박싱 : 기본형타입이 Wrapper클래스로 자동 변환
		
		Integer integer = list.get(0); //소괄호 안에 index번호를 넣어주면 그 번호에 해당하는 값을 얻을 수 있음
		int i2 = list.get(0); //언박싱 : Wrapper클래스가 기본형타입으로 자동변환
	}

}
