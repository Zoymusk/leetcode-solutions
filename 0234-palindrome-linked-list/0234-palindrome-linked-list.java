/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head== null && head.next==null) return true;
        ListNode s= head, f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode sh= reverse(s), fh= head;
        ListNode shc=sh;
        boolean res= true;
        while(sh != null){
            if(fh.val!= sh.val){
                res= false;
                break;
            }
            fh= fh.next;
            sh=sh.next;
        }
    return res;
    }
    private ListNode reverse(ListNode head) {
    ListNode prev = null;
    while (head != null) {
        ListNode next = head.next;   
        head.next = prev;            
        prev = head;                 
        head = next;                 
    }
    return prev;   

    }
}