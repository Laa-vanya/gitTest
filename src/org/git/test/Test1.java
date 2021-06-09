package org.git.test;

public class Test1 {
	int a=10;
	int b=20;
	int e=10;
	public void add() {
		int c=a+b;
		System.out.println(c);
		System.out.println(e+c);
		
	}
	
public static void main(String[] args) {
	Test1 t=new Test1();
	t.add();
}
}
