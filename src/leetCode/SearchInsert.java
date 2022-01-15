/*
 * 35. Search Insert Position
 * https://leetcode.com/problems/search-insert-position/
 */
package leetCode;

public class SearchInsert {

	public int searchInsert(int[] nums, int target) {
	    if (target > nums[nums.length-1])
	    		return nums.length;
	    	if (target < nums [0])
	    		return 0;
			int positionIndex =  binarySearch(nums,0,nums.length-1,target);
			if (positionIndex == -1)
				{
				while (positionIndex == -1)
				 positionIndex =  binarySearch(nums,0,nums.length-1,--target);
				positionIndex ++;
				}
			

	    return positionIndex;
	}

	public int binarySearch(int[] arr, int startIndex, int endIndex, int target)
	{
	   if(endIndex >= startIndex)
	   {
	    int mid = startIndex + (endIndex-startIndex)/2;
	    if(arr[mid] == target)
	        return mid;
	    else if (arr[mid] > target)
	    	return binarySearch (arr,0,mid-1,target);
	    else
	        return binarySearch (arr,mid+1,endIndex,target);
	   }

	   return -1;
	}
}
