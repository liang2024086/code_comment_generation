package methodEmbedding.Magic_Trick.S.LYD981;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class mainclass {

	public static void main(String[] args) {
		int testcases, skip;
		int caseno=1;
		int numlines = 4;
		Set<Integer> solution1 = new HashSet<Integer>();
		Set<Integer> solution2 = new HashSet<Integer>();
		// The name of the file to open.
		String fileName = "A-small-attempt0.in";
		String fstring="";

		// This will reference one line at a time
		String line = null;

		try {
			// FileReader reads text files in the default encoding.
			//FileReader fileReader = new FileReader(fileName);

			// Always wrap FileReader in BufferedReader.
			//BufferedReader bufferedReader = new BufferedReader(fileReader);
			Scanner scan=new Scanner(new File("A-small-attempt0.in"));
			testcases = scan.nextInt();
			for (int g = 0; g < testcases; g++) {
				solution1.clear();
				solution2.clear();
				skip = scan.nextInt()-1;
				for (int i = 0; i < skip; i++) {
					for(int z=0;z<4;z++)
					{
						int k=scan.nextInt();
					}
				}
				
				solution1.add(scan.nextInt());
				solution1.add(scan.nextInt());
				solution1.add(scan.nextInt());
				solution1.add(scan.nextInt());
			
				for (int i = 0; i < (4 - (skip+1)); i++) {
					for(int z=0;z<4;z++)
					{
						int k=scan.nextInt();
					}
				}
				skip = scan.nextInt()-1;
				
				for (int i = 0; i < skip; i++) {
					for(int z=0;z<4;z++)
					{
						int k=scan.nextInt();
					}
				}
				solution2.add(scan.nextInt());
				solution2.add(scan.nextInt());
				solution2.add(scan.nextInt());
				solution2.add(scan.nextInt());
			
				for (int i = 0; i < (4 - (skip+1)); i++) {
					for(int z=0;z<4;z++)
					{
						int k=scan.nextInt();
						
					}
				}
				solution1.retainAll(solution2);
				if(solution1.size()>1)
					fstring+="Case #" + caseno + ": Bad magician! \n";
				else if(solution1.size()==0)
					fstring+="Case #" + caseno + ": Volunteer cheated!\n";
				else
				{
					Iterator ite = solution1.iterator();
					fstring+="Case #" + caseno + ": " + ite.next() + "\n";
					
				}
				caseno++;
				
			}
			
			try {
		        BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
		            
		                out.write(fstring);
		            
		            out.close();
		        } catch (IOException e) {}
			
			// Always close files.
			scan.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}
	}

}
