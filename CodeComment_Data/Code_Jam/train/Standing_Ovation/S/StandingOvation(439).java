package methodEmbedding.Standing_Ovation.S.LYD12;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class StandingOvation {
	
	public static void main(String[] args) throws Exception {

		// for reading in the data from the file
        File input = new File("A-small-attempt0.in");
        FileReader fr = new FileReader(input);
        BufferedReader br = new BufferedReader(fr);

        // for writing to the output file
        PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
        int numArgs = Integer.parseInt(br.readLine());


        for (int i=0; i<numArgs; i++) {
        	String text = br.readLine();
        	String[] words = text.split(" ");
        	int max = Integer.parseInt(words[0]);
        	String crowd = words[1];
        	int numPeople = 0; //total num people in attendance
        	int standing = 0;
        	int out = 0;

        	for(int j=0; j<crowd.length(); j++) {
        		int a = crowd.charAt(j) - 48;
        		numPeople += a;
        		while(standing < j) {
        			standing++;
                    out++;
                }
                standing+=a;
        	}
            writer.printf("Case #%d: %d", i+1, out);
            if (i<numArgs-1)
                writer.print("\n");
        }
            writer.close();
    }
}
