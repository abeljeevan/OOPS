import java.util.Scanner;
public class paliendrome
{
	public static void main(String args[])
	{
		String s;
		String rev=new String();
		int i,len;
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the String:");
		s=kb.nextLine();
		len=s.length();
		for(i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("Its a paliendrome");
		}
		else
		{
			System.out.println("Its not a paliendrome:");
		}
		kb.close();
	}
}
