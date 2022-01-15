/*
 * Instructions
 * You are given an n x n 2D matrix representing an image. 
 * Rotate the image by 90 degrees (clockwise).

 * Input FormatOn first line you need to tell that how many rows and columns 
 * your matrix need to have and these values should be separated by space.
 * Then after that, each line will represent will represent each row and 
 * you need to enter numbers which each rows should have separated by a space.



 * Input example : 

	5             // note this means the number of rows/ columns which is (n) 
	1 2 3 4 20
	5 6 7 8 30
	9 10 11 12 40
	13 14 15 16 50
	21 22 23 24 25

 * Output for last example : 

	21 13 9 5 1 
	22 14 10 6 2 
	23 15 11 7 3 
	24 16 12 8 4 
	25 50 40 30 20

 */

package tasks;

import java.util.Scanner;

public class ImageRotation {
	public static int rotate(int [][] arr,int n, int c)
	{
		c++;
		switch (c%4)
		{
		case 1:
			for(int j=0;j<n;j++)
			{
			System.out.println();
			for(int i=n-1;i>=0;i--)
				{
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
			break;
			
		case 2:	
			for(int i=n-1;i>=0;i--)
			{
			System.out.println();
			for(int j=n-1;j>=0;j--)
				{
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
			break;
			
		case 3:
			for(int j=n-1;j>=0;j--)
			{
			System.out.println();
			for(int i=0;i<n;i++)
				{
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
			break;
			
		case 0:
			for(int i=0;i<n;i++)
			{
			System.out.println();
			for(int j=0;j<n;j++)
				{
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
			break;
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,c=0;
		
		Scanner on = new Scanner(System.in);
		n = on.nextInt();
		
		int [][] arr = new int [n][n];
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				arr[i][j] = on.nextInt();
			}
		}
		
		c = rotate(arr,n,c);
		c = rotate(arr,n,c);
		c = rotate(arr,n,c);
		c = rotate(arr,n,c);
		c = rotate(arr,n,c);
		c = rotate(arr,n,c);

		
	}
}

