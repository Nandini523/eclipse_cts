package over;
class Addition
{
	int add(int a,int b)
	{return a+b;}
	double add(double a,double b)
	{return a+b;}
	double add(int a,double b)
	{return a+b;}
	double add(double a,int b)
	{return a+b;}
	}
public class Ovrld {
public static void main(String []ar)
{
	Addition a=new Addition();
	System.out.println(a.add(5, 6));
	System.out.println(a.add(6.6, 5.5));
	System.out.println(a.add(7.5, 5));
	System.out.println(a.add(5, 7.5));
	}
}
