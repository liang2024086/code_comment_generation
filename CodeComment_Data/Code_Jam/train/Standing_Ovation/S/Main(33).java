package methodEmbedding.Standing_Ovation.S.LYD1147;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException
{
    Scanner sc = new Scanner(new FileReader("A-small-attempt0.in"));
    PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
    String a=sc.nextLine();
    int t=Integer.parseInt(a);
    int ans[]=new int[t];
    for(int i=0;i<t;i++)
    {
        a=sc.nextLine();
        String[] b=new String[2];
        b=a.split(" ");
        int s=Integer.parseInt(b[0]);
        int arr[]=new int[s+1];
        int abc[]=new int[s+1];
        int cnt=0;
        for(int j=0;j<=s;j++)
        {
            arr[j]=(int)(b[1].charAt(j)-48);
            if(j!=0 && j>abc[j-1])
            {
                cnt=cnt+j-abc[j-1];
                abc[j-1]=j;
            }
            if(j==0)
                 abc[j]=arr[j];
            else
                abc[j]=abc[j-1]+arr[j];
            //System.out.println(i+" "+j+" "+arr[j]+" "+abc[j]+" "+cnt);

        }
        ans[i]=cnt;
    }
   for(int i=0;i<t;i++)
        {
           pw.println("Case #"+(i+1)+": "+ans[i]);
        }
       pw.flush();
        pw.close();
       sc.close();


}
}
