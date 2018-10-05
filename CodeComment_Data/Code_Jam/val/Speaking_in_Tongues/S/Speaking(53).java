package methodEmbedding.Speaking_in_Tongues.S.LYD386;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author priyankle
 */
import java.io.*;
public class Speaking {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
    FileInputStream fstream = new FileInputStream("/home/priyankle/Desktop/text.txt");

    DataInputStream in = new DataInputStream(fstream);
    BufferedReader br = new BufferedReader(new InputStreamReader(in));
    String strLine;
    
    //Read File Line By Line
    String scan[] = null;
    int i=0,j=0,flag=1;
 
        File file=new File("output.txt");
    FileWriter fileWritter = new FileWriter(file.getName(),true);
    BufferedWriter bufferWritter = new BufferedWriter(fileWritter);

    strLine=br.readLine();
    i=strLine.charAt(0)-48;
    
    while ((strLine = br.readLine()) != null)  
    {
      bufferWritter.write("Case #"+flag+": ");

    System.out.println (strLine);

    for(i=0;i<strLine.length();i++)
    {
            switch(strLine.charAt(i))
            {
                case 'a':
                   bufferWritter.write('y');
                    break;
                case 'b':
                   bufferWritter.write('h');
                    break;
                case 'c':
                   bufferWritter.write('e');
                   break;
                case 'd':
                   bufferWritter.write('s');
                    break;
                case 'e':
                   bufferWritter.write('o');
                    break;
                case 'f':
                   bufferWritter.write('c');
                    break;
                case 'g':
                   bufferWritter.write('v');
                   break;
                case 'h':
                   bufferWritter.write('x');
                   break;
                case 'i':
                   bufferWritter.write('d');
                   break;
                case 'j':
                   bufferWritter.write('u');
                   break;
                case 'k':
                   bufferWritter.write('i');
                   break;
                case 'l':
                   bufferWritter.write('g');
                   break;
                case 'm':
                   bufferWritter.write('l');
                   break;
                case 'n':
                   bufferWritter.write('b');
                   break;
                case 'o':
                   bufferWritter.write('k');
                   break;
                case 'p':
                   bufferWritter.write('r');
                   break;
                case 'q':
                   bufferWritter.write('z');
                   break;
                case 'r':
                   bufferWritter.write('t');
                                    break;

                case 's':
                   bufferWritter.write('n'); 
                                    break;

                case 't':
                   bufferWritter.write('w');
                                    break;

                case 'u':
                   bufferWritter.write('j');
                                    break;

                case 'v':
                   bufferWritter.write('p');
                                    break;

                case 'w':
                   bufferWritter.write('f');
                                    break;

                case 'x':
                   bufferWritter.write('m');
                                    break;

                case 'y':
                   bufferWritter.write('a');
                                    break;

                case 'z':
                   bufferWritter.write('q');
                                    break;

                default:
                   bufferWritter.write(' ');

                
            }
            
            
                
}

flag++;
                       bufferWritter.write("\n");
        
        }
        
    in.close();
    bufferWritter.close();
    
    
    

    
  
    
    
    }
}
