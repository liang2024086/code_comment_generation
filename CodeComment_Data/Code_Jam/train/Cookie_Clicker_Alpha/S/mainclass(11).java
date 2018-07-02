package methodEmbedding.Cookie_Clicker_Alpha.S.LYD607;

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
		int testcases;
		int caseno=0;
		// The name of the file to open.
		String fileName = "B-small-attempt0.in";
		String fstring="";


		try {
			// FileReader reads text files in the default encoding.
			//FileReader fileReader = new FileReader(fileName);

			// Always wrap FileReader in BufferedReader.
			//BufferedReader bufferedReader = new BufferedReader(fileReader);
			Scanner scan=new Scanner(new File("B-small-attempt0.in"));
			testcases = scan.nextInt();
			for (int g = 0; g < testcases; g++) {
				 double c=scan.nextDouble();
				 double f=scan.nextDouble();
				 double x=scan.nextDouble();
				 
				 double fcur=2.0;
				 double fnum=0;
				 double fpot;
				 double tcur=0;
				 double tpot;
				 double runtimeoffset=0;
				 boolean potflag=true;
				 while(potflag)
				 {	
					  tcur= x/fcur;
					  double ftemp=fnum+1;
					  tpot= c/fcur+(x/(fcur+f));
					  if(tcur<tpot)
						  potflag=false;
					  else
					  {
						  runtimeoffset=runtimeoffset+c/fcur;
						  fcur=fcur+f;
					  }
					  
				 }
				 double finaltime=runtimeoffset+tcur;
				 int casenos=g+1;
				 fstring+="Case #" + casenos + ": " +finaltime + "\n";
				
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
