package vo;

public class SnackCartVO {
   //스낵 장바구니 : 번호(PK), 회원아이디(FK), 수량, 스낵번호(FK), 결제번호(FK 초기값이 -1)
   
   private int snackCartNum;  //스낵카트번호
   private String userId;  //회원아이디
   private int snackCount;  //스낵의 수량
   private int snackNum;  //스낵번호(SnackVO참조)
   private int paymentNum = -1;  //결제번호(PaymentVO참조)
   
   public int getSnackCartNum() {
      return snackCartNum;
   }
   public void setSnackCartNum(int snackCartNum) {
      this.snackCartNum = snackCartNum;
   }
   public String getUserId() {
      return userId;
   }
   public void setUserId(String userId) {
      this.userId = userId;
   }
   public int getSnackCount() {
      return snackCount;
   }
   public void setSnackCount(int snackCount) {
      this.snackCount = snackCount;
   }
   public int getSnackNum() {
      return snackNum;
   }
   public void setSnackNum(int snackNum) {
      this.snackNum = snackNum;
   }
   public int getPaymentNum() {
      return paymentNum;
   }
   public void setPaymentNum(int paymentNum) {
      this.paymentNum = paymentNum;
   }
   
}