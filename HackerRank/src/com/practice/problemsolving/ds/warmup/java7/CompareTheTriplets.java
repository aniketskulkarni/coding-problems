/**
 * 
 */
package com.practice.problemsolving.ds.warmup.java7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Aniket Kulkarni
 *
 */
public class CompareTheTriplets {

    static List<Integer> result = new ArrayList<>();

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	if (a == null || a.size() < 0 || b == null || b.size() < 0 || (a.size() != b.size())) {
	    result.add(0);
	    result.add(0);
	    return result;
	}
	int alice = 0;
	int bob = 0;
	for (int i = 0; i < a.size(); i++) {
	    if (a.get(i) > b.get(i)) {
		alice++;
	    } else if (a.get(i) == b.get(i)) {
		continue;
	    } else if (a.get(i) < b.get(i)) {
		bob++;
	    }
	}
	result.add(alice);
	result.add(bob);
	return result;
    }

    public static void main(String[] args) throws IOException {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	List<Integer> a = new ArrayList<>();

	for (int i = 0; i < 3; i++) {
	    int aItem = Integer.parseInt(aItems[i]);
	    a.add(aItem);
	}

	String[] bItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	List<Integer> b = new ArrayList<>();

	for (int i = 0; i < 3; i++) {
	    int bItem = Integer.parseInt(bItems[i]);
	    b.add(bItem);
	}

	List<Integer> result = compareTriplets(a, b);

	for (int i = 0; i < result.size(); i++) {
	    bufferedWriter.write(String.valueOf(result.get(i)));

	    if (i != result.size() - 1) {
		bufferedWriter.write(" ");
	    }
	}

	bufferedWriter.newLine();

	bufferedReader.close();
	bufferedWriter.close();
    }
}
