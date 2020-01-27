class stx
{
int inst;
static int sta;
static void set(int a)
{
sta=a;
stx s=new stx();
s.inst=5;
System.out.println(sta+"  "+s.inst);
}
public static void main(String [] ar)
{
stx s1=new stx();
s1.set(7);
}
}