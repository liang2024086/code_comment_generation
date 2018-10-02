package methodEmbedding.Magic_Trick.S.LYD468;

import java.util.*;
import java.io.*;

public class MagicTrick{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        for(int i=1; i<=testcases; i++){
            int answer1 = Integer.parseInt(br.readLine());
            String row1 = new String();
            String line;
            for(int j=0; j<4; j++){
                line = br.readLine();
                if((j+1)==answer1)row1 = line;
            }
            int answer2 = Integer.parseInt(br.readLine());
            String row2 = new String();
            for(int j=0; j<4; j++){
                line = br.readLine();
                if((j+1)==answer2)row2 = line;
            }
            String[][] rows = new String[4][4];
            rows[0] = row1.split(" ");
            rows[1] = row2.split(" ");
            String answer = "";
            int numAnswers = 0;
            for(int j=0; j<4; j++){
                for(int k=0; k<4; k++){
                    if(rows[0][j].equals(rows[1][k])){
                        answer = rows[0][j];
                        numAnswers++;
                    }
                }
            }

            if(numAnswers>1)
                System.out.println("Case #"+i+": Bad magician!");
            else if(numAnswers==0)
                System.out.println("Case #"+i+": Volunteer cheated!");
            else System.out.println("Case #"+i+": "+answer);
        }
    }
}
