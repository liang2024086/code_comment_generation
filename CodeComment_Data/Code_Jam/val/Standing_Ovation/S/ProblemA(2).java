package methodEmbedding.Standing_Ovation.S.LYD508;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProblemA {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("ProblemA.txt.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("ProblemA.txt.out")));
		
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<T;i++)
		{
		    int smax = sc.nextInt();
			String str = sc.nextLine().trim();
			int frndToAdd = 0,currentStanding=0;
			for(int sLevel=0;sLevel<=smax;sLevel++) {
			    int sCount = Integer.parseInt(""+str.charAt(sLevel));
			    if(currentStanding < sLevel) {
			        frndToAdd+= (sLevel - currentStanding);
			        currentStanding+= (sLevel - currentStanding);
			    }
			    currentStanding+= sCount;
			}
			bw.write("Case #" + (i+1) +": " + frndToAdd + "\n");
			System.out.println("Case #" + (i+1) +": " + frndToAdd);
		}
		
		bw.close();
		sc.close();
	}
}
