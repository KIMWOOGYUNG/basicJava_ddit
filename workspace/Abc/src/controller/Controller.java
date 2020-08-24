package controller;

import java.util.Scanner;

import service.UserService;
import snackbar.SnackBar;

public class Controller {
	//뷰 & 실행화면
	public static void main(String[] args) {
		new Controller().login_start();
	}
	
	UserService userService = UserService.getInstance();
	
	void login_start(){
		int menu;		
		do{
			Scanner s  = new Scanner(System.in);
			System.out.println("-------------- 메뉴 --------------");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 아이디/비번 찾기");
			System.out.println("0. 프로그램 종료");
			System.out.println("--------------------------------");
			System.out.println("메뉴에 해당하는 번호 입력>");
			
			menu = Integer.parseInt(s.nextLine());
			
			switch(menu){
			case 1: //회원가입
				userService.join();
				break;
			case 2: //로그인
				userService.login();
				break;
			case 3: //회원목록
				userService.userList();
				break;
			case 0: //프로그램 종료
				System.out.println("프로그램 종료");
				break;
				
			}
		}while(menu != 0);
	}
	
	public static void menu_start() {
		int menu;
		do {
			Scanner s  = new Scanner(System.in);
			System.out.println("----------------------------");
			System.out.println("**CGB에 오신걸 환영합니다!**");
			System.out.println("<<초기화면>>");
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("----------------------------");
			System.out.println("1. 영화 예매");
			System.out.println("2. 스낵 구매");
			System.out.println("3. 예매확인");
			System.out.println("4. 마이페이지");
			System.out.println("5. 리뷰");
			
			System.out.println("0. 프로그램 종료");
			System.out.println("--------------------------------");
			System.out.println("메뉴에 해당하는 번호 입력>");
			
			menu = Integer.parseInt(s.nextLine());
			
			
			
			switch (menu) {
			case 1: // 영화 예매
				break;
			case 2: // 스낵 구매
				SnackBar.popcornMenu1();
				break;
			case 3: // 예매확인
				break;
			case 4: //마이페이지
				break;
			case 5: //리뷰페이지
				break;
			case 0: // 프로그램 종료
				System.out.println("로그아웃되셨습니다.");
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			}
			
		} while (false/*menu != 0*/);		
	}
	
	
	
	
}
