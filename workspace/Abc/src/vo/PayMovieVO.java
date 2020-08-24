package vo;

public class PayMovieVO {
	//영화 결제 : 영화결제번호(PK), 상영시간표번호(FK), 좌석번호(FK), 결제번호(FK) 
	
	private int paymovie_number;
	private int sc_number;  //상영시간표번호
	private int seat_number;  //좌석번호
	private int payment_number;  //결제번호
	
	public int getPaymovie_number() {
		return paymovie_number;
	}
	public void setPaymovie_number(int paymovie_number) {
		this.paymovie_number = paymovie_number;
	}
	public int getSc_number() {
		return sc_number;
	}
	public void setSc_number(int sc_number) {
		this.sc_number = sc_number;
	}
	public int getSeat_number() {
		return seat_number;
	}
	public void setSeat_number(int seat_number) {
		this.seat_number = seat_number;
	}
	public int getPayment_number() {
		return payment_number;
	}
	public void setPayment_number(int payment_number) {
		this.payment_number = payment_number;
	}
	
}
