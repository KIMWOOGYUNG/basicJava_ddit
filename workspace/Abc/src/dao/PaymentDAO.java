package dao;

import java.util.ArrayList;

import vo.PaymentVO;

public class PaymentDAO {
	private static PaymentDAO instance;

	private PaymentDAO() {}

	public static PaymentDAO getInstance() {
		if (instance == null) {
			instance = new PaymentDAO();
		}
		return instance;
	}

	Database database = Database.getInstance();

	public void insertPayment(PaymentVO payment) {
		database.tb_payment.add(payment);
	}

	public ArrayList<PaymentVO> selectPaymentList() {
		return database.tb_payment;
	}

	public void deletePayment(int payment) {
		database.tb_payment.remove(payment);
	}
}
