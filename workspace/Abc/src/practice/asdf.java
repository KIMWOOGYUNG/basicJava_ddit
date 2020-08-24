/*import vo.SnackCartVO;
import controller.Controller;

// 팝콘메뉴
	public void popcornMenu() {

		System.out.println("------------------------------------");
		// 고소팝콘, 달콤팝콘 등을 snackVO에서 들고와 출력해서 보여줌
		for (int i = 0; i < snackDao.selectSnackList().size(); i++) {
			if (snackDao.selectSnackList().get(i).getSm_number() == 0) {
				System.out.println((i + 1) + ". "
						+ snackDao.selectSnackList().get(i).getSnack_name()
						+ " : "
						+ snackDao.selectSnackList().get(i).getSnack_price());
			}
		}
		System.out.println("9. 스낵바 초기 화면으로");
		System.out.println("0. 초기 화면으로");
		System.out.println("------------------------------------");
		System.out.println("다음 해당번호를 입력해주세요>");

		int input;
		String popcornName = "";
		int popcornPrice = 0;
		int popcornCount;

		input = Integer.parseInt(s.nextLine());

		if (input == 9) {
			snackBar();
		} else if (input == 0) {
			Controller.menu_start();
		} else if (input > 10) {
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
		}
		popcornName = snackDao.selectSnackList().get(input - 1).getSnack_name();
		popcornPrice = snackDao.selectSnackList().get(input - 1)
				.getSnack_price();
		int SnackCartListSize = snackCartDao.selectSnackCartList().size();

		if (SnackCartListSize == 0) {
			SnackCartVO snackCartVO = new SnackCartVO();
			snackCartVO.setSnack_name(popcornName);
			snackCartVO.setSnack_price(popcornPrice);
			snackCartVO.setSnack_count(1);
			snackCartDao.insertSnackCart(snackCartVO);

		} else {
			for (int i = 0; i < SnackCartListSize; i++) {
				if (popcornName == snackCartDao.selectSnackCartList().get(i)
						.getSnack_name()) {
					popcornCount = snackCartDao.selectSnackCartList().get(i)
							.getSnack_count();
					popcornCount++;
					snackCartDao.selectSnackCartList().get(i)
							.setSnack_count(popcornCount);
					System.out.println(snackCartDao.selectSnackCartList()
							.get(i).getSnack_count()); // 카운트 플러스 됐는지 확인
					break;
				} else {
					// 없으면 장바구니에 새로 저장하기
					SnackCartVO snackCartVO = new SnackCartVO();
					snackCartVO.setSnack_name(popcornName);
					snackCartVO.setSnack_count(1);
					snackCartVO.setSnack_price(popcornPrice);
					snackCartDao.insertSnackCart(snackCartVO);
				}
			}
		}

		for (int i = 0; i < snackCartDao.selectSnackCartList().size(); i++) {
			System.out.println(snackCartDao.selectSnackCartList().get(i)
					.getSnack_name()
					+ " "
					+ snackCartDao.selectSnackCartList().get(i)
							.getSnack_count());
		}
		additionalOrder();

	}*/