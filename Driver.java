package com.jsp.annotations;

public class Driver {

	public static void main(String[] args) {
		Demo demo = new Demo();

		Class c = (Class) demo.getClass();

		System.out.println(c.getName());

		MyAnno myAnno = (MyAnno) c.getAnnotation(MyAnno.class);

		System.out.println(myAnno.id());

		System.out.println(myAnno.city);

		System.out.println(myAnno.name());

	}

}
