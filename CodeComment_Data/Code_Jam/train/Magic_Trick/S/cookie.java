package methodEmbedding.Magic_Trick.S.LYD1093;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shashank
 */
public class cookie {
    
    
    public static void main(String arg[]) throws FileNotFoundException, IOException
    {
        File f=new File("input.in");
        File f1=new File("result.out");
        
        BufferedReader buffer=new BufferedReader(new FileReader(f));
        BufferedWriter writer=new BufferedWriter(new FileWriter(f1));
        int s=Integer.parseInt(buffer.readLine());
        int count=1;
        while(count!=s+1)
        {   int counter=0;
            String string=null;
            int a=Integer.parseInt(buffer.readLine());
            for(int x=1;x<=a-1;x++)
            {
            buffer.readLine();
            }
            String st=buffer.readLine();
            String row1[]=st.split(" ");
            for(int x=a;x<4;x++)
            {
            buffer.readLine();
            }
            int b=Integer.parseInt(buffer.readLine());
            for(int x=1;x<=b-1;x++)
            {
            buffer.readLine();
            }
            String st1=buffer.readLine();
            String row2[]=st1.split(" ");
            for(int x=b;x<4;x++)
            {
            buffer.readLine();
            }
            for(int x=0;x<4;x++)
            {
            for(int y=0;y<4;y++)
            {
            if(row1[x].equals(row2[y]))
            {
            counter=counter+1;
            string=row1[x];
            }
            }
            }
            if(counter==0)
            {
            writer.write("Case #"+count+": Volunteer cheated!");
            writer.newLine();
            }
            else if(counter>1)
            {
            writer.write("Case #"+count+": Bad magician!");
            writer.newLine();
            }
            else
            {
            writer.write("Case #"+count+": "+string);
            writer.newLine();
            }
            count=count+1;
        }
        buffer.close();
        writer.close();
    }
    
}

