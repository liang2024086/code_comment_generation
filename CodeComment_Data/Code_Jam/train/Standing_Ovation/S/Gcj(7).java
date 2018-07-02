package methodEmbedding.Standing_Ovation.S.LYD177;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Zia Ul Rehman Mughal
 */
public class Gcj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            BufferedReader br=new BufferedReader(new FileReader("A-small-attempt0.in"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("output.out"));
            int n=Integer.parseInt(br.readLine());
            for(int i=0;i<n;i++)
            {
                String in=br.readLine();
                String []parts=in.split("[ ]");
                int msh=Integer.parseInt(parts[0]);
                char []list=parts[1].toCharArray();
                
                int []lst=new int[list.length];
                for(int m=0;m<list.length;m++)
                    lst[m]=((int)list[m])-48;
                
                int total=0,needed=0;
                for(int j=0;j<lst.length;j++)
                {
                    if(total<j && lst[j]!=0){
                        needed+=(j-total);
                        total+=(j-total);
                    }
                    total+=lst[j];
                }
                //System.out.println("Case #"+(i+1)+": "+needed);
                bw.write("Case #"+(i+1)+": "+needed);
                bw.newLine();
            }
            bw.flush();
            bw.close();
            br.close();
            
        }
        catch(Exception e)
        {
            
        }
    }
    
}
