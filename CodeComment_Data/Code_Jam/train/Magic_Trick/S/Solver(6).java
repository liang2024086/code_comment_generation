package methodEmbedding.Magic_Trick.S.LYD949;

import java.io.*;
import java.util.*;

public class Solver
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        String line = new String();
        final int R = 4;
        
        try {
            BufferedReader in = new BufferedReader(new FileReader(new File("A-small-attempt0.in")));
            final int numCases = Integer.parseInt(in.readLine());
            
            for (int caseId = 1; caseId <= numCases; caseId++) {
                final int firstAns = Integer.parseInt(in.readLine());
                int[] beforeRow = new int[R];
                for (int i = 1; i <= R; i++) {
                    line = in.readLine();
                    if (i == firstAns) {
                        String[] tokens = line.split("\\s+");
                        for (int j = 0; j < R; j++) {
                            beforeRow[j] = Integer.parseInt(tokens[j]);
                        }
                    }
                }
                
                final int secondAns = Integer.parseInt(in.readLine());
                int[] afterRow = new int[R];
                for (int i = 1; i <= R; i++) {
                    line = in.readLine();
                    if (i == secondAns) {
                        String[] tokens = line.split("\\s+");
                        for (int j = 0; j < R; j++) {
                            afterRow[j] = Integer.parseInt(tokens[j]);
                        }
                    }
                }
                
                int counter = 0;
                int result = 0;
                for (int i = 0; i < R; i++) {
                    for (int j = 0; j < R; j++) {
                        if (beforeRow[i] == afterRow[j]) { 
                            counter++; 
                            if (counter == 1) { result = beforeRow[i]; }
                        }
                        
                    }
                }
                
                sb.append("Case #" + caseId + ": ");
                if (counter == 0) {
                    sb.append("Volunteer cheated!\n");
                }
                else if (counter == 1) {
                    sb.append(result);
                    sb.append("\n");
                }
                else {
                    sb.append("Bad magician!\n");
                }
            }
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("output.txt")));
            bw.write(new String(sb));
            bw.close();
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
