package methodEmbedding.Standing_Ovation.S.LYD928;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter(args[0] + "_output.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            int cases = Integer.parseInt(br.readLine());
            int ovation, helpers, crowdSize;
            for(int caseNumber = 0; caseNumber < cases; caseNumber++) {
                String[] line = br.readLine().split(" ");
                ovation = helpers = 0;
                crowdSize = Integer.parseInt(line[0]);
                for(int i = 0; i <= crowdSize; i++) {
                    ovation += Character.getNumericValue(line[1].charAt(i)) - 1;
                    if(ovation < 0)  {
                        helpers++;
                        ovation++;
                    }
                }
                String output = String.format("%sCase #%d: %d", caseNumber==0?"":"\n", caseNumber+1, helpers);
                System.out.print(output);
                writer.write(output);

            }
            writer.close();
        }
    }
}
