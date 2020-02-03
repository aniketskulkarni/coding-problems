/**
 * 
 */
package com.practice.problemsolving.ds.arrays.java7;

/**
 * @author Aniket Kulkarni
 *
 */
public class ArrayReverse {

    static int[] reverseArray(int[] a) {
	if (a == null || a.length <= 0) {
	    return a;
	}
	int forwardIndex = 0;
	int backwardIndex = a.length - 1;
	while (forwardIndex < backwardIndex) {
	    int tempHoldValue = a[backwardIndex];
	    a[backwardIndex] = a[forwardIndex];
	    a[forwardIndex] = tempHoldValue;
	    ++forwardIndex;
	    --backwardIndex;
	}
	return a;
    }
}
