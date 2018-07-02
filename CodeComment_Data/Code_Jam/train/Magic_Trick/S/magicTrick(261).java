package methodEmbedding.Magic_Trick.S.LYD17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



public class magicTrick {
	 public static String[][] initialCards= new String[4][4];
	
	public static void main(String args[]){
		
		String newLine = System.getProperty("line.separator");
		File file = new File("C:\\Users\\Brahma\\Downloads\\A-small-attempt8.in");
		Scanner input;
		try {
			input = new Scanner(file);
			PrintWriter f0 = new PrintWriter(new FileWriter("output.out"));
//			f0.println("Case #1:");

		int testCases= Integer.parseInt(input.nextLine());
		if(testCases>0 && testCases<=100){
			
			
			for(int i=1;i<=testCases;i++){

				int initialRow=Integer.parseInt(input.nextLine());

				for(int j=0;j<4;j++){
					String arrayLine= input.nextLine();
					initialCards[j]= arrayLine.split(" ");
				}
				

			int checkRow= Integer.parseInt(input.nextLine());
			String[] row=initialCards[initialRow-1];

			String result = null;
			for(int j=0;j<4;j++){
				int check=0;
				String arrayLine= input.nextLine();
				if(j==(checkRow-1)){
					String[] array=arrayLine.split(" ");
					for(int k=0;k<4;k++){
				if(array[k].equals(row[0])){
					check++;
					result=row[0];
				}
				if(array[k].equals(row[1])){
					check++;
					result=row[1];
				}
				if(array[k].equals(row[2])){
					check++;
					result=row[2];
				}
				if(array[k].equals(row[3])){
					check++;
					result=row[3];
				}
					}
				result= ": "+result;
				if(check==0)
					result=": Volunteer cheated!";
				if(check>1)
					result=": Bad magician!";
				
				}
				
				
				
			}
			System.out.println(result);
			f0.println("Case #"+ i+result);
			
			}
			
		}
		f0.close();	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
