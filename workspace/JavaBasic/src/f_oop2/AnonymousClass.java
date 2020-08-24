package f_oop2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass {

	public static void main(String[] args) {
		//익명 클래스 : 하나의 부모 클래스나 인터페이스를 상속받아 
		//클래스를 선언함과 동시에 객체를 생성하는 클래스
		//GUI(Graphic User Interface)를 만들때 사용 
		//CUI(Character User Interface)
		
		Button b = new Button();
		
												 //중괄호부터 클래스 시작
		b.addActionListener(new ActionListener() { //new Action( + ctrl + enter)
			//ActionListener를 상속받은 자식 클래스
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 누르면 실행");
			}
		}); //익명 클래스가 생성됐고 그안에 actionPerformed라는 메서드가 있는것
		//버튼에서만 필요한 한정된 기능이기 때문에 이름이 필요없음 (이름은 다른데서 호출하기 위한것)
	}

}
