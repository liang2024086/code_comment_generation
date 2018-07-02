package methodEmbedding.Magic_Trick.S.LYD170;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bhageera
 */
public class Codejam_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //  compairArray ob=new compairArray();
      //  System.out.println(ob.compair("5 6 7 8","5 6 7 8"));
        
        
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw=null;
        try {

            String sCurrentLine;
            br = new BufferedReader(new FileReader("C:\\Users\\Bhageera\\Desktop\\A-small-attempt0.IN"));
            File file = new File("C:\\Users\\Bhageera\\Desktop\\out_i.text");

            if (!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file.getAbsoluteFile());
            bw = new BufferedWriter(fw);
            
           List oo=new ArrayList();
           int count=0;
           int valueOf=0;
            while ((sCurrentLine = br.readLine()) != null) {
                
                try{
                    if(Integer.valueOf(sCurrentLine)!=null){
                         valueOf = Integer.valueOf(sCurrentLine);
                        count=0;
                    } else{
                        
                    }
                }catch(Exception e)
                {
                    
                    if(count==valueOf){
                        //System.out.println(sCurrentLine);
                        oo.add(sCurrentLine);
                    }

                }                
                
             count++;
            }
            
            compairArray ooo=new compairArray();
         ooo.iter(oo);
            
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                 bw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
        
    }
    
}
