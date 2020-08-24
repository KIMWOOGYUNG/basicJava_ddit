package controller;

import java.util.Scanner;

import data.ReservationList;

public class OnlineTicketing {
	static ReservationList reservList = new ReservationList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//온라인 예매 발권
	static void online(){
		Scanner s = new Scanner(System.in);
		String input;
//		ReservationList reserv_num = new ReservationList();
		
		do{
			System.out.println("--------------------------------");
			System.out.println("예매번호를 입력해주세요>>");
			System.out.println("--------------------------------");
			input = s.nextLine();
			String a = ReservationList.numList.get(i).get(0);
			if(!input.equals()){
				System.out.println();
				System.out.println("**예매번호가 올바르지 않습니다. 다시 입력해주세요**");
			}else{
				System.out.println("---------------------------");
				System.out.println("발권하실 영화를 선택해주세요");
				System.out.println("---------------------------");
				
				
				
				System.out.println();
				System.out.println("9. 이전페이지로 돌아가기");
				System.out.println("0. 처음으로 돌아가기");
				System.out.println("----------------------------");
			}
		}while(input != reserv_num_in_db);
	}
	

}
