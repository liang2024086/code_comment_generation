package methodEmbedding.Speaking_in_Tongues.S.LYD620;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author Nah-Abiah
 */
public class Speaking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* String path = "."; 
 
  String files;
  File folder = new File(path);
  File[] listOfFiles = folder.listFiles(); 
 
  for (int i = 0; i < listOfFiles.length; i++) 
  {
 
   if (listOfFiles[i].isFile()) 
   {
   files = listOfFiles[i].getName();
   System.out.println(files.toString());
   }
  }*/
        try{
            FileInputStream fstream = new FileInputStream("A-small-attempt0.in");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            String writeFile = "";
            int count = 1;
            int testCount = 0;
            while ((strLine = br.readLine()) != null)   {
                String newLine = "";           
                if(testCount == 0){
                    testCount = Integer.parseInt(strLine);
                } 
                else{  
                    String[] words = strLine.split(" ");
                    for(int i=0; i<words.length; i++){
                        for(int s=0; s<words[i].length(); s++){
                            switch (words[i].charAt(s)){                                
                                case 'a': newLine += "y"; break;
                                case 'b': newLine += "h"; break;
                                case 'c': newLine += "e"; break;
                                case 'd': newLine += "s"; break;
                                case 'e': newLine += "o"; break;
                                case 'f': newLine += "c"; break;
                                case 'g': newLine += "v"; break;
                                case 'h': newLine += "x"; break;
                                case 'i': newLine += "d"; break;
                                case 'j': newLine += "u"; break;                                   
                                case 'k': newLine += "i"; break;
                                case 'l': newLine += "g"; break;
                                case 'm': newLine += "l"; break;
                                case 'n': newLine += "b"; break;
                                case 'o': newLine += "k"; break;
                                case 'p': newLine += "r"; break;
                                case 'q': newLine += "z"; break;
                                case 'r': newLine += "t"; break;
                                case 's': newLine += "n"; break;
                                case 't': newLine += "w"; break;
                                case 'u': newLine += "j"; break;
                                case 'v': newLine += "p"; break;
                                case 'w': newLine += "f"; break;
                                case 'x': newLine += "m"; break;
                                case 'y': newLine += "a"; break;
                                case 'z': newLine += "q"; break;                                  
                            }                        
                        }
                        newLine += " ";                    
                }
                    writeFile += "Case #"+count+": "+newLine + "\r\n";
                    count++;
            }
            }
            in.close();
            try{
                FileWriter filestream = new FileWriter("output1.txt");
                BufferedWriter out = new BufferedWriter(filestream);
                out.write(writeFile);
                out.close();
            }
            catch (Exception e){//Catch exception if any
                System.err.println("Error: " + e.getMessage());
            }
        }
        catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage() + e.toString());
        }
    }
    
    
}
