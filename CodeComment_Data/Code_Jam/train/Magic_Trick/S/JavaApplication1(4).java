package methodEmbedding.Magic_Trick.S.LYD1869;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author wahbi
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        RandomAccessFile input = new RandomAccessFile("/home/wahbi/NetBeansProjects/JavaApplication1/src/javaapplication1/input.txt","r");
        RandomAccessFile output = new RandomAccessFile("/home/wahbi/NetBeansProjects/JavaApplication1/src/javaapplication1/output.txt","rw");

        int n=Integer.parseInt(input.readLine());
        String [] sx=new String[4];
        for (int i = 0; i < n; i++) {
            int x=Integer.parseInt(input.readLine());
            String s=new String();
            
            for (int j = 0; j < 4 ; j++) {
                s=input.readLine();
                if (j==x-1)  {sx=s.split(" ");}
            }
            int y=Integer.parseInt(input.readLine());
            String [] sy=new String[4];
            
            for (int j = 0; j < 4 ; j++) {
                s=input.readLine();
                if (j==y-1)  {sy=s.split(" ");}
            }
            String msg="Volunteer cheated!";
            int a=0;
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (sx[j].equals(sy[k])){ msg=sx[j];a++;};
                    
                }
                if (a>1){msg="Bad magician!";};
                
                
            }
            output.writeBytes("Case #"+(i+1)+": "+msg+"\n");
        }
        
        
    }
    
}
