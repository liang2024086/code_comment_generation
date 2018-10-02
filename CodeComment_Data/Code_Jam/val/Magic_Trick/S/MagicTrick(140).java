package methodEmbedding.Magic_Trick.S.LYD1894;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Masood
 */
public class MagicTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            PrintWriter out= new PrintWriter("Output.txt");
            BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
            int testCases = Integer.parseInt(br.readLine());
            ArrayList<ArrayList<String>> firstArrangement = new ArrayList<ArrayList<String>>();
            ArrayList<ArrayList<String>> secondArrangement = new ArrayList<ArrayList<String>>();

            for (int i = 1; i <= testCases; i++) {
                int firstAnswer = Integer.parseInt(br.readLine());
                for (int j = 0; j < 4; j++) {
                    String[] temp = br.readLine().split(" ");
                    ArrayList<String> t = new ArrayList<>(Arrays.asList(temp));
                    firstArrangement.add(t);
                }
                
                int secondAnswer = Integer.parseInt(br.readLine());
                
                for (int j = 0; j < 4; j++) {
                    String[] temp = br.readLine().split(" ");
                    ArrayList<String> t = new ArrayList<>(Arrays.asList(temp));
                    secondArrangement.add(t);
                }
                int count = 0;
                int currentAnswer = -1;
                firstAnswer--;
                secondAnswer--;
                
                
                for(int j=0;j<4;j++){
                
                    for(int k=0;k<4;k++){
                        if(firstArrangement.get(firstAnswer).get(j).equals(secondArrangement.get(secondAnswer).get(k))){
                            currentAnswer = Integer.parseInt(firstArrangement.get(firstAnswer).get(j));
                            count++;
                        }
                        
                    }
                }
                if(count==1){
                    System.out.format("Case #%d: %d\n",i,currentAnswer);
                    out.format("Case #%d: %d",i,currentAnswer);
                    out.println();
                }
                else if(count>1){
                    System.out.format("Case #%d: Bad magician!\n",i);
                    out.format("Case #%d: Bad magician!",i);
                    out.println();
                }
                else if(count==0){
                    System.out.format("Case #%d: Volunteer cheated!\n",i);
                    out.format("Case #%d: Volunteer cheated!",i);
                    out.println();
                    
                }
                //System.out.println(firstArrangement);
                //System.out.println(secondArrangement);
                firstArrangement.clear();
                secondArrangement.clear();
                
            }
             out.close();
             br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MagicTrick.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

}
