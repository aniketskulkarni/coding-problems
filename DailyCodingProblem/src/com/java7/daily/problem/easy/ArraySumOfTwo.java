/**
 * 
 */
package com.java7.daily.problem.easy;

import java.util.Scanner;

/**
 * @author Aniket Kulkarni
 *
 */

/**
 * ******************************************************************************
 * Problem:- Given a list of numbers and a number k, return whether any two
 * numbers from the list add up to k. For example, given [10, 15, 3, 7] and k of
 * 17, return true since 10 + 7 is 17.
 * ******************************************************************************
 */
public class ArraySumOfTwo {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of elements in array");
	int n = sc.nextInt();
	int[] arr = new int[n];
	System.out.println("Enter elements ");
	for (int i = 0; i < n; i++) {
	    arr[i] = sc.nextInt();
	}
	System.out.println("Enter the value of k ");
	int k = sc.nextInt();
	sc.close();
	boolean isAddUptoK = isAddUptoK(arr, k);
	System.out.println(isAddUptoK);
    }

    /**
     * @param arr
     * @return boolean
     */
    private static boolean isAddUptoK(int[] arr, int k) {
	for (int i = 0; i < arr.length; i++) {
	    for (int j = i + 1; j < arr.length; j++) {
		if (arr[i] + arr[j] == k) {
		    return true;
		}
	    }
	}
	return false;
    }

}
