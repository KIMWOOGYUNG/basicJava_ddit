package i_collection;

import java.util.ArrayList;

public class Score_ArrayList {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 Java, Oracle, HTML, CSS, JQuery, JSP 점수를 50~100까지 랜덤으로 생성하고,
		 * 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력하시오. 
		 * 석차 이름 Java Oracle HTML CSS JQuery JSP 총점 평균 
		 * 1 홍길동 80 90 100 90 70 60 500 80 
		 * 2 홍길동 80 90 100 90 70 60 500 80 
		 * 3 홍길동 80 90 100 90 70 60 500 80 
		 * 4 홍길동 80 90 100 90 70 60 500 80 
		 * 5 홍길동 80 90 100 90 70 60 500 80
		 */
		
		//**과목**
		ArrayList<String> subject = new ArrayList<String>();
		subject.add("Java");
		subject.add("Oracle");
		subject.add("HTML");
		subject.add("CSS");
		subject.add("JQuery");
		subject.add("JSP");
		
		System.out.print("석차\t이름\t");
		for(int i = 0; i < subject.size(); i++){
			System.out.print(subject.get(i) + "\t");
		}
		System.out.println("총점\t평균");
		
		
		//**이름**
		ArrayList<String> student = new ArrayList<String>();
		student.add("강현철");
		student.add("김종완");
		student.add("박기완");
		student.add("김준우");
		student.add("이혁진");
		student.add("심주영");
		student.add("송효진");
		student.add("연지은");
		student.add("박선정");
		student.add("남아름");
		student.add("김우경");
		student.add("전다희");
		student.add("이제경");
		student.add("정주환");
		student.add("김철희");
		student.add("홍종욱");
		student.add("정영수");
		student.add("박정민");
		student.add("김태유");
		student.add("박혜진");
		student.add("임수진");
		
		//점수입력
		ArrayList<ArrayList<Double>> scores = new ArrayList<>();
		
		for(int i = 0; i < student.size(); i++){
			ArrayList<Double> list = new ArrayList<>();
			list.add(1.0); // 석차넣기
			double sum = 0.0;
			for(int j = 0; j < subject.size(); j++){
				list.add((int)(Math.random() * 51) + 50.0);
				sum += list.get(j+1); //sum에 한과목씩 점수 더하기(0번째는 석차 들어있으니까 1번째부터)
			}
			list.add(sum); //총점넣기
			list.add((int)(sum/subject.size() * 10 + 0.5)/10.0); //평균넣기
			scores.add(list); //한줄씩 배열에 넣기
		}
		
		/*//총점 평균을 구한다.
		for(int i = 0; i < scores.size(); i++){
			ArrayList<Double> score = scores.get(i);
			int sum = 0;
			for(int j = 1; j < score.size(); j++){
				sum += scroe.get(j);
			}
			score.add((double)sum);
			score.add((double)sum / subject.size());
		}*/
		
		
		//석차만들기
		for(int i = 0; i < scores.size(); i++){
			double d = 1; //기본석차
			for(int j = 0; j < scores.size(); j++){ //이전값들과도 비교해줘야함 그래서 0부터 시작
				if(scores.get(i).get(scores.get(i).size()-2) < scores.get(j).get(scores.get(i).size()-2)){
					d++;
				}
			}
			scores.get(i).set(0,d);
		}
		
		/*//석차만들기2
		for(int i = 0; i < scores.size(); i++){
			for(int j = 0; j < scores.size(); j++){ //이전값들과도 비교해줘야함 그래서 0부터 시작
				int sumIdx = subjects.size() + 1;
				if(scores.get(i).get(sumIdx) < scores.get(j).get(sumIdx)){
					scores.get(i).set(0,scores.get(i).get(0) + 1);
				}
			}
		}*/
		
		
		//석차정렬
		for(int i = 0; i < scores.size()-1; i++){
			ArrayList<Double> temp = new ArrayList<>();
			for(int j = i + 1; j < scores.size(); j++){
				if(scores.get(i).get(scores.get(i).size()-2) < scores.get(j).get(scores.get(i).size()-2)){
					//총점정렬
					temp = scores.get(i);
					scores.set(i,scores.get(j));
					scores.set(j,temp);
					
					//이름정렬
					String temp2 = student.get(i);
					student.set(i,student.get(j));
					student.set(j,temp2);
				}
			}
		}
		
		/*//석차정렬
		for(int i = 0; i < scores.size()-1; i++){
			boolean changed = false;
			for(int j = 0; j < scores.size()-1-i; j++){
				if(scores.get(j).get(0) < scores.get(j+1).get(0)){
					ArrayList<Double> temp = new ArrayList<>();
					//총점정렬
					temp = scores.get(i);
					scores.set(i,scores.get(j));
					scores.set(j,temp);
					
					//이름정렬
					String temp2 = student.get(i);
					student.set(i,student.get(j));
					student.set(j,temp2);
				}
			}
		}*/
		
		
		//출력
		for(int i = 0; i < student.size(); i++){
			System.out.print(scores.get(i).get(0) + "\t");	   //석차 출력
			System.out.print(student.get(i) + "\t");	   	   //이름 출력
			for(int j = 1; j < scores.get(i).size(); j++){
				System.out.print(scores.get(i).get(j) + "\t"); //점수 출력
			}
			System.out.println();
		}
		
	}

}
