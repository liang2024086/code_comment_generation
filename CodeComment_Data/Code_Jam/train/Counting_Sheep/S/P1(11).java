package methodEmbedding.Counting_Sheep.S.LYD1598;

 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class P1
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        for(int t=1;t<=T;t++) {
            int N= sc.nextInt();
            int mask = 0;
            if(N==0) {
                System.out.println("Case #"+t+": INSOMNIA");
                continue;
            }
            int i;
            for(i=1;i<101;i++) {
                int res=N*i;
                while(res!=0) {
                    mask |= 1 << (res%10);
                    res/=10;
                }
                if(mask==1023)
                    break;
            }
            if(i==101)
                System.out.println("Case #"+t+": INSOMNIA");
            else
                System.out.println("Case #"+t+": "+N*i);
        }
    }
}
