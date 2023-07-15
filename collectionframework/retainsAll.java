package com.rays.collectionframework;

import java.util.Collection;
import java.util.ArrayList;

public class retainsAll {
	public static void main(String[] args) {
		
	
	Collection box = new ArrayList();
	box.add("pen");
	box.add("paper");
	box.add("scale");
	box.add("Eraser");
	
	Collection bag = new ArrayList();
	bag.add("pen");
	bag.add("scale");
	
	box.retainAll(bag);
	System.out.println(box);
	
	
	}
	
}
