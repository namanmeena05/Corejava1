package com.rays.collectionframework;

public class ToString {
	public static void main(String[] args) {
		
		ToString t = new ToString(101, "naman");
		System.out.println(t);
		
		
		
	}
		private int id = 0;
		private String name = null;

		public ToString(int id, String name) {
			this.id = id;
			this.name = name;

		}

		public String toString() {
			return name + " " + id;
		}
		
	}


