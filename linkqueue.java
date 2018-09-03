class Link
{
	public long dData;
	public Link next;

public Link(long d)
{
	dData = d;
}

public void displayLink()
{
	System.out.println(dData + " ");
}
}
class Firstlastlist
{
	private Link first;
	private Link last;

public Firstlastlist()
{
	first = null;
	last = null;
}

public boolean isEmpty()
{
	return first==null;
}
public void insertlast(long dd)
{
	Link newLink = new Link(dd);
	if(isEmpty() )
	first = newLink;
	else
	{
		last.next = newLink;
		last = newLink;
	}
}

public long deleteFirst()
{
	long temp = first.dData;
	if(first.next == null)
	{	last = null;
	first = first.next;
	return temp;
	}
}

public void displayList()
{	
	Link current = first;
	while(current != null)
	{
		current.displayLink();
		current = current.next;
	}
	System.out.println(" ");
}
}

class Linkqueue
{
	private Firstlastlist theList;

public Linkqueue()
{
	theList = new Firstlastlist();
}
public boolean isEmpty()
{
	return theList.isEmpty();
}
public void insert(int j)
{	
	theList.insertlast(j);
}
public long remove()
{
	return theList.deleteFirst();
}
public void displayQueue()
{
	System.out.print("Queue (front-->rear): ");
	theList.displayList();
}
}
class linkqueue
{
	public static void main(String[] args)
	{
		linkqueue theQueue = new linkqueue();
		theQueue.insert(20);
		theQueue.insert(40);

		theQueue.displayQueue();

		theQueue.insert(60);
		theQueue.insert(80);
		
		theQueue.displayQueue();
		
		theQueue.remove();
		theQueue.remove();
		
		theQueue.displayQueue();
	}
}
