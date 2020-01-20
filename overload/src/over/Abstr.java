package over;
abstract class A
{
	abstract int add(int a,int b);
	void show()
	{
		System.out.println("this is abstract class");
	}
	}
class Aimpl extends A
{

	@Override
	int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	}

public class Abstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Aimpl s=new Aimpl();
      System.out.println(s.add(5, 4));
	}

}
