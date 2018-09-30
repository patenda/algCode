package alg;

public class AddTwoNum {
	public ListNode addTwoNumbers(ListNode l1,ListNode l2) {
		ListNode c1=l1;
		ListNode c2=l2;
		ListNode pre = new ListNode(0);
		ListNode d= pre;
		int sum=0;
		while(c1!=null || c2!=null) {
			if(c1!=null) {
				sum+=c1.val;
				c1=c1.next;
			}
			if (c2!=null) {
				sum+=c2.val;
				c2=c2.next;
			}
			d.next = new ListNode(sum % 10);
			sum/=10;
			d=d.next;
		}
		if (sum==1)
			d.next=new ListNode(1);
		return pre.next;
	}
	
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
			next=null;
		}
	}
	
	public void outPutResult(ListNode ls) {
		while (ls != null) {
			System.out.print(ls.val + " ");
			ls = ls.next;
		}
		System.out.print("\n");
	}
	
	public ListNode arrToList(int[] arr) {
		ListNode result = null; // 用于存放数组转成的链表
		ListNode p = null; // 指向result的指针
		for (int i = 0; i < arr.length; i++) {
			if (result == null) { // 如果为null，则存放为头节点
				p = new ListNode(arr[i]);
				result = p;
			} else {
				p.next = new ListNode(arr[i]); // next指向下一个节点
				p = p.next;
			}
		}
		return result;
	}

}
