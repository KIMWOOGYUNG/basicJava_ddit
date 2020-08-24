package vo;

public class TheaterVO {
	//상영관 : 상영관번호(PK), 상영관이름, 좌석 수, 좌석유무(Boolean타입 Array)
	
	private int theaterNum;  //상영관번호
	private String theaterName;  //상영관 이름
	private int seatCount;  //좌석 수
	private boolean seatCheck;  //좌석유무
	
	public int getTheaterNum() {
		return theaterNum;
	}
	public void setTheaterNum(int theaterNum) {
		this.theaterNum = theaterNum;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	public boolean isSeatCheck() {
		return seatCheck;
	}
	public void setSeatCheck(boolean seatCheck) {
		this.seatCheck = seatCheck;
	}
	
}
