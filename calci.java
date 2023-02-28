public class Calculator {
	public static void main(String[] args)
	{
		int a,b;
		a=Integer.parseInt(args[0]);
		String c=args[1];
		b=Integer.parseInt(args[2]);
		int result=0;
		if(c.equals("+"))
		{
			result=a+b;
		}
		if(c.equals("*"))
		{
			result=a*b;
		}
		if(c.equals("/"))
		{
			result=a/b;
		}
	   System.out.println("The result is = "+result);
			
		
	}

}
