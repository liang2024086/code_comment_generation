package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1074;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;

/**
 *
 * @author Sachin
 */
public class GCJ_revengeofpancakes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         int t = 0;
        int num = 0;

        File file = new File("output.txt");
        FileWriter fileWritter = new FileWriter(file.getName(), true);
        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
        
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
               
        int learn = 0, flag = 0, j = 0;
        String input="";
        char hold=' ';

        
            
        
            
            t = Integer.parseInt(bf.readLine());
            for(j=0;j<t;j++)
            {
                input=bf.readLine();
                //System.out.println(input);
                int moves=0;
                hold=' ';
                for(int i=0;i<input.length();i++)
                {
                    switch(input.charAt(i))
                    {
                        case '+':
                            i=input.indexOf('-',i)-1;
                            hold='+';
                            break;
                        case '-':
                            i=input.indexOf('+',i)-1;
                            if(hold==' ')
                                moves+=1;
                            else
                                moves+=2;
                            hold='+';
                            //System.out.println(i);
                    }
                    if(i<0)
                        break;
                }
                flag=1;
                num++;
                bufferWritter.write("Case #"+num+": "+moves+"\n");
                System.out.println("Case #"+num+": "+moves);
            }
            
        
        bufferWritter.close();
    }
}
