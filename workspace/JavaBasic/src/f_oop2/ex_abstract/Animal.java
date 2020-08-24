package f_oop2.ex_abstract;

public abstract class Animal {
	
	public static void main(String[] args){
		Animal a = new Dog();
		a.bark();
	}
	void run(){
		System.out.println("달려갑니다.");
	}
	
	abstract void bark();
}

class Dog extends Animal{ //추상클래스 애니멀을 상속받는 개 클래스

	@Override //추상메서드 오버라이딩 - 필수!!
	void bark() {
		System.out.println("멍멍!!");
	}
	
}

class Cow extends Animal{

	@Override
	void bark() {
		System.out.println("음메~");
	}
	
}

class Bird extends Animal{

	@Override
	void bark() {
		System.out.println("짹짹");
	}
	
}
