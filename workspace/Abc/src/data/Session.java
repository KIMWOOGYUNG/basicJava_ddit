package data;

import vo.UserVO;

public class Session {
	//세션 : 인터넷 브라우저가 열려있는 동안 유지되는 저장 공간
	
	//로그인 되어있는 유저의 정보를 저장
	//예매, 스낵 결제 시 저장
	//관리자가 기능 수행 시 저장
	
	//로그인 시 다시 정보 들고옴(장바구니 담아놓고 로그아웃한 뒤 다시 로그인해도 기록이 남아있어야함) 
	private static Session instance;
	
	private Session() {}

	public static Session getInstance() {
		if (instance == null) {
			instance = new Session();
		}
		return instance;
	}
	
	public static UserVO loginUser;
	
//	private static Map<String, Object> attribute;
//
//	public static Map<String, Object> getAttribute() {
//		return attribute;
//	}
//
//	public static void setAttribute(Map<String, Object> attribute) {
//		Session.attribute = attribute;
//	}

	
}

