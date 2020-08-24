package vo;

public class CartVO {
   //장바구니 : 스낵주문번호(PK), 날짜, 회원아이디(FK)
   private int cart_snack_number;  //스낵주문번호
   private String snack_name; //스낵이름
   private String cart_date;
   private String user_id;
   private String movie_name;
   private int snack_count; //스낵 수량
   private int movie_count; //예매수량
   private int cart_price;  //장바구니의 모든 스낵금액을 더한 금액(->결제로 데이터 넘김)
   private int snack_price; //스낵 가격
   
   public int getSnack_count() {
      return snack_count;
   }
   public void setSnack_count(int snack_count) {
      this.snack_count = snack_count;
   }
   public String getSnack_name() {
      return snack_name;
   }
   public void setSnack_name(String snack_name) {
      this.snack_name = snack_name;
   }
   public int getSnack_price() {
      return snack_price;
   }
   public void setSnack_price(int snack_price) {
      this.snack_price = snack_price;
   }
   public int getMovie_count() {
      return movie_count;
   }
   public void setMovie_count(int movie_count) {
      this.movie_count = movie_count;
   }
   public String getMovie_name() {
      return movie_name;
   }
   public void setMovie_name(String movie_name) {
      this.movie_name = movie_name;
   }
   public int getCart_price() {
      return cart_price;
   }
   public void setCart_price(int cart_price) {
      this.cart_price = cart_price;
   }
   public int getCart_snack_number() {
      return cart_snack_number;
   }
   public void setCart_snack_number(int cart_snack_number) {
      this.cart_snack_number = cart_snack_number;
   }
   
   public String getCart_date() {
      return cart_date;
   }
   public void setCart_date(String cart_date) {
      this.cart_date = cart_date;
   }
   public String getUser_id() {
      return user_id;
   }
   public void setUser_id(String user_id) {
      this.user_id = user_id;
   }
   
}