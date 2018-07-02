package methodEmbedding.Magic_Trick.S.LYD1993;

import java.util.*;
import java.io.*;
class CodeJam1
{ public static void main(String args[]) throws Exception
{
   //Scanner in = new Scanner(System.in);
   Scanner inFile = new Scanner(new FileReader("input.txt"));
   int t;
 
  t=inFile.nextInt();
  int p;
  for(p=1;p<=t;p++)
  {
  int ans1=inFile.nextInt();
    int a[]=new int[5];
	int b[]=new int[5];
	int c1,c2,c3,c4,count,temp,ans2,i,j;
	count=0;
	
	temp=0;
    for(i=1;i<=4;i++)
	{ if(i==ans1)
	   { a[1]=inFile.nextInt();
	     a[2]=inFile.nextInt();
		 a[3]=inFile.nextInt();
		 a[4]=inFile.nextInt();
	   }
	   else
	     { c1=inFile.nextInt();
	       c2=inFile.nextInt();
	       c3=inFile.nextInt();
		   c4=inFile.nextInt();
	     }
	   
	}
	
	ans2=inFile.nextInt();
	 for(i=1;i<=4;i++)
	{ if(i==ans2)
	   { b[1]=inFile.nextInt();
	     b[2]=inFile.nextInt();
		 b[3]=inFile.nextInt();
		 b[4]=inFile.nextInt();
	   }
	   else
	     { c1=inFile.nextInt();
	       c2=inFile.nextInt();
	       c3=inFile.nextInt();
		   c4=inFile.nextInt();
	     }
	   
	}
	
	for(i=1;i<=4;i++)
	  {for(j=1;j<=4;j++)
	     {if(a[i]==b[j])
		     {++count;
			 temp=a[i];
			 }
		 }
	  }
	  if(count==0)
	  System.out.println("Case #"+p+": "+"Volunteer cheated!");
	  
	  if(count>1)
	  System.out.println("Case #"+p+": "+"Bad magician!");
	  if(count==1)
	   System.out.println("Case #"+p+": "+temp);
	   //p=p+1;
}
}
}
