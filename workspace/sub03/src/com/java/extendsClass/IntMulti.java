package com.java.extendsClass;

import sub03.Multi;

public class IntMulti extends Multi{

	@Override
	public Object multi(Object o) {
		Object target = getMinus().minus(7);
		if(o instanceof Integer && target instanceof Integer){
			return (Integer)target * (Integer)o;
		}
		return null;
	}
	
	
}
