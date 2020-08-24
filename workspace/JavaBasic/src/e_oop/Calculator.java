package e_oop;

public class Calculator {
	
	//계산에 음수가 있을지 실수가 있을지 모르니 double로 하는게 좋음
	double add(double a, double b){
		return a + b;
	}
	
	double subtract(double a, double b){
		return a - b;
	}
	
	double multiply(double a, double b){
		return a * b;
	}
	
	double divide(double a, double b){
		return a / b;
	}
	
	double remainder(double a, double b){
		return a % b;
	}
}
