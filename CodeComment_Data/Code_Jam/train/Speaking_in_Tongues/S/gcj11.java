package methodEmbedding.Speaking_in_Tongues.S.LYD65;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class gcj11 
{
    public static void main(String args[])throws Exception
    {
        
        Scanner in=new Scanner(new File("C:/Users/Rakesh/Downloads/A-small-attempt.in"));
        FileWriter fstream = new FileWriter("c:/out.out");
        BufferedWriter out = new BufferedWriter(fstream);
        int t,i;
         String sm="yhesocvxduiglbkrztnwjpfmaq ";
       //String r="abcdefghijklmnopqrstuvwxyz ";
         t=in.nextInt();
         in.nextLine();
        String st[]=new String[t];
        String res[]=new String[t];
        for(i=0;i<t;i++) 
        {
            st[i]=in.nextLine();
        }
        for(i=0;i<t;i++)
        {
            res[i]="";
            for(int j=0;j<st[i].length();j++)
            {
               
                    if(st[i].charAt(j)!=' ')
                    {
                        int m=st[i].charAt(j)-97;
                        res[i]+=sm.charAt(m);
                        
                    }
                    else
                        res[i]+=" ";
                
            }
        }
        for(i=0;i<t;i++)
        {
            try{
              
             out.write("Case #"+(i+1)+": "+res[i]+"\n");
             
                }
            catch (Exception e)
            {//Catch exception if any
                    System.err.println("Error: " + e.getMessage());
             }
            //System.out.println("Case #"+(i+1)+": "+res[i]);
          }
       
    out.close();
}
}
