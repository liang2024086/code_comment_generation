package methodEmbedding.Standing_Ovation.S.LYD173;

// Code by PepeOfMath
//
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) throws FileNotFoundException {
    
        //hard code the file location
        //open file
        //get number of test cases
        File f = new File("A-small-attempt0.in");
        Scanner s = new Scanner(f);
        String line = s.nextLine();
        int T = Integer.parseInt(line);
        
        //open output file
        File f2 = new File("smallresult.txt");
        PrintWriter p = new PrintWriter(f2);
        
        
        for ( int j = 1; j <= T; j++) {
            String[] parts = s.nextLine().split(" ");
            //get Smax and freq[]
            int Smax = Integer.parseInt(parts[0]);
            char[] freq = parts[1].toCharArray();
            
            int total = 0;
            int npeop = 0; //number of friends added
            for( int i = 0; i <= Smax; i++) {
                if (total < i && '0' != freq[i]) {
                    npeop += i - total;
                    total += i - total;
                }
                total += ((int) freq[i] - (int) '0');        
            }
            
            //store the result in the output file
            p.println("Case #" + j + ": " + npeop);
        }
        
        p.close();
        s.close();
    }
}
