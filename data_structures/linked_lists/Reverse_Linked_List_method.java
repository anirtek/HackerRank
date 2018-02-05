/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    if(head == null) { 
        return null;
    }
    Node end = head;
    Node prev = end;
    Node current = head.next;
    while(current != null) {
        Node newHead = current.next;
        current.next = prev;
        prev = current;
        current = newHead;
    }
    head = prev;
    end.next = null;
    return head;
}
