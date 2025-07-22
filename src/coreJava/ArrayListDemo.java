package coreJava;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Text");
		al.add("Sourish");
		al.add("Modu");
		al.add(0, "England");
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.contains("Text"));
		al.remove(1);
		System.out.println(al);
		al.remove("Modu");
		System.out.println(al);
		System.out.println(al.get(1));
		System.out.println(al.isEmpty());
		System.out.println(al.indexOf("Sourish"));
		System.out.println(al.size());
	}

}
