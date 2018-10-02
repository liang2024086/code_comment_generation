package methodEmbedding.Counting_Sheep.S.LYD130;

import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author Yakubu
 */
public class CodeJam2016 {

    public static void main(String[] args) throws IOException {
     
        char[] allDigits = {1,2,3,4,5,6,7,8,9,0};
        
        BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        int numTestCases = Integer.parseInt(br.readLine());
        int N;
        String productString = "";
        int T = 1;
        
        while (numTestCases > 0) {
            ArrayList<Character> seen = new ArrayList<>();
            N = Integer.parseInt(br.readLine());
            
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
                        if(seen.contains(productString.charAt(j)) == false) {
                            seen.add((productString.charAt(j)));
                        }
                    }
                }
            }
            stoppingPoint = productString;
            
            if (stoppingPoint.equals("0") == false) {
                bw.write("Case #"+T+":\t"+stoppingPoint);
                bw.newLine();
            }
            else {
                stoppingPoint = "INSOMNIA";
                bw.append("Case #"+T+":\t"+stoppingPoint);
                bw.newLine();
            }
            T++;
            numTestCases--;
            
        }
        bw.close();
    }
}
