package methodEmbedding.Magic_Trick.S.LYD1748;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class A {

	public static void main(String[] args) throws IOException {

		int lineCount = 0;
		int testCases = 0;
		int runs = 1;
		int firstRow;
		int secondRow;

		int[][] arrangement = new int[4][4];
		int[][] arrangement2 = new int[4][4];
		int[] possibleRowCards = new int[4];
		int[] possibleRowCards2 = new int[4];
		
		Scanner file = null;

		
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		try {
			file = new Scanner(br);
			while(file.hasNextLine())
			{
				if(lineCount == 0)
				{
					testCases = file.nextInt();
					lineCount++;
				}
				else
				{

					while(runs-1 < testCases)
					{
						int matchesFound = 0;
						int match = 0;

						if(testCases >= 1 && testCases <= 100)
						{
							firstRow = file.nextInt();

							if(firstRow >=1 && firstRow <= 4)
							{
								Scanner ca = null;
								String line = file.nextLine();
								//for(int a = 0; a < 4; a++)
								//{
									
									
									//System.out.println(ca.next());

									for(int i = 0; i < 4; i++)
									{
										ca = new Scanner(file.nextLine());

										for(int z = 0; z < 4; z++)
										{
											
											int card = ca.nextInt();
											//System.out.println(card);

											arrangement[i][z] = card;
											if(i == firstRow-1)
											{
												possibleRowCards[z] = card;
	
											}
										}
									}
									
								//}
	
								ca.close();
							}
							
							secondRow = file.nextInt();
							if(secondRow >= 1 && secondRow <= 4)
							{
								Scanner ca2 = null;
								String line = file.nextLine();
								//for(int b = 0; b < 4; b++)
								//{
									

									for(int i = 0; i < 4; i++)
									{
										ca2 = new Scanner(file.nextLine());

										for(int z = 0; z < 4; z++)
										{
											int card = ca2.nextInt();
											arrangement2[i][z] = card;
											if(i == secondRow-1)
											{
												possibleRowCards2[z] = card;
											}
										}
									}
									ca2.close();
								//}
	
							}
	
							for(int v = 0; v < possibleRowCards.length; v++)
							{
								for(int b = 0; b < possibleRowCards2.length; b++)
								{
									if(possibleRowCards2[b] == possibleRowCards[v])
									{
										matchesFound++;
										match = possibleRowCards2[b];
									}
								}
							}
	
							System.out.print("Case #" + runs + ": ");
							if(matchesFound == 1)
								System.out.println(match);
							if(matchesFound > 1)
								System.out.println("Bad magician!");
							if(matchesFound == 0)
								System.out.println("Volunteer cheated!");
							
							runs++;
						}
					}
				}
			}

		} finally {
			br.close();
			file.close();
		}

	
	}
}
