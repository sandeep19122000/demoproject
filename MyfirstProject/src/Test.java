import java.util.Scanner;

class employee{
	final private int eno;
	private String name;
	employee()
	{
		eno=80;
		System.out.println(eno);
	}
//	employee(int eno,String name)
//	{
//		this.eno=eno;
//		this.name=name;
////	}
//	public void getValue(int eno,String name)
//	{
//		this.eno=eno;
//		System.out.println(eno+ "  "+name);
//	}
//	public void getValue(String name)
//	{
//		this.name=name;
//		System.out.println(name);
//	}
}
//class sample{
//	private int a;
////	public void setValue(int x)
////	{
////		a=x;
////		
////	}
//	sample(int x)
//	{
//		System.out.println("parameterized");
//		a=x;
//	}
//	sample()
//	{
//		System.out.println("default cons");
//	}
//	public int getValue()
//	{
//		return a;
//	}
//}
public class Test {
public static void main(String args[])
{
//	int a=Integer.parseInt(args[0]);
//	int b=Integer.parseInt(args[1]);
//	sample s=new sample(20);
//	sample s1=new sample();
//	s.setValue(10);
//	System.out.println(a+b);
//System.out.println("hello world");
//	employee s=new employee();
//	s.getValue("sa");
//	employee s2=new employee(102,"sandeep");
//	s2.getValue();
//	employee s3=new employee(103,"yash");
//	s3.getValue();
//	for(int i=0;i<10;i++)
//	{
////		Scanner sc=new Scanner(System.in);
////		int a=sc.nextInt();
////		String b=sc.nextLine();
////		employee e=new employee(a,b);
////		e.getValue();
////		
//		
//	}
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter no.");
//	int n=sc.nextInt();
//	sc.close();
//	employee arr[]=new employee[n];
//	for(int i=0;i<n;i++) {
//		arr[i]=new employee(i+1,"EMP_"+(i+1));
//		
//	}
//	for(int i=0;i<n;i++) {
//		arr[i].getValue();
//	}
//	child c=new child();
//	c.show();
//	c.display();
//	String s =new String("sandeep");
//	System.out.println(s.length());
//	
//	StringBuffer sb=new StringBuffer("sandeep");
//	sb.reverse();
//	sb.append("santosh");
//	sb.insert(1,"TEST");
//	System.out.println(sb);
//	sb.delete(0,3);
//	System.out.println(sb);
//	sb.replace(0, 7, "new_name");
//	System.out.println(sb);
//	System.out.println(sb.toString().equals("new_namesantosh"));
//	System.out.println(sb.toString()==("new_namesantosh"));
//	
	employee s=new employee();
	employee s1=new employee();
	System.out.println(s==s1);
	System.out.println(s.equals(s1));
	
}
}
//inheritence
//class grandparent
//{
//	int g=30;
//	void perform()
//	{
//		System.out.println("from grandparent:"+g);
//	}
//			
//}
class parent 
{
int p1=20;
void show()
{
	
	System.out.println("from parent:"+p1);
}
}
class child extends parent 
{
	int c1=30;
	void display()
	{
		System.out.println("from child:"+c1);
	}
	void show()
	{
		super.show();
		System.out.println("from child:"+c1);
	}
}

