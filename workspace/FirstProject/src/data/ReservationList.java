package data;

import java.util.ArrayList;

public class ReservationList {
	public static ArrayList<ArrayList<String>> numList = new ArrayList<>();
	
	//예매번호
	public void reservNum(){
		ArrayList<String> rsv1 = new ArrayList<>();
		rsv1.add("12345");
		rsv1.add("나쁜녀석들-포에버");
		rsv1.add("CGB-탄방점");
		rsv1.add("2020-02-05");
		rsv1.add("14:00");
		rsv1.add("성인 2명");
		rsv1.add("18000원");
		rsv1.add("7관 H열 9번, H열 10번");
		
		ArrayList<String> rsv2 = new ArrayList<>();
		rsv2.add("23456");
		rsv2.add("스타워즈-라이즈 오브 스카이워커");
		rsv2.add("CGB-대전터미널");
		rsv2.add("2020-02-03");
		rsv2.add("20:20");
		rsv2.add("청소년 2명, 성인 2명");
		rsv2.add("36000원");
		rsv2.add("2관 j열 4번, j열 5번, j열 6번, j열 7번");
		
		ArrayList<String> rsv3 = new ArrayList<>();
		rsv3.add("34567");
		rsv3.add("해치지않아");
		rsv3.add("CGB-유성온천");
		rsv3.add("2020-02-04");
		rsv3.add("15:40");
		rsv3.add("성인 3명");
		rsv3.add("30000원");
		rsv3.add("5관 j열 6번, j열 7번, j열 8번");
			
		numList.add(rsv1);
		numList.add(rsv2);
		numList.add(rsv3);
		
	}
}
