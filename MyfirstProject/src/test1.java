import static java.lang.System.*;
class example
{
	static int a=5;
	 void exampl()
	{
		++a;
		out.println("static method"+a);
	}
	
//	{
//		System.out.println("static block");
//	}
//	
}
public class test1 implements inter1 {
	public void show()
	{
		System.out.println("from main");
	}
	public void show1()
	{
		System.out.println("own method of main");
	}
	public void move()
	{
		System.out.println("from main moving");
	}
	public static void main(String args[])
	{
		
//		System.out.println("static variable a:"+example.a);
//		
//		example s=new example();
//		s.exampl();
//		example s1=new example();
//		s1.exampl();
//		example s2=new example();
//		s2.exampl();
//		
		inter1 t=new test1();
		t.show();
		t.move();
		inter2.parts();
	}

}
abstract class abs
{
	abstract void print();
	void show()
	{
		System.out.println("non abstract method");
	}
}