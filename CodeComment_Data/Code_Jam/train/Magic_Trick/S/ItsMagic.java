package methodEmbedding.Magic_Trick.S.LYD224;


import java.io.*;

public class ItsMagic {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("D:\\Input.txt"));	
			int testCases;
			testCases = Integer.parseInt(br.readLine());
			if(testCases< 1 || testCases >100)
			{   
				System.out.println("TestCases not in range 1 to 100");
				System.exit(0);
			}
			for (int i=1;i<=testCases;i++)
			{
				int row1;
				row1 = Integer.parseInt(br.readLine());
				if (row1 < 1 || row1 > 4)
				{
					System.out.println("Answers not in range");
					break;
				}

				int j=1;
				String array1[] =null, array2[] =null;
				while (j<=4)
				{
					if(j==row1)
						array1 = br.readLine().split(" ");
					else 
						br.readLine();
					j++;
				}
				int row2 = Integer.parseInt(br.readLine());    
				if (row2 < 1 || row2 > 4)
				{
					System.out.println("Answers not in range");
					break;
				}

				j=1;
				while (j<=4)
				{
					if(j==row2)
						array2 = br.readLine().split(" ");
					else 
						br.readLine();
					j++;
				}
				String vnumber = null;
				int count = 0;
				//System.out.println("Hello:"+ row1 +" " +array1 + "Row2 " +row2 + " " + array2);
				for (int m =0 ;m<array1.length;m++)
				{
					for(int n=0;n<array2.length;n++)
					{
						if(array1[m].equals(array2[n]) )
						{
							count++;
							vnumber=array1[m];
						}
					}
				}
				switch(count)
				{
				case 0:
					System.out.println("Case #" + i +": Volunteer cheated!" );
					break;
				case 1:
					System.out.println("Case #" + i +": " + vnumber);
					break;
				default:
					System.out.println("Case #" + i +": Bad magician!");


				}

			}
		}	
		catch (FileNotFoundException e)
		{
			e.printStackTrace();

		} catch (NumberFormatException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}


	}
}
