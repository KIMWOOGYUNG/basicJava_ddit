package dao;

import java.util.ArrayList;

import vo.TheaterScheduleVO;

public class TheaterScheduleDAO {
	private static TheaterScheduleDAO instance;

	private TheaterScheduleDAO() {}

	public static TheaterScheduleDAO getInstance() {
		if (instance == null) {
			instance = new TheaterScheduleDAO();
		}
		return instance;
	}

	Database database = Database.getInstance();
	
	public void insertTheaterSchedule(TheaterScheduleVO theaterSchedule) {
		database.tb_theaterSchedule.add(theaterSchedule);
	}
	public ArrayList<TheaterScheduleVO> selectTheaterScheduleList(){
		return database.tb_theaterSchedule;
	}
	public void deleteTheaterSchedule(int theaterSchedule) {
		database.tb_theater.remove(theaterSchedule);
	}
}
