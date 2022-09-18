package datastructure.ch04;

public class IntArrayQueue {

	private int[] que;
	private int capacity;
	private int num;
	
	//큐 비었음 에러
	public class EmptyIntArrayQueueException extends RuntimeException{
		public EmptyIntArrayQueueException() {}
	}
	
	//큐 가득참 에러
	public class OverflowIntArrayQueueException extends RuntimeException{
		public OverflowIntArrayQueueException() {}
	}
	
	public IntArrayQueue(int maxlen) {
		capacity = maxlen;
		num=0;
		try {
			que = new int[maxlen];
		}catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	public int enque(int x) throws OverflowIntArrayQueueException{
		if(num >= capacity)
			throw new OverflowIntArrayQueueException();
		return que[num++] = x;
	}
	
	public int deque() throws EmptyIntArrayQueueException{
		if(num <= 0)
			throw new EmptyIntArrayQueueException();
		int val = que[0];
		for(int i=1; i<num; i++) {
			que[i-1] = que[i];
		}
		num--;
		return val;
	}
	
	public int peek() throws EmptyIntArrayQueueException{
		if(num <= 0)
			throw new EmptyIntArrayQueueException();
		return que[0];
	}
	
	public void clear() {
		num=0;
	}

	//front -> rear
	public int indexOf(int x) {
		for(int i=0; i<num; i++)
			if(x==que[i])
				return i;
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
			for(int i=0;i<num; i++)
				System.out.print(que[i]+" ");
		System.out.println();
	}
}
