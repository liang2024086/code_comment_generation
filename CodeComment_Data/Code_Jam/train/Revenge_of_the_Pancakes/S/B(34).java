package methodEmbedding.Revenge_of_the_Pancakes.S.LYD799;

import java.util.Scanner;

public class B {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int cases=in.nextInt();
		for(int c=0;c<cases;c++)
		{
			String s= in.next();
			String[] stk=s.split("");
			boolean allup=false;
			int count=0;
			while(allup==false)
			{
				allup=true;
				String chk1="";
				for(int i=0;i<stk.length;i++)
				{
					chk1+=stk[i];
				}
				if(!chk1.contains("-"))
					break;
				int flipsize=0;
				int mismatch=0;
				for(int i=0;i<stk.length-1;i++)
				{
					if(stk[i].equals(stk[i+1]))
					{
						flipsize++;
					}
					else
						break;
				}
				//if(mismatch==0&&stk[0].equals("-"))
				//{
				//	flipsize=stk.length;
				//}
				//else
				//{
				//	flipsize=stk.length-mismatch;
				//}
				//flipsize--;
				String[] nstk=new String[stk.length];
				for(int i=0;i<stk.length;i++)
				{
					if(flipsize-i>=0)
					{
						nstk[i]=stk[flipsize-i];
						if(nstk[i].equals("-"))
							nstk[i]="+";
						else if(nstk[i].equals("+"))
							nstk[i]="-";
					}
					else
						nstk[i]=stk[i];
				}
				
				String chk="";
				for(int i=0;i<nstk.length;i++)
				{
					stk[i]=nstk[i];
					chk+=stk[i];
				}
				if(chk.contains("-"))
				{	
					allup=false;
				}
				count++;
			}
			System.out.println("Case #"+(c+1)+": "+count);
		}
	}
}
