package data;

import java.util.ArrayList;
import vo.UserVO;

public class Database {
	private static Database instance; //인스턴스 변수 생성 (클래스명 변수명)
	private Database(){ }//싱글톤패턴(생성자에 Private) 
		
	public static Database getInstance(){ //인스턴스 메서드 생성 (클래스명 변수명)
		if(instance == null){ instance = new Database(); } return instance; }
		
	public ArrayList<UserVO> tb_user = new ArrayList<>(); 
	//초기화 블럭으로 데이터 넣음
	{
		UserVO user = new UserVO(); //UserVO 객체 생성
		user.setId("admin");
		user.setPassword("admin");
		user.setName("관리자");
		tb_user.add(user); //tb_user라는 ArrayList에 user를 넣어줌
	}
}
