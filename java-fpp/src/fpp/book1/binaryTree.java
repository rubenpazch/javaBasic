package fpp.book1;

//import lesson10.BinaryNode;

public class binaryTree {

	/**
	* Static inner class for the node
	 * @category Static method
	 * 
	 * */
	private static class Node {
		private int Value;
		private Node lChild;
		private Node rChild;
		public Node (int v, Node l, Node r) {
			Value = v;
			lChild=l;
			rChild=r;
		}
		public Node (int v) {
			Value = v;
			lChild=null;
			rChild=null;
		}		
	}

	private Node root;

	public binaryTree(){
		root=null;
	}

	public void levelOrderBinaryTree(int[]arr ) {
		root = levelOrderBinaryTree(arr,0);
	}
	public Node levelOrderBinaryTree(int[]arr , int start) {
		int size = arr.length;
		Node curr = new Node(arr[start]);
		int left = 2 * start+1;
		int right = 2 * start+2;
		if(left<size)
			curr.lChild=levelOrderBinaryTree(arr, left);
		if(right<size)
			curr.rChild=levelOrderBinaryTree(arr, right);
		return curr;
	}
	public void PrintPreOrder() {
		PrintPreOrder(root);
	}
	public void PrintPreOrder(Node node) {
		if(node!=null)
		{
			System.out.print(""+node.Value+",");
			PrintPreOrder(node.lChild);
			PrintPreOrder(node.rChild);
		}
	}
	public void PrintInOrder() {
		PrintInOrder(root);
	}
	public void PrintInOrder(Node node) {
		if(node!=null)
		{
			PrintInOrder(node.lChild);
			System.out.print(""+node.Value+",");
			PrintInOrder(node.rChild);
		}
	}
	public void insert(Integer x) {
		if (root == null) {
			root = new Node(x);
			return;
		}
		else { 
			Node n = root;
			boolean inserted = false;

			while(!inserted)//true
			{
				if(x.compareTo(n.Value)<0) {
					//space found on the left
					if(n.lChild == null){
						n.lChild = new Node(x,null,null);
						inserted = true;
					}
					//keep looking for a place to insert (a null)
					else {
						n = n.lChild;
					}
				}				
				else if(x.compareTo(n.Value)>0){ 
					//space found on the right					
					if(n.rChild==null){
						n.rChild = new Node(x,null,null);
						inserted = true;
					}
					//keep looking for a place to insert (a null)
					else {
						n = n.rChild;
					}

				}
				// if a node already exists
				else {
					inserted = true;
				}

			}

		}
	}
	public static void main(String [] args) {
		binaryTree t = new binaryTree();
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		t.levelOrderBinaryTree(arr);
		t.PrintPreOrder();
		System.out.println("");
		t.PrintInOrder();
	}
}
