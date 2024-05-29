package stacksequence;

import java.util.Stack;
public class StackSequenceChecker {
 public static boolean isSequencePresent(Stack<Integer> stack, int[] sequence) {
 // Reverse the sequence array to facilitate checking from end to start
 for (int i = 0; i < sequence.length / 2; i++) {
 int temp = sequence[i];
 sequence[i] = sequence[sequence.length - 1 - i];
 sequence[sequence.length - 1 - i] = temp; }
 Stack<Integer> tempStack = new Stack<>();
 for (int num : sequence) {
 tempStack.push(num); }
 while (!stack.isEmpty() && !tempStack.isEmpty()) {
 if (stack.pop().equals(tempStack.peek())) {
 tempStack.pop(); } }
 return tempStack.isEmpty(); }
 public static void main(String[] args) {
 Stack<Integer> stack = new Stack<>();
 stack.push(8);
 stack.push(16);
 stack.push(12);
 stack.push(25);
 stack.push(5);
 //int[] sequence = {12, 25, 5};	//this used for wrong sequence
 int[] sequence = {5, 25, 12};	//buttom - up approach
 boolean result = isSequencePresent(stack, sequence);
 System.out.println("Is the sequence present? " + result); 
 }
 }
