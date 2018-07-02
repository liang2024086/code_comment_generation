package methodEmbedding.Standing_Ovation.S.LYD1152;

import java.io.*;
import java.lang.Integer;

public class StandingOvation {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        String fileName = "A-small-attempt1.in";
        String line = null;

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        final int T = Integer.parseInt(bufferedReader.readLine());
        
        String[] input = new String[T];
        
        int count = 0;
        while((line = bufferedReader.readLine()) != null) {
            input[count] = line;
            count++;
        }
        count = 0;
        bufferedReader.close();
        
        PrintWriter writer = new PrintWriter("A-small-attempt1.out", "UTF-8");
        
        int up = 0;
        int friends = 0;
        
        for(int i = 0; i < T; i++){
            for(int j = 2; j < input[i].length(); j++){
                if(Integer.parseInt(Character.toString(input[i].charAt(j))) != 0){
                    if(up >= j - 2)
                        up += Integer.parseInt(Character.toString(input[i].charAt(j)));
                    else{
                        count = j - 2 - up;
                        friends += count;
                        up += count;
                        up += Integer.parseInt(Character.toString(input[i].charAt(j)));
                    }
                }
            }
            writer.println("Case #" + (i + 1) + ": " + friends);
            friends = 0;
            up = 0;
        }
        writer.close();
    }
}
