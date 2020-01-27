class stat
{
static int a=0;
stat()
{
a++;
}
public static void main(String ar[])
{
stat s =new stat();
System.out.println(a);
stat s1=new stat();
System.out.println(a);
}
}