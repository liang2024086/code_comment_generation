package methodEmbedding.Magic_Trick.S.LYD262;

import java.io.*;

public class magic_trick {

	public static void main(String args[])throws IOException
	{
		FileInputStream fstream = new FileInputStream(new File("/home/ankit/workspace/google_code_jam/src/google_code_jam/A-small-attempt1.in"));
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		int TestCase;
		TestCase=Integer.parseInt(br.readLine());
		int case_number=0;

		for(int i=1;i<=TestCase;i++)
		{
			case_number++;			
			int ans1=Integer.parseInt(br.readLine());
			int sel_row1[]=new int[4];
			for(int k=1;k<=4;k++)
			{
				if (k == ans1)
				{
					String s = br.readLine();
					String[] array=s.split(" ");
					sel_row1 = new int[array.length];
					for (int j = 0; j < array.length; j++) 
					{
						sel_row1[j] = Integer.parseInt(array[j]);
					}
				}	
				else
					br.readLine();
			}

			int ans2=Integer.parseInt(br.readLine());
			int sel_row2[]=new int[4];
			for(int k=1;k<=4;k++)
			{
				if (k == ans2)
				{
					String s = br.readLine();
					String[] array=s.split(" ");
					sel_row2 = new int[array.length];
					for (int j = 0; j < array.length; j++) 
					{
						sel_row2[j] = Integer.parseInt(array[j]);
					}
				}	
				else
					br.readLine();
			}

			int match=0;
			int card_number=-1;
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					if(sel_row1[j]==sel_row2[k])
					{
						match++;
						if(match>1)
							break;
						card_number=sel_row1[j];					
					}
				}
			}

			if(match==0)
				System.out.println("Case #"+case_number+": Volunteer cheated!");
			else if (match==1)
			
				System.out.println("Case #"+case_number+": "+card_number);
			else
				System.out.println("Case #"+case_number+": Bad Magician!");

		}
	}
}
