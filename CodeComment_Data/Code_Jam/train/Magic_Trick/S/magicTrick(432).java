package methodEmbedding.Magic_Trick.S.LYD681;

//Coded By a 15 Year Old

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class magicTrick {
	public static void main(String[] args) throws IOException {
		FileInputStream input =null;
		PrintWriter output =null;

		try {
		
			input=new FileInputStream ("/Users/dhruvramani/Documents/GoogleCS/codejam-commandline-1.2-beta1/source/A-small-attempt0.in");
			output=new PrintWriter (new FileWriter("/Users/dhruvramani/Documents/GoogleCS/codejam-commandline-1.2-beta1/source/B-small.out"));

			
			boolean MatchedOrNot=false;
			
			Scanner scan=new Scanner (input);
			String test=scan.nextLine();
			
			int Location=0;
			
			int t=Integer.parseInt(test);
			
			for (int i=0;i<t;i++)  //Number Of TesCases
			{
				int []ItemsOfString=new int[4];
				
				int [] Array1=new int [4];
				int []Array2=new int [4];

				for (int j=0;j<2;j++)  //Number Of Rows 
				{	
					String FirstIndexString=scan.nextLine();
				
					int FirstIndex=Integer.parseInt(FirstIndexString);
				
					String []rowsString=new String[4];
					for (int q=0;q<4;q++)
					{
						rowsString[q]=scan.nextLine();
					}
				
					String []NumberOfLine=rowsString[FirstIndex-1].split(" ");
					
					for (int m=0;m<4;m++)
					{
						ItemsOfString[m]=Integer.parseInt(NumberOfLine[m]);
					}
					if (j==0)
					{
						for (int d=0;d<4;d++)
						{
							Array1[d]=ItemsOfString[d];
						}
					}
					if (j==1)
					{
						for (int d=0;d<4;d++)
						{
							Array2[d]=ItemsOfString[d];
						}
					}
					int count=0;
					
					if (Array2[0]!=0)
					{
						    boolean keep=true;
							for (int l=0;l<4 && keep==true; l++)
							{
								for (int y=0;y<4 ;y++)
								{
									if (Array1[l]==Array2[y])
									{
											Location=Array1[l];
											count++;
											if (count==2)
												keep=false;

									}
									
							}
						}
						
						if (count==2)
						{
							output.print("Case #");
							output.print(i+1);
							output.print(": ");
							output.print("Bad magician!");
							output.println("");
							Arrays.fill(Array1, 0);
							
						}
						if (count==1)
						{
							output.print("Case #");
							output.print(i+1);
							output.print(": ");
							output.print(Location);
							output.println("");
							Arrays.fill(Array1, 0);
							
						}
						if (count==0)
						{
							output.print("Case #");
							output.print(i+1);
							output.print(": ");
							output.print("Volunteer cheated!");
							output.println("");
							Arrays.fill(Array1, 0);
							
						}
						
					}
					
				}
			}
			
		output.close();
		}catch (FileNotFoundException e) {
        e.printStackTrace();
        
    }

	}
}
