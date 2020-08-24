package dao;

import java.util.ArrayList;

import vo.UserVO;

public class UserDAO {
	
	private static UserDAO instance;

	private UserDAO() {}

	public static UserDAO getInstance() {
		if (instance == null) {
			instance = new UserDAO();
		}
		return instance;
	}

	Database database = Database.getInstance();
	
	
	//아이디 중복 검사
	public UserVO selectUser(UserVO param){
		UserVO rtnUser = null;
		for(int i=0; i<database.tb_user.size(); i++){
			UserVO user = database.tb_user.get(i);
			boolean flag = true;
			if(param.getUserId() != null)
				if(!param.getUserId().equals(user.getUserId()))	flag = false;
			if(param.getUserPwd() != null)
				if(!param.getUserPwd().equals(user.getUserPwd())) flag = false;
			if(param.getUserName() != null)
				if(!param.getUserName().equals(user.getUserName())) flag = false;
			if(flag){
				rtnUser = user;
				break;
			}
		}
		return rtnUser;
	}
	
	
	//회원가입 시 유저 새로 등록
	public void insertUser(UserVO user) {
		database.tb_user.add(user);		
	}

	public ArrayList<UserVO> selectUserList() {		
		return database.tb_user;
	}
	
	//회원삭제
	public void deleteUser(int user){
		database.tb_user.remove(user);
	}
	
}





