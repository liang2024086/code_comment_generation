package methodEmbedding.Magic_Trick.S.LYD516;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class main 
{

	private static Scanner s;
	
	public static void main(String[] args) throws Exception
	{
		s=new Scanner(new File("input.in"));
		BufferedWriter w = new BufferedWriter( new FileWriter( new File("output.out")));
		
		int n_case;
		int f_mat [] [] = new int[4][4];
		int s_mat [] [] = new int[4][4];
		n_case = s.nextInt();
		for(int i =0;i<n_case;i++)
		{
			int f_ans,s_ans;
			f_ans = s.nextInt();
			for(int j=0;j<4;j++)
			{
				for(int k =0;k<4;k++)
				{
					f_mat[j][k] = s.nextInt();
				}
			}
			s_ans = s.nextInt();
			for(int j=0;j<4;j++)
			{
				for(int k =0;k<4;k++)
				{
					s_mat[j][k] = s.nextInt();
				}
			}
			int cont = 0, ris=-1;
			f_ans--;
			s_ans--;
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					if(f_mat[f_ans][j] == s_mat[s_ans][k])
					{
						cont++;
						ris=f_mat[f_ans][j];
					} 
				}
			}
			
			if(cont>1)
			{
				w.write("Case #"+(i+1)+": Bad magician!\n");
			}
			else
			{
				if(ris==-1)
				{
					w.write("Case #"+(i+1)+": Volunteer cheated!\n");
				}
				else
				{
					w.write("Case #"+(i+1)+": "+ris+"\n");
				}
			}
		}
		w.close();

	}

}
