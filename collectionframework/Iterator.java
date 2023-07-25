package com.rays.collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class Iterator {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("RAM");
		c.add("Shyam");
		c.add("radha");
		
		java.util.Iterator it = c.iterator();

		while (it.hasNext()) {
			Object o = it.next();

			System.out.println(o);
			it.remove();
			System.out.println(c);

		}
	}

}
