/*
 * 26. Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
package leetCode;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        
        int k=1, n = nums[0];
        
        for (int i = 1 ; i < nums.length ; i ++)
            if (nums[i] <= n)
            {
                for(int j = i ; j < nums.length ; j++)
                    if (nums[j] > n)
                    {
                        nums [i] = nums [j];
                        n = nums[i];
                        k++;
                        break;
                    }
            }
        else
        {
            k++;
            n = nums[i];
        }
        return k;
    }
}
