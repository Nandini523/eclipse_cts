package access;
import java.util.*;
import java.awt.List;

public class Collec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AbstractList<String>e= new ArrayList<String>();
     e.add("a");
     e.add("b");
     e.add("c");
     System.out.println(e);
     ArrayList<String>e1=new ArrayList<String>();
     e1.add("d");
     e1.add("e");
     e1.add("f");
     System.out.println(e1);
     e1.addAll(e);
     System.out.println(e1);
     e.remove("a");
     System.out.println(e);
     e1.removeAll(e);
     System.out.println(e1);
	}

}
