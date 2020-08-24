package f_oop2;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	
	//private이라 직접 접근할 수 없으니까 get, set으로 함수를 만들어서 접근 가능하게 해줌
	public int getHour() { //다른 클래스에서 변수의 값을 얻을 수 있는 메서드
		return hour;
	}
	
	//말도 안되는 값 입력을 방지하기 위해 set 사용
	public void setHour(int hour) { //다른 클래스에서 변수를 저장할 수 있는 메서드
		this.hour = hour;
		if(this.hour < 0){
			this.hour = 0;
		}
		else{
			this.hour = hour % 24;
		}
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
		if(this.minute < 0){
			this.minute = 0;
		}
		else{
			this.minute = minute % 60;
			setHour(this.hour + minute / 60);
		}
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
		if(this.second < 0){
			this.second = 0;
		}
		else{
			this.second = this.second % 60;
			setMinute(this.minute + second / 60); //함수를 통해서만 값을 바꿀 수 있음
			//minute += second / 60; //전역변수가 private이니까 값을 바꿔줄 수 없음
		}
	}
	
	@Override //object 클래스에서 상속받은것
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	
}
