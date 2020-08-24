package dao;

import java.util.ArrayList;

import vo.TheaterVO;

public class TheaterDAO {
	
	private static TheaterDAO instance;

	private TheaterDAO() {}

	public static TheaterDAO getInstance() {
		if (instance == null) {
			instance = new TheaterDAO();
		}
		return instance;
	}

	Database database = Database.getInstance();
	
	public void insertTheater(TheaterVO theater) {
		database.tb_theater.add(theater);
	}
	public ArrayList<TheaterVO> selectTheaterList(){
		return database.tb_theater;
	}
	public void deleteTheater(int theater) {
		database.tb_theater.remove(theater);
	}
}
