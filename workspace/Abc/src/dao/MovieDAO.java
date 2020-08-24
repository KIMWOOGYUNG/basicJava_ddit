package dao;

import java.util.ArrayList;

import vo.MovieVO;

public class MovieDAO {
	
	private static MovieDAO instance;

	private MovieDAO() {}

	public static MovieDAO getInstance() {
		if (instance == null) {
			instance = new MovieDAO();
		}
		return instance;
	}

	Database database = Database.getInstance();
	
	
	public void insertMovie(MovieVO movie) {
		database.tb_movie.add(movie);
		ReviewDAO.ArrayReviewDB.add(movie);
	}
	public ArrayList<MovieVO> selectMovieList(){
		return database.tb_movie;
	}
	public void deleteMovie(int movie) {
		database.tb_movie.remove(movie);
	}
}
