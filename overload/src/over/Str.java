package over;

public class Str {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s=" String  ";
     String s1=new String("bye");
     char []c= {'c','h','a','r'};
     String s2=new String(c);
     char [] v= {'v','a','l'};
     String split1="good@afternoon@chennai";
     System.out.println(String.valueOf(v));
     System.out.println(s.trim()+s1);
     System.out.println(s.replace('r', 'k'));
     System.out.println("com"+s.compareTo(s2));
     System.out.println("compig"+s.compareToIgnoreCase(s1));
     String [] sp =split1.split("@");
     for(String i:sp)
    	 System.out.println(i);
     System.out.println(s1.charAt(1));
     System.out.println(split1.substring(5, 14));
	}

}
