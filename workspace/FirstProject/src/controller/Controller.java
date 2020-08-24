package controller;

import java.util.ArrayList;
import java.util.Scanner;

import data.MovieList;

public class Controller {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input;
		
		menu();
		input = Integer.parseInt(s.nextLine());
		switch(input){
		case 1 : ticket();
		case 2 : ; //스낵
		case 3 : ; //주차
		}
			
	
		
	}

	static void menu(){
		
		System.out.println("----------------------------");
		System.out.println("**CGB에 오신걸 환영합니다!**");
		System.out.println("원하시는 메뉴를 선택해주세요.");
		System.out.println("----------------------------");
		System.out.println("1. 영화 예매 및 발권");
		System.out.println("2. 스낵바 이용");
		System.out.println("3. 차량 등록");
		System.out.println();
		System.out.println("9. 이전페이지로 돌아가기");
		System.out.println("0. 처음으로 돌아가기");
		System.out.println("----------------------------");
	}
	
	static void ticket(){
		Scanner s = new Scanner(System.in);
		int input;
		
		System.out.println("----------------------------");
		System.out.println("1. 현장에서 예매하기");
		System.out.println("2. 온라인 예매 발권하기");
		System.out.println("----------------------------");
		
		input = Integer.parseInt(s.nextLine());
		switch(input){
		case 1 : offline();
			break;
		case 2 : online();
			break;
		
		case 9 : menu();
			break;
			
		case 0 : menu();
			break;
			
		default : System.out.println("잘못 입력하셨습니다. 다시 시도해주세요.");
		}
	}
	
	static MovieList movieList = new MovieList();
	
	/*//오프라인 예매 발권
	static void offline(){
		System.out.println();
		System.out.println("**영화선택** -> 날짜선택 -> 시간선택 -> 인원수 선택 -> 좌석선택 -> 결제");
		System.out.println();
		System.out.println("관람하실 영화를 선택해주세요>>");
		System.out.println();
		//영화선택
		MovieList ml = new MovieList();
		System.out.println("1.해치지 않아");
		System.out.println("2.나쁜녀석들-포에버");
		System.out.println("3.닥터두리틀");
		System.out.println("4.남산의부장들");
		System.out.println("5.스타워즈-라이즈오브스카이워커");
		//날짜선택
		//시간선택
		//인원수입력
		//좌석선택
		//결제
		
	}*/
	
	//온라인 예매 발권
	static void online(){
		Scanner s = new Scanner(System.in);
		int input;
		int reserv_num_in_db = 12345;
		
		do{
			System.out.println("--------------------------------");
			System.out.println("예매번호를 입력해주세요>>");
			System.out.println("--------------------------------");
			input = Integer.parseInt(s.nextLine());
			int reserv_num = input;
			if(reserv_num != reserv_num_in_db){
				System.out.println();
				System.out.println("**예매번호가 올바르지 않습니다. 다시 입력해주세요**");
			}else{
				System.out.println("---------------------------");
				System.out.println("발권하실 영화를 선택해주세요");
				System.out.println("---------------------------");
				System.out.println("1. ㅇㅇㅇ / ㅇ월ㅇ일 / ㅇ시 / ㅇ명");
				System.out.println("2. ㅇㅇㅇ / ㅇ월ㅇ일 / ㅇ시 / ㅇ명");
				System.out.println("3. ㅇㅇㅇ / ㅇ월ㅇ일 / ㅇ시 / ㅇ명");
				System.out.println();
				System.out.println("9. 이전페이지로 돌아가기");
				System.out.println("0. 처음으로 돌아가기");
				System.out.println("----------------------------");
			}
		}while(input != reserv_num_in_db);
	}
	
	
}
