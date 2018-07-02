package methodEmbedding.Cookie_Clicker_Alpha.S.LYD617;

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
        FileReader fr=new FileReader("B-small-attempt1.in");

        BufferedReader br=new BufferedReader(fr);
        String st=br.readLine();
        int n=Integer.parseInt(st);
        System.out.println(n);
        Double ans=0.0;
       for(int i=0;i<n;i++)
       {
        
        String s1 = "",ss= "";
        ss=br.readLine();
        String ary[]=ss.split(" ");
        double C,F,X,t1 = 0,t2 = 0,temp=0,f=2;
        C=Double.parseDouble(ary[0]);
        F=Double.parseDouble(ary[1]);
        X=Double.parseDouble(ary[2]);
        while(t1>=t2)
        {

            t1=temp+(X/f);
            
            temp=temp+(C/f);
            f=f+F;
           t2=temp+(X/f);
        }

      ans=t1;
       FileWriter fw=new FileWriter("a.txt",true);
       PrintWriter pw = new PrintWriter(fw);
      
       pw.println("Case #"+(i+1)+": "+ans);
       System.out.println(ans);
      
       pw.close();
       }
       
fr.close();
        
    }

}
