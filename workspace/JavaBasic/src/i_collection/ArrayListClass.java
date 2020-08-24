package i_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * add()	: 마지막 위치에 객체를 추가
		 * get() 	: 지정된 위치의 객체를 반환 //index번호로
		 * set() 	: 지정된 위치에 주어진 객체를 저장(수정)
		 * remove()	: 지정된 위치의 객체를 제거
		 * size()	: 저장된 객체의 수 반환 //컬렉션에서는 length말고 size 사용
		 */
		
		ArrayList<Object> list = new ArrayList<Object>(); //화살괄호 안에 클래스 : 타입을 지정(제네틱)
		
		list.add(10);
		list.add("abc");
		list.add(true);
		list.add(new ArrayListClass());
		//제네틱을 광범위하게 잡으면 넣을땐 편하지만 꺼낼때 타입이 예상이 안되어 좋지 x
		
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("abc");
		list2.add("123");
		list2.add("가나다");
		list2.set(1, "456"); //1번 인덱스 값 수정
		
		for(int i = 0; i < list2.size(); i++){
			System.out.println(list2.get(i));
		}
		
		list2.remove(0);
		//리스트에 저장된 값을 삭제하면 그뒤의 모든 값의 인덱스가 당겨진다.
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<>(); //2차원 배열
		
		ArrayList<Integer> list4 = new ArrayList<>();
		list4.add(10);
		list4.add(20);
		list4.add(30);
		list3.add(list4);
		
		/*ArrayList<Integer> list5 = new ArrayList<>(); //변수를 하나 더 만들거나
		list5.add(40);
		list5.add(50);
		list5.add(60);
		list3.add(list5);*/
		
		list4 = new ArrayList<>();
		list4.add(40);
		list4.add(50);
		list4.add(60);
		
		list3.add(list4);
		System.out.println(list3);
		
		//정수를 저장할 수 있는 ArrayList를 생성해 값을 5번 저장해주세요
		ArrayList<Integer> list_2 = new ArrayList<>();
		list_2.add(9);
		list_2.add(5);
		list_2.add(0);
		list_2.add(8);
		list_2.add(7);
		
		//위에서 만든 ArrayList에 저장된 값들의 합계와 평균을 출력해주세요.
		int list_2_sum = 0;
		double list_2_avg = 0;
		for(int i = 0; i < list_2.size(); i++){
			list_2_sum += list_2.get(i);
		}
		list_2_avg = (double)list_2_sum / list_2.size();
		System.out.println("합 : " + list_2_sum + " 평균 : " + list_2_avg);
		
		//위에서 만든 ArrayList에 저장된 값들 중 최소값과 최대값을 출력해주세요.
		int max = list_2.get(0);
		int min = list_2.get(0);
		
		for(int i = 1; i < list_2.size(); i++){
			if(list_2.get(i) > max){
				max = list_2.get(i);
			}
			if(list_2.get(i) < min){
				min = list_2.get(i);
			}
		}
		System.out.println("최대값 : " + max + " 최소값 : " + min);
		
		
		
	}

}
