import java.util.*;
class Rec
{ 
public static void main()
{ 
int n,n1;
int c=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.println(n);
while(n<10)
{ 
if(n<10)
System.out.println(c);
else
{
n1=sum(n);
System.out.println(n1);
c++;
}
n=n1;
}
}
static int sum(int n)
{ int k=0;
  while(n>0)
 {
  k+=n%10;
  n=n/10;
 }
 return k;
 }
}
