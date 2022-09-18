package datastructure.ch04;

public class IntQueue {

	private int[] que;
	private int capacity;
	private int num;
	private int front;
	private int rear;
	
	//큐 비었음 에러
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	
	//큐 가득참 에러
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	public IntQueue(int maxlen) {
		capacity = maxlen;
		num=0;
		front=0;
		rear=0;
		try {
			que = new int[maxlen];
		}catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	public int enque(int x) throws OverflowIntQueueException{
		if(num >= capacity)
			throw new OverflowIntQueueException();
		que[rear++] = x;
		num++;
		if(rear == capacity)
			rear=0;
		return x;
	}
	
	public int deque() throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException();
		int x = que[front++];
		num--;
		if(front == capacity)
			front=0;
		return x;
	}
	
	public int peek() throws EmptyIntQueueException{
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
	public int indexOf(int x) {
		for(int i=0; i<num; i++)
			if(que[(front+i)%capacity] == x)
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
	
	public int search(int x) {
		for(int i=0; i<num; i++)
			if(que[(front+i)%capacity] == x)
				return i+1;
		return 0;
	}
	/*
	public void tempInit() {
		front=7;
		rear=7;
		enque(35);
		enque(56);
		enque(24);
		enque(68);
		enque(95);
		enque(73);
		enque(19);
	}
	*/
}
