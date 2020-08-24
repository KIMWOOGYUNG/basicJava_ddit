package z_exam;
//3~13, 15~17, 20번
public class exam07 {

	//[7-3] 오버라이딩의 정의와 필요성에 대해서 설명하시오.
	/*오버라이딩 : 상속받은 메서드의 내용을 재정의 하는것
	 * 		- 리턴타입, 메서드명, 파라미터개수와 타입 등 동일해야하고 내용만 바뀐다.
	 * 		- 동일한 이름의 메서드
	 * 		- 필요성 : 부모 클래스의 메서드 내용이 수정이 필요하거나 추가 사항이 있을때
	 */
	
	
	/*[7-4] 다음 중 오버라이딩의 조건으로 옳지 않은 것은? (모두 고르시오)
				a. 조상의 메서드와 이름이 같아야 한다. ㅇ
				b. 매개변수의 수와 타입이 모두 같아야 한다. ㅇ
				c. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다. x - 자식의 범위가 좁으면 더 넓은 범위에 접근할 수가 없어서 조상으로 접근할 수가 없음
				d. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다. x - 자식 메서드의 예외가 더 많으면 그게 다 충족이 안되는 부모 메서드 실행이 불가함
				*/
	
	/*[7-5] 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기
	위해서는 코드를 어떻게 바꾸어야 하는가?
			class Product
			{
				int price; // 제품의 가격
				int bonusPoint; // 제품구매 시 제공하는 보너스점수
				
				Product(){ 
				} //Tv클래스에서 호출할 수 있는 생성자를 만들어 준것
				
				Product(int price) {
					this.price = price;
					bonusPoint =(int)(price/10.0);
				}
			}
			class Tv extends Product {
				Tv() {
					(super()가 자동 생성돼있음)) //컴파일러가 호출 할 수 있는건 파라미터가 없는 생성자
				}
				public String toString() {
					return "Tv";
					}
				}
				class Exercise7_5 {
				public static void main(String[] args) {
					Tv t = new Tv();
				}
			}*/
	
	
	
	/*[7-6] 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유는 무엇인
	가?*/
		//조상의 인스턴스 변수들을 초기화 해주기 위해서
		//자손클래스에서 직접 초기화 하는것보다 호출해서 초기화하는게 바람직
	
	/*[7-7] 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
	class Parent {
		int x=100;
		Parent() {
			this(200);
		}
		Parent(int x) {
			super() //object 호출
			this.x = x; //x=200
		}
		int getX() {
			return x;
		}
	}
	class Child extends Parent {
		int x = 3000;
		Child() {
			this(1000); //x=1000
		}
		Child(int x) {
			//super(); //parent 호출
			this.x = x;
		}
	}
	class Exercise7_7 {
		public static void main(String[] args) {
			Child c = new Child();
			System.out.println("x="+c.getX());
		}
	}*/
	
	/*[7-8] 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한
	것은?  //a
	a. public-protected-(default)-private
	b. public-(default)-protected-private
	c. (default)-public-protected-private
	d. private-protected-(default)-public*/
	
	/*[7-9] 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다.
	옳지 않은 것은? (모두 고르시오) //
	a. 지역변수 - 값을 변경할 수 없다. o
	b. 클래스 - 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다. ㅇ
	c. 메서드 - 오버로딩을 할 수 없다.  x - 오버라이딩x (내용을 수정할 수 x)
	d. 멤버변수 - 값을 변경할 수 없다. ㅇ
	*/ 
	
	/*[7-10] MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할
	수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
	getter와 setter메서드를 추가하라.
	
	class MyTv2 {
		private boolean isPowerOn;
		private int channel;
		private int volume;
		final int MAX_VOLUME = 100;
		final int MIN_VOLUME = 0;
		final int MAX_CHANNEL = 100;
		final int MIN_CHANNEL = 1;
		
		public boolean getisPowerOn(){
			return isPowerOn;
		}
		
		public void setisPowerOn(boolean isPowerOn){
			this.isPowerOn = isPowerOn; 
		}
		
		public int getChannel(){
			return channel;
		}
		public void setChannel(int channel){
			if(channel < MAX_CHANNEL && channel > MIN_CHANNEL){
				this.channel = channel;
			}
		}
		
		public int getVolume(){
			return volume;
		}
		
		public void setVolume(int volume){
			if(volume < MAX_CHANNEL && volume > MIN_CHANNEL){
				this.volume = volume;
			}
		}
	}
	class Exercise7_10 {
		public static void main(String args[]) {
			MyTv2 t = new MyTv2();
			t.setChannel(10);
			System.out.println("CH:"+t.getChannel());
			t.setVolume(20);
			System.out.println("VOL:"+t.getVolume());
		}
	}
	*/
	
