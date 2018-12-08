import java.util.Scanner;
class Palindrome
{
	public static void main(String a[])
	{
		Palindrome p=new Palindrome();
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		boolean b;
		b=p.palindrome(str);
		System.out.println(b);
	}
	static boolean palindrome(String s)
	{
		char ch[]=s.toCharArray();
		int p=0;
		for(int i=0,j=s.length()-1;i<=s.length()/2;i++,j--)
		{
			if (ch[i]!=ch[j])
				p=1;
		}
		if(p==0)
			return true;
		else
			return false;
	}
}