package datastructure.ch04;

public class IntStack {

	private int[] stk;
	private int capacity;
	private int ptr;
	
	//예외 : empty stack exception
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	//예외 : full stack exception
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	//생성자
	public IntStack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity];
		}catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	//push
	public int push(int x) throws OverflowIntStackException{
		if(ptr >= capacity)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	//pop
	public int pop() throws EmptyIntStackException{
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	//peek
	public int peek() throws EmptyIntStackException{
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr-1];
	}
	
	//clear
	public void clear() {
		ptr=0;
	}
	
	//indexOf : 성공시 index, 실패시 -1
	public int indexOf(int x) {
		for(int i=ptr-1; i>=0; i--) 
			if(stk[i]==x) 
				return i;
		return -1;
	}
	
	//getCapacity
	public int getCapacity() {
		return capacity;
	}
	
	//size
	public int size(){
		return ptr;
	}
	
	//isEmpty
	public boolean isEmpty() {
		return ptr<=0;
	}
	
	//isFull
	public boolean isFull() {
		return ptr>=capacity;
	}
	
	//dump : 데이터 0부터 끝까지 출력
	public void dump() {
		if(ptr<=0)
			System.out.print("stack is empty");
		else
			for(int i=0; i<ptr; i++) 
				System.out.print(stk[i] + " ");
		System.out.println();
	}
}
