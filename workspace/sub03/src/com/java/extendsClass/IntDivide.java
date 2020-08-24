package com.java.extendsClass;

import sub03.Divide;

public class IntDivide extends Divide{

	@Override
	public Object divide(Object o) {
		Object target = getMulti().multi(100);
		if(o instanceof Integer && target instanceof Integer && (Integer)o != 0){
			return (Integer)target / (Integer)o;
		}
		return null;
	}

	
}
