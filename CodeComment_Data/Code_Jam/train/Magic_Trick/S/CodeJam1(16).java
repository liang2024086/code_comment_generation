package methodEmbedding.Magic_Trick.S.LYD1725;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author V Pavan Kumar
 */
public class CodeJam1 {
    public static void main(String args[])
    {
        int rowNo;
        int seq1[] = new int[10];
        int seq2[] = new int[10];
        int[] soln = new int[4];
        int sno = 0;
        String Filename = "C:\\Users\\V Pavan Kumar\\TAS\\Reverse Coding\\Reverse_Coding\\src\\A-small-attempt.txt";
     try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\V Pavan Kumar\\TAS\\Reverse Coding\\Reverse_Coding\\src\\A-small-attempt0.in"))) {
        //StringBuilder sb = new StringBuilder();
        String line= br.readLine();
        PrintWriter writer = new PrintWriter(Filename,"UTF-8");
            int T = Integer.parseInt(line);
            for(int i = 0;i<T;i++)
            {
                sno = 0;
               rowNo = Integer.parseInt(line=br.readLine());
                for(int j = 0;j < rowNo;j++)
                    line = br.readLine();
               for(int k = 0;k<4;k++)
                    seq1[k] = Integer.parseInt(line.split(" ")[k]);
               for(int j = rowNo;j < 4;j++)
                   line = br.readLine();
               rowNo = Integer.parseInt( br.readLine());
               for(int j = 0;j < rowNo;j++)
                   line = br.readLine();
               for(int k = 0;k<4;k++)
                   seq2[k] = Integer.parseInt(line.split(" ")[k]);
               for(int j = rowNo;j < 4;j++)
                   line = br.readLine();
                for(int j = 0;j < 4;j++)
                    for(int k = 0;k < 4;k++)
                        if(seq1[j] == seq2[k])
                        {
                            soln[sno] = seq1[j];
                            sno++;
                        }
                if(sno == 0)
                    writer.println("Case #"+(i+1)+": Volunteer cheated!");
                else if(sno == 1)
                    writer.println("Case #"+(i+1)+": "+soln[sno-1]);
                else
                    writer.println("Case #"+(i+1)+": Bad magician!");
            }
            
        writer.close();
    br.close();
     }
     catch(Exception e)
     {
        System.out.println("Error: "+e.getMessage()) ;
        System.out.println(e.toString());
    }
     
    }
}
