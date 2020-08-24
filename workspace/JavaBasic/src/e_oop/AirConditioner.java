package e_oop;

public class AirConditioner {
	
	boolean power; //전원
	int temperature; //온도
	int airVolume; //풍량
	
	AirConditioner(){ //생성자 생성 및 초기화
		power = false;
		temperature = 24;
		airVolume = 1;
	}
	
	void power(){
		power = !power;
	}
	
	void temperatureUp(){
		if(power){ //전원이 켜져있을때 즉 현재 true일때)
			if(temperature < 30){
				temperature++; //온도 1씩 증가
			}
		}
	}
	
	void temperatureDown(){
		if(power && 18 < temperature){
		temperature--; //온도 1씩 감소
		}
	}
	
	void airVolume(){
		if(power && 3 < ++airVolume){
			airVolume = 1;
		}
	}
	
	//온도가 18 ~ 30까지만 변경할 수 있게 해주시고,
	//전원을 켰을때만 버튼들이 작동되도록 메서드들을 변경해주세요.
		
	
	//실행은 main메소드에서!
	public static void main(String[] args){
		AirConditioner ac = new AirConditioner();
		
		ac.power();
		System.out.println("power : " + ac.power);
		
		ac.temperatureUp();
		System.out.println("temperature : " + ac.temperature);
		
		ac.temperatureDown();
		System.out.println("temperature : " + ac.temperature);
		
		ac.airVolume();
		System.out.println("airVolume : " + ac.airVolume);
		
	}
	
}
