/**
 * 
 */
package mystack;

/**
 * @author Nico Middleton
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		if(theStack == null)
		{
			throw new IllegalStateException("Stack is empty");
		}
		T value = theStack.val;
		theStack = theStack.next;
		return value;
	}

	public void push(T v) {
		// TODO To complete
		theStack = new MyNode<T>(v, theStack);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> integerStack = new MyStack<>();
		// Push 1 and 2
		integerStack.push(1);
		integerStack.push(2);
		// Pop
		System.out.println("Pop: " + integerStack.pop());
		// Push 5
		integerStack.push(5);
		
		// TODO To complete
		// Create a stack of Person
		MyStack<Person> people = new MyStack<>();
		// Push a person p1 with your name
		Person me = new Person("Nico", "Middleton");
		people.push(me);
		// Push a person p2 with my name
		Person you = new Person("Christelle", "Scharff");
		people.push(you);

	}

}
