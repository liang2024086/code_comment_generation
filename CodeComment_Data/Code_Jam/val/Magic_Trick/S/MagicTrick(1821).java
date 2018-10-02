package methodEmbedding.Magic_Trick.S.LYD290;

import java.io.BufferedReader;
import java.io.FileReader;


public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try
		{
			BufferedReader r = new BufferedReader(new FileReader("D:\\Users\\m.schadd\\Desktop\\in.txt"));
			
			int t = Integer.parseInt(r.readLine());
			
			for (int i=0;i<t;i++)
			{
				int choice = Integer.parseInt(r.readLine());
				String possible1=null;
				for (int j=0;j<4;j++)
				{
					String line = r.readLine();
					if (choice==j+1) possible1=line;
				}
				
				choice = Integer.parseInt(r.readLine());
				String possible2=null;
				for (int j=0;j<4	;j++)
				{
					String line = r.readLine();
					if (choice==j+1) possible2=line;
				}
				
				String[] p1 = possible1.split(" ");
				String[] p2 = possible2.split(" ");
				int nr=4;
				for (int j=0;j<4;j++)
				{
					boolean found = false;
					for (int k=0;k<4;k++)
					{
						if (p1[j].equals(p2[k]))
						{
							found=true;
							break;
						}
					}
					if (!found)
					{
						p1[j]="";
						nr--;
					}
				}
				
				if (nr==0)
					System.out.println("Case #"+(i+1)+": Volunteer cheated!");
				else
				if (nr>1)
					System.out.println("Case #"+(i+1)+": Bad magician!");
				else
				for (int j=0;j<4;j++)
					if (p1[j]!="") System.out.println("Case #"+(i+1)+": "+p1[j]);
			}
		}
		catch (Exception e){e.printStackTrace();}
	}

}
