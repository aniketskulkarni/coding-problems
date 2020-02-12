/**
 * 
 */
package com.practice.interviewprep.arrays.java7;

import java.util.Scanner;

/**
 * @author Aniket Kulkarni
 *
 */
public class NewYearChaos {

    static void minimumBribes(int[] q) {
	if (q == null || q.length <= 0) {
	    return;
	}
	int bribe = 0;
	for (int index = 0; index < q.length; index++) {
	    if (q[index] - (index + 1) > 2) {
		System.out.println("Too chaotic");
		bribe = 0;
		break;
	    }
	    for (int innerLoop = Math.max(0, q[index] - 2); innerLoop < index; innerLoop++) {
		if (q[innerLoop] > q[index]) {
		    bribe += 1;
		}
	    }
	}
	if (bribe != 0) {
	    System.out.println(bribe);
	}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	int t = scanner.nextInt();
	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	for (int tItr = 0; tItr < t; tItr++) {
	    int n = scanner.nextInt();
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	    int[] q = new int[n];

	    String[] qItems = scanner.nextLine().split(" ");
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	    for (int i = 0; i < n; i++) {
		int qItem = Integer.parseInt(qItems[i]);
		q[i] = qItem;
	    }

	    minimumBribes(q);
	}

	scanner.close();
    }
}
