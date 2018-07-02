package methodEmbedding.Speaking_in_Tongues.S.LYD294;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Codejam {

    /**
     * @param args the command line arguments
     */
    public Map m;
    public  BufferedReader input;
    public  BufferedWriter output;
    
    
    public Codejam()
    {
       
            m = new HashMap();
            m.put("y", "a");
            m.put("n", "b");
            m.put("f", "c");
            m.put("i", "d");
            m.put("c", "e");
            m.put("w", "f");
            m.put("l", "g");
            m.put("b", "h");
            m.put("k", "i");
            m.put("u", "j");
            m.put("o", "k");
            m.put("m", "l");
            m.put("x", "m");
            m.put("s", "n");
            m.put("e", "o");
            
            m.put("v", "p");
            m.put("z", "q");
            m.put("p", "r");
            m.put("d", "s");
            m.put("r", "t");
            m.put("j", "u");
            m.put("g", "v");
            m.put("t", "w");
            m.put("h", "x");
            m.put("a", "y");
            m.put("q", "z");
            m.put(" ", " "); 
            
            
            //-----File initialization
             try {
           input = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream("A-small-attempt0.in"))));
           output = new BufferedWriter(new FileWriter(new File("b.out")));
        } catch (IOException ex) {
            Logger.getLogger(Codejam.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    public static void main(String[] args) {
        
        Codejam c = new Codejam();
        
       String strLine;
       int nol;
       
     
        try {
                  nol =  Integer.parseInt(c.input.readLine());
            
                  for(int i =1 ; i <= nol ; i++)
                  {
                      strLine=c.input.readLine();
                      
           
                      c.output.append("Case #"+i+": ");
                      for(int j = 0 ; j<strLine.length() ; j++)
                      {
                            c.output.append(c.m.get(Character.toString(strLine.charAt(j))).toString());
                      }

                      if(i!= nol)  c.output.newLine();
                      
                      
                      
                  }
                  
                  c.input.close();
                  c.output.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Codejam.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
                
                
    }
}
