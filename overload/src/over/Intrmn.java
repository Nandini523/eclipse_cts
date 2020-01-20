package over;
abstract class auto
{   
	String modelNo;
	abstract String show(String modelNo);
	}
interface fly1
{
	int maxfly=100;
	}
interface  run
{
	int maxrun=150;
	}
interface swim
{
	int maxswim=50;
	}
class s_auto extends auto implements swim
{   
	String show(String modelNo)
	{   System.out.println("Im ship");
		return modelNo;
	}
	}
class e_auto extends auto implements run
{
	String show(String modelNo)
	{   
		System.out.println("Im train");
		return modelNo;
	}
	}
class air_auto extends auto implements fly1
{
	String show(String modelNo)
	{   System.out.println("Im jet");
		return modelNo;
	}
	}
public class Intrmn {
public static void main (String[]ar)
{
	air_auto a=new air_auto();
	System.out.println("modelno : "+a.show("airbus523"));
	System.out.println("maxspeed: "+air_auto.maxfly);
	e_auto e=new e_auto();
	System.out.println("modelno: "+e.show("earth523"));
	System.out.println("maxspeed: "+e_auto.maxrun);
	s_auto s=new s_auto();
	System.out.println("modelno :"+s.show("swim523"));
	System.out.println("maxspeed:"+s_auto.maxswim);
	}
}
