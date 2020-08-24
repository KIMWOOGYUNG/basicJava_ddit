package vo;

public class UserVO {
//	회원 : 회원 아이디(PK), 비밀번호, 이름(닉네임), 전화번호, 생년월일
	
	private String userId;	//회원아이디
	private String userPwd;  //비밀번호
	private String userName;  //이름
	private String userPhone;  //전화번호
	private int userReg1;  //생년월일
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public int getUserReg1() {
		return userReg1;
	}
	public void setUserReg1(int userReg1) {
		this.userReg1 = userReg1;
	}
	
	
}
