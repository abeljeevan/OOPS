import java.util.Scanner;
public class Frequency
{
	public static void main(String args[])
	{
		int i,len,count=0;
		String s,ch;
		s=new String();
		ch=new String();
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the String:");
		s=kb.nextLine();
		System.out.println("Enter the characters to find frequency of");
		ch=kb.nextLine();
		char ch2=ch.charAt(0);
		len=s.length();
		for(i=0;i<len;i++)
		{
			if(s.charAt(i)==(ch2))
			{
				count=count+1;
			}
		}
		System.out.println("The occurence of"+ch+" is:"+count);
		kb.close();
	}
}
		 
