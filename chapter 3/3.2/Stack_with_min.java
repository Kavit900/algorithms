class Stack_with_min
{
	public static void main(String[] args) throws Exception
	{
		StackWithMin s = new StackWithMin();
		s.push(20);
		s.push(10);
		s.push(9);
		s.push(11);
		s.push(4);
		s.push(5);
		System.out.println(s.min());
		System.out.println(s.pop());
		System.out.println(s.min());
		System.out.println(s.pop());
		System.out.println(s.min());
		System.out.println(s.pop());
		System.out.println(s.min());
		System.out.println(s.pop());
		System.out.println(s.min());
	}
}

class Node
{
	Node next = null;
	int data;

	public Node(int d)
	{
		data = d;
	}
}

class Stack
{
	Node top;

	void push(int item)
	{
		Node t = new Node(item);
		t.next = top;
		top = t;
	}

	int pop()
	{
		if(top != null)
		{
			int item = top.data;
			top = top.next;
			return item;
		}
		return -1;
	}

	int peek()
	{
		return top.data;
	}

	boolean isEmpty()
	{
		if(top == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class StackWithMin extends Stack
{
	Stack s2;
	public StackWithMin()
	{
		s2 = new Stack();
	}

	public void push(int value)
	{
		if(value <= min())
		{
			s2.push(value);
		}
		super.push(value);
	}

	int pop()
	{
		int value = super.pop();
		if(value == min())
		{
			s2.pop();
		}
		return value;
	}

	public int min()
	{
		if(s2.isEmpty())
		{
			return Integer.MAX_VALUE;
		}
		else
		{
			return s2.peek();
		}
	}
}