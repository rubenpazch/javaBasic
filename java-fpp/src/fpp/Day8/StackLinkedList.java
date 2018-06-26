package lesson9stackqueue;

import java.util.Scanner;

class Node {
int data;
Node next;
public Node(int d) {
data = d;
next = null;
}
} //end class Node
class Stack2 {
Node top = null;
public boolean empty() {
return top == null;
}
public void push(int n) {
Node p = new Node(n);
p.next = top;
top = p;
} //end push
public int pop() {
if (this.empty()) return 0; 
int hold = top.data;
top = top.next;
return hold;
} //end pop
} //end class stack
public class StackLinkedList {

		public static void main(String[] args) {
			 Scanner in = new Scanner(System.in);
			 Stack2 S = new Stack2();
			 System.out.printf("Enter the Number of items: \n");
			 int n = in.nextInt();
			 int i=1,x;
			 System.out.printf("Enter the n Elements: \n");
			 while (i<= n) {
				 x = in.nextInt();
				 S.push(x);
				 i++;
			 }
			 System.out.println(S.pop());
			 System.out.println(S.pop());			 
			/*	 System.out.printf("\nNumbers in reverse order\n");
				 while (!S.empty())
				 System.out.printf("%d ", S.pop());
				 System.out.printf("\n");*/
	}

}
