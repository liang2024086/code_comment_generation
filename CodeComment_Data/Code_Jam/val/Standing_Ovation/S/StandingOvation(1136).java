package methodEmbedding.Standing_Ovation.S.LYD433;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("A-small-attempt2.in"));
		PrintWriter out = new PrintWriter(new File("A-small-attempt2.out"));
		
		int testcases = s.nextInt();
		
		for(int i=0;i<testcases;i++) {
			s.nextInt();
			String audience = s.next();
			int need = 0;

			int peopleClapping = 0;
			for(int j=0;j<audience.length();j++) {
				if(j>peopleClapping) {
					need +=(j-peopleClapping);
					peopleClapping+=(j-peopleClapping);
				} 
				
				peopleClapping+=Integer.valueOf(String.valueOf(audience.charAt(j)));
				
			}
			
			out.println("Case #" + (i+1) +": " +  need);

		}
		
		s.close();
		out.flush();
		out.close();

	}

}
