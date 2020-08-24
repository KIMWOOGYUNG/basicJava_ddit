package vo;

import java.util.Date;

public class ReviewVO {
	//리뷰 : 리뷰번호(PK), 회원아이디, 평점, 리뷰 내용, 날짜, 영화번호(FK)
	
	private int reviewNum;  //리뷰번호
	private String userId;   //회원아이디(UserVO참조)
	private String reviewGrade;  //평점
	private String reviewContent;  //리뷰내용
	private Date reviewDate;  //날짜
	private int movieNum;  //영화번호(MoviewVO참조)
	
	
	public int getReviewNum() {
		return reviewNum;
	}
	public void setReviewNum(int reviewNum) {
		this.reviewNum = reviewNum;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getReviewGrade() {
		return reviewGrade;
	}
	public void setReviewGrade(String reviewGrade) {
		this.reviewGrade = reviewGrade;
	}
	public String getReviewContent() {
		return reviewContent;
	}
	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}
	public Date getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}
	public int getMovieNum() {
		return movieNum;
	}
	public void setMovieNum(int movieNum) {
		this.movieNum = movieNum;
	}
	
	
}
