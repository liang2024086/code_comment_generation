package methodEmbedding.Magic_Trick.S.LYD591;

import java.io.*;
public class magic_trick {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new FileReader("D:\\eclipse_pro\\Code_Jam\\src\\A-small-attempt4.in"));
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		 
	 
		String line=null;
		String [] splits=null;
		int j=0;
		int num=Integer.valueOf(reader.readLine());
		System.out.println(num);
		for(int k=1;k<=num;k++)
		{
			
		int[][] arrange_1=new int[4][4];
		int[][] arrange_2=new int[4][4];
		int a1=Integer.valueOf(reader.readLine());
		a1--;
		for (int i=0;i<4;i++)
		{
			line=reader.readLine();
			splits=line.split("\\s");
			j=0;
			for(String sp:splits)
			{   
				
				int temp=Integer.valueOf(sp);
				arrange_1[i][j]=temp;
				j++;
			}
			
		}
		int a2=Integer.valueOf(reader.readLine());
		a2--;
		j=0;
		splits=null;
		for (int i=0;i<4;i++)
		{
			line=reader.readLine();
			splits=line.split("\\s");
			j=0;
			for(String sp:splits)
			{
				int temp=Integer.valueOf(sp);
				arrange_2[i][j]=temp;
				j++;
			}
			
		}
		int count=0;
		int col=0;
		    
		    for(int i=0;i<4;i++)
		    {
			for(int q=0;q<4;q++)
			{
				if(arrange_1[a1][i]==arrange_2[a2][q])
				{
					count++;
					col=q;
				}
			}
		    }
		     
		 if(count==0)
		 {
			 writer.println("Case #"+k+": Volunteer cheated!");
			 System.out.println("Case #3: Volunteer cheated!");
		 }
		 if(count==1)
		 {
			 writer.println("Case #"+k+": "+arrange_2[a2][col]);
			 System.out.println("Case #1: "+arrange_2[a2][col]);
		 }
		 if(count>1)
		 {
			 writer.println("Case #"+k+": Bad magician!");
			 System.out.println("Case #2: Bad magician!");
		 }
		
		
		
	}
		writer.close();

}
}
