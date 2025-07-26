package coreJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("India");
		hs.add("Sourish");
		hs.add("UK");
		hs.add("Hespanic");
		hs.add("Hespanic");
		System.out.println(hs);
		hs.remove("UK");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		Iterator<String> i  = hs.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
