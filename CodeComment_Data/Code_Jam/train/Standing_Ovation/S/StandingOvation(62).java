package methodEmbedding.Standing_Ovation.S.LYD874;

/* *****PROGRAMMER*****
 * MIR AYMAN ALI
 * CSE STUDENT 
 * BRAC University
 * BANGLADESH
 * ********************/
import static java.lang.System.*;
import java.util.*;

public class StandingOvation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int t = sc.nextInt();//inputing number of test
        int[] sMax = new int[t];//Max scare level
        String[] sPeople = new String[t];//string of people

        //taking input from user
        for (int i = 0; i < t ; i++) {
            sMax[i]    = sc.nextInt();
            sPeople[i] = sc.next();
        }
        int[] tCase = new int[t]; 
        for (int i = 0 ; i < t ; i++ ) {
            int sum = 0, count =0;
            char ch;
            for (int j = 0; j < sMax[i] ; j++ ) {
                ch = sPeople[i].charAt(j);  //storing jth char from sPeople[] in ch              
                sum+= ((byte)ch) - 48;  //converting char to byte and adding it to sum
                while(sum<=j){
                    sum++;
                    count++;//counting number of friends needed
                }
                
            }
            tCase[i] = count;//storing number of friends to tCase array
        }
        
        // Giving Output
        for (int i = 0; i<t ;i++ ) {
            out.println("Case #"+(i+1)+": "+ tCase[i]); 
        }
  
 }
}
