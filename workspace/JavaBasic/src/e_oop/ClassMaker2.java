package e_oop;

public class ClassMaker2 {

	//전역변수 하나를 선언하고 명시적으로 초기화 해주세요.
	int variable = 10;
	
	//위에서 선언한 전역변수를 초기화 블럭을 사용해 초기화 해주세요.
	//전역변수 중 인스턴스
	{	
		for(int i = 0; i < 10; i++){
			variable += i;
		}
	}
	
	static int a = 0;
	static void a(){
		
	}
	
	//위에서 선언한 전역변수를 생성자의 파라미터를 사용해 초기화 해주세요.
	ClassMaker2(int variable){
		this.variable = variable;
		System.out.println(variable);
		a();
		//static 붙은애들은 바로 사용 가능 
	}
	//위에서 선언한 전역변수를 생성자를 하나 더 만들어서 초기화 해주세요.
	ClassMaker2(){
		this(50);	
	}
	
	public static void main(String[] args){
		//메인 메서드에는 static이 붙어있기때문에 객체를 통해 변수를 사용해야함
		//static이 붙은애는 안붙은애를 사용할 수 없기때문에 객체 생성하는것임
		//왜냐면 static이 붙은게 더 먼저 메모리에 올라가기때문에 그땐 안붙은애가 아직 없음
		
		ClassMaker2 cm2 = new ClassMaker2();
		System.out.println(cm2.variable);
		
		cm2 = new ClassMaker2(100);
		System.out.println(cm2.variable);
		
	}
	//생성자를 사용하는 이유 : 인스턴스를 초기화 할때 / 객체생성을 하면서 뭔가 하고싶을때
}
