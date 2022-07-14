package excep;

public class excepex {
	
		int a=10;
		int b=0;
		int c[]=new int[5];
		int excep()
		{
		try {
		return a/b;
//		System.out.println(c[7]);
//		System.out.println("inside try");
	         }
//		catch(Exception ae)
//		{
//			System.out.println(ae);
//		}
	catch(ArithmeticException ae)
	{
//		System.out.println(ae);
		return 1;
		
	}
//		catch(ArrayIndexOutOfBoundsException ae)
//		{
//			System.out.println(ae);
//		}
//		catch(ArrayIndexOutOfBoundsException | ArithmeticException ae)
//		{
//			System.out.println(ae);
//		}
//	finally
//	{
//		System.out.println("finally excecuted");
//	}
		finally {
		System.out.println("after excecution");
		}
//		return 0;
		
	}



public static void main(String args[])
{
	excepex e=new excepex();
	System.out.println(e.excep());
	
}
}