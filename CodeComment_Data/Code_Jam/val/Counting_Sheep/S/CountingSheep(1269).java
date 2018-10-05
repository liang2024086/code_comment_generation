package methodEmbedding.Counting_Sheep.S.LYD1062;

import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author Daniel
 */
public class CountingSheep {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("A-small-attempt3.in"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));
        int numberOfTestCases = Integer.parseInt(bufferedReader.readLine());
        int N;
        String productString = "";
        int T = 1;
        
        while (numberOfTestCases > 0) {
            ArrayList<Character> seen = new ArrayList<>();
            N = Integer.parseInt(bufferedReader.readLine());
            
            int i = 0;
            String stoppingPoint;
            
            while(seen.size() < 10){
              
                i = i+1;
                productString = Integer.toString(N * (i));
                
                if(productString.equals("0")) {
                    break;
                }
                else {
                    for(int j = 0; j < productString.length(); j++) {
                        if(!seen.contains(productString.charAt(j))) {
                            seen.add((productString.charAt(j)));
                        }
                    }
                }
            }
            stoppingPoint = productString;
            
            if (!stoppingPoint.equals("0")) {
                bufferedWriter.write("Case #"+T+":\t"+stoppingPoint);
                bufferedWriter.newLine();
            }
            else {
                stoppingPoint = "INSOMNIA";
                bufferedWriter.append("Case #"+T+":\t"+stoppingPoint);
                bufferedWriter.newLine();
            }
            T++;
            numberOfTestCases--;
            
        }
        bufferedWriter.close();
    }
}
