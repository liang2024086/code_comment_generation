package methodEmbedding.Magic_Trick.S.LYD2151;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MagicTrick {
    static Scanner input;
    static BufferedWriter output;

    public static void main(String[] args) throws IOException {
        input = new Scanner(new File(args[0]));
        output = new BufferedWriter(new FileWriter("small.out"));

        int numCase = input.nextInt();

        for (int i = 0; i < numCase; i++) {
        	output.write("Case #" + (i + 1) + ": ");
        	
        	int[] A = new int[4];
        	int[] B = new int[4];
        	int matchedNumber = 0;
        	
            int r = input.nextInt();
            
            for (int j = 0; j < 4 * (r - 1); j++)
            	input.nextInt();
            
            for (int j = 0; j < 4; j++)
            	A[j] = input.nextInt();
            
            for (int j = 0; j < 4 * (4 - r); j++)
            	input.nextInt();
            
            r = input.nextInt();
            
            for (int j = 0; j < 4 * (r - 1); j++)
            	input.nextInt();
            
            for (int j = 0; j < 4; j++)
            	B[j] = input.nextInt();
            
            for (int j = 0; j < 4 * (4 - r); j++)
            	input.nextInt();
            
            for (int j = 0; j < 4 && matchedNumber >= 0; j++) {
            	if (A[j] == B[0] || A[j] == B[1] || A[j] == B[2] || A[j] == B[3]) {
            		if (matchedNumber == 0)
            			matchedNumber = A[j];
            		else
            			matchedNumber = -1;
            	}
            }
            
            
            if (matchedNumber == 0)
            	output.write("Volunteer cheated!\n");
            else if (matchedNumber == -1)
            	output.write("Bad magician!\n");
            else
            	output.write(matchedNumber + "\n");
        }
        
        output.close();
    }
    
    
}
