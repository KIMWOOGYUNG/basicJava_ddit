package h_useful;

public class StringSpeedTest {

	public static void main(String[] args) {
		//걸린 시간 구하기
		String str = "a";
		
		/*long start = System.currentTimeMillis(); //시작할때의 시간
		for(int i = 0; i < 200000; i++){
			str += "a";
		}
		long end = System.currentTimeMillis(); //끝날때의 시간
		System.out.println(end - start + "ms"); //끝나는 시간 - 시작시간 == 걸린시간
		//약 8000ms나옴
		*/
		
		
		//StringBuffer를 사용하면 시간이 굉장히 많이 단축됨
		StringBuffer sb = new StringBuffer("a");
		long start = System.currentTimeMillis();
		for(int i = 0; i < 200000; i++){
			sb.append("a");
		}
		long end = System.currentTimeMillis(); 
		System.out.println(end - start + "ms"); 
		//10ms로 굉장히 빠름
	}

}
