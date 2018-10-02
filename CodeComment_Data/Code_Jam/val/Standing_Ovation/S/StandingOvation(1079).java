package methodEmbedding.Standing_Ovation.S.LYD106;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class StandingOvation {
    public static void main(String args[])throws Exception{ 
        BufferedReader br = new BufferedReader(new FileReader("C:\\Test\\A-small-attempt0.in"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Test\\output.txt", false));
        int noOFTC = Integer.parseInt(br.readLine());
        for(int i = 1; i <= noOFTC; i++){
            int answer = 0;
            String []  testCaseLine = br.readLine().split(" ");
            int highestShyLevel = Integer.parseInt(testCaseLine[0]);
            String peopleCountString = testCaseLine[1];
            int currentClapping = 0;
            if(peopleCountString.length() == 1){
                bw.write("Case #" + i + ": " + 0 + System.lineSeparator());
                continue;
            }
            for(int shyLevel = 0; shyLevel < peopleCountString.length()-1;shyLevel++){
                currentClapping = currentClapping + Integer.parseInt(peopleCountString.substring(shyLevel, shyLevel+1));
                int nextLevelRequired = Integer.parseInt(peopleCountString.substring(shyLevel+1, shyLevel+2));
                if(nextLevelRequired > 0 && currentClapping < (shyLevel + 1)){
                    int extraRequired = shyLevel+1 - currentClapping;
                    answer = answer + extraRequired;
                    currentClapping = currentClapping + extraRequired;
                }   
            }
            bw.write("Case #" + i + ": " + answer+System.lineSeparator());
        }
        br.close();  
        bw.close();
        
    }
    
}
