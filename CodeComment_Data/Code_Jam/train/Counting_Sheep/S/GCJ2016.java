package methodEmbedding.Counting_Sheep.S.LYD1031;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.stream.IntStream;

public class GCJ2016
{

	public static void main(String[] args)
	{
		try (BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in")))
		{
			int cases = Integer.parseInt(br.readLine());
			try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt")))
			{
				for (int c = 1; c <= cases; c++)
				{
					int N = Integer.parseInt(br.readLine());
					if (N == 0)
					{
						writer.write("Case #" + c + ": INSOMNIA");
						writer.newLine();
						continue;
					}
					int foundDigits[] = new int[10];
					int checkNumber = N;
					while (checkNumber > 0)
					{
						foundDigits[checkNumber % 10] = 1;
						if (IntStream.of(foundDigits).parallel().sum() == 10)
						{
							break;
						}
						checkNumber = checkNumber / 10;
					}
					int sumOfDigits = IntStream.of(foundDigits).parallel().sum();
					if (sumOfDigits == 10)
					{
						writer.write("Case #" + c + ": " + N);
						writer.newLine();
						continue;
					} else if (sumOfDigits == 1)
					{
						if (foundDigits[1] == 1)
						{
							writer.write("Case #" + c + ": " + 10 * N);
							writer.newLine();
							continue;
						} else if (foundDigits[2] == 1)
						{
							if (N == 2)
							{
								writer.write("Case #" + c + ": " + 45 * N);
							} else
							{
								writer.write("Case #" + c + ": " + 9 * N);
							}
							writer.newLine();
							continue;
						} else if (foundDigits[3] == 1)
						{
							writer.write("Case #" + c + ": " + 10 * N);
							writer.newLine();
							continue;
						} else if (foundDigits[4] == 1)
						{
							if (N == 4)
							{
								writer.write("Case #" + c + ": " + 23 * N);
							} else
							{
								writer.write("Case #" + c + ": " + 9 * N);
							}
							writer.newLine();
							continue;
						} else if (foundDigits[5] == 1)
						{
							if (N == 5)
							{
								writer.write("Case #" + c + ": " + 18 * N);
							} else
							{
								writer.write("Case #" + c + ": " + 9 * N);
							}
							writer.newLine();
							continue;
						} else if (foundDigits[6] == 1)
						{
							if (N == 6)
							{
								writer.write("Case #" + c + ": " + 15 * N);
							} else
							{
								writer.write("Case #" + c + ": " + 11 * N);
							}
							writer.newLine();
							continue;
						} else if (foundDigits[7] == 1)
						{
							if (N == 7)
							{
								writer.write("Case #" + c + ": " + 10 * N);
							} else
							{
								writer.write("Case #" + c + ": " + 7 * N);
							}
							writer.newLine();
							continue;
						} else if (foundDigits[8] == 1)
						{
							if (N == 8)
							{
								writer.write("Case #" + c + ": " + 12 * N);
							} else
							{
								writer.write("Case #" + c + ": " + 9 * N);
							}
							writer.newLine();
							continue;
						} else if (foundDigits[9] == 1)
						{
							writer.write("Case #" + c + ": " + 10 * N);
							writer.newLine();
							continue;
						}
					}

					int i = 1;
					boolean finished = false;
					HashSet<Integer> set = new HashSet<Integer>();
					while (true)
					{
						int number = i * N;
						while (number > 0)
						{
							int digit = number % 10;
							set.add(new Integer(digit));
							if (set.size() == 10)
							{
								finished = true;
								break;
							}
							number = number / 10;
						}
						if (finished)
						{
							writer.write("Case #" + c + ": " + i * N);
							writer.newLine();
							break;
						}
						i++;
					}
					if (!finished)
					{
						writer.write("Case #" + c + ": INSOMNIA");
						writer.newLine();
					}
				}
			}
		} catch (FileNotFoundException e)
		{
			System.out.println("Error!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Error!");
			e.printStackTrace();
		}
	}
}

// StringTokenizer LX = new StringTokenizer(br.readLine());
// if (LX.countTokens() != 2) {
// System.out.println("Error in Case #" + c + " Tokenizer!");
// }
// int L = Integer.parseInt(LX.nextToken());
// int X = Integer.parseInt(LX.nextToken());
// String input = br.readLine();
// if (L != input.length()) {
// System.out.println("Error in Case #: Wrong number of chars!");
// }
// String tmp = input;
// for (int i = 1; i < X; i++) {
// input = input + tmp;
// }
// if (tmp.equals("kkj") || tmp.equals("jji"))
// {
// writer.write("Case #" + c + ": NO");
// System.out.println("Case #" + c + ": NO ");
// }
