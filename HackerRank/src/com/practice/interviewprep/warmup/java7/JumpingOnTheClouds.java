/**
 * 
 */
package com.practice.interviewprep.warmup.java7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Aniket Kulkarni
 *
 */
public class JumpingOnTheClouds {
    static int jumpingOnClouds(int[] c) {
	int numOfJumps = 0;
	for (int index = 0; index < c.length;) {
	    if (c[index] == 0) {
		numOfJumps = index == 0 ? 0 : ++numOfJumps;
		index = index + 2 < c.length ? index + 2 : index + 1;
	    } else {
		index -= 1;
	    }
	}
	return numOfJumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	int n = scanner.nextInt();
	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	int[] c = new int[n];

	String[] cItems = scanner.nextLine().split(" ");
	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	for (int i = 0; i < n; i++) {
	    int cItem = Integer.parseInt(cItems[i]);
	    c[i] = cItem;
	}

	int result = jumpingOnClouds(c);

	bufferedWriter.write(String.valueOf(result));
	bufferedWriter.newLine();

	bufferedWriter.close();

	scanner.close();
    }
}
