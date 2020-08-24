package i_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		
		/*
		 * put()    : 지정된 키와 값을 저장 // 이미 값이 있으면 덮어씀
		 * get()    : 지정된 키의 값을 반환 (없으면 null)
		 * remove() : 지정된 키로 저장된 값을 제거
		 * keySet() : 저장된 모든 키를 Set으로 반환
		 */
		 //인덱스번호가 x -> "순서가 없다"
		 //키는 보통 String 타입으로
		 //데이터 베이스와 사용이 잘됨 (디비의 컬럼이 해쉬맵의 키가 됨)
		 //디비 한줄이 해쉬맵 1개 
		 //테이블 == ArrayList에 해쉬맵 여러개가 담겨있는 형태
		
		HashMap<String, String> map = new HashMap<String, String>(); //<키, 값>>
		//값을 저장
		map.put("title", "제목입니다.");
		map.put("content", "내용입니다.");
		map.put("user", "홍길동");
		map.put("date", "2020-01-13 10:33");
		
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		System.out.println(map.get("date"));
		
		//덮어쓰기
		map.put("user", "이순신");
		System.out.println(map.get("user"));
		
		//삭제 (값 뿐만 아니라 키도 삭제)
		map.remove("user");
		System.out.println(map.get("user"));
		
		//저장된 모든 키를 받음
		Set<String> keys = map.keySet();
		for(String key : keys){ //오른쪽 값을 하나씩 꺼내서 왼쪽에 저장 (향상된 for문)
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}

			
		HashMap<String,String> map1 = new HashMap<String,String>();
		map1.put("LPROD_ID", "1");
		map1.put("LPROD_GU", "p101");
		map1.put("LPROD_NM", "컴퓨터제품");
		
		HashMap<String,String> map2 = new HashMap<String,String>();
		map2.put("LPROD_ID", "2");
		map2.put("LPROD_GU", "p102");
		map2.put("LPROD_NM", "전자제품");
		
		HashMap<String,String> map3 = new HashMap<String,String>();
		map3.put("LPROD_ID", "3");
		map3.put("LPROD_GU", "p201");
		map3.put("LPROD_NM", "여성캐주얼");
		
		HashMap<String,String> map4 = new HashMap<String,String>();
		map4.put("LPROD_ID", "4");
		map4.put("LPROD_GU", "p202");
		map4.put("LPROD_NM", "남성캐주얼");
		
		HashMap<String,String> map5 = new HashMap<String,String>();
		map5.put("LPROD_ID", "5");
		map5.put("LPROD_GU", "p301");
		map5.put("LPROD_NM", "피역잡화");
		
		ArrayList<HashMap<String,String>> table = new ArrayList<>();
		table.add(map1);
		table.add(map2);
		table.add(map3);
		table.add(map4);
		table.add(map5);
		
		System.out.println("-----------------------------------------");
		for(String key : table.get(0).keySet()){ //오른쪽 값을 하나씩 꺼내서 왼쪽에 저장 (향상된 for문)
			System.out.print(key + "\t");
		}
		System.out.println();
		System.out.println("-----------------------------------------");
		
		//일반 for문
		/*for(int i = 0; i < table.size(); i++){
			HashMap<String,String> m = table.get(i);
			Set<String> keySet = m.keySet();
			Iterator<String> itr = keySet.iterator();
			while(itr.hasNext()){
				String key = itr.next();
				String value = m.get(key);
				System.out.print(value + "\t\t");
			}
			System.out.println();
		}*/
		
		//향상된 for문
		for(HashMap<String, String> m : table){
			for(String key : m.keySet()){
				System.out.print(m.get(key) + "\t\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		
	}

}
