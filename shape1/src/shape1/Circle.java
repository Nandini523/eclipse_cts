package shape1;

public class Circle extends Shape1 {
int radius,pi=3;
public Circle(int shape_id, String shape_name,int radius) {
	super(shape_id, shape_name);
	// TODO Auto-generated constructor stub
	this.radius=radius;
}

public int getRadius() {
	return radius;
}
public void setRadius(int radius) {
	this.radius = radius;
}

@Override
public String toString() {
	return "Circle [radius=" + radius + "]";
}
public int area()
{
	return pi*radius*radius;
	}

}
