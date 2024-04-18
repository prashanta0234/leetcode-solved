// https://www.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1
Node deleteNode(Node head, int x)
    {

	     Node temp=head;
	     Node next=null;

	    
	     if(x==1&&temp.next!=null){
	        head=head.next;
	        return head;
	    }

    
    
	for(int i=1;i<x-1;i++){
	        temp=temp.next;
	    }

	
    next=temp.next.next;
	temp.next=next;
	return head;
	    
	    
    }