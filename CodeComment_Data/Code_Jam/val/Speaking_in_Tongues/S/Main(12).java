package methodEmbedding.Speaking_in_Tongues.S.LYD860;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Albatross
 */
public class Main {

    
    public static void main(String[] args) throws IOException {

        Character[] English = new Character[26];
        Character[] Googler = new Character[26];
        English[0] = 'a';
        Googler[0] = 'y';
        English[1] = 'b';
        Googler[1] = 'n';
        English[2] = 'c';
        Googler[2] = 'f';
        English[3] = 'd';
        Googler[3] = 'i';
        English[4] = 'e';
        Googler[4] = 'c';
        English[5] = 'f';
        Googler[5] = 'w';
        English[6] = 'g';
        Googler[6] = 'l';
        English[7] = 'h';
        Googler[7] = 'b';
        English[8] = 'i';
        Googler[8] = 'k';
        English[9] = 'j';
        Googler[9] = 'u';
        English[10] = 'k';
        Googler[10] = 'o';
        English[11] = 'l';
        Googler[11] = 'm';
        English[12] = 'm';
        Googler[12] = 'x';
        English[13] = 'n';
        Googler[13] = 's';
        English[14] = 'o';
        Googler[14] = 'e';
        English[15] = 'p';
        Googler[15] = 'v';
        English[16] = 'q';
        Googler[16] = 'z';
        English[17] = 'r';
        Googler[17] = 'p';
        English[18] = 's';
        Googler[18] = 'd';
        English[19] = 't';
        Googler[19] = 'r';
        English[20] = 'u';
        Googler[20] = 'j';
        English[21] = 'v';
        Googler[21] = 'g';
        English[22] = 'w';
        Googler[22] = 't';
        English[23] = 'x';
        Googler[23] = 'h';
        English[24] = 'y';
        Googler[24] = 'a';
        English[25] = 'z';
        Googler[25] = 'q';

        String final_output = "";
        
        try{
            FileReader input = new FileReader("Input.txt");
            BufferedReader bufRead = new BufferedReader(input);
            String line;
            line = bufRead.readLine();
            int max = Integer.parseInt(line);
            
            for (int times=0; times<max; times++){
                
                line = bufRead.readLine();
                String output="";
                
                for (int i=0; i<line.length(); i++)
                {
                   Character current = line.charAt(i);
                   if (current==' '){
                        output = output+' ';
                   }
                   
                   else{
                       for (int j=0; j<Googler.length; j++)
                        {
                            if (Googler[j].equals(current))
                                output = output+English[j];
                        }
                   }
                   
                }           
                final_output = final_output+"Case #"+(times+1)+": "+output+"\n";
            }
            input.close();
        }
        catch(FileNotFoundException e)
        {
            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            
        }
        catch(IOException e){
            
        }

        FileWriter output_file = new FileWriter("Output.txt");
        BufferedWriter bufWrite = new BufferedWriter(output_file);
        try{

            bufWrite.write(final_output);
        }
        finally{
            bufWrite.close();
        }

 
    }

}
