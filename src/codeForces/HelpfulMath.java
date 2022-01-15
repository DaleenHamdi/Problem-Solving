/*
 * 339A - Helpful Maths
 * https://codeforces.com/problemset/problem/339/A
 */

package codeForces;

import java.util.Scanner;

public class HelpfulMath {
	

	public static void main(String[] args) {
		int count1=0,count2=0;
		Scanner in = new Scanner (System.in);
		String s = new String ();
		s=in.nextLine();
		char arr []= s.toCharArray();
		
		for(int i=0;i<arr.length;i++)
			{
				switch(arr[i])
				{
				case '1':
					count1++;
					break;
				case '2':
					count2++;
					break;
				case '3':
				default:
					continue;
				}		
			}
 
		for(int i=0;i<arr.length;i++)
			{	
			if (i%2==1)
				System.out.print('+');
			else 
			{
				if(count1 != 0)
				{
					arr[i]='1';
					count1--;
				}
				else if (count2 !=0)
					{
					arr[i]='2';
					count2--;
					}
					else 
						arr[i]='3';
				System.out.print(arr[i]);
				}
			}
		
 
}
	}

 