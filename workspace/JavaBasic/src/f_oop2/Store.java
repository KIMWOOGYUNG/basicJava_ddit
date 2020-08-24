package f_oop2;

public class Store {
	
	//구조체(struct) : 배열과 달리 다른 타입의 데이터를 묶어서 사용하는것 (c언어)
	//클래스 : 다른 타입의 데이터를 묶어서 사용하는것 + 관련 메서드

	public static void main(String[] args) {
		Customer c = new Customer(); //손님 만들기
		
		Product p = new Desktop();
		p.info();
		c.buy(p);
		
		p = new TV();
		p.info();
		c.buy(p);
		
		c.showItem();

	}

}

class Product{ //부모클래스
	String name;
	int price;
	
	Product(String name, int price){ //생성자
		this.name = name;
		this.price = price;
	}
	
	void info(){
		System.out.println("----------------------");
		System.out.println("상품명 : " + name);
		System.out.println("금   액 : " + price + "원");
		System.out.println("----------------------");
	}
	
}

class Desktop extends Product{ //자식클래스
	Desktop(){
		super("삼성 컴퓨터", 500000); //부모 클래스의 생성자 호출
	}
}

class TV extends Product{ //자식클래스
	TV(){
		super("LG TV", 1000000);
	}
}

class Customer{ //일반클래스
	int money = 2000000000;
	Product[] item = new Product[10]; //장바구니
	
	void buy(Product p){ //클래스가 데이터타입이 될 수 있음
		if(money < p.price){
			System.out.println("돈이 부족합니다.");
			return;
		}
		money -= p.price;
		
		for(int i = 0; i < item.length; i++){
			if(item[i] == null){
				item[i] = p;
				break;
			}
		}
		System.out.println(p.name + "을 구매했다.");
	}
	
	void showItem(){
		System.out.println("--------장바구니--------");
		for(int i = 0; i < item.length; i++){
			if(item[i] != null){
				System.out.println(i + 1 + "." + item[i].name);
			}
		}
		System.out.println("----------------------");
	}
}


