package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.UserVO;
import dao.UserDao;
import data.Session;

public class UserService {
	
	//싱글톤패턴
	private static UserService instance; //인스턴스 변수 생성 (클래스명 변수명)
	
	private UserService(){
		
	}
	
	public static UserService getInstance(){ //인스턴스 메서드 생성 (클래스명 변수명)
		if(instance == null){
			instance = new UserService();
		}
		return instance;
	}
	
	
	Scanner s = new Scanner(System.in);
	
	//유저다오 만들기
	private UserDao userDao = UserDao.getInstance();
	
	//회원가입
	public void join(){
		UserVO user = new UserVO(); //회원정보로 넘겨주려고(set)
		
		//사용자 정보 입력
		
		System.out.println("아이디  : ");
		String id = s.nextLine();
		
		user.setId(id); //VO클래스의 set에 입력받은 값을 넘겨줌 (회원정보 저장)

		//아이디 중복검사
		UserVO userCheck = userDao.selectUser(user);
		
		//없으면 회원가입
		if(userCheck == null){
		
		System.out.println("비밀번호 : ");
		String password = s.nextLine();
		
		System.out.println("이름 : ");
		String name = s.nextLine();
		
		user.setPassword(password);
		user.setName(name);
		
		userDao.insertUser(user);
		System.out.println("가입해주셔서 감사합니다.");
		
		}else{
			//있으면 아이디 중복
			System.out.println("아이디 중복");
		}
		
		
		
		
	}
	
	//로그인
	public void login(){
		//아이디 입력
		System.out.println("아이디  : ");
		String id = s.nextLine();

		//비밀번호 입력
		System.out.println("비밀번호 : ");
		String password = s.nextLine();
		
		//입력받은 현재 유저 정보를 vo에 저장
		UserVO user = new UserVO();
		user.setId(id);
		user.setPassword(password);
		
		//데이터베이스에 현재유저정보 넘겨줘서 일치하는지 확인
		UserVO userCheck = userDao.selectUser(user);
		
		if(userCheck == null){
			System.out.println("아이디 혹은 비밀번호를 잘못 입력하셨습니다.");
		}else{
			//있으면 로그인
			System.out.println("로그인 성공!!");
			System.out.println(userCheck.getName() + "님 환영합니다."); //vo로 가서 이름값 가져옴
			Session.loginUser = userCheck; //로그인되어있는 유저에 추가해줌
			
		}
		
	}
	
	//회원목록
	public void userList(){
		//회원 전체 조회
		ArrayList<UserVO> userList = userDao.selectUserList();
		
		//출력
		System.out.println("----------------------------------");
		System.out.println("번호\t아이디\t이름");
		System.out.println("----------------------------------");
		for(int i = 0; i < userList.size(); i++){
			UserVO user = userList.get(i);
			System.out.println(i + 1 + "\t" + user.getId() + "\t" + user.getName());
		}
	}
}

