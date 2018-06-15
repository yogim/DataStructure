package com.ymhase.linkedlist;

public class PrintKthToLast  extends SinglyLL{

    
    public Node  getKthElementFromLast(int K){
	Node KthNode = new Node();
	Node itrAhead = getHead();
	Node itrBehind = getHead();
     	this.addDatainLL();
	
	while (itrBehind.getNext() !=null) {
	    
	    if(K==0) {
		itrBehind = (Node) itrBehind.getNext();
	    }
	
	    itrAhead =(Node) itrAhead.getNext();
	}
	
	return KthNode;   
    }
    
    
}
