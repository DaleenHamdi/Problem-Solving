package geeksforgeeks;

public class Hourglass {

	public static int maximumSum(int arr[][])
	{
		int maxSumValue=0,sum=0;
		for (int k=0;k<9;k++)
			{
			for (int i=k/3;i<(k/3)+3;i++)
				for (int j=k%3;j<(k%3)+3;j++)
					{
					if (i==(k/3)+1)
					{
						sum+=arr[i][(k%3)+1];
						break;
					}
					sum+=arr[i][j];
					}
			if(sum>=maxSumValue)
				maxSumValue=sum;
				sum=0;
			}
		return maxSumValue;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] arr = {
						{1,2,3,0,0},
						{0,0,0,0,0},
						{2,1,4,0,0},
						{0,0,0,0,0},
						{1,1,0,1,0}};
		System.out.println(maximumSum(arr));
		}
	}

/*
 * Maximum Sum of Hour glass in Matrix
 * https://www.geeksforgeeks.org/maximum-sum-hour-glass-matrix/ 
 */
