/**
 * 
 */
package com.practice.problemsolving.ds.warmup.java7;

import java.util.Scanner;

/**
 * @author Aniket Kulkarni
 *
 */
public class SolveMeFirst {

    static int solveMeFirst(int a, int b) {
	return a + b;
    }

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a;
	a = in.nextInt();
	int b;
	b = in.nextInt();
	int sum;
	in.close();
	sum = solveMeFirst(a, b);
	System.out.println(sum);
    }

}
