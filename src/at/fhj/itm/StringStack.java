package at.fhj.itm;

import java.util.EmptyStackException;
import java.util.LinkedList;

/**
 * Stack Implementation of <code>Stack</code> Interface.
 * supports String Values and can be initialized with a maximum number
 * of items.
 *  
 * @see Stack
 */
public class StringStack implements Stack
{
	/**
	 * generates an new List containing Strings
	 * 
	 * @param stack
	 */
	private LinkedList<String> stack = new LinkedList<String>();
	
	/**
	 * describes the maximum size of the Stack
	 * 
	 * @param maxsize
	 */
	int maxsize;
	
	
	/**
	 * Class Constructor.
	 * 
	 * @param m 
	 */
	public StringStack (int m){
		this.maxsize=m;
	}

	/**
	 * tests if the Stack is empty
	 * 
	 * @return true or false
	 */
	@Override
	public boolean isEmpty() {
		if(stack.size()==0){
			return true;
		} 
		else {
			return false;
		}	
	}

	/**
	 * test if the actual size of the Stack is smaller than the maximum size
	 * if so it places a new item on top
	 * else throws an IllegalArgumentException()
	 * 
	 * @exception IllegalArgumentExeption()
	 * 
	 * @param item
	 */
	@Override
	public void push(String item) {
		if(stack.size()<maxsize){
			stack.add(item);
			System.out.println(stack);
		} else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * test if the Stack is not empty
	 * if so it removes the item on top
	 * else throws an EmptyStackException()
	 * 
	 * @exception EmptyStackException()
	 * 
	 * @param item
	 * 
	 * @return item
	 */
	@Override
	public String pop() {
		String item;
		
		if(stack.size()>0){
			item=stack.get(stack.size()-1);
			stack.remove(stack.size()-1);
			return item;
		}
		else {
			throw new EmptyStackException();
		}	
	}
}
