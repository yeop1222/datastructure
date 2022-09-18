package datastructure.ch04;

public class Stack<E> {

	private E[] stk;
	private int capacity;
	private int ptr;
	
	//예외 : empty stack exception
	public static class EmptyStackException extends RuntimeException {
		public EmptyStackException() {}
	}
	
	//예외 : full stack exception
	public static class OverflowStackException extends RuntimeException {
		public OverflowStackException() {}
	}
	
	//생성자
	public Stack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = (E[])new Object[capacity];
		}catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	//push
	public E push(E x) throws OverflowStackException{
		if(ptr >= capacity)
			throw new OverflowStackException();
		return stk[ptr++] = x;
	}
	
	//pop
	public E pop() throws EmptyStackException{
		if(ptr <= 0)
			throw new EmptyStackException();
		return stk[--ptr];
	}
	
	//peek
	public E peek() throws EmptyStackException{
		if(ptr <= 0)
			throw new EmptyStackException();
		return stk[ptr-1];
	}
	
	//clear
	public void clear() {
		ptr=0;
	}
	
	//indexOf : 성공시 index, 실패시 -1
	public int indexOf(E x) {
		for(int i=ptr-1; i>=0; i--) 
			if(stk[i].equals(x)) 
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
