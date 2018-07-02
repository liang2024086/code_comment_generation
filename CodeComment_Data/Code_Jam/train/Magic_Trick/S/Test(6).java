package methodEmbedding.Magic_Trick.S.LYD438;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test {
	private static BufferedReader bufferedReader;

	public static void main(String[] args)
	{
		File file = new File("D:/contest/A-small-attempt2.in");
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
//			while(true)
//			{
//				String text = bufferedReader.readLine();
//				if (text == null)break;;
//				System.out.println(text);
//			}
			int T = Integer.parseInt(bufferedReader.readLine());
//			int T = 0;
//			System.out.println(T);
			int[][] arraysA = new int[5][5];
			int[][] arraysB = new int[5][5];
			int answerA, answerB;
			for (int i = 1; i <= T; i++)
			{
				answerA = Integer.parseInt(bufferedReader.readLine());
//				System.out.println(answerA);
				for (int p = 1; p <= 4; p++)
				{
					String[] rowElement = bufferedReader.readLine().split(" ");
					for (int q = 1; q <= 4; q++)
					{
						arraysA[p][q] = Integer.parseInt(rowElement[q-1]);
//						System.out.printf("%d\t", arraysA[p][q]);
					}
//					System.out.println();
				}
				
				answerB = Integer.parseInt(bufferedReader.readLine());
//				System.out.println(answerB);
				for (int p = 1; p <= 4; p++)
				{
					String[] rowElement = bufferedReader.readLine().split(" ");
					for (int q = 1; q <= 4; q++)
					{
						arraysB[p][q] = Integer.parseInt(rowElement[q-1]);
//						System.out.printf("%d\t", arraysB[p][q]);
					}
//					System.out.println();
				}
				
				List<Integer> results = new ArrayList<Integer>();
				for (int p = 1; p <= 4; p++)
				{
					boolean exist = false;
					for (int q = 1; q <= 4; q++)
					{
						if (arraysA[answerA][p] == arraysB[answerB][q])
							exist = true;
					}
					if (exist)
						results.add(arraysA[answerA][p]);
				}
				
				if (results.isEmpty())
				{
					System.out.println("Case #" + i + ": " + "Volunteer cheated!");
				}
				else if (results.size() > 1)
				{
					System.out.println("Case #" + i + ": " + "Bad magician!");
				}
				else
				{
					System.out.println("Case #" + i +": " + results.get(0));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
