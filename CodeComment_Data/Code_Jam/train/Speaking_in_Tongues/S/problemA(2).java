package methodEmbedding.Speaking_in_Tongues.S.LYD943;

import java.util.*;
public class problemA
{
    public static void main(String[]args)
    {
        char english[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
        char googles[] = {'y','n','f','i','c','w','l','b','k','u','o','m','x','s','e','v','z','p','d','r','j','g','t','h','a','q',' '};
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        for(int num=1;num<=N;num++)
        {
            String line = scanner.nextLine();
            int len = line.length();
            String res = "";
            for(int i=0;i<len;i++)
                for(int j=0;j<27;j++)
                    if(line.charAt(i)==googles[j])
                        res+=english[j];
            System.out.println("Case #"+num+": "+res);
        }
    }
}
