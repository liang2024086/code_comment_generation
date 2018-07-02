package methodEmbedding.Magic_Trick.S.LYD97;

/**
 * Created by ffetters on 4/12/14.
 */

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;


public class Main1 {

    public static void main(String [] strings) throws Exception{

//        String file = "/tmp/aSample.in";
        String file = "/tmp/A-small-attempt0.in";

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        int numCases = Integer.valueOf(br.readLine()).intValue();

        for( int x=0;x<numCases;x++){
            int firstAnswer = Integer.valueOf(br.readLine()).intValue();
            String [][] setup1 = new String[4][4];
            for( int y=0;y<4;y++){
                setup1[y] = br.readLine().split(" ");
            }

            Set possibleAnswers = new HashSet();
            for( int y=0;y<4;y++){
                possibleAnswers.add(setup1[firstAnswer-1][y]);
            }

            int answer2 = Integer.valueOf(br.readLine()).intValue();
            String [][] setup2 = new String[4][4];
            for( int y=0;y<4;y++){
                setup2[y] = br.readLine().split(" ");
            }

            int matches = 0;
            String match = null;
            for( int y=0;y<4;y++){
                if(possibleAnswers.contains(setup2[answer2-1][y])){
                    matches++;
                    match = setup2[answer2-1][y];
                }
            }

            String result;
            if( matches == 0 ){
                result = "Volunteer cheated!";
            }else if( matches > 1){
                result = "Bad magician!";
            }else{
                result = match;
            }
            System.out.println("Case #"+(1+x)+": "+result);
        }

        br.close();

    }
}
