package methodEmbedding.Standing_Ovation.S.LYD1677;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.out;

/**
 *
 * @author Administrator
 */
public class GoogleJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
        FileReader read=new FileReader("input.txt");
        BufferedReader in=new BufferedReader(read);
         FileWriter write=new FileWriter("output.txt");
        BufferedWriter out=new BufferedWriter(write);
       
        String input=in.readLine();
        int index=1;
        while((input=in.readLine())!=null)
        { 
        String[] inputParts=input.split(" ");
        int max=Integer.parseInt(inputParts[0].trim());
        char[] shy=inputParts[1].trim().toCharArray();
        int[] entries=new int[shy.length];
        for(int i=0;i<shy.length;i++)
        {
            String a=Character.toString(shy[i]);
            entries[i]=Integer.parseInt(a);
        }
        int previousSum=0;
        int answer=0;
        int difference=0;
       if(entries[0]==0)
       {
          answer=1;
          previousSum=1;
       }
       for(int j=1;j<entries.length;j++)
       {
            previousSum=previousSum+(entries[j-1]);
           if(previousSum<j)
           {
               difference=j-previousSum;
               answer=answer+difference;
               previousSum=previousSum+difference;
             //  System.out.println("Answer:   "+answer);
            //   System.out.println("interim:   "+previousSum);
           }
        //  System.out.println(j+"   "+previousSum);
           
       }
       out.write("Case #"+index+": "+answer);
       out.newLine();
      System.out.println(inputParts[1]+"   Case #"+index+": "+answer);
      index++;
    }
        in.close();
        out.close();
        }
    
          catch(IOException e){}
    }
  
}
