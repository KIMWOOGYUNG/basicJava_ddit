package com.java.extendsClass;

import sub03.Divide;
import sub03.Output;

public class IntOutput implements Output {

	private Divide divide;
	public void setDivide(Divide divide){
		this.divide=divide;
	}
	
	@Override
	public void output(Object o) {
		System.out.println("계산 결과 : "+ (Integer)divide.divide(o));		
	}

}
