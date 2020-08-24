package z_exam;

import java.util.Arrays;

public class String_Function {
	//질문 : 11-1번

	public static void main(String[] args) {
		//1. String(char[] value) : 주어진 문자열(value)을 갖는 String인스턴스를 생성한다.
			char[] c1 = {'w','o','o','g','y','u','n','g'};
			String s1 = new String(c1);
			System.out.println(s1);
			
		//2. String(StringBuffer buf) : StringBuffer인스턴스가 갖고 있는 문자열과 같은 내용의 String 인스턴스를 생성한다.
			StringBuffer sb = new StringBuffer("Chloe");
			String s2 = new String(sb);
			System.out.println(s2);
			
		//3. char charAt(int index) : 지정된 위치(index)에 있는 문자를 알려준다. (index는 0부터 시작)
			String s3 = "Hello";
			char c3 = s3.charAt(1);
			System.out.println(c3);
		
		//4. int compareTo (String str) : 문자열(str)과 사전순서로 비교한다. 
		   //같으면, 0을, 사전순으로 이전이면 음수를, 이후면 양수를 반환한다.
			int i4 = "aaaa".compareTo("abcd");
			System.out.println(i4);
		
		//5. String concat(String str) : 문자열(str)을 뒤에 덧붙인다.
			String s5 = "우유~";
			String s52 = s5.concat("좋아!");
			System.out.println(s52);
			
		//6. boolean contains(CharSequence s) : 지정된 문자열(s)이 포함되었는지 검사한다.
			String s6 = "Chocolate Cream Cheese Cake";
			boolean b6 = s6.contains("Cheese");
			System.out.println("6번" + b6);
			
		//7. boolean endsWith(String suffix) : 지정된 문자열(suffix)로 끝나는지 검사한다.
			String file = "25th birthday.pdf";
			boolean b7 = file.endsWith("pdf");
			System.out.println("7번" + b7);
			
		//8. boolean equals(Object obj) : 매개변수로 받은 문자열(obj)과 String인스턴스의 문자열을 비교한다.
		//   obj가 String이 아니거나 문자열이 다르면 false를 반환한다.
			String s8 = "sky";
			boolean b8 = s8.equals("ski");
			System.out.println("8번" + b8);
			
		//9. boolean equalIgnoreCase (String str) : 문자열과 String인스턴스 문자열을 대소문자 구분없이 비교한다.
			String s9 = "Chloe";
			boolean b9 = s9.equalsIgnoreCase("chloe");
			System.out.println("9번" + b9);
			
		//10. int indexOf(int ch) : 주어진 문자(ch)가 문자열에 존재하는지 확인하여 위치(index)를 알려준다. 
		//    못 찾으면 -1을 반환한다.(index는 0부터 시작)
			String s10 = "pizza chicken burger steak";
			int idx10 = s10.indexOf("burger");
			System.out.println(idx10);
		
		//11. String intern() : 문자열을 상수풀(constant pool)에 등록한다.
		//    이미 상수풀에 같은 내용의 문자열이 있을 경우 그 문자열의 주소값을 반환한다.
			String s11 = new String("Paris");
			String s11_2 = new String("Paris");
			boolean b11 = (s11 == s11_2);
			boolean b11_2 = s11.equals(s11_2);
			boolean b11_3 = (s11.intern() == s11_2.intern());
			System.out.println("11번 1번쨰 : " + b11);
			System.out.println("11번 2번쨰 : " + b11_2);
			System.out.println("11번 3번쨰 : " + b11_3);
			
		//12. int lastIndexOf(int ch) : 지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서부터 찾아서 위치(index)를 알려준다
		//    못 찾으면 -1을 반환한다.
			String s12 = "abc.def.hij";
			int idx12 = s12.lastIndexOf('.');
			int idx12_2 = s12.indexOf('.');
			System.out.println(idx12);
			System.out.println(idx12_2);
			
		//13. int lastIndexOf(String str) : 지정된 문자열을 인스턴스의 문자열 끝에서부터 찾아서 위치(index)를 알려준다.
		//    못 찾으면 -1을 반환한다.
			int idx13 = s12.lastIndexOf("hij");
			int idx13_2 = s12.lastIndexOf("ef");
			System.out.println(idx13);
			System.out.println(idx13_2);
			
		//14. int length() : 문자열의 길이를 알려준다.
			String s14 = "Hi, my name is Chloe! Nice to meet you:)";
			int length = s14.length();
			System.out.println(length);
			
		//15. String replace(Char old, Char nw) : 문자열 중의 문자(old)를 새로운 문자(nw)로 바꾼 문자열을 반환한다.
			String s15 = "yello";
			String s15_2 = s15.replace('y', 'h');
			System.out.println(s15_2);
			
		//16. String replace(CharSequence old, CharSequence nw) : 문자열 중의 문자열(old)을 새로운 문자열(nw)로 모두 바꾼 문자열을 반환한다.
			String s16 = "apple pie";
			String s16_2 = s16.replace("apple", "walnut");
			System.out.println(s16_2);
			
		//17. String replaceAll(String regex, String replacement) : 문자열 중에서 지정된 문자열(regex)과 일치하는 것을 새로운 문자열(replacement)로 모두 변경한다.
			String s17 = "AABBAABB";
			String s17_2 = s17.replaceAll("BB","bb");
			System.out.println(s17_2);
			
		//18. String replaceFirst(String regex, String replacement) : 문자열 중에서 지정된 문자열과 일치 하는 것 중, 첫 번째 것만 새로운 문자열로 변경한다.
			String s18_2 = s17.replaceFirst("BB", "bb");
			System.out.println(s18_2);
			
		//19.String[] split(String regex) : 문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다.
			String s19 = "apple,banana,grape";
			String[] s19_2 = s19.split(",");
			for(int i = 0; i < s19_2.length; i++){
				System.out.println(s19_2[i]);
			}
				
		//20. String[] split(String regex, int limit) : 문자열을 지정된 분리자(regex)로 나누어 문자열배열에 담아 반환한다.
		//    단, 문자열 전체를 지정된 수(limit)로 자른다.
			String[] s20_2 = s19.split(",",2);
			for(int i2 = 0; i2 < s20_2.length; i2++){
				System.out.println(s20_2[i2]);
			}
			
		//21. boolean startsWith(String prefix) : 주어진 문자열(prefix)로 시작하는지 검사한다.
			String s21 = "one, two, three, four, five";
			boolean b21 = s21.startsWith("one");
			System.out.println(b21);
			
		/*22. String substring(int begin)
			  String substring(int begin, int end)
			  주어진 시작위치(begin)부터 끝 위치(end) 범위에 포함된 문자열을 얻는다.
			  이 때, 시작위치의 문자는 범위에 포함되지만, 끝 위치의 문자는 포함되지 않는다.(begin <= x < end)*/
			String s22 = "abcdefghijklmnop";
			
			String s22_2 = s22.substring(5);
			String s22_3 = s22.substring(5, 7);
			System.out.println(s22_2);
			System.out.println(s22_3);
			
		//23. String toLowerCase() : String 인스턴스에 저장되어있는 모든 문자열을 소문자로 변환하여 반환한다.
			String s23 = "HelLo";
			String s23_2 = s23.toLowerCase();
			System.out.println(s23_2);
			
		//24. String toSring() : String 인스턴스에 저장되어 있는 문자열을 반환한다.
			String s24 = "Chole";
			String s24_2 = s24.toString();
			System.out.println(s24_2);
			
		//25. String toUpperCase() : String 인스턴스에 저장되어 있는 모든 문자열을 대문자로 변환하여 반환한다.
			String s25 = "heLlo";
			String s25_2 = s25.toUpperCase();
			System.out.println(s25_2);
			
		//26. String trim() : 문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다. 
							// 이 때 문자열 중간에 있는 공백은 제거되지 않는다.
			String s26 = "   Hello Chloe      ";
			String s26_2 = s26.trim();
			System.out.println(s26_2);
			
		//27. static String valueOf(boolean b)
		   // static String valueOf(char c)
		   // static String valueOf(int i)
		   // static String valueOf(long l)
		   // static String valueOf(float f)
		   // static String valueOf(double d)
		   // static String valueOf(Object o)
		//지정된 값을 문자열로 변환하여 반환한다. 참조변수의 경우, toString()을 호출한 결과를 반환한다.
			String b = String.valueOf(true);
			String c = String.valueOf('a');
			String i = String.valueOf(100);
			String l = String.valueOf(100L);
			String f = String.valueOf(100f);
			String d = String.valueOf(10.0);
			java.util.Date dd = new java.util.Date();
			String date = String.valueOf(dd);
			
			System.out.println(b);
			System.out.println(c);
			System.out.println(i);
			System.out.println(l);
			System.out.println(f);
			System.out.println(d);
			System.out.println(date);
		
			
	}
}


