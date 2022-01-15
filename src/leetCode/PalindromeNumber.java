/*
 * 9. Palindrome Number
 * https://leetcode.com/problems/palindrome-number/
 */

package leetCode;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
        if (x<0)
            return false;
        String num = Integer.toString(x);
               
        for(int i=0,j=num.length()-1; i<j ; i++,j--)
            if(num.charAt(i) == num.charAt(j))
                continue;
            else 
                return false;
        return true;
    }
}
