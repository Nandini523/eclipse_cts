import java.util.*;
import java.sql.*;
public class add {
    static void add(int... num)
    {  int s=0;
    	for(int i:num)
    		s+=i;
    	System.out.println(s);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=5;
     double b=5.8;
	 add(1,2);
     add(1,2,3);
     add(1,0,2,4);
     java.util.Date d=new java.util.Date();
     System.out.println(Math.ceil(b));
     System.out.println(Math.floor(b));
     System.out.println(Math.abs(-9));
     System.out.println(Math.min(5.5, 6.7));
     System.out.println(Math.max(7, 5));
     System.out.println(Math.random());
     System.out.println((int)(Math.pow(2, 4)));
     System.out.println(5+(int)(Math.random()*17-5));
     System.out.println(d);
	}

}
