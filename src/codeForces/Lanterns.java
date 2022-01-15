/*
 * 492B - Vanya and Lanterns
 * https://codeforces.com/problemset/problem/492/B
 */

package codeForces;

import java.util.Arrays;
import java.util.Scanner;

public class Lanterns {
	public static void main(String[] args) {
 
	Scanner in = new Scanner (System.in);
	int lanternsCount,streetLength;
	double maxValue,first,last;
	
	lanternsCount=in.nextInt();
	streetLength=in.nextInt();
	
	int [] inputArray = new int [lanternsCount];
	int [] differenceArray = new int [lanternsCount];
 
	for (int i=0;i<lanternsCount;i++)
	{
		inputArray[i]=in.nextInt();
	}
	Arrays.sort(inputArray);
 
 
	for (int i=0;i<lanternsCount;i++)
	{
		if (i==0)
			differenceArray[i]=inputArray[i];
		else 
			{
			differenceArray[i]=Math.abs(inputArray[i]-inputArray[i-1]);
			}
	}
	
	maxValue=differenceArray[0];
	for(int i=1;i<lanternsCount;i++)
	{
		if(differenceArray[i]>maxValue)
			maxValue=differenceArray[i];
	}
	
	first=inputArray[0]-0;
	last=streetLength-inputArray[lanternsCount-1];
	
	maxValue=Math.max(maxValue/2, first);
	maxValue=Math.max(maxValue,last);
 
	System.out.println(String.format("%.9f", maxValue));
	
	}
}


