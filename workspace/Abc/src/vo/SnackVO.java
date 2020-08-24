package vo;

public class SnackVO {
	//스낵 : 스낵번호(PK), 스낵명, 금액, 스낵종류번호(FK)
	
	private int snackNum;  //스낵번호
	private String snackName;  //스낵명
	private int snackPrice;  //금액
	private int snackCategoryNum;  //스낵종류번호(SnackCategoryVO참조)
	
	public int getSnackNum() {
		return snackNum;
	}
	public void setSnackNum(int snackNum) {
		this.snackNum = snackNum;
	}
	public String getSnackName() {
		return snackName;
	}
	public void setSnackName(String snackName) {
		this.snackName = snackName;
	}
	public int getSnackPrice() {
		return snackPrice;
	}
	public void setSnackPrice(int snackPrice) {
		this.snackPrice = snackPrice;
	}
	public int getSnackCategoryNum() {
		return snackCategoryNum;
	}
	public void setSnackCategoryNum(int snackCategoryNum) {
		this.snackCategoryNum = snackCategoryNum;
	}
	
}
