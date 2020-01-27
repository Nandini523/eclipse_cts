import java.util.*;
class cal
{
public static void main(String [] a)
{
Scanner s=new Scanner();
System.out.println("a");
int a=s.nextInt();
System.out.println("b");
int b=s.nextInt();
System.out.println("op");
char ch=s.nextChar();
switch(ch)
{
case '+':
return a+b;
break;
case'-':
return a-b;
break;
}
}
}