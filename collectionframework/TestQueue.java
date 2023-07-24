package com.rays.collectionframework;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	
	public static void main(String[] args) {
		
		Queue q = new LinkedList();
		q.add(null);
		
		System.out.println(q);
		q.remove();
		System.out.println(q);
	}

}
