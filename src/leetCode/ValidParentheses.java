/*
 * 20. Valid Parentheses
 * https://leetcode.com/problems/valid-parentheses/
 */
package leetCode;

import java.util.Stack;

public class ValidParentheses {
	 public boolean isValid(String s) {
	        if (s.length() % 2 == 1)
	            return false;
	        Stack <Character> stack = new Stack <Character> ();
	        char c = ' ';
	        
	        for(int i=0 ; i < s.length() ; i++)
	           switch (s.charAt(i))
	           {
	               case '[':
	               case '{':
	               case '(':
	                   stack.push(s.charAt(i));
	                   continue;
	               case ']':
	               case '}':
	               case ')':
	                   if (stack.empty())
	                       return false;
	                   else
	                   {           
	                   c=stack.pop();
	                   if ( s.charAt(i) == ']' && c== '[' ||
	                        s.charAt(i) == ')' && c == '(' ||
	                        s.charAt(i) == '}' && c == '{')
	                        continue;
	                    else
	                        return false;
	                      
	                   }
	                   
	           }
	            if (stack.empty())
	             return true;
	            else
	                return false;

	    }
}
