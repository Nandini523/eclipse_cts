package over;
import java.util.*;
public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*Scanner s=new Scanner(System.in);
       String s1=s.nextLine();
       String s2=s.nextLine();*/
	   	String s1="nandu";
	   	String s2="appu";
	   	char c1='2';
       int l,m,c=0;
       l=s1.length();
       m=s2.length();
       if(l!=m)
       System.out.println("no");
       else
       {
    	   for(int i=0;i<l;i++)
    	   {
    		   if(s1.charAt(i)!=s2.charAt(i))
    		   {c=1;}
    	   }
    	   if(c==1)
    		   System.out.println("no");
    	   else
    		   System.out.println("yes");
    
       }
       if('1'<c1&&c1<'9')
       {System.out.println(c1);}
	}
}
