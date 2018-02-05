"""
 Insert Node at a specific position in a linked list
 head input could be None as well for empty list
 Node is defined as
 
 class Node(object):
 
   def __init__(self, data=None, next_node=None):
       self.data = data
       self.next = next_node

 return back the head of the linked list in the below method. 
"""
#This is a "method-only" submission.
#You only need to complete this method.
def InsertNth(head, data, position):
    if(head is None) :
        head = Node(data)
        return head
    elif(position == 0) :
        newNode = Node(data)
        newNode.next = head
        head = newNode
        return newNode
    elif(position >= 1) :
        current = head
        prev = None
        while(position > 0) :
            prev = current
            current = current.next
            position -= 1
        newNode = Node(data)
        newNode.next = current
        prev.next = newNode
        return head;
