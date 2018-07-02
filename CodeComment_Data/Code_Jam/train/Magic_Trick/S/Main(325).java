package methodEmbedding.Magic_Trick.S.LYD1526;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author Dilshan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr=new FileReader("A-small-attempt1.in");

        BufferedReader br=new BufferedReader(fr);
        String st=br.readLine();
        int n=Integer.parseInt(st);
        System.out.println(n);
        String ans="";
       for(int i=0;i<n;i++)
       {
        String a1=br.readLine();
        int an1=Integer.parseInt(a1);
        String s1 = "",ss= "";
        for(int j=1;j<=4;j++)
        {
            if(j==an1)
            s1=br.readLine();
            else
                ss=br.readLine();
        }

       String arr1[]=s1.split(" ");
       String a2=br.readLine();
          // System.out.println(a2);
        int an2=Integer.parseInt(a2);
        String s2 = "";
        for(int j=1;j<=4;j++)
        {
           // System.out.println(ss);
            if(j==an2)
            s2=br.readLine();
                 else
                ss=br.readLine();
        }

       String arr2[]=s2.split(" ");
          // System.out.println(arr1.length+" "+arr2.length);
       int l=0,t = 0;
       for(int q=0;q<4;q++)
       {
        for(int w=0;w<4;w++)
            {
                if(arr1[q].equals(arr2[w]))
                {
                    l++;
                    t=q;
                }
            }

       }
       FileWriter fw=new FileWriter("a.txt",true);
       PrintWriter pw = new PrintWriter(fw);
       if(l==1)
       {
            ans=arr1[t];

       }
       else if(l>0)
       {
            ans="Bad magician!";

       }
       else
       {
        ans="Volunteer cheated!";
       }
       pw.println("Case #"+(i+1)+": "+ans);
       System.out.println(ans);
      
       pw.close();
       }
       
fr.close();
        
    }

}
