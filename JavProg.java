package learnjava;
class JavProg
	//No Decalaration
{
	public static void main(String args[])
	{
	 try{
		System.out.println("Output 1 ");
	 	System.out.println(5/0);
		System.out.println("Output 2 ");
	}		
	catch(ArithmeticException e)
	{
		System.err.println("Division by zero has been done in the program");
		System.out.println("Exception thrown is :"+e);
	}
	
	}
}
