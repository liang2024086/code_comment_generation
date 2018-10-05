package methodEmbedding.Counting_Sheep.S.LYD496;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class CodeJam_Q_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        int cases;
        
        final String filename = "A-small-attempt0.in";
        final String outFile = "A-small-attempt0.out";

        String[] vals;
        //----------------------------Inits-Go-Here----------------------------\\
        
        StringBuilder str;
        String temp;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))) {
            
            //Num of Cases
            cases = Integer.valueOf(reader.readLine());
            
            for (int i = 1; i <= cases; ++i) {
                str = new StringBuilder();

                temp = reader.readLine();
                vals = temp.split(" ");
                
                //------------------------Inits-Go-Here------------------------\\
                int N = Integer.parseInt(vals[0]);
                int loops;
                String strRes = "INSOMNIA";
                HashSet<Integer> seen = new HashSet<>();

                if (N != 0) {

                    for (loops = 1; seen.size() < 10; ++loops) {
                        int currentNumber = loops * N;

                        while (currentNumber > 0) {
                            seen.add(currentNumber % 10);
                            currentNumber = currentNumber / 10;
                        }


                    }

                    --loops;
                    strRes = "" + (loops * N);
                }

                str.append("Case #").append(i).append(": ").append(strRes);
                System.out.println(str.toString());
                
                writer.write(str.toString());
                writer.newLine();

            }
        }

    }
    
    
}
