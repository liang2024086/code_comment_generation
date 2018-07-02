package methodEmbedding.Magic_Trick.S.LYD1115;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class magic {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("output.txt", "UTF-8");
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt1.in"));
		
		int cases = Integer.parseInt(in.readLine());
		
		int first=0, second=0, check = 0, card = 0;
		int[][] first_arr = new int [4][4];
		int[][] second_arr = new int [4][4];
		String temp[];
		for(int i=0;i<cases;i++)
		{
			//first arrangement
			first = Integer.parseInt(in.readLine()) - 1;
			
			for(int j=0; j<4; j++)
			{ 
				String s = in.readLine();
				temp = s.split(" ");
				
				for(int k=0; k<4; k++)
				first_arr[j][k] = Integer.parseInt(temp[k]);
			}
			
//			for(int j=0; j<4; j++)
//			{ 
//				for(int k=0; k<4; k++)
//					pw.print(first_arr[j][k] + " ");
//				
//				pw.println();
//			}
			
			//Second Arrangement
			second = Integer.parseInt(in.readLine()) - 1;
			
			for(int j=0; j<4; j++)
			{ 
				String s = in.readLine();
				temp = s.split(" ");
				
				for(int k=0; k<4; k++)
				second_arr[j][k] = Integer.parseInt(temp[k]);
			}
			
//			for(int j=0; j<4; j++)
//			{ 
//				for(int k=0; k<4; k++)
//					pw.print(second_arr[j][k] + " ");
//				
//				pw.println();
//			}
			
			for(int j=0; j<4; j++)
			{
				for(int k=0; k<4; k++)
				{ 
//					pw.println(first_arr[first][j] + "==" + second_arr[second][k]);
					if(first_arr[first][j] == second_arr[second][k])
					{
						check++;
						card = first_arr[first][j];
					}
				}
			}
			
			pw.print("Case #" + (i+1) + ":");
			
			if(check == 0)
			{
				pw.println(" Volunteer cheated!");
			}
			else if(check == 1)
			{
				pw.println(" "+card);
			}
			else
			{
				pw.println(" Bad magician!");
			}
			
			check = 0;
		}
		
		pw.close() ;
	}

}
