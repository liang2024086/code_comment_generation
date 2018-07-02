package methodEmbedding.Standing_Ovation.S.LYD1852;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Philip Lanaras <flanaras@csd.auth.gr>
 */
public class CodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        int cases;
        
        final String filename = "A-small-attempt0.in";
        final String outFile = "A-small-attempt0.out";

        String[] vals;
        //----------------------------Inits-Go-Here----------------------------\\
        
        StringBuilder str = new StringBuilder();
        String temp;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))) {
            
            //Num of Cases
            temp = reader.readLine();
            cases = Integer.valueOf(temp);
            
            for (int i = 1; i <= cases; ++i) {
                temp = reader.readLine();
                vals = temp.split(" ");
                
                //------------------------Inits-Go-Here------------------------\\
                int until = Integer.parseInt(vals[0]);
                int res = 0;
                int count = 0;
                String digits = vals[1];

                int currentShyness;

                for (int j = 0; j <= until; j++) {

                    currentShyness = Character.getNumericValue(digits.charAt(j));

                    if (j - count > 0) {
                        res += j - count;

                        count += j - count;
                    }

                    count += currentShyness;

                }

                str = str.append("Case #" + i + ": " + res);
                System.out.println(str.toString());
                
                writer.write(str.toString());
                writer.newLine();
                str = new StringBuilder();
            }
        }

    }
    
    
}
