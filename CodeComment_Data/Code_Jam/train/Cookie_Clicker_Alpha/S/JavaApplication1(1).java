package methodEmbedding.Cookie_Clicker_Alpha.S.LYD985;

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
        double rate,f,c,x,time;
        for (int i = 0; i < n; i++) {
            String[] s=input.readLine().split(" ");
            rate=2.0;
            time=0.0;
            c=Double.parseDouble(s[0]);
            f=Double.parseDouble(s[1]);
            x=Double.parseDouble(s[2]);
           
             while((x/(rate+f))<((x-c)/rate)) {time+=(c/rate);rate+=f;}; 
             time+=(x/rate);
            
            output.writeBytes("Case #"+(i+1)+": "+time+"\n");
        }
        
        
    }
    
}
