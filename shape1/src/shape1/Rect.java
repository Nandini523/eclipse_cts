package shape1;

public class Rect extends Shape1 {
int rect_length,rect_breadth;

public Rect(int shape_id, String shape_name,int rect_length,int rect_breadth) {
	super(shape_id, shape_name);
	this.rect_length=rect_length;
	this.rect_breadth=rect_breadth;
	// TODO Auto-generated constructor stub
}

public int getRect_length() {
	return rect_length;
}

public void setRect_length(int rect_length) {
	this.rect_length = rect_length;
}

public int getRect_breadth() {
	return rect_breadth;
}

public void setRect_breadth(int rect_breadth) {
	this.rect_breadth = rect_breadth;
}

@Override
public String toString() {
	return "Rect [rect_length=" + rect_length + ", rect_breadth=" + rect_breadth + ", shape_id=" + shape_id
			+ ", shape_name=" + shape_name + "]";
}
public int cal_rect()
{
	return rect_length*rect_breadth;
	}
public int area()
{
	return rect_length*rect_breadth;
	}
}
