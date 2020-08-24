package service;

import java.util.Scanner;
import java.util.regex.Pattern;

import controller.Controller;

public class prac {
	
	public static void main(String[] args) {
		 new prac().start();
		
	}
	
	private UserService userService = UserService.getInstance(); //회원가입, 로그인, 회원목록 가져오려고
	
	
	void start(){
		Scanner s = new Scanner(System.in);
		
		int menu;
		
		do{
			System.out.println("--------------메뉴-------------");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원목록");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------------------");
			System.out.println("메뉴에 해당하는 번호 입력>");
			
			menu = Integer.parseInt(s.nextLine()); //메뉴입력받기
			
			switch(menu) {
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

}
