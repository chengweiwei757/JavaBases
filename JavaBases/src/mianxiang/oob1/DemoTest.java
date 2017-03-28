package mianxiang.oob1;

public class DemoTest {

	public static void main(String[] args) {
		IStudent student  = new StudentImpl();
		student.study();
		student.study("java");
		student.study("php");

	}

}
