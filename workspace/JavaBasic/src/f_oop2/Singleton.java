package f_oop2;

//싱글톤 패턴 : 객체의 생성을 제한하여 하나의 객체만 사용하게 하는 디자인 패턴
//객체들간에 객체를 공유하기 위해 사용한다. (객체들끼리 하나의 작은 객체를 또 공유)
//생성자를 호출하지 못하게 생성자에 private을 붙인다.
//객체 생성은 이 클래스 내에서만 하고
//다른 클래스에서 필요하면 객체가 저장된 변수를 빌려줌
//메모리 낭비 방지 효과
//singleton 은 어떤 키워드가 x, 방법 이름

public final class Singleton { //이 클래스를 상속받지 못하게 final을 붙여줌
	
	private static Singleton instance;  //변수(생성자를 담아 객체화하기 위해 변수 만듬)
	
	private Singleton(){				//생성자(컴파일러가 기본으로 만드는건데 private을 붙이려고 표기)
		
	}
	
	public static Singleton getInstance(){ //객체를 빌려주는 함수 생성
		if(instance == null){ //null일때 한번만 생성되고 그 뒤론 공유해서 사용
			instance = new Singleton(); //객체생성
		}
		return instance;
	}
}
