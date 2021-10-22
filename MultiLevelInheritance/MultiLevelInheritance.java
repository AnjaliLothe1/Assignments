package maamAssignment;

import java.lang.*;

class Triangle {
	void getData() {
		System.out.println("I am an Triangle");
	}
}

class Isosceles extends Triangle {
	void getData() {
		System.out.println("I am an Isosceles Triangle");
	}
}

class Equlateral extends Isosceles {
	void getData() {
		System.out.println("I am an Equlateral Triangle");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		/*
		 * type1 Equlateral eobj=new Equlateral(); eobj.getData();
		 * 
		 * Isosceles iobj =new Isosceles(); iobj.getData();
		 * 
		 * Triangle tobj=new Triangle(); tobj.getData();
		 */
		Triangle t = new Equlateral();
		t.getData();

		Triangle t1 = new Isosceles();
		t1.getData();

		Triangle t2 = new Triangle();
		t2.getData();
	}

}
