package methodEmbedding.Counting_Sheep.S.LYD1642;

import java.util.*;
import java.io.*;
public class Main
{
	public static void main (String[] args) {
		try
		{

	File f=new File("A-small-attempt0.in");
	FileReader fr=new FileReader(f);
	BufferedReader r=new BufferedReader(fr);

	File f1=new File("ans.txt");
	FileWriter fw=new FileWriter(f1);
	BufferedWriter w=new BufferedWriter(fw);


	long n,l,i,d,k=0;
	int t,j=1;
	t=Integer.parseInt(r.readLine());
	while(t>0)
	{
		i=1;
		TreeSet <Long>ts=new TreeSet<Long>();
		n=Integer.parseInt(r.readLine());
		
		if(n==0)
			{
				w.write("Case #"+j+": INSOMNIA");
				w.newLine();
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
				d=l%10;
				ts.add(d);
				l=l/10;
					}
			i++;
		}
		w.write("Case #"+j+": "+k);
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
