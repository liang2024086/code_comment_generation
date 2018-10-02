package methodEmbedding.Standing_Ovation.S.LYD630;

import static java.lang.System.*;
import java.util.*;

public class StandingOvation{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(in);
        int input = keyboard.nextInt(); //taking value of test from user
        int[] sMax = new int[input]; //Max shylevel
        String[] sPeople = new String[input];
        
        for (int i = 0; i < input ; i++) {
            sMax[i]    = keyboard.nextInt();
            sPeople[i] = keyboard.next();
        }
        int[] tCase = new int[input]; 
        for (int i = 0 ; i < input ; i++ ) {
            int sum = 0, count =0;
            char ch;
            for (int j = 0; j < sMax[i] ; j++ ) {
                ch = sPeople[i].charAt(j);  //storing jth char from sPeople[]             
                sum+= ((byte)ch) - 48; 
                while(sum<=j){
                    sum++;
                    count++;//counting number of friends needed
                }
                
            }
            tCase[i] = count;//storing number of friends to tCase array
        }
        for (int i = 0; i<input ;i++ ) {
            out.println("Case #"+(i+1)+": "+ tCase[i]); 
        }
  
 }
}
