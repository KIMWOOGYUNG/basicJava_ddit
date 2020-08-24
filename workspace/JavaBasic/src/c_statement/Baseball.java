package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// 숫자야구게임을 만들어주세요.
		// 3자리의 중복되지 않는 숫자를 발생시킨다.(1~9)
		int a, b, c;
		a = (int) (Math.random() * 9) + 1;

		do{b = (int) (Math.random() * 9) + 1;
		}while(a == b); //중복되면 계속 숫자생성

		do{c = (int) (Math.random() * 9) + 1;
		}while(a == c || b == c);

		Scanner s = new Scanner(System.in);
		int count = 0;
		
		//한번에 3자리 숫자 입력후 쪼개서 사용
		while(true){
			System.out.println("3자리의 숫자를 입력해주세요");
			int input = Integer.parseInt(s.nextLine());
			int i3 = input % 10; //1의자리
			input /= 10;
			int i2 = input % 10; //10의자리
			input /= 10;
			int i1 = input % 10; //100의자리
		
		
		int Strike = 0;
		int Ball = 0;
		int Out = 0;
		
		if(a == i1) Strike++;
		if(b == i2) Strike++;
		if(c == i3) Strike++;
		
		if(a == i2 || a == i3) Ball++;
		if(b == i1 || b == i3) Ball++;
		if(c == i1 || c == i2) Ball++;
		
		Out = 3 - Strike - Ball;
		
		System.out.println("정답 : " + a + b + c);
		System.out.println(++count + "차 시도 (" + i1 + i2 + i3 + ") : " 
							+ Strike + "S " + Ball + "B " + Out + "O)");
		System.out.println("--------------");
		if(Strike == 3){
			System.out.println("정답입니다!");
			break;
		}
	}

		// 사용자에게 3개의 숫자를 입력받는다.
		// 사용자가 입력한 값과 정답을 비교해 SBO를 카운팅한다.
		// 3S인 경우 정답이므로 프로그램을 종료한다.
		
	}

}
