/*
 * 27. Remove Element
 * https://leetcode.com/problems/remove-element/
 */
package leetCode;

import java.util.Arrays;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
	    
        if (nums.length < 1) 
            return 0;
        int k = 0,r =1;
        Arrays.sort(nums);
        for (int i = 0 ; i < nums.length ; i++ )
        {
            if (nums [i] == val)
            {
                nums [i]= nums[nums.length-r];
                r++;            
            }
            else
                k++;
        }
        return k;
    
}
}
