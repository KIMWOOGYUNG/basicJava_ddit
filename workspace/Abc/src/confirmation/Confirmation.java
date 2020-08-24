package confirmation;

import java.util.Scanner;

import controller.Controller;

public class Confirmation {
	//회원에 따른 예매 확인
	
	public void confirmation() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("------------------------------------");
		System.out.println("영화예매 및 스낵 주문 목록");
		System.out.println("겨울왕국2, 고소팝콘L, 콜라, 나쵸  예매번호:4564789");
		System.out.println("------------------------------------");
		System.out.println("1. 환불");
		System.out.println("9. 초기화면으로 이동");
		System.out.println("0. 시스템 종료");
		System.out.println("실행하실 번호를 선택해주세요>");
		System.out.println("------------------------------------");
		
		int input = Integer.parseInt(s.nextLine());
		
		switch(input){
		case 1: //환불
			refun();
			break;
		case 9:
			Controller.menu_start();
			break;
		case 0:
			System.exit(0);
		default :
			System.out.println("잘못 입력하셨습니다. 다시 시도해주세요.");
			confirmation();
			break;
		}
		
	}
	
	//환불
	public void refun(){ 
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("------------------------------------");
		System.out.println("정말로 환불하시겠습니까?");
		System.out.println("1.yes  2.no");
		System.out.println("------------------------------------");
		int input = Integer.parseInt(s.nextLine());
		
		switch(input){
		case 1: //환불
			
			System.out.println("환불이 완료되었습니다");
			break;
		case 2:
			confirmation();
			break;
		default :
			System.out.println("잘못 입력하셨습니다. 다시 시도해주세요.");
			refun();
			break;
		}
		
		
	}
	
	
}



