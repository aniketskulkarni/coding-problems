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
public class CountingValleys {
    static int countingValleys(int n, String s) {
	if (s == null || s.isEmpty()) {
	    return 0;
	}
	int steps = 0;
	int count = 0;
	for (int i = 0; i < s.length(); i++) {
	    if (s.charAt(i) == 'D')
		steps--;
	    else if (s.charAt(i) == 'U')
		steps++;
	    if (steps == 0 && s.charAt(i) == 'U') {
		count++;
	    }
	}
	return count++;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	int n = scanner.nextInt();
	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	String s = scanner.nextLine();

	int result = countingValleys(n, s);

	bufferedWriter.write(String.valueOf(result));
	bufferedWriter.newLine();

	bufferedWriter.close();

	scanner.close();
    }

}
