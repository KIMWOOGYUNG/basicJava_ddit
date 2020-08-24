package com.java.extendsClass;

import sub03.Minus;

public class IntMinus extends Minus{

	@Override
	public Object minus(Object o) {
		Object target = getSum().sum(10);
		if(o instanceof Integer && target instanceof Integer ){
			return (Integer)target-(Integer)o;
		}
		return null;
	}


}
