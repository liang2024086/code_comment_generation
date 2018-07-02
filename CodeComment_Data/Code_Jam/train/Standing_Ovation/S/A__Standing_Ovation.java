package methodEmbedding.Standing_Ovation.S.LYD2068;

public class A__Standing_Ovation
{
	public static void main(String[] args)
	{
		java.util.Scanner in = new java.util.Scanner(System.in);
		for(int T = in.nextInt(),caseCount=1;T>0;T--,caseCount++)
		{
			int Smax = in.nextInt(), extra = 0;
			String s = in.next();
			for(int i=0,total=0;i<=Smax;i++)
			{
				int Sk = Integer.parseInt(""+s.charAt(i));
				if(total+extra < i && Sk > 0)
					extra += i-(total+extra);
				total += Sk;
			}
			System.out.println("Case #"+(caseCount)+": "+extra);
		}
	}
}
