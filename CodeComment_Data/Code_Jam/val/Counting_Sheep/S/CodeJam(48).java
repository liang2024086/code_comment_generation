package methodEmbedding.Counting_Sheep.S.LYD1694;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author admin
 */
public class CodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        File file = new File("F:\\A-small-attempt1.in");
        File outFile = new File("F:\\out.out");
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
        int testCases = Integer.parseInt(br.readLine());
        Set check = new HashSet<String>();
        List list = new ArrayList<Character>();
        for(int t=1;t<=testCases;t++){
        int present = Integer.parseInt(br.readLine());
        int pre = present;
        String buffer = String.valueOf(present);
        if(present == 0 )
        {
         bw.write("Case #" + t +": INSOMNIA\n");
        }
        else {
        for(; check.size()<10;) 
        {
            //char buffer1[] = buffer.toCharArray();
            //Arrays.sort(buffer1);
            /*if(buffer1[0] =='0' && buffer1[1] == '1')
            {
                check.add("10");
            }*/
            for(char c : buffer.toCharArray()) {
               //if(c!='0')
               check.add(c);
          }
            
            present = present+pre;
            buffer = String.valueOf(present);
        }         
        present = present-pre;
        bw.write("Case #" + t +": "+present+"\n");
        check.clear();
      }
        }
        br.close();
        bw.close();
        
    }
    
}
