package f_oop2;

public class SampleParent extends Object{ //기본부모클래스는 Object로
	
	String var; //상속 ok
	
	{
		var = "초기화 블럭은 물려주지 않는다.";
	} //뒤의 생성자 초기화 때문에 사라짐
											
	
	SampleParent(){
		var = "생성자도 물려주지 않는다.";
	}
	
	
	int method(int a , int b){
		return a + b;
	}
}
