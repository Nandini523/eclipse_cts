package thread;

 class Mthread extends Thread {
@Override
public void run() {
	// TODO Auto-generated method stub
	super.run();
	/*for(int i=0;i<=10;i++)
		{ 
		
		System.out.println(i);
		
		}*/
}
}
public class Mythread
{
	public static void main(String [] ar)
	{
		Mthread m=new Mthread();
		Mthread m1=new Mthread();
		
		m.start();
		System.out.println(m.getPriority());
		System.out.println(m1.MIN_PRIORITY);
	    System.out.println(m1.MAX_PRIORITY);
		}
		
	}
