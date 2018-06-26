package lesson9;

public class Stack {
	Node head = null;
	Node tail = null;
	int size=0;
	public int getSize() {
		return size;
	}
	public boolean isEmpty()
	{
		return head == null;
	}    
	public void Push(String data) {
		tail = head;
		head = new Node(data,null,null);
		head.data=data;
		head.next= tail;
		head.prev = null;
		if(tail != null) {
			tail.prev=head;
		}
		size++;
	}
	public void Pop() {
		if (!isEmpty()) {
			System.out.println("Deleted ..> "+head.getData());
			head = head.next;   // delete first node
			size--;
		} else {
			System.out.println("is Empty");
		}
	}
	public void Top() {
		Node tmp = head;
		while (tmp != null) {
			System.out.println(tmp.getData());
			tmp = tmp.getNext();
		}
	}
	/*@Override
		public String toString() {
		while(head.next!=null)
		{
			return "["+head.next.getData()+"]";
		}
		
	}*/
	
	public static void main(String [] args) {
		Stack st = new Stack();
		st.Push("uno");
		st.Push("dos");
		st.Push("tres");
		st.Push("cuatro");
		System.out.println(st.getSize());
		st.Push("cinco");
		System.out.println(st.getSize());
		st.Pop(); 
		System.out.println(st.getSize());
		st.Pop(); 
		System.out.println(st.getSize());
		st.Top(); 
		System.out.println(st.getSize());
	}
}