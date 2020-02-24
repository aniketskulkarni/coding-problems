/**
 * 
 */
package com.practice.interviewprep.dict.hashmap.java7;

import java.util.Scanner;

/**
 * @author Aniket Kulkarni
 *
 */
public class TwoStrings {

    static String twoStrings(String s1, String s2) {
	String response = "NO";
	int[] s1CharCount = new int[123];
	for (int index = 0; index < s1.length(); index++) {
	    s1CharCount[s1.charAt(index)]++;
	}
	int[] s2CharCount = new int[123];
	for (int index = 0; index < s2.length(); index++) {
	    s2CharCount[s2.charAt(index)]++;
	}
	for (int index = 97; index < s1CharCount.length; index++) {
	    if (s1CharCount[index] != 0 && s2CharCount[index] != 0) {
		response = "YES";
		break;
	    }
	}
	return response;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

	int q = scanner.nextInt();
	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	for (int qItr = 0; qItr < q; qItr++) {
	    String s1 = scanner.nextLine();

	    String s2 = scanner.nextLine();

	    String result = twoStrings(s1, s2);
	    System.out.println(result);

	}
	scanner.close();
    }
}
