/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		for (int i=0;i<tc;i++){
		    int l=sc.nextInt();
		    int r=sc.nextInt();
		    if(l<444&&r>=444){
		        l=444;
		      
		        
		        int count=0;
		        int flag=0;
		    for (int j=l;j<=r;j++)
		    {
		        while(j!=0)
		        { flag=0;
		            int dig=j%10;
		            if(dig==4||dig==7)
		           { j=j/10;
		               flag=1;
		           }
		            else
		            {
		                flag=0;
		            break;
		            }
		            }
		            if (flag==0){
		                count++;
		        }
		    }System.out.println(count);
		        
		    }
		    else{
		          System.out.println(0);
		    }
		}
	}
}
