package methodEmbedding.Revenge_of_the_Pancakes.S.LYD959;


import java.util.Scanner;

public class Main {
    public static void main(String args[])
{
       Scanner sc=new Scanner(System.in);
       int t;
       String v;
       int count=0;
       t=sc.nextInt();
       for(int i=0;i<t;i++)
       {
           count=0;
        v=sc.next();
        for(int j=0;j<v.length()-1;j++)
        {
            if(v.charAt(j)!=v.charAt(j+1))
                   count++;
        }
        if(v.charAt(v.length()-1)=='-')
        count++;
        System.out.println("Case #"+(i+1)+": "+count);
       }
 }
}
