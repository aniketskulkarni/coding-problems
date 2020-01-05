/**
 * Input: ["flower","flow","flight"]
   Output: "fl"
   
   Input: ["dog","racecar","car"]
   Output: ""
   Explanation: There is no common prefix among the input strings.
   
 * String[] strs = { "flower", "flow", "flight" };
   String[] strs = { "dog", "racecar", "car" };
   String[] strs = { "aabb", "aa" };
   String[] strs = { "aa", "aa" };
   String[] strs = { "c", "c" };
   String[] strs = { "aa", "aa", "aabb" };
   String[] strs = { "" };
   String[] strs = { "aca", "cba" };
   String[] strs = { "a", "aca", "accb", "b" };
 */
package com.java7.problem.easy;

/**
 * @author Aniket Kulkarni
 *
 */
public class LongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
	if (strs == null || strs.length == 0) {
	    return "";
	}
	int[] charCountArr = new int[123]; // z's ASCII value is 122
	for (int i = 0; i < strs.length; i++) {
	    for (int j = 0; j < strs[i].length(); j++) {
		charCountArr[(int) strs[i].charAt(j)] = ++charCountArr[strs[i].charAt(j)];
	    }
	}
	StringBuilder ans = new StringBuilder();
	String test = strs[0];
	if (test.length() > 0) {
	    for (int i = 0; i < test.length(); i++) {
		if (charCountArr[test.charAt(i)] > strs.length
			&& charCountArr[test.charAt(i)] / strs.length == strs.length) {
		    ans.append(test.charAt(i));
		} else {
		    break;
		}
	    }
	}
	return ans.toString();
    }

    public static void main(String[] args) {
	LongestCommonPrefix14 obj = new LongestCommonPrefix14();
	// String[] strs = { "flower", "flow", "flight" };
	// String[] strs = { "dog", "racecar", "car" };
	// String[] strs = { "aabb", "aa" };
	// String[] strs = { "aa", "aa" };
	// String[] strs = { "c", "c" };
	// String[] strs = { "aa", "aa", "aabb" };
	// String[] strs = { "" };
	// String[] strs = { "aca", "cba" };
	// String[] strs = { "a", "aca", "accb", "b" };
	// System.out.println(obj.longestCommonPrefix2(strs));
    }

    public String longestCommonPrefix2(String[] strs) {
	if (strs == null || strs.length == 0) {
	    return "";
	}
	StringBuilder tmp = new StringBuilder();
	String ans = strs[0];
	for (int i = 0; i < strs.length - 1; i++) {
	    String frst = strs[i];
	    String scnd = strs[i + 1];
	    for (int j = 0; j < frst.length() && j < scnd.length() && j < ans.length(); j++) {
		if (frst.charAt(j) == scnd.charAt(j)
			&& (ans.length() != 0 && ans.charAt(j) == frst.charAt(j) && ans.charAt(j) == scnd.charAt(j))) {
		    tmp.append(frst.charAt(j));
		} else {
		    break;
		}
	    }
	    ans = tmp.toString();
	    tmp = new StringBuilder();
	}
	return ans;
    }
}
