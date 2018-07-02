package methodEmbedding.Standing_Ovation.S.LYD860;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nancy
 */
public class CodeJAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("small.in");
            //BufferedReader bufReader = new BufferedReader(reader);
            Scanner in=new Scanner(reader);
            File file = new File("small.out");
            FileWriter writer = new FileWriter(file);
            int t=in.nextInt();
            int i,s,j,tp=0,d,friends=0;
            String str;
            for(i=0;i<t;i++)
            {
                s=in.nextInt();
                //System.out.println("s="+s);
                str=in.next();
                //System.out.println("str="+str);
                for(j=0;j<str.length();j++)
                {
                    d=Integer.parseInt(str.charAt(j)+"");
                   // System.out.println("d="+d);
                    if(d!=0){
                    if(j==0)
                        tp=d;
                    else
                        if(tp>=j)
                            tp=tp+d;
                    else
                        {
                            friends+=(j-tp);
                            tp=j+d;
                        }
                    }
                    
                }
                //System.out.println("friends="+friends);
                writer.write("Case #"+(i+1)+": "+friends+"\n");
                tp=0;
                friends=0;
                
            }
            
            
            
            
            
            
            
            
            writer.close();
        } catch (Exception ex) {
            Logger.getLogger(CodeJAM.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(CodeJAM.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
