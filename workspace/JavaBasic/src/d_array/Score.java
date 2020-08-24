package d_array;

import java.util.Arrays;

public class Score {

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
		String[] students = {"강현철","김종완","박기완","김준우","이혁진","심주영","송효진","연지은","박선영",
				"남아름","김우경","전다희","이제경","정주환","김철희","홍종욱","정영수","박정민","김태유","박혜진","임수진"};
		String[] subjects = {"Java", "Oracle", "HTML", "CSS", "JQuery", "JSP"};
		double[][]scores = new double[students.length][subjects.length + 3]; // +3은 과목 앞뒤에 석차,총점,평균을 더한것
		
		
		//점수를 입력한다.
		for(int i = 0; i < scores.length; i++){
			scores[i][0] = 1; //0번인덱스에 석차 저장
			for(int j = 0; j < subjects.length; j++){
				scores[i][j+1] = (int)(Math.random() * 51) + 50; //석차 다음 인덱스니까 j+1
			}
		}
		
		//총점과 평균을 구한다.
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < subjects.length; j++){
				scores[i][scores[i].length - 2] += scores[i][j + 1]; //총점
			}
			scores[i][scores[i].length - 1]
					= (int)((double)scores[i][scores[i].length - 2]
							/ subjects.length * 100 + 0.5) / 100.0; //평균
		}
		
		//석차를 구한다.
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores.length; j++){
				if(scores[i][scores[i].length - 1] < scores[j][scores[j].length - 1]){
					scores[i][0]++;
				}
			}
		}
		
		//석차순으로 정렬한다.
		for(int i = 0; i < scores.length -1 ; i++){
			for(int j = i + 1; j < scores.length; j++){
				if(scores[i][0] > scores[j][0]){
					double[]temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
					
					String tempName = students[i];
					students[i] = students[j];
					students[j] = tempName;
				}
			}
		}
		
		//출력한다.
		 System.out.print("석차\t이름");
		 for(int i = 0; i < subjects.length; i++){
			 System.out.print("\t" + subjects[i]);
		 }
		 System.out.println("\t총점\t평균");
		 for(int i = 0; i < scores.length; i++){
			 System.out.print((int)scores[i][0] + "\t" + students[i]);
			 for(int j = 1; j < scores[i].length; j++){
				 if(j == scores[i].length - 1){
					 System.out.print("\t" + scores[i][j]);
				 }else{
					 System.out.print("\t" + (int)scores[i][j]);
				 }
			 }
			 System.out.println();
		 }
	}
}
		
//------------------------------------------------------------------
		/*int[][] scores = new int[21][6];
		int[] sum = new int[21];
		double[] avg = new double[21];

		
		
		for (int i = 0; i < scores.length; i++) {

			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int) ((Math.random() * 51) + 50);
			}
		}
		
		//이름넣기 //데이터타입이 달라서 배열안에 못 들어감
		String[] name = new String[] {
						"김현철","김종완","박기완","김준우","이혁진","심주영","송효진","연지은","박선영",
						"남아름","김우경","전다희","이제경","정주환","김철희","홍종욱","정영수","박정민","김태유","박혜진","임수진"};

		
		
		
		//총점평균
		 for(int i = 0; i < scores.length; i++){
		    	for(int j = 0; j < scores[i].length; j++){
		    		sum[i] += scores[i][j];
		    	}
		    	avg[i] = (double)sum[i] / scores[i].length;
		    }
		
		//석차구하기
			int[] rank = new int[scores.length];
			for (int i = 0; i < sum.length; i++) {
				rank[i] = 1;
			}

			for (int i = 0; i < sum.length; i++) {
				for (int j = 0; j < sum.length; j++) {
					if (sum[i] < sum[j]) {
						rank[i]++;
					}
				}
			}
			
			//기준점을 sum으로 잡아서 정렬
			//for문을 돌릴 때 sum이 기준이라는 소리
			//for안에서 모든게 다 정렬을 해줘야함
			//석차, 이름, 점수, 총점, 평균 각각 정렬
			//2중 for문 안에 if문(sum이 기준이겠지) 안에서 모든 정렬이 이루어짐
		 
		 
		//최종출력
		System.out.print("석차 \t이름 \tJava\tOracle\tHTML\tCSS\tJQuery\tJSP\t총점\t평균");
		System.out.println();
		for(int i = 0; i < scores.length; i++) {
			System.out.print(rank[i] + "\t");
			System.out.print(name[i] + "\t");
			for(int j = 0; j < scores[i].length; j++){
			System.out.print(scores[i][j] + "\t");
			}
			System.out.print(sum[i]+"\t"+avg[i] + "\t");
			System.out.println();
		}
	}
}*/
