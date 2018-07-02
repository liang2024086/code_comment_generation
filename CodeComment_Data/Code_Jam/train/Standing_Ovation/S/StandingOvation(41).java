package methodEmbedding.Standing_Ovation.S.LYD1867;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;

/**
 *
 * @author Ahmed Mousa
 */
public class StandingOvation {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
     BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Ahmed Mousa\\Downloads\\A-small-attempt6.in"));
        int i = 0;
        String kth ;
        int minimumNumberOfFriends = 0;
        int numOfCurrentAud = 0;
        int caseNum = 1;
        
    try {
        String line = br.readLine();
        while (line != null) {
            //start from sMax kth
            if(i != 0){
                String[]arrSm = line.split(" ");
                kth = arrSm[1];
                //kth = "1";
              for(int j = 0; j < kth.length(); j++){
                if(kth.charAt(j) != '0'){
                   if(numOfCurrentAud < j){
                       minimumNumberOfFriends += j - numOfCurrentAud;
                       numOfCurrentAud += minimumNumberOfFriends;
                   }
                   numOfCurrentAud += Integer.parseInt(String.valueOf(kth.charAt(j)));
                }
              }
            
              System.out.println("Case #"+caseNum+": "+minimumNumberOfFriends);
              minimumNumberOfFriends = 0;
              numOfCurrentAud = 0;
              caseNum++;
            }
            line = br.readLine();
            i++;
        }

    }finally {
        br.close();
    }
    
    }
    
}
