package over;
class Airaut implements Fly
{
	double speed =100;
	String modelno;
	void setModelno(String modelno)
	{
		this.modelno=modelno;
	}
String show()
{ 
	return modelno;
	}
@Override
public int fly(int a) {
	// TODO Auto-generated method stub
	return a;
}

}
interface Fly
{
	int mspeed=150;
	int fly(int a);
	
	}
public class Intrfc {
public static void main(String ar[])
{
	Airaut a1=new Airaut();
	a1.setModelno("airbus523");
	System.out.println("aeroplane name: "+a1.show());
    System.out.println("aeroplane is flying with: "+a1.fly(100)); 
	System.out.println("max speed of aeroplane is:s "+Airaut.mspeed);
	}
}
