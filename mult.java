
  class ch6ex1ex3
{
	public static void main(String[] args)
	{
		double x = 3;
		double y = 3;
		
		double answer = power(x, y);
		System.out.println(x + " ^ " + y + " = " + answer);
		
		double a = 5;
		double b = 9;
		double answer2 = mult(a, b);
		System.out.println(a + " * " + b + " = " + answer2);
	}
	
	
	public static double power(double x, double y)
	{
		if(y == 1) return x;	
		else if (y%2 == 0) return power(x*x, y/2);	
		else return x * power(x, y-1);	
	}
	
	
	public static double mult(double x, double y)
	{
		if(y==1) return x;
		else return x + mult(x, y-1);
	}
}
