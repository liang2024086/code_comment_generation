package methodEmbedding.Magic_Trick.S.LYD2209;

import java.util.*;
import java.io.*;

public class Magician
{
		public static void main(String[] args)
		{
				try
				{
						BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));				
						int numCases = Integer.parseInt(br.readLine());
						String line; //Now at second

				for (int i = 0; i<numCases; i++)
				{
						int c1= Integer.parseInt(br.readLine());
						String row1 = br.readLine();
						String row2 = br.readLine();
						String row3 = br.readLine();
						String row4 = br.readLine();

						String [] first;

						if(c1 == 1)
								first = row1.split(" ");
						else if (c1==2)
								first = row2.split(" ");
						else if (c1==3)
								first = row3.split(" ");
						else
								first = row4.split(" ");

						int c2= Integer.parseInt(br.readLine());
						row1 = br.readLine();
						row2 = br.readLine();
						row3 = br.readLine();
						row4 = br.readLine();

						String[] second;

						if(c2 == 1)
								second = row1.split(" ");
						else if (c2==2)
								second = row2.split(" ");
						else if (c2==3)
								second = row3.split(" ");
						else
								second = row4.split(" ");
						
						String[] results;
						int count = 0;
						String winner=""; 

						for (int x = 0; x < first.length; x++)
						{
								for (int y = 0; y < second.length; y++)
								{
										if (first[x].equals(second[y]))
										{
												count++;
												winner = first[x];
						//						System.out.println("Got one:" + first[x]);
						//						System.out.println("winner now is "+winner);
										}
								}
						}

						String badMagic = "Bad magician!";
						String cheater = "Volunteer cheated!";
						// System.out.println("Count is "+count);
						String finalResult = "Case #"+(i+1)+": ";
						if(count == 0)
								finalResult = finalResult.concat(cheater);
						else if(count >1)
								finalResult = finalResult.concat(badMagic);
						else
								finalResult = finalResult.concat(winner);
						
						System.out.println(finalResult);
						
				} //End for
		}
		catch(Exception x)
		{
				
		}
		}
}
