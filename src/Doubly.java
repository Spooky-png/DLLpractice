
public class Doubly {
	 	public Node head;
	    public Node tail;
	    
	    public Doubly() {
	        this.head = null;
	        this.tail = null;
	    }
	    

	    public void push(Node newNode) {
	      
	        if(this.head == null) {
	            this.head = newNode;
	            this.tail = newNode;
	            return;
	        }
	        
	        Node lastNode = this.tail;
	        lastNode.next = newNode;
	        newNode.previous = lastNode;
	        this.tail = newNode;
	    }
	    
	    public void printValuesForward() {
	  
	        Node current = this.head;
	        
	       
	        while(current != null) {
	     
	            System.out.println(current.value);
	           
	            current = current.next;
	        }
	    }
	    public void printValuesBackwards() {
	    	Node lastCurrent = this.tail;
	    	
	    	while(lastCurrent != null) {
	    		System.out.println(lastCurrent.value);
	    		lastCurrent = lastCurrent.previous;
	    	}
	    }
	    public void nodePop() {
	    	Node popCurrent = this.tail;
	    	
	    	popCurrent.previous = null;
	    	popCurrent.next = null;
	    	
	    	
	    }
	    public boolean contains(int value) {
	    	Node cCurrent = this.head;
	    	
	    	while(cCurrent != this.tail) {
	    		cCurrent = cCurrent.next;
	    		if(cCurrent.value == value) {
	    			System.out.println("true");
	    			return true;
	    		}
	    		if(this.tail.value == value) {
	    			System.out.println("true");
	    			return true;
	    		}
	    	}
	    	System.out.println("false");
			return false;
			
	    }
	    public void size() {
	    	Node sCurrent = this.head;
	    	int counter = 0;
	    	
	    	while(sCurrent != null) {
	    		sCurrent = sCurrent.next;
	    		counter++;
	    	}
	    	System.out.println(counter);
	    }

}
