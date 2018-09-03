class priority
{
	private int maxsize;
	private long[] quearray;
	private int nele;

public priority(int s)
{
	maxsize = s;
	quearray = new long[maxsize];
	nele= 0;
}

public void insert (long item)
{
	int j;
	if(nele==0)
		quearray[nele++] = item;
	else
	{
		for(j=nele-1;j>=0;j--)
		{
			if(item > quearray[j])
				quearray[j+1] = quearray[j];
			else
			break;
		}

		quearray[j+1] = item;
		nele++;

	}
}
public long remove()
{
	return quearray[--nele];
}

public long peekmin()
{
	return quearray[nele-1];
}
public boolean isempty()
{
	return (nele == 0);
}
public boolean isfull()
{
	return (nele == maxsize);
}
}

class priorityQ
{
	public static void main( String[] args) throws IOexception
{
		priorityQ thePQ = new PriorityQ(5);
		thePQ.insert(30);
		thePQ.insert(50);		
		thePQ.insert(10);
		thePQ.insert(40);
		thePQ.insert(60);

		while( !thePQ.isempty())
{
		longitem = thePQ.remove();
		System.out.print(item + " ");
		}

		System.out.println(" ");
}
}

