/*
 * 66. Plus One
 * https://leetcode.com/problems/plus-one/
 */
package leetCode;

public class PlusOne {
	 public int[] plusOne(int[] digits) {
	        int n = digits.length;
	        int carry=0;
	        int [] digitsPlusOne = new int [n+1];
	        
	        digits[n-1]= digits[n-1]+1;

	        
	        for(int j = n-1 ; j>=0 ; j--)
	        {
	            digits[j]= digits[j]+carry;
	            digitsPlusOne[j+1]=digits[j];
	            if (digits[j]>9)
	            {
	                digits[j]=0;
	                digitsPlusOne[j+1]=0;
	                carry=1;
	            }
	            else
	                carry=0;
	            }
	        
	        if (carry == 0)
	            return digits;
	        else
	           digitsPlusOne[0]=1;
	        
	        return digitsPlusOne;

	}
}
