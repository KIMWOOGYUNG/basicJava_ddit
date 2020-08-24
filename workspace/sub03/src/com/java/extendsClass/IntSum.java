package com.java.extendsClass;

import sub03.Sum;

public class IntSum extends Sum {

	@Override
	public Object sum(Object o) {
		Object target = getInput().input();
		if(o instanceof Integer && target instanceof Integer){
			return (Integer)o+(Integer)target;
		}
		return null;
	}

}
