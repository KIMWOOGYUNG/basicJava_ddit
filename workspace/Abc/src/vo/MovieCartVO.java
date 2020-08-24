package vo;

public class MovieCartVO {
	//예매 장바구니 : 영화카트번호(PK), 회원아이디(FK), 좌석선택한위치, 결제번호(FK), 상영시간표(FK)
	
	private int movieCartNum;  //영화카트번호
	private String userId;  //회원아이디(UserVO참조)
	private int seatLocation;  //좌석 선책한 위치
	private int paymentNum;  //결제번호(PaymentVO참조)
	private int scheduleNum;  //상영시간표(TheaterScheduleVO참조
	
	public int getMovieCartNum() {
		return movieCartNum;
	}
	public void setMovieCartNum(int movieCartNum) {
		this.movieCartNum = movieCartNum;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getSeatLocation() {
		return seatLocation;
	}
	public void setSeatLocation(int seatLocation) {
		this.seatLocation = seatLocation;
	}
	public int getPaymentNum() {
		return paymentNum;
	}
	public void setPaymentNum(int paymentNum) {
		this.paymentNum = paymentNum;
	}
	public int getScheduleNum() {
		return scheduleNum;
	}
	public void setScheduleNum(int scheduleNum) {
		this.scheduleNum = scheduleNum;
	}
	
}
