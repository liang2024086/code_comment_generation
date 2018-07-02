package methodEmbedding.Revenge_of_the_Pancakes.S.LYD898;

import java.util.Scanner;
public class QR_B
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();        
        for(int x=1;x<=T;x++)
        {
            int ctr=0;
            String s=scan.next();
            for(int i=0;i<s.length()-1;i++)
                if(s.charAt(i)!=s.charAt(i+1))
                    ctr++;
            if(s.charAt(s.length()-1)=='-')
                ctr++;
            
            System.out.println("Case #"+x+": "+ctr);
           
        }
    }
}
