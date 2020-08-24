package vo;

public class TheaterScheduleVO {
	//상영시간표 : 상영시간표번호(PK), 영화번호(FK), 상영관번호(FK), 상영시작시간
	
	private int scheduleNum;  //상영시간표번호
	private int movieNum;  //영화번호(MovieVO참조)
	private int theaterNum;  //상영관번호(TheaterVO참조)
	private String movieStartTime;  //상영시작시간
	
	public int getScheduleNum() {
		return scheduleNum;
	}
	public void setScheduleNum(int scheduleNum) {
		this.scheduleNum = scheduleNum;
	}
	public int getMovieNum() {
		return movieNum;
	}
	public void setMovieNum(int movieNum) {
		this.movieNum = movieNum;
	}
	public int getTheaterNum() {
		return theaterNum;
	}
	public void setTheaterNum(int theaterNum) {
		this.theaterNum = theaterNum;
	}
	public String getMovieStartTime() {
		return movieStartTime;
	}
	public void setMovieStartTime(String movieStartTime) {
		this.movieStartTime = movieStartTime;
	}
	
	
}
