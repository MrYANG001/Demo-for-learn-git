package offer;
/*
 * 输入一个链表，输出该链表中倒数第k个结点。
 */

class ListNode{
	int val;
	ListNode next = null;
	
	ListNode(int val){
		this.val = val;
	}
}
public class Title14 {
    public ListNode FindKthToTail(ListNode head,int k) {
    	if(head == null ) {
    		return head;
    	}
    	int count =0;
    	while(head.next != null) {
    		count++;
    		head = head.next;
    	}   	
    	ListNode pre = head;
    	ListNode target = head;
    	if(k>count) {
    		return null;
    	}
    	for(int i=0; i<k; i++) {
    		pre = pre.next;
    	}
    	while(pre.next != null) {
    		pre = pre.next;
    		target = target.next;
    	}    	
		return target;    	
    }
}
