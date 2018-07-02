package methodEmbedding.Speaking_in_Tongues.S.LYD1138;

/**
 *
 * @author Prasun
 */
import java.io.*;
public class A2012 {
    public static void main(String prsn[]) throws Exception
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        char[] fl=null;
        char[] arr={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
        String input, output;
        int T, ind, i,n, cnt=1;
        T=Integer.parseInt(br.readLine());
        while(T>0)
        {
            input=br.readLine();
            n=input.length();
            fl=new char[101];
            for(i=0;i<n;i++)
            {
                ind=((int)input.charAt(i)) - 97;
                if(ind<0)
                    fl[i]=' ';
                else
                    fl[i]=arr[ind];
            }
            output=new String(fl,0,n);
            System.out.println("Case #" + cnt + ": " + output);
            cnt++;
            T--;
        }

    }
}
