package methodEmbedding.Counting_Sheep.S.LYD19;

import java.util.*;
import java.io.*;
class Counting_Sheep
{
	public static void main (String[] args) {
		try
		{

	File f=new File("A-small-attempt1.in");
	FileReader fr=new FileReader(f);
	BufferedReader r=new BufferedReader(fr);
	
	File f1=new File("output.txt");
	FileWriter fw=new FileWriter(f1);
	BufferedWriter w=new BufferedWriter(fw); 
	
	
	long n,l,i,d,k=0;
	int t,j=1;
	t=Integer.parseInt(r.readLine());
	//System.out.println("t: "+t);
	
	while(t>0)
	{
		i=1;
		TreeSet <Long>ts=new TreeSet<Long>();
		n=Integer.parseInt(r.readLine());
		//System.out.println("n : "+n);
		if(n==0)
			{
				w.write("Case #"+j+": INSOMNIA");
				w.newLine();
			//	System.out.println("Case #"+j+": INSOMNIA");
				j++;
				t--;
				continue;
			}
		
		while(ts.size()!=10)
		{
			
			k=n*i;
			l=k;
			
			while(l!=0)
			{
				//System.out.println("l : "+l);
				d=l%10;
				ts.add(d);
				//System.out.println("Adding "+d+" to treeset");
				l=l/10;
				//System.out.println("newl : "+l);
			}
			i++;
		}
		w.write("Case #"+j+": "+k);
		//System.out.println("Case #"+j+": "+k);
		w.newLine();
		j++;
		t--;
	}
	r.close();
	w.close();
		}
		catch(Exception e){
		}
	}
}
