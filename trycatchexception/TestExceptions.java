package com.rays.trycatchexception;

public class TestExceptions {

	public static void main(String[] args) {

		try {
			String name1 = "Copper";

			String name2 = "Gold";

			if (name1 == name2) {
				System.out.println("String match");
			} else {
				throw new Exceptions();
			}
		} catch (Exception e) {
			System.out.println(e);

		} finally {
			System.out.println("Finally Work");
		}

	}

}
