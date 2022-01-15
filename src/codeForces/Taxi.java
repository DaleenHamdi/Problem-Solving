/*
 * 158B-Taxi
 * https://codeforces.com/problemset/problem/158/B
 */
package codeForces;

import java.util.Scanner;

public class Taxi {

	public static void main(String[] args) {
		
		int [] fr = new int [5];
		int taxi=0;
		int n,g;
		
		Scanner in = new Scanner (System.in);
		n=in.nextInt();
		
		for(int i=0;i<n;i++)
		{
			g=in.nextInt();
			fr[g]++;
		}
		
		taxi+=fr[4];
		taxi+=fr[3];
		fr[1]-=fr[3];
		
		if (fr[2] %2 != 0)
			{
			taxi ++;
			fr[1] -=2;
			}
		taxi += fr[2]/2;

	
		if (fr[1]<0)
			fr[1]=0;
		else if (fr[1]%4 == 0)
			taxi += fr[1]/4;
			else 
				taxi += fr[1]/4 + 1;
		
		System.out.println(taxi);
	}

	}


