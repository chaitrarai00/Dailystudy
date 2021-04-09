package com.inheritance;

public class Inheritcheck{

	public static void main(String[] args) {
		A a=new B();
		a.call(); //class reference
		/*
		 * if not static object reference will be picked
		 */
	}

}
