package methodEmbedding.Counting_Sheep.S.LYD49;

import java.util.*;
import java.io.*;
class Manav
{
	public static void main(String...s) throws IOException
	{
		int t,n;
	File file=new File("A-small-attempt2.in");
	 File outFile = new File ("output.txt");
    FileWriter fWriter = new FileWriter (outFile);
    PrintWriter pWriter = new PrintWriter (fWriter);
  
    
Scanner sc=new Scanner(file);
while(sc.hasNextLine())
{
	String line =sc.nextLine();
	t=Integer.parseInt(line);
	//System.out.println(t);
	for(int i=0;i<t;i++)
	{
		//System.out.println("FOR CASE"+ i+1);
	 line =sc.nextLine();
    int m=Integer.parseInt(line);
	//System.out.println(m);
	if(m==0)
    		  pWriter.println ("Case #"+(i+1)+": INSOMNIA");
		  else
		  {
      int count=0,nm=m;
	   int a[]=new int[10];
	   boolean mat=true;
	   for(int tan=1;tan<=10;tan++)
	   {
		   if(a[tan-1]!=tan)
			   mat=false;
	   }
	   while(mat!=true)
	   {
		   int k=nm;
		   int d=10;
		   while(k!=0)
		   {   
			   d=k%10;
			   if(d!=0)
				   a[d-1]=d;
			   if(d==0)
				   a[9]=10;
			   k=k/10;
		   }
		    count++;
		   nm=m*count;
		mat=true;
//System.out.println("");		
		    for(int tan=0;tan<10;tan++)
	   {//System.out.print(a[tan]);
	      if(a[tan]!=tan+1)
		
		{	mat=false;
		}
	   }
	   }
	   nm=m*(count-1);
	  pWriter.println ("Case #"+ (i+1) +": "+nm);
		  }
	}
}pWriter.close();	
	}
}
