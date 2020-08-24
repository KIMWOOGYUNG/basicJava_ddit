package dao;

import java.util.ArrayList;

import vo.SnackCategoryVO;


public class SnackCategoryDAO {
	
	private static SnackCategoryDAO instance;

	private SnackCategoryDAO() {}

	public static SnackCategoryDAO getInstance() {
		if (instance == null) {
			instance = new SnackCategoryDAO();
		}
		return instance;
	}

	Database database = Database.getInstance();

	public void insertSnackCategory(SnackCategoryVO SnackCategory) {
		database.tb_snackCategory.add(SnackCategory);
	}

	public ArrayList<SnackCategoryVO> selectSnackCategoryList() {
		return database.tb_snackCategory; // 리뷰리스트
	}

	public void deleteSnackCategory(int SnackCategory) {
		database.tb_snackCategory.remove(SnackCategory);
	}
	
	
	
	
}
