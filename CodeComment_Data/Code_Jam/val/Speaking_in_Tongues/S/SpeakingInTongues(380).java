package methodEmbedding.Speaking_in_Tongues.S.LYD1306;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SpeakingInTongues {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        int cases=0,temp=1;
        
        
        File file=new File("output.txt");
         FileWriter fileWritter = new FileWriter(file.getName(),true);
    	BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
        
        FileInputStream fr =new FileInputStream("C:\\Users\\Sachin\\Desktop\\A-small-attempt3.in");
        DataInputStream in = new DataInputStream(fr);
        BufferedReader br= new BufferedReader(new InputStreamReader(in));
        
        String fileLine;
        fileLine=br.readLine();
        cases=fileLine.charAt(0)-48;
       
        while((fileLine=br.readLine())!=null)
        {
             bufferWritter.write("Case #"+temp+": ");
            for(int i=0;i<fileLine.length();i++)
            {
                switch(fileLine.charAt(i))
                {
                    case 'a':
                        bufferWritter.write("y");
                        break;
                    case 'b':
                        bufferWritter.write("h");
                        break;
                    case 'c':
                        bufferWritter.write("e");
                        break;
                    case 'd':
                        bufferWritter.write("s");
                        break;    
                    case 'e':
                        bufferWritter.write("o");
                        break;
                   case 'f':
                        bufferWritter.write("c");
                        break;     
                   case 'g':
                        bufferWritter.write("v");
                        break; 
                   case 'h':
                        bufferWritter.write("x");
                        break; 
                   case 'i':
                        bufferWritter.write("d");
                        break; 
                   case 'j':
                        bufferWritter.write("u");
                        break; 
                   case 'k':
                        bufferWritter.write("i");
                        break; 
                   case 'l':
                        bufferWritter.write("g");
                        break; 
                   case 'm':
                        bufferWritter.write("l");
                        break; 
                   case 'n':
                        bufferWritter.write("b");
                        break; 
                   case 'o':
                        bufferWritter.write("k");
                        break; 
                   case 'p':
                        bufferWritter.write("r");
                        break; 
                   case 'q':
                        bufferWritter.write("z");
                        break; 
                   case 'r':
                        bufferWritter.write("t");
                        break; 
                   case 's':
                        bufferWritter.write("n");
                        break; 
                   case 't':
                        bufferWritter.write("w");
                        break; 
                   case 'u':
                        bufferWritter.write("j");
                        break; 
                   case 'v':
                        bufferWritter.write("p");
                        break; 
                   case 'w':
                        bufferWritter.write("f");
                        break; 
                   case 'x':
                        bufferWritter.write("m");
                        break; 
                   case 'y':
                        bufferWritter.write("a");
                        break; 
                   case 'z':
                        bufferWritter.write("q");
                        break; 
                   default:
                       bufferWritter.write(" ");
                
                }
            }
            bufferWritter.write("\n");
            temp++;
        }
        in.close();
        bufferWritter.close();
        
        
    }
}
