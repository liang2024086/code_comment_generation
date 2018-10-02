package methodEmbedding.Standing_Ovation.S.LYD1555;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class StandingOvation {

	public static final String FILE_PATH = 
//			"D://warehouse//codes//java//gcj//resource//standingovation//sample.txt";
	"D://warehouse//codes//java//gcj//resource//standingovation//A-small-attempt2.in";
	
	public static final String OUTPUTFILE_PATH = 
			"D://warehouse//codes//java//gcj//resource//standingovation//A-small-attempt2.out";
	
	public static void main(String[] args) throws IOException {
		PrintWriter writer = new PrintWriter(OUTPUTFILE_PATH, "UTF-8");
		BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
		String line=br.readLine();
		int nScenario = Integer.parseInt(line);
		for (int i=0; i<nScenario; i++) {
			line=br.readLine();
			int spacePosition = line.indexOf(' ');
			int nPerson = Integer.parseInt(line.substring(0, spacePosition));
			String theRest = line.substring(spacePosition+1);
			int[] persons = new int[nPerson+1];
			for (int j=0; j<=nPerson; j++) persons[j] = theRest.charAt(j)-48;
			int result = 0;
			for (int j=1; j<=nPerson; j++) {
				if (persons[j]>0) {
					int total = 0;
					for (int k=0; k<j; k++) total = total + persons[k];
					int personNeeded = j-total;
					personNeeded = (personNeeded<0) ? 0 : personNeeded;
					if (result<personNeeded) result = personNeeded;
				}
			}
			writer.println("Case #"+(i+1)+": "+result);
			System.out.println(result);
		}
		br.close();
		writer.close();		
	}

}
