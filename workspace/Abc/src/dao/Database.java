package dao;

import java.util.ArrayList;
import java.util.Date;

import vo.MovieCartVO;
import vo.MovieVO;
import vo.PaymentVO;
import vo.ReviewVO;
import vo.SnackCartVO;
import vo.SnackCategoryVO;
import vo.SnackVO;
import vo.TheaterScheduleVO;
import vo.TheaterVO;
import vo.UserVO;

public class Database {

	private static Database instance;

	private Database() {}

	public static Database getInstance() {
		if (instance == null) {
			instance = new Database();
		}
		return instance;
	}

	public ArrayList<UserVO> tb_user = new ArrayList<>();
	{
		UserVO user = new UserVO();
		user.setUserId("admin");
		user.setUserPwd("admin");
		user.setUserName("관리자");
		user.setUserPhone("010-1234-5678");
		user.setUserReg1(951007);
		tb_user.add(user);
		
		
		user = new UserVO();
		user.setUserId("a");
		user.setUserPwd("a");
		user.setUserName("관리자");
		user.setUserPhone("010-1234-5678");
		user.setUserReg1(951007);
		tb_user.add(user);
	}

	public ArrayList<SnackVO> tb_snack = new ArrayList<>();
	{
		SnackVO snack = new SnackVO();
		// 팝콘--------------------------------------------
		snack = new SnackVO();
		snack.setSnackNum(1);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("고소팝콘(M)");
		snack.setSnackPrice(5500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(2);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("고소팝콘(L)");
		snack.setSnackPrice(6000);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(3);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("달콤팝콘(M)");
		snack.setSnackPrice(5500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(4);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("달콤팝콘(L)");
		snack.setSnackPrice(6000);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(5);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("바질어니언팝콘(M)");
		snack.setSnackPrice(5500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(6);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("바질어니언팝콘(L)");
		snack.setSnackPrice(6000);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(7);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("더블치즈팝콘(M)");
		snack.setSnackPrice(5500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(8);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("더블치즈팝콘(L)");
		snack.setSnackPrice(6000);
		tb_snack.add(snack);

		// 음료---------------------------------------------
		snack = new SnackVO();
		snack.setSnackNum(9);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("콜라(M)");
		snack.setSnackPrice(2200);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(10);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("콜라(L)");
		snack.setSnackPrice(2700);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(11);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("사이다(M)");
		snack.setSnackPrice(2200);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(12);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("사이다(L)");
		snack.setSnackPrice(2700);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(13);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("환타오렌지(M)");
		snack.setSnackPrice(2200);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(14);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("환타오렌지(L)");
		snack.setSnackPrice(2700);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(15);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("레몬에이드(M)");
		snack.setSnackPrice(3500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(16);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("레몬에이드(L)");
		snack.setSnackPrice(4500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(17);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("복숭아 아이스티(M)");
		snack.setSnackPrice(3500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(18);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("복숭아 아이스티(L)");
		snack.setSnackPrice(4500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(19);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("아메리카노(M)");
		snack.setSnackPrice(3500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(20);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("아메리카노(L)");
		snack.setSnackPrice(4000);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(21);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("카스");
		snack.setSnackPrice(4000);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(22);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("생수");
		snack.setSnackPrice(1500);
		tb_snack.add(snack);

		// 스낵류-------------------------------------------
		snack = new SnackVO();
		snack.setSnackNum(23);
		snack.setSnackCategoryNum(2);
		snack.setSnackName("나쵸");
		snack.setSnackPrice(4500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(24);
		snack.setSnackCategoryNum(2);
		snack.setSnackName("즉석구이오징어");
		snack.setSnackPrice(5000);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(25);
		snack.setSnackCategoryNum(2);
		snack.setSnackName("치즈볼");
		snack.setSnackPrice(4500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(26);
		snack.setSnackCategoryNum(2);
		snack.setSnackName("핫도그");
		snack.setSnackPrice(4000);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(27);
		snack.setSnackCategoryNum(2);
		snack.setSnackName("맛밤");
		snack.setSnackPrice(3500);
		tb_snack.add(snack);

		// 세트메뉴--------------------------------------
		snack = new SnackVO();
		snack.setSnackNum(28);
		snack.setSnackCategoryNum(3);
		snack.setSnackName("★콤보A★\t   고소팝콘(L) 1 + 탄산음료(M) 2");
		snack.setSnackPrice(8900);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(29);
		snack.setSnackCategoryNum(3);
		snack.setSnackName("★콤보B★\t   달콤/바질어니언/더블치즈(L) 1 + 탄산음료(M) 2");
		snack.setSnackPrice(9900);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(30);
		snack.setSnackCategoryNum(3);
		snack.setSnackName("★콤보C★\t   칠리치즈나쵸 1 + 고소팝콘(L) 1 + 탄산음료(M) 2");
		snack.setSnackPrice(11900);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(31);
		snack.setSnackCategoryNum(3);
		snack.setSnackName("★스타워즈세트★    고소팝콘(L) 1 + 탄산음료(M) 2 + 히든컵 + 키링");
		snack.setSnackPrice(16000);
		tb_snack.add(snack);
		// -------------------------------------

	}

	
	public ArrayList<MovieCartVO> tb_movieCart = new ArrayList<>();
	{
		MovieCartVO movieCart = new MovieCartVO();
		movieCart.setMovieCartNum(0);  //영화카트번호
		movieCart.setUserId("");  //회원아이디(UserVO참조)
		movieCart.setSeatLocation(0);  //좌석 선책한 위치
		movieCart.setPaymentNum(0);  //결제번호(PaymentVO참조)
		movieCart.setScheduleNum(0);  //상영시간표(TheaterScheduleVO참조
		
	}
	
	public ArrayList<SnackCartVO> tb_snackCart = new ArrayList<>();
	{
		SnackCartVO snackCart = new SnackCartVO();
		snackCart.setSnackCartNum(0); //스낵카트번호
		snackCart.setUserId("");  //회원아이디
		snackCart.setSnackCount(0);  //스낵의 수량
		snackCart.setSnackNum(20);  //스낵번호(SnackVO참조)
		snackCart.setPaymentNum(-1);  //결제번호(PaymentVO참조)
		
		
		snackCart = new SnackCartVO();
		snackCart.setSnackCartNum(1); //스낵카트번호
		snackCart.setUserId("");  //회원아이디
		snackCart.setSnackCount(0);  //스낵의 수량
		snackCart.setSnackNum(21);  //스낵번호(SnackVO참조)
		snackCart.setPaymentNum(-1);  //결제번호(PaymentVO참조)
		
		snackCart = new SnackCartVO();
		snackCart.setSnackCartNum(2); //스낵카트번호
		snackCart.setUserId("");  //회원아이디
		snackCart.setSnackCount(2);  //스낵의 수량
		snackCart.setSnackNum(2);  //스낵번호(SnackVO참조)
		snackCart.setPaymentNum(100);  //결제번호(PaymentVO참조)
		
		snackCart = new SnackCartVO();
		snackCart.setSnackCartNum(3); //스낵카트번호
		snackCart.setUserId("");  //회원아이디
		snackCart.setSnackCount(2);  //스낵의 수량
		snackCart.setSnackNum(1);  //스낵번호(SnackVO참조)
		snackCart.setPaymentNum(-1);  //결제번호(PaymentVO참조)
	}
	
	public ArrayList<ReviewVO> tb_review = new ArrayList<>();
	{
		// 리뷰리스트 영화별로 하나씩 만들기

		ReviewVO review = new ReviewVO();
		review.setReviewNum(0);
		review.setUserId("");
		review.setReviewGrade("★★☆☆☆");
		review.setReviewContent("유치해요");
		review.setReviewDate(new Date());
		review.setMovieNum(0); // 영화PK저장 (영화제목을 들고있는거)
		tb_review.add(review);

		review = new ReviewVO();
		review.setReviewNum(1);
		review.setUserId("");
		review.setReviewGrade("★★★☆☆");
		review.setReviewContent("재밌어요");
		review.setReviewDate(new Date());
		review.setMovieNum(1);
		tb_review.add(review);

		review = new ReviewVO();
		review.setReviewNum(2);
		review.setUserId("");
		review.setReviewGrade("★★★★★");
		review.setReviewContent("짱 재밌어요");
		review.setReviewDate(new Date());
		review.setMovieNum(2);
		tb_review.add(review);

		review = new ReviewVO();
		review.setReviewNum(3);
		review.setUserId("");
		review.setReviewGrade("★★★☆☆");
		review.setReviewContent("흥미진진 재밌어요 짱!");
		review.setReviewDate(new Date());
		review.setMovieNum(3);
		tb_review.add(review);

	}

	public ArrayList<MovieVO> tb_movie = new ArrayList<>();
	{
		MovieVO movie = new MovieVO();
		movie.setMovieNum(0);
		movie.setMovieName("겨울왕국2");
		movie.setMovieRating("전체 관람가");
		movie.setMovieCast("크리스틴 벨, 이디나 멘젤, 조시 게드");
		movie.setMovieDirector("크리스 벅, 제니퍼 리");
		movie.setMovieStory("위험에 빠진 아렌델 왕국을 구해야만 하는 엘사와 안나는 숨겨진 과거의 진실을 찾아\r\n" +
								" 크리스토프, 올라프 그리고 스벤과 함께 위험천만한 놀라운 모험을 떠나게 된다.");
		tb_movie.add(movie);

		movie = new MovieVO();
		movie.setMovieNum(1);
		movie.setMovieName("해치지않아");
		movie.setMovieRating("전체 관람가");
		movie.setMovieCast("크리스틴 벨, 이디나 멘젤, 조시 게드");
		movie.setMovieDirector("크리스 벅, 제니퍼 리");
		movie.setMovieStory("위험에 빠진 아렌델 왕국을 구해야만 하는 엘사와 안나는 숨겨진 과거의 진실을 찾아\r\n" +
				 		" 크리스토프, 올라프 그리고 스벤과 함께 위험천만한 놀라운 모험을 떠나게 된다.");
		tb_movie.add(movie);
		
		movie = new MovieVO();
		movie.setMovieNum(2);
		movie.setMovieName("스타워즈");
		movie.setMovieRating("전체 관람가");
		movie.setMovieCast("크리스틴 벨, 이디나 멘젤, 조시 게드");
		movie.setMovieDirector("크리스 벅, 제니퍼 리");
		movie.setMovieStory("위험에 빠진 아렌델 왕국을 구해야만 하는 엘사와 안나는 숨겨진 과거의 진실을 찾아\r\n" +
								" 크리스토프, 올라프 그리고 스벤과 함께 위험천만한 놀라운 모험을 떠나게 된다.");
		tb_movie.add(movie);

		movie = new MovieVO();
		movie.setMovieNum(3);
		movie.setMovieName("나쁜녀석들");
		movie.setMovieRating("전체 관람가");
		movie.setMovieCast("크리스틴 벨, 이디나 멘젤, 조시 게드");
		movie.setMovieDirector("크리스 벅, 제니퍼 리");
		movie.setMovieStory("위험에 빠진 아렌델 왕국을 구해야만 하는 엘사와 안나는 숨겨진 과거의 진실을 찾아\r\n" +
									" 크리스토프, 올라프 그리고 스벤과 함께 위험천만한 놀라운 모험을 떠나게 된다.");
		tb_movie.add(movie);

	}
	
	public ArrayList<SnackCategoryVO> tb_snackCategory = new ArrayList<>();
    {   
       SnackCategoryVO snackCategory = new SnackCategoryVO();
       snackCategory.setSnackCategoryNum(0);
       snackCategory.setSnackCategoryName("팝콘");
       tb_snackCategory.add(snackCategory);
       
       snackCategory = new SnackCategoryVO();
       snackCategory.setSnackCategoryNum(1);
       snackCategory.setSnackCategoryName("음료");
       tb_snackCategory.add(snackCategory);
       
       snackCategory = new SnackCategoryVO();
       snackCategory.setSnackCategoryNum(2);
       snackCategory.setSnackCategoryName("스낵");
       tb_snackCategory.add(snackCategory);
       
       snackCategory = new SnackCategoryVO();
       snackCategory.setSnackCategoryNum(3);
       snackCategory.setSnackCategoryName("세트");
       tb_snackCategory.add(snackCategory);
       
    }
    
    public ArrayList<TheaterScheduleVO> tb_theaterSchedule = new ArrayList<>();
    {
    	TheaterScheduleVO ts = new TheaterScheduleVO();
    	ts.setScheduleNum(0);  //상영시간표번호
    	ts.setMovieNum(0);  //영화번호(MovieVO참조)
    	ts.setTheaterNum(0);  //상영관번호(TheaterVO참조)
    	ts.setMovieStartTime("");  //상영시작시간
    }
    
    public ArrayList<TheaterVO> tb_theater = new ArrayList<>();
    {
    	TheaterVO tt = new TheaterVO();
    	tt.setTheaterNum(0);  //상영관번호
    	tt.setTheaterName("아이맥스관");  //상영관 이름
    	tt.setSeatCount(20);  //좌석 수
    	tt.setSeatCheck(false);  //좌석유무
    }
    
    public ArrayList<PaymentVO> tb_payment = new ArrayList<>();
    {
    	PaymentVO pp = new PaymentVO();
    	pp.setPaymentNum(0);
    	pp.setUserId("");
    	pp.setPaymentForm("계좌이체");
    	pp.setPaymentDate(new Date());
    }
    
}