	/*[7-11] 문제7-10에서 작성한 MyTv2클래스에 이전 채널(previous channel)로 이동하는
	기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
	[Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.
	메서드명 : gotoPrevChannel
	기 능 : 현재 채널을 이전 채널로 변경한다.
	반환타입 : 없음
	매개변수 : 없음
	class MyTv2 {
		
		(1) 문제7-10의 MyTv2클래스에 gotoPrevChannel메서드를 추가하여 완성하시오.
		private boolean isPowerOn;
		private int channel;
		private int volume;
		int prevChannel;
		
		final int MAX_VOLUME = 100;
		final int MIN_VOLUME = 0;
		final int MAX_CHANNEL = 100;
		final int MIN_CHANNEL = 1;
		
		
		public boolean getisPowerOn(){
			return isPowerOn;
		}
		
		public void setisPowerOn(boolean isPowerOn){
			this.isPowerOn = isPowerOn; 
		}
		
		public int getChannel(){
			return channel;
		}
		public void setChannel(int channel){
			if(channel < MAX_CHANNEL && channel > MIN_CHANNEL){
				prevChannel = this.channel;
				this.channel = channel;
			}
		}
		
		public int getVolume(){
			return volume;
		}
		
		public void setVolume(int volume){
			if(volume < MAX_CHANNEL && volume > MIN_CHANNEL){
				this.volume = volume;
			}
		}
		
		public void gotoPrevChannel(){
			setChannel(prevChannel);
			
		}
		
		}
		class Exercise7_11 {
		public static void main(String args[]) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		}
		}*/
	
	/*[7-12] 다음 중 접근 제어자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
			a. public은 접근제한이 전혀 없는 접근 제어자이다. o
			b. (default)가 붙으면, 같은 패키지 내에서만 접근이 가능하다. o
			c. 지역변수에도 접근 제어자를 사용할 수 있다. x - 지역변수는 참조될 수 없다. 그 메서드 안에서만! (호출할 때마다 다른 주소)
			d. protected가 붙으면, 같은 패키지 내에서도 접근이 가능하다. o
			e. protected가 붙으면, 다른 패키지의 자손 클래스에서 접근이 가능하다. o
			*/
	
	//[7-13] Math클래스의 생성자는 접근 제어자가 private이다. 그 이유는 무엇인가?
			//생성자 호출을 못하게 하기 위해서 == 객체 생성을 못하게 하려고 
			//외부 접근을 막기 위해
	
	/*[7-15] 클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은?
			(모두 고르시오.)
			class Unit {}
			class AirUnit extends Unit {}
			class GroundUnit extends Unit {}
			class Tank extends GroundUnit {}
			class AirCraft extends AirUnit {}
			
			Unit u = new GroundUnit();
			Tank t = new Tank();
			AirCraft ac = new AirCraft();
			
			a. u = (Unit)ac; o
			b. u = ac; o
			c. GroundUnit gu = (GroundUnit)u; o //u가 참조하는 객체가 GroundUnit이므로 가능
			d. AirUnit au = ac;  o
			e. t = (Tank)u; x - 조상을 자손클래스로 형변환 할 수 없음
			f. GroundUnit gu = t; o
			*/
	
	/*[7-16] 다음 중 연산결과가 true가 아닌 것은? (모두 고르시오)
			class Car {}
			class FireEngine extends Car implements Movable {}
			class Ambulance extends Car {}
			FireEngine fe = new FireEngine();
			
			a. fe instanceof FireEngine ㅇ
			b. fe instanceof Movable ㅇ
			c. fe instanceof Object ㅇ - 모든 클래스는 object를 상속받음
			d. fe instanceof Car ㅇ
			e. fe instanceof Ambulance x
			*/
			
			
	/*[7-17] 아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고, 이
			클래스를 상속받도록 코드를 변경하시오.
			class Marine { // 보병
				int x, y; // 현재 위치
				void move(int x, int y) {  지정된 위치로 이동  }
				void stop() {  현재 위치에 정지  }
				void stimPack() {  스팀팩을 사용한다.}
			}
			class Tank { // 탱크
				int x, y; // 현재 위치
				void move(int x, int y) {  지정된 위치로 이동  }
				void stop() {  현재 위치에 정지  }
				void changeMode() {  공격모드를 변환한다. }
			}
			class Dropship { // 수송선
				int x, y; // 현재 위치
				void move(int x, int y) {  지정된 위치로 이동  }
				void stop() {  현재 위치에 정지  }
				void load() {  선택된 대상을 태운다. }
				void unload() {  선택된 대상을 내린다. }
			}
			--------------------------------------------------
			
			class Marine { // 보병
				void move(int x, int y) {  지정된 위치로 이동  }
				void stimPack() {  스팀팩을 사용한다.}
			}
			class Tank { // 탱크
				void move(int x, int y) {  지정된 위치로 이동  }
				void changeMode() {  공격모드를 변환한다. }
			}
			class Dropship { // 수송선
				void move(int x, int y) {  지정된 위치로 이동  }
				void load() {  선택된 대상을 태운다. }
				void unload() {  선택된 대상을 내린다. }
			}
			abstract class Unit{   //추상메서드를 포함하면 추상클래스
				int x, y; // 현재 위치
				abstract void move(int x, int y) {  지정된 위치로 이동  } //이동하는게 각자 다르므로 추상메서드
				void stop() {  현재 위치에 정지  }
			}
			*/
	
	/*7-20] 다음의 코드를 실행한 결과를 적으시오.
	[연습문제]/ch7/Exercise7_20.java
	class Exercise7_20 {
		public static void main(String[] args) {
			Parent p = new Child();
			Child c = new Child();
			System.out.println("p.x = " + p.x);
			p.method();
			System.out.println("c.x = " + c.x);
			c.method();
		}
	}
	class Parent {
		int x = 100;
		void method() {
			System.out.println("Parent Method");
		}
	}
	class Child extends Parent {
		int x = 200;
		void method() {
			System.out.println("Child Method"); //오버라이딩으로 "Parent Method"는 사라짐
		}
	}*/
	
	/*실행결과 : 
	p.x = 100
	Child Method
	c.x = 200
	Child Method*/


}
