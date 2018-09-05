import java.util.Scanner;
class stack
{
	private int maxSize;
	private char[] stackArray;
	private int top;

public  stack(int maxSize)
{
	stackArray= new char[maxSize];
	top=-1;
}

public void push(char item)
{
	if(top >= stackArray.length)
	{
	System.out.println("Stack overflow");
	}
	else
	{
	stackArray[++top]=item;
	}
}
public char pop()
{
	if (top==-1)
	{
	System.out.println("Stack underflow");
	return 0;
	}
	else
	{
	return stackArray[top--];
	}
}
boolean isAlpha(char ch)
{
	if((ch>='a' && ch<= 'z')||(ch>=0 && ch<=9))
	{
	return true;
	}
	else
	{
	return false;
	}
}
boolean isOperator(char ch)
{
	if((ch=='+')||(ch=='-')||(ch=='/')||(ch=='*'))
	{
	return true;
	}
	else
	{
	return false;
	}
}
void inTOpost(string s)
{
	
	postfix=new char[s.length()];
	char ch;
	int j=0;
	for (int i=0;i<=str.length();i++)
	{
	ch = s.charAt(i);
	if(ch=='(')
	{
	push(ch);
	}
	else if(isAlpha(ch))
	{
	postfix[j++]=ch;
	}
	else if(isOperator(ch))
	{
	push ch;
	}
	else if(ch==')')
	{
	char c =pop();
	while(c!='(')
	{
	postfix[j++]=c;
	c=pop();
	}
	}
	}
}
void display()
{
	for(i=0;i<postfix.length;i++)
	{
	System.out.println(postfix[i]);
	}
}
}
class inTOpostApp
{
public static void main(String[] args) throws IOException
{
	string s,postfix;
	Scanner sc = new Scanner(System.in);
	stack =new stack();
	s=sc.nextLine();
	System.out.println("input string"+s);
	System.out.println("output string is");
	b.postfix(s);
}
}
	
