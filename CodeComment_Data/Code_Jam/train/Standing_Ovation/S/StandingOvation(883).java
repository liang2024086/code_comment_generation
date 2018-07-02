package methodEmbedding.Standing_Ovation.S.LYD2140;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StandingOvation {

	private static final String FILES_PATH = "E:\\DL\\gcj\\2015\\qualificationRound\\";
	private static final String IN_EXT = ".in";
	private static final String OUT_EXT = ".out";
	
	private static final String FILE_NAME = "A-small-attempt0";

	public static void main(String[] args) throws IOException {
		
		 Scanner in = new Scanner(new File(FILES_PATH + FILE_NAME + IN_EXT));
		 FileWriter fw = new FileWriter(new File(FILES_PATH + FILE_NAME + OUT_EXT));
		 
		 int nbTests = in.nextInt();
		 int count, nbUp;
		 
		 in.nextLine();
		 int maxShy;
		 char[] people;
		 for(int i = 0; i < nbTests; i++) {
			 count = 0;
			 maxShy = in.nextInt();
			 people = in.next().toCharArray();
			 
			 if(maxShy > 0) {
				 nbUp = people[0] - 48;
				 for(int j = 1; j < people.length; j++) {
					 if(nbUp < j) {
						 count += j - nbUp;
						 nbUp += j - nbUp;
					 }
					 nbUp += people[j] - 48;
				 }
			 }
			 
			 fw.write("Case #" + (i+1) + ": " + count + "\n");
			 in.nextLine();
		 }
		 
		 fw.close();
		 in.close();
		 
	}
	
}
