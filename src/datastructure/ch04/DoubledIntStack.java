package datastructure.ch04;

import java.util.Arrays;

public class DoubledIntStack {

	private int[] stk;
	private int cap;
	private int ptrA;
	private int ptrB;
	
	//예외 : empty stack exception
	public class EmptyDoubledIntStackException extends RuntimeException {
		public EmptyDoubledIntStackException() {}
	}
	
	//예외 : full stack exception
	public class OverflowDoubledIntStackException extends RuntimeException{
		public OverflowDoubledIntStackException() {}
	}
	
	//생성자
	public DoubledIntStack(int maxlen) {
		ptrA = 0;
		ptrB = maxlen-1;
		cap = maxlen;
		try {
			stk = new int[cap];
		}catch(OutOfMemoryError e) {
			cap = 0;
		}
	}

	//pushA
	public int pushA(int x) throws OverflowDoubledIntStackException{
		if(ptrA > ptrB)
			throw new OverflowDoubledIntStackException();
		return stk[ptrA++] = x;
	}
	//pushB
	public int pushB(int x) throws OverflowDoubledIntStackException{
		if(ptrA > ptrB)
			throw new OverflowDoubledIntStackException();
		return stk[ptrB--] = x;
	}

	//popA
	public int popA() throws EmptyDoubledIntStackException{
		if(ptrA <= 0)
			throw new EmptyDoubledIntStackException();
		return stk[--ptrA];
	}
	//popB
	public int popB() throws EmptyDoubledIntStackException{
		if(ptrB >= cap-1)
			throw new EmptyDoubledIntStackException();
		return stk[++ptrB];
	}

	//peekA
	public int peekA() throws EmptyDoubledIntStackException{
		if(ptrA <= 0)
			throw new EmptyDoubledIntStackException();
		return stk[ptrA-1];
	}
	//peekB
	public int peekB() throws EmptyDoubledIntStackException{
		if(ptrB >= cap-1)
			throw new EmptyDoubledIntStackException();
		return stk[ptrB+1];
	}

	//clearA
	public void clearA() {
		ptrA=0;
	}
	//clearB
	public void clearB() {
		ptrB=cap-1;
	}
	
	/*
	//indexOf : 성공시 index, 실패시 -1
	public int indexOf(int x) {
		for(int i=ptr-1; i>=0; i--) 
			if(stk[i]==x) 
				return i;
		return -1;
	}
	*/

	//getCapA
	public int getCapA() {
		return ptrB;
	}
	//getCapB
	public int getCapB() {
		return cap-(ptrA-1);
	}

	//sizeA
	public int sizeA(){
		return ptrA;
	}
	//sizeB
	public int sizeB(){
		return cap-(ptrB+1);
	}

	//isEmptyA
	public boolean isEmptyA() {
		return ptrA<=0;
	}
	//isEmptyB
	public boolean isEmptyB() {
		return ptrB>=cap-1;
	}

	//isFull
	public boolean isFullA() {
		return ptrA>ptrB;
	}
	//isFull
	public boolean isFullB() {
		return ptrA>ptrB;
	}

	//dumpA : 데이터 0부터 끝까지 출력
	public void dumpA() {
		if(ptrA<=0)
			System.out.print("stack is empty");
		else
			for(int i=0; i<ptrA; i++) 
				System.out.print(stk[i] + " ");
		System.out.println();
	}
	//dumpB
	public void dumpB() {
		if(ptrB>=cap-1)
			System.out.print("stack is empty");
		else
			for(int i=cap-1; i>ptrB; i--) 
				System.out.print(stk[i] + " ");
		System.out.println();
	}
	
	//toString
	@Override
	public String toString() {
		return Arrays.toString(stk);
	}
}
