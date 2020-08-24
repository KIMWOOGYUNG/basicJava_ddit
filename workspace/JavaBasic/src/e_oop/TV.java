package e_oop;

import java.util.Scanner;

public class TV {

	/*
	 * 기능에 해당하는 번호를 입력해주세요 
	 * 1. 전원 
	 * 2. 채널+ 
	 * 3. 채널- 
	 * 4. 음량+ 
	 * 5. 음량- 
	 * 0. 종료
	 */

	boolean power;
	int channel;
	int volume;
	int button;

	// 초기화
	TV() {
		power = false;
		channel = 20;
		volume = 10;
		button = 0;
	}


	void power() {
		power = !power;
		
	}

	void channelUp() {
		if (power && channel <= 60) {
			channel++;
		}
	};

	void channelDown() {
		if (power && channel > 0) {
			channel--;
		}
	};

	void volumeUp() {
		if (power && volume <= 40) {
			volume++;
		}
	};

	void volumeDown() {
		if (power && volume <= 40) {
			volume++;
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		//현재상태
		TV tv = new TV();
		System.out.println("power : " + tv.power);
		
	
		do{
			System.out.println("버튼을 눌러주세요");
			input = Integer.parseInt(sc.nextLine());
			
			if (input == 1) {
				tv.power();
				if(tv.power == true){
					System.out.println("전원이 켜졌습니다.");
				}else{
					System.out.println("전원이 꺼졌습니다.");
				}
			}
			else if (input == 2) {
				tv.channelUp();
				System.out.println("채널+1");
			}
			else if (input == 3) {
				tv.channelDown();
				System.out.println("채널-1");
			}
			else if (input == 4) {
				tv.volumeUp();
				System.out.println("볼륨+1");
			}
			else if (input == 5) {
				tv.volumeDown();
				System.out.println("볼륨-1");
			}
		}while(input != 0);	
		System.out.println("종료되었습니다.");
		
		System.out.println("power : " + tv.power);
		System.out.println("channel : " + tv.channel);
		System.out.println("volume"
				+ " : " + tv.volume);
		
	}
}


