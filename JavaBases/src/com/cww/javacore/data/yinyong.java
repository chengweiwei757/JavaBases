package com.cww.javacore.data;

public class yinyong {

	private String name="Jack";
	private int age=35;
	private boolean married=true;

	public yinyong(){}
	public yinyong(String str,int i,boolean flag){
		name=str;
		age=i;
		married=flag;
	}

	public void display(){
		System.out.println(name+" "+age+" "+married);
	}

	public static void main(String[] args) {
		yinyong person = new yinyong("Rose",20,false);
		person.display();
		
	}
}
