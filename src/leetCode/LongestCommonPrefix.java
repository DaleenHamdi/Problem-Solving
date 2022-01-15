/*
 * 14. Longest Common Prefix
 * https://leetcode.com/problems/longest-common-prefix/
 */
package leetCode;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        int n = strs.length;          
        String s = strs[0];
                 
        int l = s.length();
        for (int j = 1 ; j <= l ; j++)
        {
            int i;
            for (i=0; i<n ; i++)
            {
                if (strs[i].startsWith(s))
                    continue;
                else
                    break;
            }
            if (i == n)
                return s;
            else
                s = s.substring(0, l - j);
        }
        return "";
    }
}
