package gaurav.linkedlist;

public class ReverseLinkList206 {

	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode next = null;

		while (head != null) {
			next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}

		return prev;
	}
}
