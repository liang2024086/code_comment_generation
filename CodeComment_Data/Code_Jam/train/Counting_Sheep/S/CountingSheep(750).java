package methodEmbedding.Counting_Sheep.S.LYD269;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CountingSheep {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new FileReader("2016/qualA/input.txt"));
        BufferedReader reader = new BufferedReader(new FileReader("2016/qualA/A-small-attempt0.in.txt"));
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("2016/qualA/output.txt")));

        int numberOfTests = Integer.parseInt(reader.readLine()); // T

        for (int i = 0; i < numberOfTests; i++) {
            System.out.println(i);
            int number = Integer.parseInt(reader.readLine()); // N

            if (number == 0) {
            	writer.println("Case #" + (i + 1) + ": INSOMNIA");
            } else {
            	short gotDigit = 0;
            	long multiple = 0;

            	while (gotDigit != 1023) {
            		multiple += number;
            		long m = multiple;
            		while (m > 0) {
            			gotDigit |= (1 << (m % 10));
            			m /= 10;
            		}
            	}
            	
                writer.println("Case #" + (i + 1) + ": " + multiple);
            }
        }

        writer.flush();
        writer.close();
        reader.close();
	}

}
