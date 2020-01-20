package shape1;

public class Smain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r=new Rect(1,"rectangle",5,3);
		System.out.println("area of rectangle "+r.area());
        System.out.println(r);
        square s=new square(2,"square",4);
        System.out.println(s);
        System.out.println("area of square "+s.area());
        Circle c=new Circle(3,"circle",5);
        System.out.println("area of circle "+c.area());
        System.out.println(c);
	}

}
