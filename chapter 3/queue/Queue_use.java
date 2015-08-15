class Queue_use
{
	public static void main(String[] args) throws Exception
	{
		Queue q = new Queue();
		q.enqueue(5);
		q.enqueue(10);
		q.enqueue(15);
		q.enqueue(20);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
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

class Queue
{
	Node first, last;

	void enqueue(int item)
	{
		if(first == null)
		{
			last = new Node(item);
			first = last;
		}
		else
		{
			last.next = new Node(item);
			last = last.next;
		}
	}

	int dequeue()
	{
		if(first != null)
		{
			int item = first.data;
			first = first.next;
			return item;
		}
		return 0;
	}
}