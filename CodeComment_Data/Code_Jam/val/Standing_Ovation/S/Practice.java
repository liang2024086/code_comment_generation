package methodEmbedding.Standing_Ovation.S.LYD1694;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//"C:\Users\Shrinath\Desktop\tmp\A-small-practice.in"

public class Practice {

	public static void main(String args[])
	{

		List<Integer> number = new ArrayList<Integer>();
		try {
			Scanner filescaner = new Scanner(new File("C:\\Users\\Shrinath\\Desktop\\tmp\\A-small-attempt3.in"));
			/*
			for (String line : Files.readAllLines(Paths.get("C:\\Users\\Shrinath\\Desktop\\tmp\\newData.in"))) {
			    for (String part : line.split("\\s+")) {
			        Integer i = Integer.valueOf(part);
			        number.add(i);
			    }
			}
			 */
			//	*/
			while(filescaner.hasNextInt())
			{

				number.add(filescaner.nextInt());

			}

			//		*/
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(number.toString());


		//WriteFile data = new WriteFile("C:\\Users\\Shrinath\\Desktop\\output.in" ,true);


		try{
			
			// create FileWriter object to create file, contains file path and name, true is for appending value
			// if file is not present it will create file & if it is false then data will overwirte
			FileWriter write = new FileWriter("C:\\Users\\Shrinath\\Desktop\\output.in" ,true);
			
			
			// It is to write file
			PrintWriter print_line = new PrintWriter(write);
			//print_line.printf("%s"+"%n", "this is not jock");
			
			// store how many nuber of test cases present
			int n = number.get(0);
			int y =0;
			int k=1;
			
			//loop runs for n times
			for(int i =1; i<=2*n;i++)
			{
				y=0; // required output, contains number of friends required to call
				
				int si = number.get(i); // maximum shy number
				String str = number.get(i+1).toString(); // audiance number

				System.out.println("si = "+ si +" string ==  "+ str);

				
				if(si+1 == str.length())
				{
					int temp=Character.getNumericValue(str.charAt(0));

					System.out.println("temp = "+temp);

					for(int j=1;j<str.length();j++)
					{
						int ch = Character.getNumericValue(str.charAt(j));
						if(ch!=0 && temp< j)
						{
							y = y + j-temp;
							temp = temp +y;
						}

						temp = temp+ch;
						System.out.println("temp = "+temp+ "  y = "+ y);

					}
				}

				else{

					int temp=0;
					int l = si+1 - str.length();
					for(int j=0;j<str.length();j++)
					{
						int ch = Character.getNumericValue(str.charAt(j));
						if(ch!=0 && temp< j+l)
						{
							y = y + j+l - temp;
							temp = temp + y;
						}

						temp = temp + ch;
						System.out.println("temp = "+temp+ "  y = "+ y);

					}


				}

				System.out.println("case #"+k+ " y =  "+ y);

				// write data into file by using print_line object
				print_line.printf("%s"+"%n","Case #"+k+": "+ y);

				k++;
				i++;

				System.out.println("----------------------------------------------------");
				System.out.println();

			}
			
			print_line.close();

		}catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
