"""
 Compare two linked list
 head could be None as well for empty list
 Node is defined as
 
 class Node(object):
 
   def __init__(self, data=None, next_node=None):
       self.data = data
       self.next = next_node

 return back the head of the linked list in the below method.
"""

def CompareLists(headA, headB):
    status = 1
    currA = headA
    currB = headB
    if(currA is None and currB is None) :
        return 0
    while(currA is not None or currB is not None) :
        if(currA is not None and currB is None) :
            return 0
        if(currA is None and currB is not None) :
            return 0
        if(currA.data != currB.data) :
            return 0
        currA = currA.next
        currB = currB.next
    return 1