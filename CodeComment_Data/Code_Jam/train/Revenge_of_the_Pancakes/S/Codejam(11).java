package methodEmbedding.Revenge_of_the_Pancakes.S.LYD344;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.*;
import java.io.*;

class Codejam
{
	public static void main (String[] args) {
		try
		{

	File f=new File("B-small-attempt0.in");
	FileReader fr=new FileReader(f);
	BufferedReader r=new BufferedReader(fr);
	
	File f1=new File("outputB.txt");
	FileWriter fw=new FileWriter(f1);
	BufferedWriter w=new BufferedWriter(fw);
	//t=r.readLine();
	int t,n,k=1;
	t=Integer.parseInt(r.readLine());
	while(t>0)
	{
		LinkedList<Character> l=new LinkedList<Character>();
		String s=r.readLine();
		char ch[]=new char[s.length()];
		int c=0;
		ch=s.toCharArray();
		n=ch.length;
		for(int i=0;i<n;i++)
			l.addLast(ch[i]);
		for(int i=0;i<n;i++){
		if(l.getLast().equals('+'))
			l.removeLast();
		else if(l.getLast().equals('-'))
		{
			c++;
			l.removeLast();
			for(int j=0;j<l.size();j++)
			{
				char q=l.getFirst();
				l.removeFirst();
				if(q=='+')
					l.addLast('-');
				else if(q=='-')
					l.addLast('+');
			}
		}
		}
		w.write("Case #"+k+": "+c);
		w.newLine();
		//System.out.println("Case #"+k+": "+c);
		
		k++;
		t--;
	}
	r.close();
w.close();
}catch(Exception e){}

}
}
