package controller;

import java.util.Scanner;

import vo.MovieVO;
import vo.SnackCategoryVO;
import vo.SnackVO;
import dao.MovieDAO;
import dao.SnackCategoryDAO;
import dao.SnackDAO;
import dao.UserDAO;

public class Admin {
	//관리자 로그인
	
	Scanner s = new Scanner(System.in);
	private UserDAO userDao = UserDAO.getInstance();  //유저 세션정보 넘기기
	private SnackDAO snackDao = SnackDAO.getInstance();
	private MovieDAO movieDao = MovieDAO.getInstance();
	
	public void admin() {
		do{
			System.out.println("------------------------------------");
			System.out.println("다음 해당하는 번호를 선택해주세요.");
			System.out.println("1.상영관 추가  2.상영관 폐쇄  3.영화추가  4.영화삭제  5.스낵추가 6.스낵삭제");
			System.out.println("7.목록확인(영화, 스낵 목록)");  //상황보고 만들기
			System.out.println("0.프로그램 종료");
			System.out.println("------------------------------------");
			int input = Integer.parseInt(s.nextLine());
			
			switch(input){
			case 1:
				theaterAdd();
				break;
			case 2:
				theatoerDelete();
				break;
			case 3:
				movieAdd();
				break;
			case 4:
				movieDelete();
				break;
			case 5:
				snackAdd();
				break;
			case 6:
				snackDelete();
				break;
			case 7:
				System.out.println("1.영화 목록   2.스낵 목록");
				input = Integer.parseInt(s.nextLine());
				switch(input){
				case 1:	movieView(); break;
				case 2:	snackView(); break;
				default : 
					System.out.println("잘못 입력하셨습니다. 다시 시도해주세요.");
					admin();
					break;
				}
				break;
			case 0:
				System.out.println("로그아웃되셨습니다.");
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
			default :
				System.out.println("잘못 입력하셨습니다. 다시 시도해주세요.");
				admin();
				break;
			}
		}while(true);
		
	}
	
	//1번. 상영관 추가
	void theaterAdd(){
		System.out.println("------------------------------------");
		System.out.println("상영관 이름을 입력해주세요");
		System.out.println("------------------------------------");
		//상영관 이름 저장
		String input = s.nextLine();
		
		
		System.out.println("상영관이 등록되었습니다.???");
		
	}
	
	//2번. 상영관 삭제
	void theatoerDelete(){
		
	}
	
	//3번. 영화추가
	MovieVO movie = new MovieVO();
	void movieAdd() {
		int movie_number = 1;
		
		System.out.println("------------------------------------");
		System.out.println("추가하실 영화를 입력해주세요");
		String input_name = s.nextLine();
		System.out.println("영화 "+input_name+"의 관람연령을 입력해주세요");
		String input_rating = s.nextLine();
		System.out.println("영화 "+input_name + "의 출연진을 입력해주세요");
		String input_cast = s.nextLine();
		System.out.println("영화 "+input_name+"의 감독을 입력해주세요");
		String input_director = s.nextLine();		
		System.out.println("영화 "+input_name+"의 줄거리를 입력해주세요");
		String input_story = s.nextLine();
		

		movie.setMovieNum(movie_number);
		movie_number++;	//고유번호는 중복되지않게 하기 위해 1씩 증가시킴
		
		movie.setMovieName(input_name);
		movie.setMovieRating(input_rating);
		movie.setMovieCast(input_cast);
		movie.setMovieDirector(input_director);
		movie.setMovieStory(input_story);
		
		movieDao.insertMovie(movie);  //영화 추가
		System.out.println("*입력하신 영화가 추가되었습니다*");
		
	}
	
	//4번. 영화삭제
	void movieDelete(){
		System.out.println("삭제하실 영화를 선택해주세요");
		for(int i=0; i<movieDao.selectMovieList().size(); i++){
			System.out.println((i+1) + ". (영화명) " +movieDao.selectMovieList().get(i).getMovieName()+"\t"+
									"(관람연령) " +movieDao.selectMovieList().get(i).getMovieRating());			
		}
		System.out.println("------------------------------------");
		System.out.println("9.관리자화면으로 이동");
		int input = Integer.parseInt(s.nextLine());
		
		movieDao.deleteMovie(input-1);
		
		System.out.println("*입렵하신 영화가 삭제되었습니다*");
	}
	
