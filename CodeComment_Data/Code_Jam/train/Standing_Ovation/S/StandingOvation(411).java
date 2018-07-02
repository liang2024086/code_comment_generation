package methodEmbedding.Standing_Ovation.S.LYD1191;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StandingOvation  {

		static BufferedReader reader;
		static BufferedWriter writer;
		static Scanner scan;
		
	public static void main(String[] args) throws IOException {
		
		File inputFile= new File("A-small-attempt0.in");
		File outputFile= new File("Output.out");
		
		FileReader inputReader= new FileReader(inputFile);
		FileWriter outputWriter = new FileWriter(outputFile);
		
		reader = new BufferedReader(inputReader);
		writer = new BufferedWriter(outputWriter);
		
			short T= (short) Integer.parseInt(reader.readLine());
																				
																		
			
			for ( int test=1; test<=T ; test++ ){
				scan= new Scanner(reader.readLine());
				byte SMax= scan.nextByte();
																			
				String stmt = scan.next();
																			
				int req=0;
				int total=0;
				
				total+= stmt.charAt(0)- '0';
				
				for (int Sness =1; Sness<=SMax; Sness++){
					
					if (Sness > (total + req)){                      //if there are not enough people to excite  the shy one 
						req += Sness - (total + req);
					}
					
					total += stmt.charAt(Sness)- '0';	
				}
				
				writer.write("Case #"+test+": " + req);
				
				writer.newLine();
			}
			writer.close();
			reader.close();
			scan.close();
		}
			
}
