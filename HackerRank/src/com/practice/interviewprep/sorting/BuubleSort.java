/**
 * 
 */
package com.practice.interviewprep.sorting;

/**
 * @author Aniket Kulkarni
 *
 */
public class BuubleSort {

    static void countSwaps(int[] a) {
	int numSwaps = 0;
	for (int outerLoop = 0; outerLoop < a.length; outerLoop++) {
	    for (int innerLoop = 0; innerLoop < a.length - 1; innerLoop++) {
		if (a[innerLoop] > a[innerLoop + 1]) {
		    swapIntegers(a, innerLoop, innerLoop + 1);
		    numSwaps += 1;
		}
	    }
	}
	System.out.println(String.format("Array is sorted in %d swaps.", numSwaps));
	System.out.println(String.format("First Element: %d", a[0]));
	System.out.println(String.format("Last Element: %d", a[a.length - 1]));
    }

    static void swapIntegers(int[] a, int swapIndex, int swapWithIndex) {
	int temp = a[swapIndex];
	a[swapIndex] = a[swapWithIndex];
	a[swapWithIndex] = temp;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	int[] a = { 1, 2, 3 };
	countSwaps(a);
    }

}
