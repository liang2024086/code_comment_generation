package methodEmbedding.Magic_Trick.S.LYD1910;


import java.io.*;
import java.util.StringTokenizer;
import java.util.logging.*;

/**
 * @author Priscilla
 */
public class MagicTrick {

    public static void main(String[] args) {
        try {
            FileReader input = new FileReader("input.txt");
            BufferedReader in = new BufferedReader(input);
            
            FileWriter output = new FileWriter("output.txt");
            BufferedWriter out = new BufferedWriter(output);
            String line;

            line = in.readLine();
            int nrOfCases = Integer.parseInt(line);
            int[] firstOptions = new int[4];
            int[] secondOptions = new int[4];

            for (int caseNr = 1; caseNr <= nrOfCases; caseNr++) {
                line = in.readLine();
                int firstAnswer = Integer.parseInt(line);
                for (int answerNr = 1; answerNr <= 4; answerNr++) {
                    line = in.readLine();
                    if (answerNr == firstAnswer) {
                        StringTokenizer lineTokens = new StringTokenizer(line, " ");
                        int index = 0;
                        while (lineTokens.hasMoreTokens()) {
                            firstOptions[index] = Integer.parseInt(lineTokens.nextToken());
                            index++;
                        }
                    }
                }
                
                line = in.readLine();
                int secondAnswer = Integer.parseInt(line);
                for (int answerNr = 1; answerNr <= 4; answerNr++) {
                    line = in.readLine();
                    if (answerNr == secondAnswer) {
                        StringTokenizer lineTokens = new StringTokenizer(line, " ");
                        int index = 0;
                        while (lineTokens.hasMoreTokens()) {
                            secondOptions[index] = Integer.parseInt(lineTokens.nextToken());
                            index++;
                        }
                    }
                }
                int answer = 0;
                for (int i=0; i<4;i++){
                    for(int j=0; j<4; j++){
                        if (firstOptions[i] == secondOptions[j]){
                            if( answer == 0 ){
                                answer = firstOptions[i];
                            } else {
                                answer = -1;
                            }
                        }
                    }
                }
                if (answer > 0){
                    out.write("Case #" + caseNr + ": " + answer);
                    out.newLine();
                } else if(answer == 0){
                    out.write("Case #" + caseNr + ": " + "Volunteer cheated!");
                    out.newLine();
                } else {
                    out.write("Case #" + caseNr + ": " + "Bad magician!");
                    out.newLine();
                }
                
            }
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
