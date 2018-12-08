import java.util.*;
class StringReverse
{
	static String s1;
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringReverse sr=new StringReverse();
		s1=sr.Reverse(s);
		System.out.println(s1);
	}
	static String Reverse(String s)	
	{
		char ch[]=s.toCharArray(),t;
		int i,j;
		//char ch1[];
		int l=s.length();
		for(i=0,j=l-1;i<=(l/2);i++,j--)
		{
			t=ch[i];
			ch[i]=ch[j];
			ch[j]=t;
		}
		s1=ch.toString();
		return s1;
	}
}