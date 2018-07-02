package methodEmbedding.Standing_Ovation.S.LYD1531;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Main {
    public static void main(String[] args){
        int numTestcase;
        int max;
        List<Integer> shyList = new ArrayList<Integer>();

        try {
            //for input
            File input = new File("data.txt");
            FileReader fReader = new FileReader(input);
            BufferedReader bReader = new BufferedReader(fReader);

            String line = null;
            line = bReader.readLine();
            numTestcase = Integer.parseInt(line);
            for (int i = 0; i < numTestcase; i++){
                //Init
                line = bReader.readLine();
                max = Integer.parseInt(line.substring(0, line.indexOf(" ")));
                shyList = new ArrayList<Integer>();
                for (int j = line.indexOf(" ") + 1, k = 0; k < max + 1; k++, j++){
                    shyList.add(Integer.parseInt(line.substring(j, j + 1)));
                }

                int ans = 0;
                int sumStand = 0;

                for (int j = 0; j < shyList.size(); j++){
                    if (sumStand >= j){
                        sumStand += shyList.get(j);
                    }
                    else{
                        int plus = j - sumStand;
                        ans += plus;
                        sumStand += (plus + shyList.get(j));
                    }
                }
                System.out.println("Case #" + (i + 1) + ": " + ans);
            }
        }
        catch (Exception e){

        }
    }
}
