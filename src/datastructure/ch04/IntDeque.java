package datastructure.ch04;

public class IntDeque {

	private int[] que;
	private int capacity;
	private int num;
	private int front;
	private int rear;
	
	//큐 비었음 에러
	public class EmptyIntDequeException extends RuntimeException{
		public EmptyIntDequeException() {}
	}
	
	//큐 가득참 에러
	public class OverflowIntDequeException extends RuntimeException{
		public OverflowIntDequeException() {}
	}
	
	public IntDeque(int maxlen) {
		capacity = maxlen;
		num=0;
		front=0;
		rear=0;
		try {
			que=new int[maxlen];
		}catch(OutOfMemoryError e) {
			capacity=0;
		}
	}
	
	public int enqueFront(int x) throws OverflowIntDequeException{
		if(num>=capacity)
			throw new OverflowIntDequeException();
		if(--front < 0)
			front += capacity;
		que[front]=x;
		num++;
		return x;
	}
	
	public int enqueRear(int x) throws OverflowIntDequeException{
		if(num>=capacity)
			throw new OverflowIntDequeException();
		que[rear++]=x;
		if(rear >= capacity)
			rear -= capacity;
		num++;
		return x;
	}
	
	public int dequeFront() throws EmptyIntDequeException{
		if(num<=0)
			throw new EmptyIntDequeException();
		int x = que[front++];
		if(front >= capacity)
			front -= capacity;
		num--;
		return x;
	}
	
	public int dequeRear() throws EmptyIntDequeException{
		if(num <= 0)
			throw new EmptyIntDequeException();
		if(--rear < 0)
			rear += capacity;
		num--;
		return que[rear];
	}
	
	public int peekFront() throws EmptyIntDequeException{
		if(num <= 0)
			throw new EmptyIntDequeException();
		return que[front];
	}
	
	public int peerRear() throws EmptyIntDequeException{
		if(num <= 0)
			throw new EmptyIntDequeException();
		return que[rear<=0 ? rear+capacity-1 : rear-1];
	}
	
	public void clear() {
		num=0;
		front=0;
		rear=0;
	}
	
	//public int indexOf(int x){}
	
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
	
	public void dump() {
		if(num <= 0)
			System.out.print("Deque is empty.");
		else
			for(int i=0; i<num; i++)
				System.out.print(que[(front+i)%capacity] + " ");
		System.out.println();
	}
	
//	public int search() {}
}
