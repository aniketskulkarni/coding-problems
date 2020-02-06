/**
 * 
 */
package com.practice.problemsolving.ds.arrays.java7;

import java.util.Scanner;

/**
 * @author Aniket Kulkarni
 *
 */
public class ArrayLeftRotate {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	String[] nd = scanner.nextLine().split(" ");

	int n = Integer.parseInt(nd[0]);

	int d = Integer.parseInt(nd[1]);

	int[] a = new int[n];

	String[] aItems = scanner.nextLine().split(" ");
	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	for (int i = 0; i < n; i++) {
	    int aItem = Integer.parseInt(aItems[i]);
	    a[i] = aItem;
	}

	if (a == null || a.length <= 0) {
	    return;
	}
	if (d % a.length == 0) {
	    printArray(a);
	    return;
	}
	int mod = d % a.length;
	for (int index = 0; index < a.length; ++index) {
	    System.out.print(a[(index + mod) % a.length] + " ");
	}
	scanner.close();
    }

    static void printArray(int[] array) {
	for (int index = 0; index < array.length; index++) {
	    System.out.print(array[index] + " ");
	}
    }

}
