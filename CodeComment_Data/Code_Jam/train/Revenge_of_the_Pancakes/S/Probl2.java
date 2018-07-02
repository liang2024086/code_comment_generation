package methodEmbedding.Revenge_of_the_Pancakes.S.LYD400;

import java.io.*;
public class Probl2 {
    public static void main(String[] args){
        try{
            BufferedReader bf = new BufferedReader(new FileReader("/Users/DonD/IdeaProjects/GoogleJam/Prob2/input.in"));
            BufferedWriter wr = new BufferedWriter(new FileWriter("/Users/DonD/IdeaProjects/GoogleJam/Prob2/output.in"));

            int numberOfCases = Integer.parseInt(bf.readLine());
            String[] order1;
            String temp;
            int y;
            for ( int i=1; i<=numberOfCases; i++){
                y=0;
                order1=bf.readLine().split("");
                temp=order1[0];

                for ( String x : order1){
                    if(!x.equals(temp)) {
                        y++;
                        temp=x;
                    }
                }
                if(temp.equals("-")) y++;
                wr.write("Case #"+i+": "+y);
                wr.newLine();
            }
            bf.close();
            wr.close();
        }catch(IOException e){
            System.out.println("exception"+e);
        }
    }

}
