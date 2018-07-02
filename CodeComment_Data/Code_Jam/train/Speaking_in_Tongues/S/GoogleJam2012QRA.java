package methodEmbedding.Speaking_in_Tongues.S.LYD388;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
/**
 *
 * @author Vincent
 */
public class GoogleJam2012QRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Prepare the reader
            BufferedReader in = new BufferedReader( new FileReader("inputFile.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("outputFile.txt"));
            
            //Get the amount of cases to be solved
            String str = in.readLine();
            int caseCount = Integer.parseInt(str);
            
            //Prepare Googlerese association
            int[] glese = {'y', 'h', 'e', 's', 'o',
                           'c', 'v', 'x', 'd', 'u',
                           'i', 'g', 'l', 'b', 'k',
                           'r', 'z', 't', 'n', 'w',
                           'j', 'p', 'f', 'm', 'a',
                           'q'};
            
            //For each test case
            for(int i = 0; i < caseCount; i++){
                //Get the line to be decrypted
                str = in.readLine();
                
                out.write("Case #" + (i+1) + ": ");
                
                for(int j = 0; j < str.length(); j++){
                    char c = str.charAt(j);
                    if(c == ' ') out.write(" ");
                    else{
                        c = (char)(c - 'a');
                        out.write(""+(char)glese[c]);
                        System.out.print(""+ (char)glese[c]);
                    }
                }
                out.newLine();
                System.out.println();
            }
            in.close();
            out.close();
        }
        catch (Exception e){
            System.out.println("Read Failed");
        }
    
    }
}
