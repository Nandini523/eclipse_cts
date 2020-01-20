
public class Outer {
class Inner
{    void msg()
	{System.out.println("Inner");}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Outer out =new Outer();
     Outer.Inner in=out.new Inner();
     in.msg();
	}
}
