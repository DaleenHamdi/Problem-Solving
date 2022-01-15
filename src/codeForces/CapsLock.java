/*
 * 131A-cAPS LOCK
 * https://codeforces.com/contest/131/problem/A
 */

package codeForces;
import java.util.Scanner;


public class CapsLock {
		
	public static void main (String[] args) 
		{
			Scanner in = new Scanner (System.in);
			String s = in.nextLine();
			

			if ( s.substring(1).equals(
					s.substring(1).toUpperCase()
					))
				
				if (s.charAt(0)>='a')
					System.out.println((char)((int)s.charAt(0)-32)+ s.substring(1).toLowerCase());
				else
					System.out.println(s.toLowerCase());
			
			else 
				System.out.println(s);

		}
}

