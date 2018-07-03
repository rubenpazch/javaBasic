package inclassExercise.queue;
//autor
import java.util.Stack;

public class TwoStackQueue {

	Stack<String> stack1;
	Stack<String> stack2;

	public TwoStackQueue() {
		
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}
	/** Retrieves and Remove: removes the element at the front/head of the queue. */
	public String dequeue()  { // throws IllegalStateException {
		//implement
		
		//stack2.push(stack1.pop());  
		
//		Pop all the elements from stack1 to stack2.
		
//		Simply pop element from stack2 
		
//		And then move back all the elements from the second stack2 to the first stack1.
		
		return "";
	}
	
	/** Insert: adds an element to the rear/end of the queue. */
	public void enqueue(String s) { 
		//implement
		stack1.push(s);	
	}
	
	public String peek() {

		//implement
		
//		Pop all the elements from stack1 to stack2.
		
		while(stack1.isEmpty()) {
		 stack2.push(stack1.pop());	
		}
//		Simply pop element from stack2 
		String temp = stack2.pop();
//		And then move back all the elements from the second stack2 to the first stack1.
		while(stack2.isEmpty()) {
			 stack1.push(stack2.pop());	
			}
		return temp;
	}
	
	/** Returns a string representation of this stack. The string
	 *  consists of all data values of the nodes in the stack, separated by spaces.
	 */
	@Override
	public String toString() {
		//implement
		String temp =null;
		String s = "[";
		while(stack1.isEmpty()) {
			temp= stack1.pop();
			s=s+temp+",";
			stack2.push(temp);			
		}
		s=s+"]";	
		
		while(stack2.isEmpty()) {
			temp= stack2.pop();			
			stack1.push(temp);			
		}
		return s;
	}
	
	/** Returns the number of items in the queue */
	public int size() {
		//implement
		stack1.size();
	}
	
	/** Returns true if there are no elements in the queue, false otherwise */
	public boolean isEmpty() {
		//implement
		if(stack1.isEmpty())
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		
		TwoStackQueue myQueue = new TwoStackQueue();
		/*myQueue.enqueue("Bob");
		myQueue.enqueue("Harry");
		System.out.println(myQueue.size()+" " + myQueue);
		myQueue.enqueue("Steve");
		System.out.println(myQueue.size() +" "  + myQueue);
		
		System.out.println("Dequeue Operation : " + myQueue.dequeue());
		System.out.println("Dequeue Operation : " + myQueue.dequeue());
		System.out.println(myQueue.size()+" " + myQueue);
		myQueue.enqueue("Bill");
		myQueue.enqueue("Summer");
		myQueue.enqueue("David");
		System.out.println(myQueue.size()+" " + myQueue);
		
		System.out.println("Peek Operation : " + myQueue.peek());
		System.out.println(myQueue.size()+" " + myQueue);

*/
		
	}
}