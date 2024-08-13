import java.util.*;
public class reverse
{
	public static void main(String args[])
	{
		int i,len;
		String s=new String();
		String rev=new String();
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the string:");
		s=kb.nextLine();
		len=s.length();
		for(i=0;i<len;i++)
		{
			rev=rev+s.charAt(len-i-1);
		}
		System.out.println("The reversed string is:"+rev);
		kb.close();
	}
}
