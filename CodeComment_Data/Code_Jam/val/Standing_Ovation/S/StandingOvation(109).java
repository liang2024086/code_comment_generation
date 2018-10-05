package methodEmbedding.Standing_Ovation.S.LYD71;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;


public class StandingOvation {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("A-small-attempt1.in"));
            outputStream = new PrintWriter(new FileWriter("characteroutput.txt"));

            String l;
            int cases = Integer.parseInt(inputStream.readLine());
            int cnum = 0;
            while ((l = inputStream.readLine()) != null) {
            	cnum++;
            	int maxShy = Integer.parseInt(l.substring(0,1));
            	String reverse = new StringBuffer(l.substring(2)).reverse().toString();
            	int number = Integer.parseInt(reverse);
            	int n = 0;
            	int people = 0;
            	int numNeeded = 0;
            	for(int i = 0; i < maxShy; i++){
            		n = number % 10;
            		number = number / 10;
            		people += n;
            		if(people < (i + 1)){
            			numNeeded ++;
            			people ++;
            		}
            	}
            	
                outputStream.println(String.format("Case #%d: %d",cnum,numNeeded ));
                
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
