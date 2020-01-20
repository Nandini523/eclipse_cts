interface Eatable
{  void eat();
	}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Eatable e=new Eatable()
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("non veg");
	}
	
	};
	e.eat();
	}

}
