package f_oop2.ex_abstract;

public class Animal_print extends Animal{ //추상클래스 상속받음

	public static void main(String[] args) { //객체생성
		Dog d = new Dog();
		d.bark();
	}

	@Override
	void bark() { //추상메서드 오버라이딩
		// TODO Auto-generated method stub
		
	}

}
