package uiltex;
import java.util.*;
import java.util.stream.Stream;

public class ListEx {
	public static void main(String[] args)
	{
//	LinkedList l=new LinkedList();
//	l.add(10);
//	l.add(20);
//	l.add(30);
//	l.add(40);
//	
//	System.out.println(l);
//	l.add(50);
//	System.out.println(l);
//	ListIterator it=l.listIterator();
//    
////	Iterator it=l.iterator();
//	while(it.hasNext())
//	{
//		System.out.println(it.next());
//		System.out.println(it.hasPrevious());
//		System.out.println(it.hasNext());
//		System.out.println(it.previousIndex());
//		System.out.println(it.nextIndex());
//		
//	}
//		Stack s=new Stack();
//		s.push(10);
//		s.push(20);
//		s.push(30);
//		s.push(40);
//		System.out.println(s.size());
//		for(int i=0;i<s.size();)
//		{
//			s.pop();
//		}
//	
//		System.out.println(s);
//		
//		
//		Set st=new TreeSet();
//		st.add(20);
//		st.add(30);
//		st.add(40);
//		st.add(50);
////		st.add(null);
////		st.add(null);
//		st.add(10);
//		System.out.println(st);
//		Map mp=new HashMap();
//		mp.put(1, "sandy");
//		mp.put(2, "yash");
//		mp.put(3, "yash");
//		System.out.println(mp);
//		Set s=mp.entrySet();
//		Iterator it=s.iterator();
//		while(it.hasNext())
//		{
//			Map.Entry me=(Map.Entry) it.next();
//			System.out.println(me.getKey());
//			System.out.println();
//		}
//		
		
		System.out.println("how many records you want to store:");
		Scanner sc=new Scanner(System.in);
		int rec=sc.nextInt();
		List<Employee> l=new ArrayList<Employee>();
		
	  for(int i=0;i<rec;i++)
	  {
		 Employee e; 
		 System.out.println("enter no.");
		int no=sc.nextInt();
		System.out.println("enter name:");
		sc.nextLine();
		String name=sc.nextLine();
		int sal=sc.nextInt();
		l.add(new Employee(no,name,sal));
		
		
	  }
//	  for(Employee em:l)
//	  {
//		  if(em.getSalary()<5000)
//		  {
//		  System.out.println(em.getEno());
//		  System.out.println(em.getEname());
//		  System.out.println(em.getSalary());
//		  }
//	  }
	
	Stream<Employee> e1=l.stream().filter(e->e.salary<5000);
			e1.forEach((j)->System.out.println(j.eno+" "+j.ename+" "+j.salary));
}
		
}
