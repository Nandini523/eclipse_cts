package shape1;

public class Shape1 {
int shape_id;
String shape_name;
public Shape1(int shape_id, String shape_name) {
	super();
	this.shape_id = shape_id;
	this.shape_name = shape_name;
}
public int getShape_id() {
	return shape_id;
}
public void setShape_id(int shape_id) {
	this.shape_id = shape_id;
}
public String getShape_name() {
	return shape_name;
}
public void setShape_name(String shape_name) {
	this.shape_name = shape_name;
}
@Override
public String toString() {
	return "Shape1 [shape_id=" + shape_id + ", shape_name=" + shape_name + "]";
}
public int area()
{ 
	return 5;
	}
}
