/*
  Print elements of a linked list in reverse order 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) {
    Stack<Integer> stack = new java.util.Stack<Integer>();
    Node current = head;
    while(current != null) {
        stack.push(current.data);
        current = current.next;
    }
    while(!stack.empty()) {
        System.out.println(stack.pop());
    }
}
