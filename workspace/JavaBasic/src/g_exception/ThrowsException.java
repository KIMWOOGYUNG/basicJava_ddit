package g_exception;

import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) {
		/*
		 * << 메서드에 예외 선언하기 >>
		 * - 메서드 호출시 발생할 수 있는 예외를 선언해줄 수 있다.
		 * - void method() throws IOException{}
		 * - 메서드의 구현부 끝에 throws 키워드와 예외 클래스명으로 예외를 선언할 수 있다.
		 * - 예외를 선언하면 예외처리를 하지 않고 자신을 호출한 메서드로 예외처리를 넘겨준다.
		 */
		
		try {
			method(); //메서드 생성 후 try-catch로 감싸기
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
	
	static String str;
	//예외를 처리하지 않고 호출한 애한테 넘겨준다.
	private static void method() throws IOException { //add로 예외 선언
		//throw new IOException(); //예외 발생
		//자주 나오는 에러 2가지 
		//throw new NullPointerException(); - 에러가 발생한 위치에 있는 객체가 null이다 (객체가 변수에 들어있는데 그 변수에 null이 있는경우)
		//throw new IndexOutOfBoundsException(); - 배열 인덱스 벗어난 경우
		
		//System.out.println(str.length()); //NullPointerException 나오는 예
		
	}

}
