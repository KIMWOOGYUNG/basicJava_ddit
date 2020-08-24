package dao;

import java.util.ArrayList;

import vo.UserVO;
import data.Database;

public class UserDao {
	
	//싱글톤패턴(생성자에 Private)
	private static UserDao instance; //변수 생성 (클래스명 변수명)
		
	private UserDao(){ 
		//다른애가 호출할 수 없으니 객체생성 할 수 없음
		//변수에 객체를 넣어서 그 변수를 가지고 다른애가 사용할 수 있게 함	
	}
		
	public static UserDao getInstance(){ //메서드 생성 (클래스명 변수명)
		if(instance == null){ //가입된게 없으면 
			instance = new UserDao();
		}
		return instance;
	}
	
	//데이터베이스 사용하기 위해 객체생성
	Database database = Database.getInstance(); //데이터베이스 가져옴 (변수에 담음)
	// 데이터베이스가 private이니까 객체생성을 할 수 없어서 데이터 베이스 클래스의 함수로 접근한것
	
	//중복체크 (디비에 같은게 이미 있으면 리턴유저에 담고 반환) / (없으면 실행x)
	public UserVO selectUser(UserVO param){ //param이 UserVO를 담은 변수
		UserVO rtnUser = null; //중복이면 반환할 리턴유저 선언
		for(int i = 0; i < database.tb_user.size(); i++){
			UserVO user = database.tb_user.get(i); //user는 디비에 저장된 회원
			boolean flag = true; //true == '디비에 있다'
			
			//아이디 중복체크
			if(param.getId() != null){ //입력된게 있으면
				if(!param.getId().equals(user.getId())) //같지 않으면 안담음
				flag = false;} //false == '디비에 없다'
			
			if(param.getPassword() != null){
				if(!param.getPassword().equals(user.getPassword()))
				flag = false;}
			
			if(param.getName() != null){
				if(!param.getName().equals(user.getName())) 
				flag=false;}
			
			if(flag){
				rtnUser = user; //데이터베이스에 있으면 리턴에 담아라
				break;
			}
		}
				
		
		return rtnUser; //디비에 있어서 담았으면 그 값이 리턴될거고 없어서 못담았으면 리턴될게 x
	}

	//회원가입한 유저의 정보를 데이터베이스에(데이터베이스의 유저목록에) 저장
	public void insertUser(UserVO user) { 
		database.tb_user.add(user);
		
	}

	public ArrayList<UserVO> selectUserList() { //유저목록 리턴
		return database.tb_user;
	}
}
