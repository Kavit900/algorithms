class Stack_use
{
	public static void main(String[] args)throws Exception
	{
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);

		System.out.println(s.peek());
	}
}

class Stack
{
	Node top;

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

	void push(int item)
	{
		Node t = new Node(item);
		t.next = top;
		top = t;
	}

	int peek()
	{
		return top.data;
	}
}

class Node{
	Node next = null;
	int data;

	public Node(int d)
	{
		data = d;
	}

	void appendToTail(int d)
	{
		Node end = new Node(d);
		Node n = this;
		while(n.next != null)
		{
			n = n.next;
		}
		n.next = end;
	}
}

