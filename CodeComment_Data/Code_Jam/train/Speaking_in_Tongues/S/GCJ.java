package methodEmbedding.Speaking_in_Tongues.S.LYD1555;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.*;

public class GCJ {


    public static void main(String args[]) {
        
        int[] mapping = new int[26];
        mapping[0] = 121;
        mapping[1] = 104;
        mapping[2] = 101;
        mapping[3] = 115;
        mapping[4] = 111;
        mapping[5] = 99;
        mapping[6] = 118;
        mapping[7] = 120;
        mapping[8] = 100;
        mapping[9] = 117;
        mapping[10] = 105;
        mapping[11] = 103;
        mapping[12] = 108;
        mapping[13] = 98;
        mapping[14] = 107;
        mapping[15] = 114;
        mapping[16] = 122;
        mapping[17] = 116;
        mapping[18] = 110;
        mapping[19] = 119;
        mapping[20] = 106;
        mapping[21] = 112;
        mapping[22] = 102;
        mapping[23] = 109;
        mapping[24] = 97;
        mapping[25] = 113;
        
        int line = 1;
        int prob = 0;
        // Open the file to read answers in from
        String input = "";
        Scanner scan =  new Scanner (System.in);       
        
        
        while( scan.hasNext() ) {
        
        //  input = "";
            input = scan.nextLine();/*Read till end of line*/
           // System.out.println(input);
            if(line != 1 ) {
            prob++;
            System.out.print("Case #" + prob + ": ");
                 }
            for(int i=0;i<input.length();i++) {
                //System.out.println(input.charAt(i)+": "+((int)input.charAt(i)));
                char print;

                // A space
                if( ((int)input.charAt(i)) == 32 ) {
                    print = ' ';
                }
                else if ( line == 1 ) {
                    line++;
                    break;
                }
                else {
                
                    print = (char) mapping[ (int)input.charAt(i) - 97];
                    
                    //int x = (int)input.charAt(i) - 97;
                    //System.out.println(x);
                    //print = 'a';
                } 
                
              
                System.out.print(print);
                                                                                     
        }
            if( line != 2 ) {
            System.out.println(); }
            line++;
        }
        scan.close();
         
    
    }






}
