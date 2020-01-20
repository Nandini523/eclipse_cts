package thread2;
class A
{}
class thread extends A implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++)
			System.out.println(i);
	}
	}
public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      thread t =new thread();
      Thread t1=new Thread(t);
      t1.start();
	}

}
