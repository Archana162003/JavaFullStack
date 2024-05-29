package linkedlist.com;
public class Linkedlist {
	
	Node head; // head of the list
	 static class Node {
	 int data;
	 Node next;
	 // Constructor to create a new node
	 Node(int d) {
	 data = d;
	 next = null;
	 }
	 }
	 // Function to print the middle element of the linked list
	 void printMiddle() {
	 Node slow = head;
	 Node fast = head;
	 if (head != null) {
	 while (fast != null && fast.next != null) {
	 fast = fast.next.next;
	 slow = slow.next;
	 }
	 System.out.println("The middle element is [" + slow.data + "] \n");
	 }
	 }
	 // Function to add a new node at the end of the list
	 public void addToTheLast(Node node) {
	 if (head == null) {
	 head = node;
	 } else {
	 Node temp = head;
	 while (temp.next != null) {
	 temp = temp.next;
	 }
	 temp.next = node;
	 }
	 }
	 // Function to print the linked list
	 void printList() {
	 Node temp = head;
	 while (temp != null) {
	 System.out.print(temp.data + " ");
	 temp = temp.next;
	 }
	 System.out.println();
	 }
	 // Main method to test the linked list
	 public static void main(String[] args) {
	 Linkedlist llist = new Linkedlist();
	 // Adding nodes to the list
	 llist.addToTheLast(new Node(8));
	 llist.addToTheLast(new Node(12));
	 llist.addToTheLast(new Node(16));
	 llist.addToTheLast(new Node(5));
	 llist.addToTheLast(new Node(25));
	 // Printing the list
	 System.out.println("The linked list is:");
	 llist.printList();
	 // Printing the middle element
	 llist.printMiddle();
	 }
	}
