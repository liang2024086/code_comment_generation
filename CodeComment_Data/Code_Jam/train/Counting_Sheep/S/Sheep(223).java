package methodEmbedding.Counting_Sheep.S.LYD862;

import java.util.*;
import java.io.*;
import java.math.*;
class Sheep 
{
	public static void main(String[] args)  throws Exception
	{

		Scanner in = new Scanner(new BufferedReader(new FileReader("A-small.in")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("A-small.out")));
		
		int	 t = in.nextInt();
		
		long cnt=0;

		for (int i = 1; i <= t; i++)
		{
			Set<Integer> s=new HashSet<>();
			for(int j=0;j<=9;j++)
					s.add(j);
			
			String input=in.next();
			if(input.equals("0")){
				out.println("Case #" + i + ": INSOMNIA");
				continue;
			}
			BigInteger bi = new BigInteger("0");
			BigInteger bn = new BigInteger(input);
			while(!s.isEmpty()){
				bi=bi.add(bn);
				
				String str=bi.toString();
				for(int j=0;j<str.length();j++){

					int rem=Integer.parseInt(""+str.charAt(j));
					if(s.contains(rem)){
						s.remove(rem);
						if(s.isEmpty())
							break;
					}
					//System.out.println(s);
				}
			}
			out.println("Case #" + i + ": "+bi);
		}
		out.close();
	}
	
}
