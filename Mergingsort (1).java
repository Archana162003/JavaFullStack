package Listnode;

class ListNodee {
	 int val;
	 ListNodee next;
	 ListNodee(int val) { this.val = val; }
	}
	public class Mergingtwo {
	 public static ListNodee mergeLists(ListNodee l1, ListNodee l2) {
	 ListNodee dummy = new ListNodee(-1);
	 ListNodee current = dummy;

	 while (l1 != null && l2 != null) {
	 if (l1.val < l2.val) {
	 current.next = l1;
	 l1 = l1.next;
	 } else
	{
	 current.next = l2;
	 l2 = l2.next;
	 }
	 current = current.next;

	}
	 current.next = (l1 != null) ? l1 : l2;
	 return dummy.next;
	 }
	 public static void main(String[] args)
	{
	 ListNodee l1 = new ListNodee(8);
	 l1.next = new ListNodee(16);
	 l1.next.next = new ListNodee(12);
	 ListNodee l2 = new ListNodee(5);
	 l2.next = new ListNodee(25);
	 l2.next.next = new ListNodee(24);
	 ListNodee mergedList = mergeLists(l1, l2);
	 printList(mergedList);
	 }
	 public static void printList(ListNodee head)
	{
	 ListNodee current = head;
	 while (current != null) {
	 System.out.print(current.val + " ");
	 current = current.next;
	 }
	 }
	}