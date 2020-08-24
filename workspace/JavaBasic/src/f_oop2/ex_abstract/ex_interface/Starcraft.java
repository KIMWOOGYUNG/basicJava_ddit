package f_oop2.ex_abstract.ex_interface;

public class Starcraft {
	
	public static void main(String[] args){
		//객체생성
		Marine marine = new Marine();
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		SCV scv = new SCV();
		
		scv.repair(marine); //repairable을 상속받지 않고 있기 때문에 오류
		scv.repair(tank);
		scv.repair(dropship);
		scv.repair(scv);
	}
}

class Unit{
	int hp; //현재 체력
	final int MAX_HP; //최대 체력
	
	Unit(int hp){ //생성자
		MAX_HP = hp;
		this.hp = MAX_HP; //체력 풀에서 시작
	}
}

class Marine extends Unit{
	Marine(){
		super(40); //부모 클래스의 생성자 호출
	}
}

class Tank extends Unit implements Repairable{ //Repairable 인터페이스를 상속받고 있음
	Tank(){
		super(150); 
	}
}

class Dropship extends Unit implements Repairable{
	Dropship(){
		super(125);
	}
}

class SCV extends Unit implements Repairable{
	SCV(){
		super(60);
	}
	
	void repair(Repairable r){ //수리하는 메서드 : 파라미터로 받은 유닛을 수리
		//마린은 받으면 안되서 유닛만 쓰면 안되고 인터페이스 사용해서 지정
		//Repairable을 상속받은 클래스들만 넘어올 수 있음
		if(r instanceof Unit){ //Unit으로 형변환이 가능한지 확인
			Unit u = (Unit)r;
			
			while(u.hp < u.MAX_HP){
				u.hp++;
			}
		}
		
	}
}

interface Repairable{ //수리 가능한 클래스를 지정해주려고 생성
	
}
