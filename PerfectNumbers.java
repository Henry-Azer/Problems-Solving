package com.Projects;

public class PerfectNumbers {

    public static void main(String[] args) {
        System.out.println("The four perfect number less than 10,000:");

        int sum;
        for (int i = 1; i < 10000; i++) {
            sum = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0)
                    sum += j;
            }

            if (i == sum) {
                System.out.println(i);
            }
        }
    }
}