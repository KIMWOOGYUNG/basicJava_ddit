package service;

import java.util.Scanner;

import vo.UserVO;
import controller.Admin;
import controller.Controller;
import dao.UserDAO;
import data.Session;

//아이디 중복확인
public class UserService {
	
	private static UserService instance;

	private UserService() {}

	public static UserService getInstance() {
		if (instance == null) {
			instance = new UserService();
		}
		return instance;
	}
	
	Scanner s = new Scanner(System.in);
	
	private UserDAO userDao = UserDAO.getInstance();
	
	//회원가입
	public void join(){
		UserVO user = new UserVO();
		
		//사용자 정보 입력
		System.out.println("아이디 : ");
		String id = s.nextLine();
		user.setUserId(id);
		
		//아이디 중복 검사
		UserVO userCheck = userDao.selectUser(user);
		
		//없으면 회원가입
		if(userCheck == null){
			System.out.println("비밀번호 : ");
			String password = s.nextLine();
			System.out.println("이름 : ");
			String name = s.nextLine();
			System.out.println("연락처 : ");
			String phone = s.nextLine();
			System.out.println("주민번호 앞자리 : ");
			int reg1 = Integer.parseInt(s.nextLine());
			
			user.setUserPwd(password);
			user.setUserName(name);
			user.setUserPhone(phone);
			user.setUserReg1(reg1);
			
			userDao.insertUser(user);
			System.out.println("가입해주셔서 감사합니다.");
		}else{
			//있으면 아이디 중복
			System.out.println("중복된 아이디입니다.");
		}
		
	}
	
	//로그인
	public void login(){
		Admin admin = new Admin();
		
		//아이디, 비밀번호를 입력
		System.out.println("------------------------------------");
		System.out.println("아이디 : ");
		String id = s.nextLine();
		System.out.println("비밀번호 : ");
		String pwd = s.nextLine();
		System.out.println("------------------------------------");
		
		UserVO user = new UserVO();
		user.setUserId(id);
		user.setUserPwd(pwd);
		
		UserVO userCheck = userDao.selectUser(user);
		
		//없으면 로그인 실패
		if(userCheck == null){
			System.out.println("아이디 혹은 비밀번호를 잘못 입력하셨습니다.");
		}else{  //있으면 로그인
			//관리자 페이지로 이동
			if(id.equals("admin") && pwd.equals("admin")) {
				System.out.println("**관리자 권한으로 로그인 되셨습니다.**");
				admin.admin();
				System.exit(0);
			}
			System.out.println("로그인 성공!!");
			System.out.println(userCheck.getUserName() + "님 환영합니다.");
			Session.loginUser = userCheck;	//세션에 정보저장
			
//			Map<String, Object> attribute = Map<"id", userCheck>();
//			Session.setAttribute(Map<"id", userCheck>);
		}
	
		Controller.menu_start();
		
	}
	
	
	//회원목록
	public void userList(){
		
	}
	
}









