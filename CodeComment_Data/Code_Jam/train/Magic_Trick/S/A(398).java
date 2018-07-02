package methodEmbedding.Magic_Trick.S.LYD728;

	import java.util.*;
	import java.io.*;
	
	public class A//Magic Trick
	{
		public static void main(String[] args) throws IOException
		{
			Scanner sc = new Scanner(new File("A-small-attempt0.in"));
			System.setOut(new PrintStream(new FileOutputStream("outputA.out")));
			
			int T = sc.nextInt();
			
			for(int t=1; t<=T; t++)
			{
				int v1=sc.nextInt();
				ArrayList<ArrayList<Integer>> g1=new ArrayList<ArrayList<Integer>>(4);
				for(int r=0;r<4;r++)
				{
					g1.add(new ArrayList<Integer>());
					for(int c=0;c<4;c++)
						g1.get(r).add(sc.nextInt());
				}
				
				int v2=sc.nextInt();
				ArrayList<ArrayList<Integer>> g2=new ArrayList<ArrayList<Integer>>(4);
				for(int r=0;r<4;r++)
				{
					g2.add(new ArrayList<Integer>());
					for(int c=0;c<4;c++)
						g2.get(r).add(sc.nextInt());
				}
				
				ArrayList<Integer> r1=g1.get(v1-1);
				ArrayList<Integer> r2=g2.get(v2-1);
				
				Set<Integer> s=new HashSet<Integer>(r1);
				s.retainAll(r2);
				
				if(s.size()==0)
					System.out.format("Case #%d: Volunteer cheated!\n",t);
				else if(s.size()>1)
					System.out.format("Case #%d: Bad magician!\n",t);
				else
				{
					for(int i : s)
					{
						System.out.format("Case #%d: %d\n",t,i);
						break;
					}
				}
				
				
			}	
		}
	}
