package z_exam;

import java.util.Arrays;
import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		
			/*[5-1] 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명하시오.
				a. int[] arr[]; //OK - 2차원배열 선언(초기화는X)
				b. int[] arr = {1,2,3,}; // OK - ,뒤 값이 없으면 기본값으로 들어간다.(좋지는 않음)
				c. int[] arr = new int[5]; OK
				d. int[] arr = new int[5]{1,2,3,4,5}; X - 초기화할땐 크기 지정 or 값 지정
				e. int arr[5]; //X - 변수 선언할때 크기 지정하는게 아님
				f. int[] arr[] = new int[3][]; //가변2차원배열
			*/				
		
			/*[5-2] 다음과 같은 배열이 있을 때, arr[3].length의 값은 얼마인가? //2
			
				int[][] arr = {
					{ 5, 5, 5, 5, 5 },
					{ 10, 10, 10 },
					{ 20, 20, 20, 20 },
					{ 30, 30 }
				};*/
					
			/*[5-3] 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
			
				int[] arr = {10, 20, 30, 40, 50};
				int sum = 0;
				
				for(int i = 0; i < arr.length; i++){
					sum +=arr[i];
				}
				
				System.out.println("sum="+sum);*/
			 
			
			/*[5-4] 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
				int[][] arr = {
						{ 5, 5, 5, 5, 5},
						{10,10,10,10,10},
						{20,20,20,20,20},
						{30,30,30,30,30}
						};
				int total = 0;
				float average = 0;
				
				int count = 0;
				for(int i = 0; i < arr.length; i++){
					for(int j = 0; j < arr[i].length; j++){
						total += arr[i][j];
						count++;
					}
				}average = (float)total / count;
				
				System.out.println("total="+total);
				System.out.println("average="+average);*/
				
			/*[5-5] 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다. 
				(1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
				[참고] Math.random()을 사용했기 때문에 실행결과와 다를 수 있다.
				
				int[] ballArr = {1,2,3,4,5,6,7,8,9};
				int[] ball3 = new int[3]; //3자리 수를 담은 배열 생성
				// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
				for(int i=0; i< ballArr.length;i++) {
				int j = (int)(Math.random() * ballArr.length); //0~8까지 생성 => index를 가리킴
				//랜덤으로 발생한 숫자를 인덱스에 넣어 ballArr[j]와 ballArr[i]를 계속 섞어줌
				int tmp = 0;	
					tmp = ballArr[i];
					ballArr[i] = ballArr[j];
					ballArr[j] = tmp;
				}
				System.out.println(Arrays.toString(ballArr)); 
	
				// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
				for(int i = 0; i < ball3.length; i++){
					ball3[i] = ballArr[i];
				}
				
				for(int i=0;i<ball3.length;i++) {
				System.out.print(ball3[i]);
				}*/
		
		
			/*[5-6] 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 
				변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라. 
				단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. 
				(1)에 알맞은 코드를 넣어서프로그램을 완성하시오.
				[Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
				
				int[] coinUnit = {500, 100, 50, 10};
				int money = 2680;
				System.out.println("money="+money);
				
				for(int i=0;i<coinUnit.length;i++) {
					System.out.println(coinUnit[i] + "원 : " + money / coinUnit[i] + "개");
					money = money % coinUnit[i];
				}*/
				
	
			/*[5-7] 문제 5-6에 동전의 개수를 추가한 프로그램이다. 커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산한다. 
				보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름 돈이 부족합니다.’라고 출력하고 종료한다. 
				지불할 돈이 충분히 있으면, 거스름돈을 지불한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다. 
				(1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
				
					// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
					int money = 2580; //임의의 수
					System.out.println("money="+money);
					int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
					int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
					for(int i = 0; i<coinUnit.length; i++) {
					int coinNum = 0;
					
					coinNum = money/coinUnit[i]; //동전의 개수를 구한다
					
					if(coin[i] >= coinNum){ //필요한 개수보다 가진 개수가 많으면,
						coin[i] = coin[i] - coinNum; //가진거에서 빼줌
					}else{
						coinNum = coin[i]; //필요한게 더 많으면 가진거 최대치로 주고,
						coin[i] = 0;	   //가진건 0이 된다
					}
					money = money - coinNum * coinUnit[i]; //금액은 가진 거스름돈들 다 주고 남은 금액
					 (1) 아래의 로직에 맞게 코드를 작성하시오.
					1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
					2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
					(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
					3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
					
					System.out.println(coinUnit[i]+"원: "+coinNum);
					}
					if(money > 0) {		//거스름돈을 다 주고도 줄 돈이 아직 있으면 거스름돈이 부족
					System.out.println("거스름돈이 부족합니다.");
					System.exit(0); // 프로그램을 종료한다.
					}
					System.out.println("=남은 동전의 개수 =");
					for(int i=0;i<coinUnit.length;i++) {
					System.out.println(coinUnit[i]+"원:"+coin[i]);
					}*/
					
			/*[5-8] 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’을 찍어서 그래프를 그리는 프로그램이다. 
				(1)~(2)에 알맞은 코드를 넣어서 완성하시오.
					
				실행결과 분석  - *의 개수 : answer배열의 1의 개수, 2의 개수, 3의 개수, 4의 개수
				 * 			 - *앞의 숫자 : *의 개수
				 
				int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
				int[] counter = new int[4];
				for (int i = 0; i < answer.length; i++) {
					counter[answer[i] - 1]++; //counter배열 0,1,2,3 에 각각 1,2,3,4의 개수를 저장함
				}
				for (int i = 0; i < counter.length; i++) {
					System.out.print(counter[i]);

					for (int j = 0; j < counter[i]; j++) {

						System.out.print("*");

					}System.out.println();
				}*/
					
			/*[5-9] 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
					
				char[][] star = {
						{'*','*',' ',' ',' '},
						{'*','*',' ',' ',' '},
						{'*','*','*','*','*'},
						{'*','*','*','*','*'}
				};                                                         
				char[][] result = new char[star[0].length][star.length]; //행과 열을 바꿔준 새 배열 결과
				//원래 배열 출력
				for(int i=0; i < star.length;i++) {
					for(int j=0; j < star[i].length;j++) {
						System.out.print(star[i][j]);
					}
					System.out.println();
				}
				System.out.println();
				//배열 회전
				for(int i=0; i < star.length;i++) {
					for(int j=0; j < star[i].length;j++) {
						int a = j;
						int b = (star.length - 1) - i;
						
						result[a][b] = star[i][j];
						}
					}
				//회전된 배열 출력
				for(int i=0; i < result.length;i++) {
					for(int j=0; j < result[i].length;j++) {
						System.out.print(result[i][j]);
					}
					System.out.println();
				}*/
							
			/*[5-10] 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
					(1)에 알맞은 코드를 넣어서 완성하시오.
					
					char[] abcCode =
					{ '`','~','!','@','#','$','%','^','&','*',
					'(',')','-','_','+','=','|','[',']','{',
					'}',';',':',',','.','/'};
					// 0 1 2 3 4 5 6 7 8 9
					char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
					String src = "abc123";
					String result = "";
					// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
					for(int i=0; i < src.length();i++) {
						char ch = src.charAt(i);
						if('a' <= ch && ch <= 'z'){
							result += abcCode[ch-'a'];
						}else if('0' <= ch && ch <= '9'){
							result += numCode[ch-0];
						}
					
					}
				System.out.println("src:"+src);
				System.out.println("result:"+result);*/
			
						
			/*[5-11] 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 
				배열의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다. 
				(1)에 알맞은 코드를 넣어서 완성하시오.
						
						int[][] score = {
								{100, 100, 100}
								, {20, 20, 20}
								, {30, 30, 30}
								, {40, 40, 40}
								, {50, 50, 50}
								};
								int[][] result = new int[score.length+1][score[0].length+1];
								for(int i=0; i < score.length;i++) {
								for(int j=0; j < score[i].length;j++) {
									result[i][j] = score[i][j]; 
									result[i][score[0].length] += result[i][j]; 
									result[score.length][j] += result[i][j]; 
									result[score.length][score[0].length] += result[i][j];
									}
								}
								for(int i=0; i < result.length;i++) {
								for(int j=0; j < result[i].length;j++) {
								System.out.printf("%4d",result[i][j]);
								}System.out.println();
							}*/
								
				/*[5-12] 예제5-23을 변경하여, 아래와 같은 결과가 나오도록 하시오.
					String[][]words = {
							{"chair", "의자"},
							{"computer", "컴퓨터"},
							{"integer", "정수"},
					};
					Scanner scanner = new Scanner (System.in);
					
					int count = 0;
					for(int i = 0; i < words.length; i++){
						System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);
						
						String tmp = scanner.nextLine();
						
						if(tmp.equals(words[i][1])){
							System.out.printf("정답입니다. %n%n");
							count++;
						}else{
							System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
						}
					}
					System.out.println("전체" + words.length + "문제 중" + count + "문제 맞추셨습니다.");*/
								
				/*[5-13] 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다. 
				실행결과와 같이 동작하도록 예제의 빈 곳을 채우시오.
								
						String[] words = { "television", "computer", "mouse", "phone" };
						Scanner scanner = new Scanner(System.in);
						for(int i=0;i<words.length;i++) {
						char[] question = words[i].toCharArray(); // String을 char[]로 변환
						
						int idx = (int)(Math.random() * question.length);
						for(int j = 0; j < words.length; j++){
							char tmp;
						
							tmp = question[j];
							question[j] = question[idx];
							question[idx] = tmp;
						}
						System.out.printf("Q%d. %s의 정답을 입력하세요.>", i+1, new String(question));
						String answer = scanner.nextLine();
						// trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
						if(words[i].equals(answer.trim()))
						System.out.printf("맞았습니다.%n%n");
						else
						System.out.printf("틀렸습니다.%n%n");
						}*/
								
								
	}

}
