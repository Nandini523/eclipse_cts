package constructor;

 class Bar {
int carNumber;
int run()
{
	return 60;}
}
class fordCar extends Bar
{
	int run()
	{
	return super.run()+40;
	}
}
public class Car
{
public static void main(String ar[])
{
	fordCar f=new fordCar();
	System.out.println(f.run());
	}
	}