	//5번. 스낵추가
	SnackVO snack = new SnackVO();
	SnackCategoryVO snackCartegory = new SnackCategoryVO();
	void snackAdd() {
		int snack_number = 1;
		System.out.println("------------------------------------");
		System.out.println("추가하실 스낵의 종류를 선택해주세요>");
		System.out.println("1.팝콘  2.음료  3.스낵류   4.세트");
		int sm_type = Integer.parseInt(s.nextLine());
		System.out.println("스낵의 이름을 입력해주세요");
		String snack_name = s.nextLine();
		System.out.println("스낵의 금액을 입력해주세요(숫자로만 입력해주세요)");
		int snack_price = Integer.parseInt(s.nextLine());
		
		snack.setSnackNum(snack_number);
		snack_number++;
		
		switch(sm_type) {
		case 1:
			snackCartegory.setSnackCategoryName("팝콘");  //팝콘 저장
			break;
		case 2:
			snackCartegory.setSnackCategoryName("음료");   //음료 저장
			break;
		case 3:
			snackCartegory.setSnackCategoryName("스낵류");   //스낵류 저장
			break;
		case 4:
			snackCartegory.setSnackCategoryName("세트");   //세트 저장
			break;
		default :
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			snackAdd();
			break;
		}
		
		//스낵테이블과 스낵카테고리 테이블에 정보저장
//		snack.setSnackName(snackName);
//		snack.setSnackPrice(snackPrice);
//		snackDao.insertSnack(snack);
		
		System.out.println("*입력하신 스낵이 추가되었습니다*");
	}
	
	//6번. 스낵 삭제
	void snackDelete(){		
		System.out.println("삭제하실 스낵을 선택해주세요");
		for(int i=0; i<snackDao.selectSnackList().size(); i++){
			System.out.println((i+1) + ". (스낵명) " +snackDao.selectSnackList().get(i).getSnackName()+"\t"+
								"(스낵금액) " +snackDao.selectSnackList().get(i).getSnackPrice());			
		}
		System.out.println("------------------------------------");
		System.out.println("9.관리자화면으로 이동");
		int input = Integer.parseInt(s.nextLine());
		if(input==9){
		}else{  
			System.out.println("잘못입력하셨슴니다. 다시 입력해주세요");
			movieView();
		}
		
		snackDao.deleteSnack(input-1);
		
		System.out.println("*입렵하신 영화가 삭제되었습니다*");
		
	}
	
	//7-1번. 영화목록 확인
	void movieView(){
		System.out.println("-------------------영화목록--------------------");
		for(int i=0; i<movieDao.selectMovieList().size(); i++){
			System.out.println("(영화고유번호): "+movieDao.selectMovieList().get(i).getMovieNum()+"\t"+
					"(영화명): " +movieDao.selectMovieList().get(i).getMovieName()+"\t"+
					"(출연진): " +movieDao.selectMovieList().get(i).getMovieCast()+"\t"+
					"(관람연령): " +movieDao.selectMovieList().get(i).getMovieRating()+"\t"+
					"(영화감독): " +movieDao.selectMovieList().get(i).getMovieDirector()+"\n"+
					"(줄거리): " +movieDao.selectMovieList().get(i).getMovieStory());
		}
		System.out.println("------------------------------------");
		System.out.println("9.관리자화면으로 이동");
		int input = Integer.parseInt(s.nextLine());
		if(input==9){
		}else{
			System.out.println("잘못입력하셨슴니다. 다시 입력해주세요");
			movieView();
		}
	}
	
	//7-2번. 스낵목록 확인
	SnackCategoryDAO snackCategoryDao = SnackCategoryDAO.getInstance();
	void snackView(){
		System.out.println("--------------스낵목록----------------");
		
		for(int i=0; i<snackDao.selectSnackList().size(); i++){
			String sm_number = "";
			
			if(snackCategoryDao.selectSnackCategoryList().get(i).getSnackCategoryName().equals("팝콘")){
				sm_number = "팝콘";
			}else if(snackCategoryDao.selectSnackCategoryList().get(i).getSnackCategoryName().equals("음료")){
				sm_number = "음료";
			}else if(snackCategoryDao.selectSnackCategoryList().get(i).getSnackCategoryName().equals("스낵류")){
				sm_number = "스낵류";
			}else if(snackCategoryDao.selectSnackCategoryList().get(i).getSnackCategoryName().equals("세트")){
				sm_number = "세트";
			}
			System.out.println("(스낵고유번호): " + snackDao.selectSnackList().get(i).getSnackNum()+"\t"+
					"(스낵명): " + snackDao.selectSnackList().get(i).getSnackName()+"\t"+
					"(스낵종류): " + sm_number + "\t"+
					"(금액): " + snackDao.selectSnackList().get(i).getSnackPrice()+"\t");
		}
		System.out.println("------------------------------------");
		System.out.println("9.관리자화면으로 이동");
		int input = Integer.parseInt(s.nextLine());
		if(input==9){
		}else{
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
			movieView();
		}
	}
	
	
	
}










