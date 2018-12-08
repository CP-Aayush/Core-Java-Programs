//package WordCount;
import java.util.Scanner;
class WordCount
{
	static int t=0;
	public static void main(String a[])
	{
		WordCount wc=new WordCount();
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		t=wc.wordCount(s);
		System.out.println(t);
	}
	static int wordCount(String s)
	{
		char ch[]=s.toCharArray();
		int l=s.length();
		int z;
		if((ch[0]>='A' && ch[0]<='Z')||(ch[0]>='a' && ch[0]<='z'))
			t++;
		for (int i=1;i<l-1;i++)
		{
			if(ch[i]==' ' && ((ch[i+1]>='A' && ch[i+1]<='Z')||(ch[i+1]>='a' && ch[i+1]<='z')))
				t++;
		}
		return t;
	}
}