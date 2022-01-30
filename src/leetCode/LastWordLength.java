/*
 * 58. Length of Last Word
 * https://leetcode.com/problems/length-of-last-word/
 */
package leetCode;


public class LastWordLength {
    public int lengthOfLastWord(String s) {

		 String arr[] = s.split(" ");
	     String m = arr[arr.length-1];
	     return m.length();
    }
}
