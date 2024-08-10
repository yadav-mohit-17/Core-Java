package maccess;
import java.util.*;
public class DemoString1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter The String :");
			String str=s.nextLine();
			int len=str.length();
			for(int i=0;i<=len-1;i++)
			{
				System.out.println("Char At :"+i+"="+str.charAt(i));
			}
		}

	}

}
