package methodEmbedding.Standing_Ovation.S.LYD669;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Raymond on 4/2/2015.
 */
public class StandingOvation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Raymond\\Desktop\\A-small-attempt2.in"));
        try {
            String jumlahTestCase = br.readLine();

            int jumlah = Integer.valueOf(jumlahTestCase);

            for (int ik =0; ik<jumlah; ik++){
                String line[] = br.readLine().split(" ");
                int maxShyness = Integer.valueOf(line[0]);

                char[] audiencesCharArray = line[1].toCharArray();
                int[] audiences = new int[audiencesCharArray.length];

                for(int i=0; i<audiencesCharArray.length; i++){
//                    System.out.println(audiencesCharArray[i]);
                    audiences[i] = Character.getNumericValue(audiencesCharArray[i]);
//                    System.out.println("lain: "+ audiences[i]);

                }
                int existingAudiences = 0;
                int audiencesNeeded = 0;
                for(int i=0; i<audiencesCharArray.length; i++){
//                    System.out.println(audiences[i]);
                    if(audiences[i] == 0 && existingAudiences <= i){
                        audiencesNeeded++;
                        existingAudiences++;
                    }else{
                        existingAudiences+=audiences[i];
                    }
                }

//                if(existingAudiences < maxShyness){
//                    System.out.println("Case #"+(ik+1)+": "+ (maxShyness-existingAudiences));
//                }else {
                    System.out.println("Case #" + (ik + 1) + ": "+ audiencesNeeded);
//                }


            }
        } finally {
            br.close();
        }
    }
}
