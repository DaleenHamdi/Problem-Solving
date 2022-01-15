/*
 * 28. Implement strStr()
 * https://leetcode.com/problems/implement-strstr/
 */
package leetCode;

public class ImplementStrStr {
	public int strStr(String haystack, String needle) {
	        if (needle.length()==0)
	            return 0;
	        if (haystack.length() < needle.length())
	            return -1;
	        
	        for (int i=0; i< haystack.length()-needle.length(); i++)
	            {       
	                  String s = haystack.substring(i,i+needle.length());
	                  if (needle.equals(s))
	                        return i;
	           }
	        if (needle.equals(
	            haystack.substring(
	                haystack.length()-needle.length())))
	            return haystack.length()-needle.length();
	         return -1;              
	    }
}
