package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * <<산술 연산자>>
		 * + : 더하기
		 * - : 빼기
		 * * : 곱하기
		 * / : 나누기
		 * % : 나머지
		 * - 이항 연산자는 양쪽의 피연산자의 타입이 일치해야 연산이 가능하다.
		 */
		
		int a = 10 + 20 - 10 * 5 / 10 % 2;
		 //수학과 같이 *, /, % 연산자가 +, - 보다 연산의 우선순위가 높다.
		 //연산의 우선순위가 동일할 경우 왼쪽부터 연산이 수행된다.
		System.out.println(a);
		
		a = (int)(10 + 20.3); //30.3->int형변환으로 소수점탈락
		//피연산자의 타입이다를 경우 표현범위가 작은 쪽에서 큰 쪽으로 자동 형변환 후 연산이 수행된다.
		//따라서 연산의 결과도 표현범위가 큰쪽의 타입이 된다.
		
		
		byte b = 10;
		short c = 20;
		
		short d = (short)(c - b);
		System.out.println(d);
		//int보다 작은 정수 타입(4바이트 이하)은 int로 형변환 후 연산이 수행된다.		
		
		long e1 = 100000 * 100000; // int형의 표현범위를 넘음
		System.out.println(e1);
		long e2 = 100000L * 100000; // 둘 중 하나는 long으로 형변환
		System.out.println(e2);
		
		float f1 = 10 / 4;
		System.out.println(f1); // int형은 소수를 나타낼 수 없으므로 사라지고 정수부분만 나옴
		float f2 = 10.0f / 4;
		System.out.println(f2); // 둘 중 하나는 float으로 형변환 해줘야함
	
		int f3 = 10 % 4; // 10을 4로 나눈 나머지
		System.out.println(f3);
		
		//정수는 0으로 나눌 수 없다.
		//int g1 = 10 / 0; // 런타임 에러 (실행했을 때 에러) 발생
		float g2 = 10.0f / 0;
		System.out.println(g2);
		float g3 = 0 / 0f;
		System.out.println(g3); // NaN : Not a Number
		
		char h1 = 'A';
		char h2 = (char)(h1 + 1);
		System.out.println(h2);
		
		int h3 = 'D' - 'A';
		System.out.println(h3);
	
		int h4 = '5' - '0';
		System.out.println(h4);
		
		//산술 연산자와 대입 연산자를 합해 연산식을 줄여서 표현할 수 있다.
		int i = 0;
		
		i = i + 1;
		i += 1;
		i += 2; // 복합연산자
		//더하는 값이 1인 경우에는 더 줄일 수 있다.
		++i; // 전위형 : 변수가 참조되기 전 수행
		i++; // 후위형 : 변수가 참조된 후 수행
		
		i = 0;
		System.out.println("++i = "+ ++i);
		i = 0;
		System.out.println("i++ = "+ i++);
		System.out.println(i);
	
		i = i - 1;
		i -= 1;
		--i;
		i--;
		
		i = i * 2;
		i *= 2;
		
		i =i / 3;
		i /= 3;
		
		i = i % 4;
		i %= 4;
		
		double round = 50.65;
		System.out.println((int)(round + 0.5)); // 연산결과를 형변환 하는것이므로 연산에 괄호!
		//반올림을 하기위해 0.5를 더하고 소수점을 없애기 위해 int로 형변환 한다.
		System.out.println((int)(round * 10 + 0.5) / 10.0); // 10을 곱해서 소수점을 한자리 미루고 반올림 한 다음 다시 10으로 나눠서 소수점 한칸 당김
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321 = 777777
		//2. 1번의 결과값 * 123456 = 1531956800 // 777777 * 123456과 다르다! double로 형변환을 안해주면 오버플로우!
		//3. 2번의 결과값 / 123456 = 12408
		//4. 3번의 결과값 - 654321 = -641913
		//5. 4번의 결과값  % 123456 = -24633

		
		double result = 123456 + 654321;
		result *= 123456; //result = result * 123456;
		result /= 123456;
		result -= 654321;		
		result %= 123456;
		
		System.out.println("***" + result);
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.(평균은 소수점 둘째자리에서 반올림)
		int i2 = 7, j2 = 20, p2 = 32;
		
		int sum = i2 + j2 + p2;
		double avg = sum / 3.0;
		double avg2 = ((int)((sum / 3.0) * 10 + 0.5) / 10.0);
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("평균 : " + avg2);
		
		System.out.println("평균 : " + (int)(avg * 10 + 0.5) / 10.0); // int형을 double형으로 나눔으로써 결과값을 double로 얻음.
		System.out.println("평균 : " + (int)(avg * 100 + 0.5) / 100.0); // 몇째자리든 상관없이 .0으로 표기(double의결과값을 얻기위해)	
		
	
	}

}
