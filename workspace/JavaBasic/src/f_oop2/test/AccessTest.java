package f_oop2.test;

import f_oop2.AccessModifier;

public class AccessTest extends AccessModifier{

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier(); 
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		//같은 패키지가 아니라서 실행x
		System.out.println(am.protectedVar);
		am.protectedMethod();
	
	
	/*	System.out.println(am.defaultVar);
		am.defaultMethod();
		
		System.out.println(am.privateVar);
		am.privateMethod();*/
		
		//1) main 메소드 안에서 사용하는 법
		//상속을 받았으니까 부모클래스에서 찾을게 아니라 현재 클래스에서 객체 생성해서 사용 
		AccessTest at = new AccessTest(); //아래 함수를 객체생성해서 써야함
		System.out.println(at.protectedVar);
		at.protectedMethod();
	}
		//2) 메소드 생성해서 사용하는 법
		void protectedTest(){	
			System.out.println(protectedVar);
			protectedMethod();
		}
	

}
