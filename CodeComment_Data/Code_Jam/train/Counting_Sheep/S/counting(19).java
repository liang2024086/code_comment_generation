package methodEmbedding.Counting_Sheep.S.LYD624;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shash
 */
public class counting_sheep {
public static void main(String arg[])
{
    File f=new File("d:\\in.in");
    File f1=new File("d:\\out.txt");
    BufferedWriter writer=null;
    BufferedReader reader=null;
    try {
        reader=new BufferedReader(new FileReader(f));
        writer=new BufferedWriter(new FileWriter(f1));
        int count=Integer.parseInt(reader.readLine());
        int x=1;
        
        while(x<=count)
        {
           String n=reader.readLine(); 
           System.out.println(n);
           int counter_inside=1;
           int number[]={0,0,0,0,0,0,0,0,0,0};
           
           while(true)
           {
              int  n1=Integer.parseInt(n)*counter_inside;
              String xx=Integer.toString(n1);              
            String split[]=xx.split("");
            for(int y=0;y<split.length;y++)
            {
                int val=Integer.parseInt(split[y]);
                if(number[val]==0)
                {
                  number[val]=1;
                  
                } 
                
            }
            if(IntStream.of(number).sum()==10)
            {
                writer.write("Case #"+x+": "+xx+"\n");
            break;   
            } 
            int ch=Integer.parseInt(xx);
            if(ch==0)
            {
                writer.write("Case #"+x+": INSOMNIA\n");
                break;
            }
            counter_inside++;
           }
        x++;
        }
    } catch (FileNotFoundException ex) {
        Logger.getLogger(counting_sheep.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(counting_sheep.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
        try {
            writer.close();
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(counting_sheep.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
}
