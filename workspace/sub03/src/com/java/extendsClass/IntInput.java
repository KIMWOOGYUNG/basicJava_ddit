package com.java.extendsClass;

import java.util.Scanner;

import sub03.Input;

public class IntInput implements Input{

	@Override
	public Object input() {
		System.out.println("정수를 입력하세요.");
		Scanner scann = new Scanner(System.in);
		int input = Integer.parseInt(scann.nextLine().trim());
		return input;
	}

	

}
