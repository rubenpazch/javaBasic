package fpp.lesson9;

import java.util.NoSuchElementException;

public class ArrayQueueImpl {
	private int[] arr ;
	private int front ;
	private int rear ;
	private int size_array ;
	
	/**
    * Initializes an empty queue.
    */
    public ArrayQueueImpl() {
        arr = new int[2];
        size_array = 0;
        front = 0;
        rear = 0;
    }
	/**
    * Initializes an empty queue.
    */
    private void resize(int capacity) {
        assert capacity >= size_array;
        int[] temp = (int[]) new int[capacity];
        for (int i = 0; i < size_array; i++) {
            temp[i] = arr[(rear + i) % arr.length];
        }
        arr = temp;
        rear = 0;
        front  = size_array;
    }
    /** Is this queue empty?
     * @return true if this queue is empty; false otherwise
     */
	public boolean isEmpty(){
		//implement
		if(size_array==0)
			return true;
		else 
			return false;
	}
	/**
     * Returns the item least recently added to this queue.
     * @return the item least recently added to this queue
     * @throws java.util.NoSuchElementException if this queue is empty
     */
	public int peek() {
		if(isEmpty()) throw new NoSuchElementException("Queue underflow"); 
		return arr[rear];
	}
	/**
    * Adds the item to this queue.
    * @param item the item to add
    */
    public void enqueue(int obj) {
        // double size of array if necessary and recopy to front of array
        if (size_array == arr.length) 
        	resize(2*arr.length);   // double size of array if necessary
        arr[front++] = obj;// add item
        if (rear == arr.length) 
        	rear = 0;// wrap-around
        size_array++;
    }		
    /**
     * Removes and returns the item on this queue that was least recently added.
     * @return the item on this queue that was least recently added
     * @throws java.util.NoSuchElementException if this queue is empty
     */
    public int dequeue() {
    	if (isEmpty()) 
    		throw new NoSuchElementException("Queue underflow");
    	int item = arr[front];
    	arr[front] = 0;                            // to avoid loitering
    	size_array--;
    	front--;
    	if (front == arr.length) 
    		front = 0;           // wrap-around
    	// shrink size of array if necessary
    	if (size_array > 0 && size_array == arr.length/4) 
    		resize(arr.length/2); 
    	return item;
    }
	/**
     * Returns the number of items in this queue.
     * @return the number of items in this queue
     */
	public int size(){
		//implement
		return size_array;
	}
	public static void main (String []args) {
		ArrayQueueImpl A = new ArrayQueueImpl();
		//System.out.println("Size of the array : "+A.size());
		
		for (int i = 1; i < 5; i++) {
			A.enqueue(i);
		}
		
		
		/*
		System.out.println("Size of the array : "+A.size());
		System.out.println(A.dequeue());
		System.out.println(A.dequeue());
		System.out.println("Size of the array : "+A.size());
		
		for (int i = 0; i < A.front; i++) {
			System.out.println("-->"+(int)A.arr[i]);
		}
		
		System.out.println("peek --> "+A.peek());
		System.out.println("front --> "+A.front);
		*/
	}	

}
