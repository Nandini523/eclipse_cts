package constructor;
class A
{
	A()
	{
		super();
		System.out.println("A class");
	}
	}
class B extends A
{   B(){
	super();
	System.out.println("B CLASS");

	}
	}
public class Cons {
	public static void main()
	{
A a=new A();
B b=new B();
System.out.println(b.hashcode());
System.out.println(b.getClass());
	}
}
