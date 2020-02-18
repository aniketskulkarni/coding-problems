/**
 * 
 */
package com.practice.interviewprep.arrays.java7;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Aniket Kulkarni
 *
 */
public class ArryaManipulation {

    static long arrayManipulation(int n, int[][] queries) {
	long[] resultArray = new long[n + 1];
	long maxElementInResultArray = 0L;
	int row = 0;
	int a = 0;
	int b = 1;
	int k = 2;
	for (int numOfTestCases = queries.length; numOfTestCases > 0; numOfTestCases--) {
	    resultArray[queries[row][a] - 1] += queries[row][k];
	    resultArray[queries[row][b]] -= queries[row][k];
	    row += 1;
	}
	for (int index = 1; index < resultArray.length; index++) {
	    resultArray[index] += resultArray[index - 1];
	    if (maxElementInResultArray < resultArray[index]) {
		maxElementInResultArray = resultArray[index];
	    }
	}
	return maxElementInResultArray;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

	String[] nm = scanner.nextLine().split(" ");

	int n = Integer.parseInt(nm[0]);

	int m = Integer.parseInt(nm[1]);

	int[][] queries = new int[m][3];

	for (int i = 0; i < m; i++) {
	    String[] queriesRowItems = scanner.nextLine().split(" ");
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	    for (int j = 0; j < 3; j++) {
		int queriesItem = Integer.parseInt(queriesRowItems[j]);
		queries[i][j] = queriesItem;
	    }
	}

	long result = arrayManipulation(n, queries);
	System.out.println(result);

	scanner.close();
    }

}
