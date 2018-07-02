package methodEmbedding.Magic_Trick.S.LYD2027;

import java.util.*;
class Jam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long startTime = System.currentTimeMillis();
		Scanner in=new Scanner(System.in);
		
		int testcases=in.nextInt();
		for(int t1=1;t1<=testcases;t1++)
		{	
			HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
			int row=in.nextInt()-1;
			int found=0,match=0;
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					if(i==row)
					{
						hs.put(in.nextInt(), 1);
					}
					else
					{
						in.nextInt();
					}					
				}
			}
			int row2=in.nextInt()-1;
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					if(i==row2)
					{
						int t=in.nextInt();
						if(hs.get(t)!=null)
								{
									found++;
									if(found==1)
									{
										match=t;
									}
								}
					}
					else
					{
						in.nextInt();
					}					
				}
			}
			if(found==0)
			{
				System.out.println("Case #"+t1+": "+"Volunteer cheated!");
			}
			else if(found==1)
			{
				System.out.println("Case #"+t1+": "+ match);
			}
			else
			{
				System.out.println("Case #"+t1+": "+"Bad magician!");
			}
			
		}
		//long endTime = System.currentTimeMillis();
		//System.out.println("Took "+(endTime - startTime) + " ms");
	}

}
