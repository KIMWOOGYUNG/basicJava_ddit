package dao;

import java.util.ArrayList;

import vo.MovieVO;
import vo.ReviewVO;

public class ReviewDAO {
	
	private static ReviewDAO instance;

	private ReviewDAO() {}

	public static ReviewDAO getInstance() {
		if (instance == null) {
			instance = new ReviewDAO();
		}
		return instance;
	}

	Database database = Database.getInstance();
	
	MovieDAO movieDAO = MovieDAO.getInstance();
	ReviewVO reviewVO = new ReviewVO();
	public static ArrayList<MovieVO> ArrayReviewDB = new ArrayList<MovieVO>();
	
	public void selectMovieList(){
		for(int i=0; i<movieDAO.selectMovieList().size(); i++){
			ArrayReviewDB.add(movieDAO.selectMovieList().get(i));
		}
	}
	
	public void insertReview(ReviewVO review){
		 database.tb_review.add(review);
		 //리뷰추가
	 }
	 
	 public ArrayList<ReviewVO> selectReviewList(){
		 return database.tb_review; //리뷰리스트
	 }
	 public void deleteReview(int review) {
		    database.tb_review.remove(review);
	  }
	 
	 
	 
}
