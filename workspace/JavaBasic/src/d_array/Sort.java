package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * << 정렬 >> 
		 * - 선택정렬 : 첫번째 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은수와 자리 바꾸기를 반복해 
		 * 			앞에서부터 작은수를 채워나가는 방식 
		 * - 버블정렬 : 첫번째 숫자부터 바로 뒤 숫자와 비교해서 작은수와 자리 바꾸기를 반복해 
		 * 			뒤에서부터 큰수를 채워나가는 방식
		 * - 삽입정렬 : 두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰수들을 뒤로 밀고 중간에 삽입하는 방식
		 * 
		 * << 석차구하기 >> - 모든 점수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점수가 작으면 1씩 증가시키는 방식
		 */

		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}

		shuffle(numbers);
		System.out.println(Arrays.toString(numbers));

		 printRank(numbers); //석차구하기
		// selectSort(numbers); //선택정렬
		// bubbleSort(numbers); //버블정렬
		InsertSort(numbers); // 삽입정렬
		System.out.println(Arrays.toString(numbers));
	}

/*	private static void InsertSort(int[] numbers) {
		int temp = 0;
		for (int i = 1; i < numbers.length; i++) {
			for (int j = i; j > 0; j--) {
				if (numbers[j] < numbers[j - 1]) {
					temp = numbers[j - 1];
					numbers[j - 1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}*/

	private static void InsertSort(int[] numbers) {
		for (int i = 1; i < numbers.length; i++) {
			int temp = numbers[i]; //임시값에 비교할 기준값을 넣어준다
			int j = 0; //초기화
			for (j = i - 1; j >= 0; j--) { //j는 기준값보다 하나 작은것 부터 제일 작은 0까지 1씩 줄어들면서 비교를 해나간다
				if (temp < numbers[j]) { //기준값보다 비교할 값이 더 크면
					numbers[j + 1] = numbers[j]; //비교할값 다음칸(j + 1)에 그 값을 넣어줌으로써 밀어준다
				} else {
					break; // 더 크지 않다면 값을 밀지 않고 비교하는 for문을 빠져나온다
				}
			}
			numbers[j + 1] = temp; //비어있는 칸에 원래 기준값이 담겨있는 임시변수를 넣어준다
		}
	}
	

	/*
	 * 0,1 1,2 2,3 3,4 4,5 5,6 6,7 7,8 8,9 
	 * 0,1 1,2 2,3 3,4 4,5 5,6 6,7 7,8 
	 * 0,1 1,2 2,3 3,4 4,5 5,6 6,7 
	 * 0,1 1,2 2,3 3,4 4,5 5,6 
	 * 0,1 1,2 2,3 3,4 4,5 
	 * 0,1 1,2 2,3 3,4 
	 * 0,1 1,2 2,3 
	 * 0,1 1,2 
	 * 0,1
	 */

	/*
	 * private static void bubbleSort(int[] numbers) {
		boolean changed = false;
		int temp = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - 1 - i; j++) { //검사하고 고정된 수는 비교 안해도 되니까 (length-i-1)
				if (numbers[j] > numbers[j + 1]) {
					// 비교를 j와 j + 1끼리 계속 쌍으로 1씩 증가하면서 한다
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					changed = true;
				}
			}
			if (!changed) {
				break;
			}
		}
	}
	 */

	/*
	 * 0,1 1,2 2,3 3,4 4,5 5,6 6,7 7,8 8,9 
	 * 1,2 2,3 3,4 4,5 5,6 6,7 7,8 8,9 
	 * 2,3 3,4 4,5 5,6 6,7 7,8 8,9 
	 * 3,4 4,5 5,6 6,7 7,8 8,9 
	 * 4,5 5,6 6,7 7,8 8,9 
	 * 5,6 6,7 7,8 8,9 
	 * 6,7 7,8 8,9 
	 * 7,8 8,9 
	 * 8,9
	 */
	/*
	private static void selectSort(int[] numbers) {
		int temp = 0;
		//처음에 배열 중 최소값을 numbers[i]에 저장함
		for (int i = 0; i < numbers.length - 1; i++) { i는 인덱스 0부터 끝에서 두번째 인덱스까지!(마지막은 j꺼니까~)
			for (int j = i + 1; j < numbers.length; j++) { //j는 i의 다음 인덱스 부터 마지막 인덱스까지
				if (numbers[i] > numbers[j]) { // 기준 비교점(i)을 고정 해놓고 j가 증가하면서 비교
		 			temp =numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
					
				}
			}
		}
	}
	 */

	
	 private static void printRank(int[] numbers) {
		int[] rank = new int[numbers.length];

		for (int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		}
		// 석차구하기는 앞 값들과 다 비교!!!(전체 중에서의 순위를 구하기 위해)
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println("랭크" + Arrays.toString(rank));
	}
	 

	private static void shuffle(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			int random = (int) (Math.random() * numbers.length);

			int temp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;
		}

	}
}
