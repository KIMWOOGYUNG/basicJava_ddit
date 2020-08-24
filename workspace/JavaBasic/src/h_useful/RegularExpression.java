package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	
	public static void main(String[] args){
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 * //회원가입 할 때 사용
		 * 
		 * ^	뒷 문자로 시작
		 * $	앞 문자로 종료
		 * .	임의의 문자(줄바꿈 제외)
		 * *	앞 문자가 0개 이상
		 * +	앞 문자가 1개 이상
		 * ?	앞 문자가 없거나 1개
		 * []	문자의 집합니다 범위([a-z] : a부터 z까지, [^a-z] : a부터 z가 아닌 것) //^은 부정의 의미
		 * {}	앞 문자의 개수({2} : 2개, {2,4} : 2개 이상 4개 이하) //개수 지정 안하면 1개
		 * ()	그룹화(1개의 문자처럼 인식)
		 * |	OR연산
		 * \s	공백, 탭, 줄바꿈
		 * \S	공백, 탭, 줄바꿈이 아닌 문자
		 * \w	알파벳이나 숫자
		 * \W	알파벳이나 숫자가 아닌 문자
		 * \d	숫자
		 * \D	숫자가 아닌 문자
		 * (?!)	뒷 문자의 대소문자 구분 안함
		 * \	정규표현식에서 사용되는 특수문자 그대로 표현	
		 */
		//정규식에 포함되지 않는건 그냥 쓰면 됨
		
		String str = "abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-z0-9]+";
//		String regex = "\\w*";
/*		String regex = ".*";
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(str);
		
		System.out.println(m.matches());*/
		
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요.
		String id = "kwk950807";
		String id_regex = "[a-z0-9_-]{5,20}";
		
		String phoneNum = "010-5760-9587";
		String pn_regex = "^0\\d{1,3}-\\d{3,4}-\\d{4}"; //0로 시작하는 숫자 - 숫자 - 숫자
		
		String mail = "kwk950807@naver.com";
		//String mail_regex = "[a-z0-9]{5,20}@[a-z]{1,7}\\.[a-z]{3}";
		String mail_regex = "[a-z0-9_-]{5,20}@[a-zA-z]+\\.(?!)(com|net|org|([a-z]{2}\\.kr))$";
		
		Pattern p_id = Pattern.compile(id_regex);
		Pattern p_pn = Pattern.compile(pn_regex);
		Pattern p_mail = Pattern.compile(mail_regex);
		
		Matcher m_id = p_id.matcher(id);
		Matcher m_pn = p_pn.matcher(phoneNum);
		Matcher m_mail = p_mail.matcher(mail);
		
		System.out.println(m_id.matches());
		System.out.println(m_pn.matches());
		System.out.println(m_mail.matches());
		
		
	}
}
