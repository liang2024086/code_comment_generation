package methodEmbedding.Standing_Ovation.S.LYD1944;

import java.util.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args) throws FileNotFoundException{
        File c = new File ("A-small-attempt1.in");
        File d = new File ("A-small-attempt1.out");
        Scanner in = new Scanner (c);
        PrintWriter out = new PrintWriter (d);
        int T, V[]= new int [7], Smax,y=0, j=0;
        T=in.nextInt();
        for(int i=0; i<T; i++)
        {
            int k=0;
            y=0;
            do{
                Smax = in.nextInt();
            }while(Smax<0||Smax>6);
            String s=in.nextLine();
            for(j=0; j<s.length()-1; j++)
                V[j]=(int)s.charAt(j+1)-48;
            y=V[0];
            for(j=1; j<s.length()-1; j++)
            {
                if(V[j]!=0)
                {
                    if(y<j)
                    {
                        k=k+j-y;
                        y=j;
                    }
                }
                y+=V[j];
            }
                
            out.println("Case #"+(i+1)+": "+k);
        }
        
        out.close();
        }
        
}
