package over;
 class A
{  static final double pi=3.14;
	 void display()
	{System.out.println("class A");}
	}
class B extends A
{
	void display()
	{
		super.display();
	}
	}
public class Final {
	static int gi=5;
public static void main(String ar[])
{
	System.out.println(A.pi);
	System.out.println(gi);
	}
}
