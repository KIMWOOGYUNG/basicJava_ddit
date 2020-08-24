package d_array;

import java.util.Scanner;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * <<배열>> : 같은 타입의 값들을 묶어서 사용 - int[] number = new int[5]; //기본값으로
		 * 초기화된다. //배열의 크기를 [ ] 안에 지정 - int[] number = new int[]{10, 20, 30, 40, 50}; 
		 * //값을 넣은 개수만큼 배열의 크기가 됨 - int[] number = {10, 20, 30, 40, 50};
		 * 2번을 간단하게 표현 - 배열의 크기는 처음에 지정하면 수정할 수 없음
		 */

		// 배열은 참조형 타입이다.
		int[] array; // 배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; // 배열이 생성되고 그 주소가 저장된다.
		// new : 새로운 저장공간 생성 및 주소 반환
		// int[5] : int를 저장할 수 있는 5개의 공간
		// 배열 초기화시 기본값이 저장된다.

		System.out.println(array); // 주소가 저장되어 있다.

		System.out.println(array[0]); // 실제값에 접근하기 위해서는 index를 지정해줘야 한다.
		// index에는 int만 사용할 수 있다.(리터럴, 변수, 상수, 연산 등)
		// 배열의 최대 크기는 int의 최대값(약20억)이다.

		String arrayStr = Arrays.toString(array); // Array.toString(배열명)
		// 배열의 모든 인덱스에 저장된 값을 문자열로 반환한다.
		System.out.println(arrayStr);

		int[] iArray1 = new int[] { 1, 2, 3 }; // 값의 개수로 배열의 길이가 정해진다.
		int[] iArray2 = { 1, 2, 3 }; // 선언과 초기화를 동시에 해야한다.
		int[] iArray3;
		// iArray3 = {1, 2, 3}; //컴파일 에러 발생

		array[0] = 10; // 인덱스는 0부터 시작한다.
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50; // 마지막 인덱스는 "배열의 길이 - 1이다."

		// 정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화 해주세요.
		int[] array1 = new int[10];
		int[] array2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] array3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 모든 인덱스에 있는 값을 변경해주세요.
		array1[0] = 11;
		array1[1] = 12;
		array1[2] = 13;
		array1[3] = 14;
		array1[4] = 15;
		array1[5] = 16;
		array1[6] = 17;
		array1[7] = 18;
		array1[8] = 19;
		array1[9] = 20;

		String arrayStr2 = Arrays.toString(array1);
		System.out.println(arrayStr2);

		// 모든 인덱스에 있는 값을 더해주세요.
		int array1_sum = 0;
		array1_sum += array1[0];
		array1_sum += array1[1];
		array1_sum += array1[2];
		array1_sum += array1[3];
		array1_sum += array1[4];
		array1_sum += array1[5];
		array1_sum += array1[6];
		array1_sum += array1[7];
		array1_sum += array1[8];
		array1_sum += array1[9];
		System.out.println(array1_sum);

		// index는 1씩 증가하는 규칙이 있어 for문과 함께 사용하기 좋다.
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		// 배열의 길이를 알고있다고 숫자를 사용하는 것을 하드코딩이라고 한다.
		// 길이를 알더라도 length를 사용하는 것이 더 좋은 코드이다.

		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		System.out.println(Arrays.toString(array));

		// 배열에 숫자를 담고 합계와 평균을 구해보자.
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(numbers));

		int sum = 0; // 합계
		double avg = 0; // 평균
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		avg = (double) sum / numbers.length; // 둘 다 int형이므로 형변환
		System.out.println("합계 : " + sum + " / 평균 : " + avg);

		// 향상된 for문
		for (int number : numbers) { // 배열에 있는 값을 차례대로 변수에 넣는다.
			// : 뒤에 배열명이 오고, 배열에 맞는 데이터 타입을 : 앞에 선언해줘야함
			System.out.println(number);
			// 단점 : 특정 인덱스로 뭘 할 수 없음, 반복문 안에서 변경 불가능 => 오직 읽을때만 사용!
		}

		// 배열에 저장된 숫자들 중 최소값과 최대값을 찾아주세요.
		int max = numbers[0]; // 첫번째 배열값 저장
		int min = numbers[0]; // "
		for (int i = 1; i < numbers.length; i++) { // 두번째 배열값부터 마지막까지 계속 반복
			if (min > numbers[i]) { // 최소값보다 더 작은 값이 있으면
				min = numbers[i]; // 최소값에 그 값을 대입
			}
			if (max < numbers[i]) { // 최대값보다 더 큰 값이 있으면
				max = numbers[i]; // 최대값에 그 값을 대입
			}
		}
		System.out.println("최대값 : " + max + " / 최소값 : " + min);

		// 순서대로 저장되어 있는 값 뒤죽박죽 섞기
		int[] shuffle = new int[30]; // 30개짜리 배열 선언
		for (int i = 0; i < shuffle.length; i++) { // 1~30 값 지정
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));

		// 배열의 값을 섞어주세요.
		// 0번의 인덱스 값과 랜덤 인덱스 값을 서로 교환한다.
		int tmp = 0; // shuffle[0]을 저장할 임시 변수
		for (int i = 0; i < shuffle.length; i++) {
			int random = (int) (Math.random() * shuffle.length); // 0~29까지니까 0부터
																	// 30개
			tmp = shuffle[0];
			shuffle[0] = shuffle[random];
			shuffle[random] = tmp;
		}
		System.out.println(Arrays.toString(shuffle));

		// 1~10 사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요. //난수 == 랜덤한 수

		/*
		 * int[] arr = new int[500]; int num1 = 0; int num2 = 0; int num3 = 0;
		 * int num4 = 0; int num5 = 0; int num6 = 0; int num7 = 0; int num8 = 0;
		 * int num9 = 0; int num10 = 0;
		 * 
		 * for(int i = 0; i < arr.length; i++){ arr[i] = (int)(Math.random() *
		 * 10) + 1; if(arr[i] == 1){ num1 ++; }else if(arr[i] == 2){ num2 ++;
		 * }else if(arr[i] == 3){ num3 ++; }else if(arr[i] == 4){ num4 ++; }else
		 * if(arr[i] == 5){ num5 ++; }else if(arr[i] == 6){ num6 ++; }else
		 * if(arr[i] == 7){ num7 ++; }else if(arr[i] == 8){ num8 ++; }else
		 * if(arr[i] == 9){ num9 ++; }else if(arr[i] == 10){ num10 ++; }
		 * 
		 * } System.out.println("1의 개수 : " + num1);
		 * System.out.println("2의 개수 : " + num2); System.out.println("3의 개수 : "
		 * + num3); System.out.println("4의 개수 : " + num4);
		 * System.out.println("5의 개수 : " + num5); System.out.println("6의 개수 : "
		 * + num6); System.out.println("7의 개수 : " + num7);
		 * System.out.println("8의 개수 : " + num8); System.out.println("9의 개수 : "
		 * + num9); System.out.println("10의 개수 : " + num10);
		 */

		int[] num2 = new int[500];

		for (int i = 0; i < num2.length; i++) {

			num2[i] = (int) (Math.random() * 10) + 1; // 1~10까지 랜덤한 수
			System.out.print(num2[i] + ", ");
		}
		System.out.println();

		// 배열에 들어있는 숫자들이 각각 몇개 들어있는지 카운트 세기
		int[] count = new int[10];

		int temp = 0;
		for (int i = 0; i < num2.length; i++) {
			temp = num2[i] - 1; //임시변수에 1~10 값에서 -1해줘서 count인덱스를 0~9로 만들어줌
			count[temp]++; // count[num2[i]]++를 할 경우 0~9였다면 가능한데 1~10이라 10이 들어가면 초과 (count의 인덱스는 1~9)
		}
		for (int i = 0; i < count.length; i++) {
			System.out.println(i + 1 + "의 개수 : " + count[i]); // 카운트 출력을 위한 구문
		}

		// 위 문제의 최소값, 최대값, 반복횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요.
		Scanner s = new Scanner(System.in);
		
		System.out.println("최소값을 입력해주세요 : ");
		int min2 = Integer.parseInt(s.nextLine());
		System.out.println("최대값을 입력해주세요 : ");
		int max2 = Integer.parseInt(s.nextLine());
		System.out.println("반복 횟수를 입력해주세요 : ");
		int repeat = Integer.parseInt(s.nextLine());
		
		int[] count2 = new int[max2 - min2 + 1]; // 카운트 배열 생성, 크기는 최대값만큼

		int[] arr3 = new int[repeat]; // 500크기의 배열 생성
		for (int i = 0; i < arr3.length; i++) { // 최소~최대 사이의 숫자를 500번 대입
			arr3[i] = (int) (Math.random() * (max2 - min2) + 1) + min2;
			System.out.print(arr3[i] + ", "); // 배열값들 출력
		}
		System.out.println();
		
		int temp2 = 0;
		for (int i = 0; i < arr3.length; i++) { // 500번 카운트++
			temp2 = arr3[i] - min2; // 최소~최대값을 인덱스에 쓸 수 있게 최소만큼 빼줌
			count2[temp2]++;
		}
		for (int i = 0; i < count2.length; i++) {
			System.out.println(i + 1 + "의 개수 : " + count2[i]);
		}
		
	}
}
