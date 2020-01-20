package hpack;
class Invalage extends Exception
{
	Invalage (String s)
	{
		super(s);
	}
	}
public class excep  {
 static void invalidage (int age)throws Invalage
 {
	 if(age<18)
		 throw new Invalage("invalid");
	 else
		 System.out.println("go for voting");
 }
 public static void main(String ar[])
 {
	 try
	 {
		 invalidage(17);
	 }
	 catch(Exception e)
	 {
		 System.out.println("Exception occured"+e);

	 }
	 System.out.println("now go home");
 }
}
