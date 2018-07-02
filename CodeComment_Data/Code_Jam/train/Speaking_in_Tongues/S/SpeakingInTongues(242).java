package methodEmbedding.Speaking_in_Tongues.S.LYD404;

//Kholofelo Moyaba
//Problem A codejam
//14 April 2012

import java.util.Scanner;

class SpeakingInTongues
{
 public static void main(String[] args)
    {
        //worked out using sample
        char[] LOOKUP = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
        Scanner input = new Scanner(System.in);
        int cases = Integer.parseInt(input.nextLine().trim());//problem with java scanner
        for(int i=1;i<=cases;i++)
        {
            char[] g = input.nextLine().toCharArray();
            for(int j=0;j<g.length;j++)
                if(g[j]!=' ')
                    g[j] = LOOKUP[g[j]-97];//according to acsii
            System.out.println("Case #"+i+": "+new String(g));
        }
    }
}
