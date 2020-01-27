class stb
{
static int a;
static 
{a=10;
System.out.println("Im static block"+a);
}
static void setA()
{
a=56;
System.out.println("Im static method"+a);
}
public static void main(String ar[])
{
setA();
System.out.println("Im main");
}
}