package methodEmbedding.Revenge_of_the_Pancakes.S.LYD667;

 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class P2
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        for(int t=1;t<=T;t++) {
            char pc = '0';
            char str[]=sc.next().toCharArray();
            int n=0;
            for(int i=0;i<str.length;i++) {
                char c = str[i];
                if(c==pc)
                    continue;
                n++;
                pc=c;
            }
            if(pc=='+')
                n--;
            System.out.println("Case #"+t+": "+n);
        }
    }
}
