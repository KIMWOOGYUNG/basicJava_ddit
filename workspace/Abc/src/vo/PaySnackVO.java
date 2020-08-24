package vo;

public class PaySnackVO {
	//스낵 결제 : 스낵결제번호(PK), 스낵번호(FK), 수량, 결제번호(FK)
	
	private int paysnack_number;
	private int snack_number;  //스낵번호
	private int paysnack_snack_amount;  //수량
	private int payment_number;  //결제번호
	
	public int getPaysnack_number() {
		return paysnack_number;
	}
	public void setPaysnack_number(int paysnack_number) {
		this.paysnack_number = paysnack_number;
	}
	public int getSnack_number() {
		return snack_number;
	}
	public void setSnack_number(int snack_number) {
		this.snack_number = snack_number;
	}
	public int getPaysnack_snack_amount() {
		return paysnack_snack_amount;
	}
	public void setPaysnack_snack_amount(int paysnack_snack_amount) {
		this.paysnack_snack_amount = paysnack_snack_amount;
	}
	public int getPayment_number() {
		return payment_number;
	}
	public void setPayment_number(int payment_number) {
		this.payment_number = payment_number;
	}
	
}
