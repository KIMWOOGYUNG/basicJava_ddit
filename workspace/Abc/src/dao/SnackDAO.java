package dao;

import java.util.ArrayList;

import vo.SnackVO;

public class SnackDAO {
	
	private static SnackDAO instance;

	private SnackDAO() {}

	public static SnackDAO getInstance() {
		if (instance == null) {
			instance = new SnackDAO();
		}
		return instance;
	}

	Database database = Database.getInstance();
	
	public void insertSnack(SnackVO snack) {
		database.tb_snack.add(snack);
	}
	public ArrayList<SnackVO> selectSnackList(){
		return database.tb_snack;
	}
	public void deleteSnack(int snack) {
		database.tb_snack.remove(snack);
	}
}
