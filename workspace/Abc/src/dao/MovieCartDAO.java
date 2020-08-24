package dao;

import java.util.ArrayList;

import vo.MovieCartVO;

public class MovieCartDAO {
	

	private static MovieCartDAO instance;
	private MovieCartDAO() {}

	public static MovieCartDAO getInstance() {
		if (instance == null) {
			instance = new MovieCartDAO();
		}
		return instance;
	}

	Database database = Database.getInstance();
	
	//회원가입 시 유저 새로 등록
	public void insertMovieCart(MovieCartVO MovieCart) {
		database.tb_movieCart.add(MovieCart);		
	}

	public ArrayList<MovieCartVO> selectMovieCartList() {		
		return database.tb_movieCart;
	}
	
	//회원삭제
	public void deleteMovieCart(int MovieCart){
		database.tb_movieCart.remove(MovieCart);
	}

}
