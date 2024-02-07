
public class Stack
{
	Node top;

	public boolean isEmpty()
	{
		if( top == null )
		{	return true;
		} else {
			return false;
		}
		//return top == null;
	}

	public void push(int n)
	{
		Node newNode = new Node(n);
		if( isEmpty() )
		{
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
	}

	public int pop()
	{
		if( isEmpty() == false ) {
			int data = top.data;
			top = top.next;
			return data;
		} else {
			System.out.println("The stack is empty");
			return 0;
		}
	}

	public int peek()
	{
		if( isEmpty() == false ) {
			int data = top.data;
			return data;
		} else {
			System.out.println("The stack is empty");
			return 0;
		}
	}

	public void printStack()
	{
		Node temp = top;
		System.out.print(this.size() + " TOP -> ");
		while(temp != null)
		{
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("Null\n");
	}

	public int size()
	{
		int counter = 0;
		Node temp = top;
		while(temp != null)
		{
			counter++;
			temp = temp.next;
		}
		return counter;
	}

	public static void main(String[] args)
	{
		Stack s = new Stack();
		if(s.isEmpty() == true)
		{	System.out.println("the stack is empty");
		}
		s.printStack();
		s.push(1);
		s.printStack();
		s.push(2);
		s.printStack();
		s.push(3);
		s.printStack();
		
		System.out.println(s.pop());
		s.printStack();
		System.out.println(s.pop());
		s.printStack();
		System.out.println(s.pop());
		s.printStack();
		System.out.println(s.pop());
		s.printStack();
		System.out.println(s.pop());
	}
}

