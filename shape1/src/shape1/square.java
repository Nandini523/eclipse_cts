package shape1;

public class square extends Shape1 {
int square_side;
public square(int shape_id, String shape_name,int square_side) {
	super(shape_id, shape_name);
	// TODO Auto-generated constructor stub
	this.square_side=square_side;
}
public int getSquare_side() {
	return square_side;
}
public void setSquare_side(int square_side) {
	this.square_side = square_side;
}
@Override
public String toString() {
	return "square [square_side=" + square_side + ", shape_id=" + shape_id + ", shape_name=" + shape_name + "]";
}
public int cal_square()
{
	return square_side*square_side;
	}
public int area()
{
	return square_side*square_side;
	}
}
