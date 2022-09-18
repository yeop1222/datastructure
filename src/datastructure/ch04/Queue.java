package datastructure.ch04;

public class Queue<E> {

	private E[] que;
	private int capacity;
	private int num;
	private int front;
	private int rear;
	
	//큐 비었음 에러
	public static class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	
	//큐 가득참 에러
	public static class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	public Queue(int maxlen) {
		capacity = maxlen;
		num=0;
		front=0;
		rear=0;
		try {
			que = (E[])new Object[maxlen];
		}catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	public E enque(E x) throws OverflowIntQueueException{
		if(num >= capacity)
			throw new OverflowIntQueueException();
		que[rear++] = x;
		num++;
		if(rear == capacity)
			rear=0;
		return x;
	}
	
	public E deque() throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException();
		E x = que[front++];
		num--;
		if(front == capacity)
			front=0;
		return x;
	}
	
	public E peek() throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	
	public void clear() {
		num=0;
		front=0;
		rear=0;
	}

	//front -> rear
	public int indexOf(E x) {
		for(int i=0; i<num; i++)
			if(que[(front+i)%capacity].equals(x))
				return (front+i)%capacity;
		return -1;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num<=0;
	}
	
	public boolean isFull() {
		return num>=capacity;
	}
	
	//front -> rear
	public void dump() {
		if(num<=0)
			System.out.print("Queue is empty.");
		else
			for(int i=0; i<num; i++)
				System.out.print(que[(front+i)%capacity]+" ");
		System.out.println();
	}
	
	public int search(E x) {
		for(int i=0; i<num; i++)
			if(que[(front+i)%capacity].equals(x))
				return i+1;
		return 0;
	}
}
