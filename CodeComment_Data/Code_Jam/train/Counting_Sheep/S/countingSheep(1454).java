package methodEmbedding.Counting_Sheep.S.LYD1671;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CountingSheep {
	public static void main(String[] args) throws Exception
    {
		
//		String inPath = "/Users/Lynn/Downloads/test";
//        String outPath = "/Users/Lynn/Downloads/test.out.txt";
		
		String inPath = "/Users/Lynn/Downloads/A-small-attempt0.in.txt";
        String outPath = "/Users/Lynn/Downloads/A-small-attempt0.out.txt";

        Scanner input = new Scanner(new FileReader(inPath));

        File outFile = new File(outPath);
        BufferedWriter bw = new BufferedWriter(new FileWriter(outPath));
        
        int numCases = input.nextInt();
        for (int n = 0; n < numCases; n++)
        {

        	Long N = (long) input.nextInt();
        	String answer = "";
        	
        	int i = 1;
        	
        	
        	if (N == 0) {
        		answer = "INSOMNIA";
        	} else {
        		
            	boolean one = false;
            	boolean two = false;
            	boolean three = false;
            	boolean four = false;
            	boolean five = false;
            	boolean six = false;
            	boolean seven = false;
            	boolean eight = false;
            	boolean nine = false;
            	boolean zero = false;
            	
        		do {
        			long cn = N * i;
        			i ++;
        			String number = String.valueOf(cn);
        			char[] digits = number.toCharArray();
        			for (char digit : digits) {
        				switch(digit){
        	            case '1': one = true; break;
        	            case '2': two = true; break;
        	            case '3': three = true; break;
        	            case '4': four = true; break;
        	            case '5': five = true; break;
        	            case '6': six = true; break;
        	            case '7': seven = true; break;
        	            case '8': eight = true; break;
        	            case '9': nine = true; break;
        	            case '0': zero = true; break;
        				}
        			} 
        			
        		} while (!(one && two && three && four && five && six && seven && eight && nine && zero));
        		
        			answer = Long.toString(N * (i-1));
        	}

            bw.write("Case #" + (n + 1) + ": " + answer);
            bw.newLine();
        }
     
        bw.close();
    }
	
	
}
