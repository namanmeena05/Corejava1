

package com.rays.basic;

public class Arms100to1000 {
    public static void main(String[] args) {
        for (int i = 100; i <= 1000; i++) {
            int number = i;
            int sum = 0;
            int r;

            while (number != 0) {
                r = number % 10;
                sum = sum+ (r * r * r);
                number = number/ 10;
            }

            if (i == sum) {
                System.out.println(i);
            }
        }
    }
}
