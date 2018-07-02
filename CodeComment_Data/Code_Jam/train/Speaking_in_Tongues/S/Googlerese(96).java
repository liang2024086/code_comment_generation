package methodEmbedding.Speaking_in_Tongues.S.LYD340;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Ed??sio
 */
public class Googlerese {
    
    public static void main(String[] args) {
        
        HashMap<String,String> dic = new HashMap<String, String>(); //googlerese map dictionary
        dic.put("y", "a");
        dic.put("n", "b");
        dic.put("f", "c");
        dic.put("i", "d");
        dic.put("c", "e");
        dic.put("w", "f");
        dic.put("l", "g");
        dic.put("b", "h");
        dic.put("k", "i");
        dic.put("u", "j");
        dic.put("o", "k");
        dic.put("m", "l");
        dic.put("x", "m");
        dic.put("s", "n");
        dic.put("e", "o");
        dic.put("v", "p");
        dic.put("z", "q");
        dic.put("p", "r");
        dic.put("d", "s");
        dic.put("r", "t");
        dic.put("j", "u");
        dic.put("g", "v");
        dic.put("t", "w");
        dic.put("h", "x");
        dic.put("a", "y");
        dic.put("q", "z");
        dic.put(" ", " ");
        
        /* input file */
        File in = new File("A-small-attempt0.in");  
        File out = new File("out.txt");  
        String lineOut;
        ArrayList<String> output = new ArrayList<String>();
               
        try {
            
            FileReader fr = new FileReader(in);
            BufferedReader br = new BufferedReader(fr);
            int numOfCases = Integer.valueOf(br.readLine());
            String line;
            for(int i = 1; i <= numOfCases; i++){
                line = br.readLine();
                lineOut = "";
                //translate line
                for(int j=0; j<line.length(); j++){
                    lineOut += dic.get(String.valueOf(line.charAt(j)));
                }
                //include line in output
                output.add(lineOut);
            }
            
            FileWriter fw = new FileWriter(out);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i = 0; i < output.size(); i++){
                bw.write("Case #" + (i+1) + ": ");
                bw.write(output.get(i));
                bw.write("\n");
            }
            
            br.close();
            fr.close();	
            bw.close();
            fw.close();
            
            JOptionPane.showMessageDialog(null, 
                    "Finished!","Ok",JOptionPane.INFORMATION_MESSAGE);


        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, 
                    ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }
    
    
}

