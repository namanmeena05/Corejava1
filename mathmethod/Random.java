package com.rays.mathmethod;

public class Random {
	public static void main(String args[])
    {
        // define the range
        int max = 1000000;
        int min = 2000000;
        int range = max - min + 1;
 
        // generate random numbers within 1 to 10
        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * range) + min;
           
            
            System.out.println(rand);
        }
    }


}
