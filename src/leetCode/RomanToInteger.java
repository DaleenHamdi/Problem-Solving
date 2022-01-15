/*
 * 13. Roman to Integer
 * https://leetcode.com/problems/roman-to-integer/
 */
package leetCode;

public class RomanToInteger {
	 public int romanToInt(String s) {
	        int num=0;
	        
	        for (int i=s.length()-1 ; i >= 0 ; i--)
	        switch(s.charAt(i))
	        {
	            case 'I':
	                num+=1;
	                break;
	                
	            case 'V':
	                if (i > 0)
	                    if(s.charAt(i-1) == 'I')
	                    {
	                        num+=4;
	                        i--;
	                        break;
	                    }
	                num+=5;
	                break;
	                
	            case 'X':
	                if (i > 0)
	                    if(s.charAt(i-1) == 'I')
	                    {
	                        num+=9;
	                        i--;
	                        break;
	                    }
	                num+=10;
	                break;
	                
	            case 'L':
	                if (i > 0)
	                    if(s.charAt(i-1) == 'X')
	                    {
	                        num+=40;
	                        i--;
	                        break;
	                    }
	                num+=50;
	                break;
	                
	            case 'C':
	                if (i > 0)
	                    if(s.charAt(i-1) == 'X')
	                    {
	                        num+=90;
	                        i--;
	                        break;
	                    }
	                num+=100;
	                break;
	                
	            case 'D':
	                if (i > 0)  
	                    if(s.charAt(i-1) == 'C')
	                    {
	                        num+=400;
	                        i--;
	                        break;
	                    }
	                num+=500;
	                break;
	                
	            case 'M': 
	                if (i > 0)
	                    if(s.charAt(i-1) == 'C')
	                    {
	                        num+=900;
	                        i--;
	                        break;
	                    }
	                num+=1000;
	                break;
	                
	        }
	        return num;
	    }
}
