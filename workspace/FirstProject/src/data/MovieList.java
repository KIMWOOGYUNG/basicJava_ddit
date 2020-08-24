package data;

import java.util.ArrayList;

public class MovieList {
	

	public static void main(String[] args) {
		movie();
		moviePrint(movie);
	}
	
	static ArrayList<String> movie = new ArrayList<String>();
	
	//영화출력
	public static void moviePrint(ArrayList<String> movie){
		for(int i = 0; i < movie.size(); i++){
			System.out.println(i + 1 + "." + movie.get(i));
		}
	}
	
	//영화입력
	public static void movie(){
		
		movie.add("해치지 않아");
		movie.add("나쁜녀석들-포에버");
		movie.add("닥터두리틀");
		movie.add("남산의부장들");
		movie.add("스타워즈-라이즈오브스카이워커");
		movie.add("백두산");
		movie.add("시동");
		movie.add("미드웨이");
		movie.add("천문-하늘에묻는다");
		
	}

}
