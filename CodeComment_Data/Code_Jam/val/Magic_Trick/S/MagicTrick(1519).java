package methodEmbedding.Magic_Trick.S.LYD1960;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class MagicTrick {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader is = new BufferedReader(new FileReader("p1a.in"));
		BufferedWriter os = new BufferedWriter(new FileWriter("p1.out"));
		int n= Integer.parseInt(is.readLine());
		StringTokenizer st; 
		int c1,c2;
		Set<Integer> a1 = new TreeSet<Integer>();
		Set<Integer> a2 = new TreeSet<Integer>();
		//TreeSet<Integer> a3 = new TreeSet<Integer>();
		for(int i =0; i < n; i++)
		{
			a1 =new TreeSet<Integer>();
			a2 =new TreeSet<Integer>();
			c1 = Integer.parseInt(is.readLine());
			
			for(int j  = 0; j <4; j++)
			{
				st = new StringTokenizer(is.readLine());
				for(int k = 0; k < 4; k++)
				{
					if(j == c1-1)
					{
						a1.add(new Integer(st.nextToken()));
					}
					else
					{
						break;
					}
				}
			}
			c2 = Integer.parseInt(is.readLine());
			
			for(int j  = 0; j <4; j++)
			{
				st = new StringTokenizer(is.readLine());
				for(int k = 0; k < 4; k++)
				{
					if(j == c2-1)
					{
						a2.add(new Integer(st.nextToken()));
					}
					else
					{
						break;
					}
				}
			}
			
			a1.retainAll(a2);
			//System.out.println(a1.size());
			
			if(a1.size() == 1)
			{
				Integer[] a = new Integer[1]; 
				a1.toArray(a);
				System.out.println("Case #"+(i+1)+": "+a[0]);
				os.write("Case #"+(i+1)+": "+a[0]+"\n");
			}
			else if(a1.size() == 0)
			{
				String s = "Volunteer cheated!";
				System.out.println("Case #"+(i+1)+": "+s);
				os.write("Case #"+(i+1)+": "+s+"\n");
			}
			else if(a1.size() >1)
			{
				String s = "Bad magician!";
				System.out.println("Case #"+(i+1)+": "+s);
				os.write("Case #"+(i+1)+": "+s+"\n");
			}
			
			
		}
		
		is.close();
		os.close();
		

	}

}
