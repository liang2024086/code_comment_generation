package methodEmbedding.Magic_Trick.S.LYD459;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author User
 */
public class MajicTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String file = "A-small-attempt3.in";
        String outFile="A-small-attempt3.out";

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        int numCases=0;

        BufferedWriter writer = null;
    writer = new BufferedWriter( new FileWriter( outFile));
  

/*
while ((line = br.readLine()) != null) {
    System.out.println(line);
   // process the line.
}
        */

if ((line = br.readLine()) != null)
{
    numCases=Integer.parseInt(line);
    
    int rowChosen;
        String tmp[]= new String[4];
        String tmp2[]= new String[4];
        
    
    for(int i=0; i<numCases; i++)
    {
        line = br.readLine();
        rowChosen=Integer.parseInt(line);
      
        for(int ii=0; ii<4; ii++)
        {
            line = br.readLine();
            if(rowChosen==ii+1)
            {System.out.println(rowChosen);
            System.out.println(line);
                tmp=line.split(" ");
                
            }
        }
        
        line = br.readLine();
        rowChosen=Integer.parseInt(line);
        
        for(int ii=0; ii<4; ii++)
        {
            line = br.readLine();
            if(rowChosen==ii+1)
            {
               System.out.println(rowChosen);
                System.out.println(line);
                tmp2=line.split(" ");
            }
        }
        
        int t[]=new int[4];
        String reslt="";
        
        for(int ii2=0; ii2<4; ii2++)
        {
            int e=-7;
         //   for(int e=0)
            e= java.util.Arrays.asList(tmp).indexOf(tmp2[ii2]);
            if(e>=0)
            {
                t[ii2]++;
            System.out.println(e+" "+t[ii2]);
           
                reslt=tmp2[ii2];
            }
        }
        
        int tot=0;
        
        for(int ii=0; ii<4; ii++)
        {
            tot +=t[ii];   
        }
        
        if(tot ==1)
        {
            System.out.println("Case #"+(i+1)+": "+reslt);
            writer.write( "Case #"+(i+1)+": "+reslt);
            writer.newLine();
        }
        else if(tot >1)
        {
            System.out.println("Case #"+(i+1)+": "+"Bad magician!");
            writer.write( "Case #"+(i+1)+": "+"Bad magician!");
            writer.newLine();
        }
        else
        {
            System.out.println("Case #"+(i+1)+": "+"Volunteer cheated!");
            writer.write( "Case #"+(i+1)+": "+"Volunteer cheated!");
            writer.newLine();
        }
    }
}

  
    writer.close();

br.close();

    }
    
}
