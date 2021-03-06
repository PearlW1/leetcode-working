public class removeNthFromEnd {
	 public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode first = dummy;
		ListNode second = dummy;
		// Advances first pointer so that the gap between first and second is n nodes apart
		for (int i = 1; i <= n + 1; i++) {
			//正数n个,最后从
			first = first.next;
		}
		// Move first to the end, maintaining the gap
		while (first != null) {
			first = first.next;
			second = second.next;
		}
		second.next = second.next.next;
		return dummy.next;
	}

	public static void main(String []args){


		removeNthFromEnd obj = new removeNthFromEnd();

	}


}
