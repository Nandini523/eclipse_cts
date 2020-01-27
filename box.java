class box
{
int length,width,height;
void setter(int length,int height,int width)
{
this.length=length;
this.height=height;
this.width=width;
}
void getter()
{
System.out.println("length: "+length+"\nheight: "+height+"\nwidth: "+width);
}
public box()
{
this.length=1;
this.height=1;
this.width=1;
}
public box(int length,int height,int width)
{
this.length=length;
this.height=height;
this.width=width;
}
void calVolume()
{
int volume=length*height*width;
System.out.println("vol: "+volume);
}
public static void main(String a[])
{
box b=new box();
b.getter();
b.calVolume();
box b1=new box(2,3,4);
b1.getter();
b1.calVolume();
b1.setter(3,4,5);
b1.getter();
b1.calVolume();
}
}