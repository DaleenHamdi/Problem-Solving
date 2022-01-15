/*
 * 21. Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
package leetCode;

public class MergeTwoSortedLists {
	 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        ListNode q = new ListNode();
	        q.next = list1;
	        ListNode k = new ListNode();
	        k.next = list2;
	        
	        
	        if(q.next == null && k.next == null)
	            return list1;
	        else if (q.next == null)
	            return list2;
	        else if (k.next == null)
	            return list1;
	        else
	        {
	            q=q.next;
	            k=k.next;
	        }
	        
	        ListNode list3 = new ListNode (0);
	        ListNode j = new ListNode(0);
	        j = list3;
	        
	        while(true)
	        {
	            if(q == null)
	            {
	                j.next=k;
	                break;
	            }
	            if (k == null)
	            {
	             
	                j.next=q;
	                break;
	            }
	            if(q.val <= k.val)
	            {
	                j.next = new ListNode (q.val);
	                j=j.next;
	                q=q.next;
	            }
	            else
	               {
	                j.next = new ListNode (k.val);
	                j=j.next;
	                k=k.next;
	            } 
	        }
	        
	        
	        return list3.next;
	    }
}
