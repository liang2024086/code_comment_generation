package methodEmbedding.Magic_Trick.S.LYD1677;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MagicTrick {


	public static void main(String[] args) {
		BufferedReader in;
		
		
		try {
			FileWriter fstream = new FileWriter("out.out");
			  BufferedWriter out = new BufferedWriter(fstream);
			  
			in = new BufferedReader(new FileReader("A-small-attempt1.in"));

			int noOfTests = Integer.parseInt(in.readLine());

			for(int i=0;i<noOfTests;i++)
			{
				List<String> elements = new ArrayList<String>();
				int row1 = Integer.parseInt(in.readLine());
				for(int j=0;j<4;j++)
				{
					if(row1 == j+1)
					{
						String str = in.readLine();
						StringTokenizer tokenizer = new StringTokenizer(str, " ");

						elements.add(tokenizer.nextToken());
						elements.add(tokenizer.nextToken());
						elements.add(tokenizer.nextToken());
						elements.add(tokenizer.nextToken());
					}
					else
						in.readLine();
				}
				int row2 = Integer.parseInt(in.readLine());
				int count=0;
				String cardNumber="";
				for(int j=0;j<4;j++)
				{
					if(row2 == j+1)
					{
						String str = in.readLine();
						StringTokenizer tokenizer = new StringTokenizer(str, " ");
						for(int k=0;k<4;k++)
						{
							String e = tokenizer.nextToken();
							if(elements.contains(e))
							{
								count++;
								cardNumber = e; 
							}

						}
						if(count==1)
						{
							out.write("Case #"+(i+1)+": "+cardNumber+"\n");
							//System.out.println("Case #"+(i+1)+": "+cardNumber);
						}	
						else if(count > 1 )
							out.write("Case #"+(i+1)+": Bad magician!\n");
						else if(count == 0)
							out.write("Case #"+(i+1)+": Volunteer cheated!\n");

					}
					else
						in.readLine();
				}
			}
			in.close();
			out.close();
		}
		catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
