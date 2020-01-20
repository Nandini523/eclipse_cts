import java.io.FileOutputStream;
import java.util.*;
public class finout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {FileOutputStream f=new FileOutputStream("E:\\cognizant\\nandu.txt");
			System.out.println("enter text");
		Scanner sc=new Scanner(System.in);
		    String s=sc.nextLine();
			byte b[]=s.getBytes();
		    f.write(b);
			f.close();
			System.out.println("check for text in file");
		}catch(Exception e) {System.out.println(e);}

	}

}
