package vo;

public class SnackCategoryVO {
	//스낵종류 : 스낵종류번호(PK), 카테고리명
	
	private int snackCategoryNum;  //스낵종류번호PK
	private String snackCategoryName;  //카테고리명 ( 0.팝콘  1.음료  2.스낵류  3.세트)
	
	
	public int getSnackCategoryNum() {
		return snackCategoryNum;
	}
	public void setSnackCategoryNum(int snackCategoryNum) {
		this.snackCategoryNum = snackCategoryNum;
	}
	public String getSnackCategoryName() {
		return snackCategoryName;
	}
	public void setSnackCategoryName(String snackCategoryName) {
		this.snackCategoryName = snackCategoryName;
	}
	
}
