package methodEmbedding.Standing_Ovation.S.LYD730;

//code JAM Ques1
import java.io.*;
import java.util.*;

class googCJA11
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t,smax,z,i,s[],add;
        String in[];    
        t=Integer.parseInt(br.readLine());
        for(z=1;z<=t;z++)
        {
            in=br.readLine().split(" ");
            smax=Integer.parseInt(in[0]);
            s=new int[smax+2];
            for(i=1;i<=smax+1;i++)
                s[i]=Integer.parseInt(Character.toString(in[1].charAt(i-1)));
            for(i=2;i<=smax+1;i++)
                s[i]+=s[i-1];
            add=0;
            for(i=1;i<=smax+1;i++)
            {
                if((s[i]+add)<i)
                {
                    add++;
                    i--;
                }
            }
            System.out.printf("Case #%d: %d\n",z,add);
        }
    }
}
