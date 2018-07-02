package methodEmbedding.Standing_Ovation.S.LYD1405;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		
		String base = "D:\\";
        String input = base + "A-small-attempt3.in";
        String output = base + "A-small-attempt3.out";
        

        try {
            Scanner in = new Scanner(new FileReader(input));
            PrintWriter write = new PrintWriter(output);
            //in = new Scanner(System.in);
            //write = new PrintWriter(System.out);

            int n = in.nextInt();
			for (int i = 0; i < n; i++) {
				int a = in.nextInt();
				String s = in.next();
				int sum = 0;
				int re = 0;
				for (int j = 0; j < s.length(); j++) {
					int kk = Integer.parseInt(String.valueOf(s.charAt(j)));
					sum+=kk;
					if((sum+re)<(j+1))
						re += (j+1)-(sum+re);
				}
				
				String outerString ="Case #"+(i+1)+": "+re+"\n";
				write.append(outerString);
				write.flush();
				 
			}
        }
		catch(Exception e){
			System.out.println("NONE");
		}
	}
}
