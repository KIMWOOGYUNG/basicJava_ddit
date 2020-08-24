package vo;

import java.util.Date;

public class PaymentVO {
	//결제 :  결제번호(PK), 회원아이디(FK), 결제방식(신용카드, 현금, 현장결제), 결제일
	
	private int paymentNum;  //결제번호
	private String userId;  //회원아이디(UserVO참조)
	private String paymentForm;  //결제방식(1.신용카드 2.계좌이체  3.휴대폰결제)
	private Date paymentDate;  //결제일
	
	public int getPaymentNum() {
		return paymentNum;
	}
	public void setPaymentNum(int paymentNum) {
		this.paymentNum = paymentNum;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPaymentForm() {
		return paymentForm;
	}
	public void setPaymentForm(String paymentForm) {
		this.paymentForm = paymentForm;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	
}
