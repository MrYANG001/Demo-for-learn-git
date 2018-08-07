package offer;

import java.util.ArrayList;

/*
 * 输入一个链表，从尾到头打印链表每个节点的值
 */


class ListNode3 {
	int val;
	ListNode3 next = null;

	ListNode3(int val) {
		this.val = val;
	}
}

public class Title3 {
	ArrayList<Integer> list = new ArrayList<Integer>();
	public ArrayList<Integer> printListFromTailToHead(ListNode3 listNode) {
						
		while(listNode != null) {
			printListFromTailToHead(listNode.next);
			list.add(listNode.val);			
		}
		return list;			
	}

	/*public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        while(listNode!=null){
            stack.push(listNode.val);
            listNode = listNode.next;
            
        }
        
        while(!stack.isEmpty()){           
            list.add(stack.pop());
        }
        
        return list;       
    }*/
	
	
	public static void main(String[] args) {
		 
	}
}
