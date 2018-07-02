package methodEmbedding.Magic_Trick.S.LYD150;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Aloha
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {

        FileReader in=new FileReader("C:/Users/Aloha/Documents/NetBeansProjects/JavaApplication1/src/javaapplication1/A-small-attempt2.in");
        FileWriter out=new FileWriter("C:/Users/Aloha/Documents/NetBeansProjects/JavaApplication1/src/javaapplication1/out.txt");
       Scanner filescanner=new Scanner(in); 
        try
        {
            int c,i=1,a1,a2,j=0,k=0,answ,ans=0;
            int[][] arr1=new int[4][4],arr2=new int[4][4];
            
            c=filescanner.nextInt();
            i=c;
           
            while(i!=0)
            {
                answ=0;
                a1=filescanner.nextInt();
                
                for(j=0;j<=3;j++)
                {
                    for(k=0;k<=3;k++)
                    {
                        arr1[j][k]=filescanner.nextInt();
                        
                    }
                                    }
                a2=filescanner.nextInt();
                
                for(j=0;j<=3;j++)
                {
                    for(k=0;k<=3;k++)
                    {
                        arr2[j][k]=filescanner.nextInt();
                        
                    }
                    

                }
                
                    
                for(j=0;j<=3;j++)
                {
                    for(k=0;k<=3;k++)
                    {
                    if(arr1[a1-1][j]==arr2[a2-1][k])
                    {
                    
                        ans=arr1[a1-1][j];
                     
                        answ++;
                    }
                    }
                }
                
                if(answ>1)
                {
                   out.write("Case #"+(c-i+1)+":"+" Bad magician!\n");
                }
                else if(answ==0)
                {
                    out.write("Case #"+(c-i+1)+":"+" Volunteer cheated!\n");
                    
                }
                else if(answ==1)
                {
                    out.write("Case #"+(c-i+1)+":"+" "+ans+"\n");
                     
                }
               
                i--;
            }
            
        }
        finally
        {
            in. close();
            out.close();
        }
        
        // TODO code application logic here
    }
}
