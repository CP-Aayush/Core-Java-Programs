/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class code
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,c=0,s=0,d=0,sp=0,i;
		String str;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t>0)
		{
		    str=sc.nextLine();
		    char ch[]=str.toCharArray();
		    int l=str.length();
		    for(i=0;i<l;i++)
	        {
	            if(ch[i]>=65 && ch[i]<=90)
	            {
	                c=1;
	            }
	            else if(ch[i]>=97 && ch[i]<=122)
	            {
	                s=1;
	            }
	            else if(ch[i]>=48 && ch[i]<=57)
	            {
	                d=1;
	            }
	            else
	                sp=1;
	        }
		    System.out.println(c+s+d+sp);
		    t--;
		}
	}
}

