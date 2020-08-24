package snackbar;

import java.util.ArrayList;
import java.util.Scanner;

import vo.SnackCartVO;
import vo.SnackCategoryVO;
import vo.SnackVO;
import controller.Controller;
import dao.SnackCartDAO;
import dao.SnackCategoryDAO;
import dao.SnackDAO;

//스낵바 구매
public class SnackBar {

	static Scanner s = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		
		Scanner s = new  Scanner(System.in);
	
		boolean check = false;
		do{
			System.out.println("입력");
			int i = s.nextInt();
			switch(i){
			case 1:
				popcornMenu1();
				break;
			case 2:
				check = true;
			}
			
		}while(!check);
		
		
		
		
	}

	public static void popcornMenu1() {
		SnackDAO snackDAO = SnackDAO.getInstance();

		ArrayList<SnackVO> snackList = new ArrayList<SnackVO>();
		SnackCategoryDAO snackCategoryDAO = SnackCategoryDAO.getInstance();
		boolean check = false; //이미 담겨있는지 확인할 변수

		do {
			//카테고리 선택
			System.out.println("------------------------------------");
			System.out.println("순번\t카테고리명");
			System.out.println("------------------------------------");
			for (int i = 0; i < snackCategoryDAO.selectSnackCategoryList()
					.size(); i++) {
				System.out.println(" " + (1 + i) + "\t" + snackCategoryDAO.selectSnackCategoryList().get(i).getSnackCategoryName());
			}
			System.out.println();
			System.out.println(" 0\t이전 메뉴로 이동");
			
			
			System.out.println("------------------------------------");
			System.out.println("선택하실 카테고리 번호를 선택해주세요.");
			System.out.println("------------------------------------");
			String temp = s.nextLine().trim();
			
			//0 입력시 이전메뉴로 돌아가기
			if (temp.equals("0")) {
				return;
			} 
			
			//메뉴고르기
			else {
				int CategoryKey = snackCategoryDAO.selectSnackCategoryList().get(Integer.parseInt(temp) - 1).getSnackCategoryNum();
				//입력받은 카테고리 번호를 숫자변환해서 인덱스(-1)로 접근 -> 카테고리 넘버 가져옴
				
				//입력받은 번호에 해당하는 카테고리 음식들을 리스트에 넣어줌
				for (int i = 0; i < snackDAO.selectSnackList().size(); i++) {
					if (snackDAO.selectSnackList().get(i).getSnackCategoryNum() == CategoryKey) {
						snackList.add(snackDAO.selectSnackList().get(i));
					}
				}
				
				//메뉴들 출력
				System.out.println("------------------------------------");
				System.out.println("순번\t메뉴\t\t가격");
				System.out.println("------------------------------------");
				for (int i = 0; i < snackList.size(); i++) {
					
					//간격 맞추기
					String name = snackList.get(i).getSnackName();
					if (name.length() > 6) { //6자 넘으면 탭1개
						name += "\t";
					} else {
						name += "\t\t";
					}
					System.out.println((1 + i) + "\t" + name
							+ snackList.get(i).getSnackPrice());
				}
				System.out.println();
				System.out.println("0\t이전 메뉴로 이동");
				System.out.println("------------------------------------");
				System.out.println("다음 해당번호를 입력해주세요>");
				
				temp = s.nextLine().trim();
				if (temp.equals("0")) {
					check = true;
				} else {
					int snackNum = snackList.get(Integer.parseInt(temp) - 1)
							.getSnackNum();

					System.out.println(snackList.get(
							Integer.parseInt(temp) - 1).getSnackName()
							+ "을 선택하셨습니다.");
					System.out.println("주문하실 수량을 입력해주세요.");

					int count = Integer.parseInt(s.nextLine().trim());
					// 마지막 팝콘번호
					SnackCartDAO snackCartDAO = SnackCartDAO.getInstance();
					SnackCartVO snackcartVo = new SnackCartVO();
					snackcartVo.setSnackCount(count);
					snackcartVo.setSnackNum(snackNum);
					snackCartDAO.insertSnackCart(snackcartVo);
					check = false; //
				}
			}
		} while (check);
	}
}
