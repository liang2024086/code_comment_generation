package methodEmbedding.Counting_Sheep.S.LYD1174;

import java.io.*;
import java.util.*;
class code
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader br = new BufferedReader
        (new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++)
        {
            int N = Integer.parseInt(br.readLine());
            int S[] = {11,11,11,11,11,11,11,11,11,11};
            int s[] = {0,1,2,3,4,5,6,7,8,9};
            int x = 0;long m;
            if(N!=0)
            {
            do
            {
                    int i,j;
                    x = ++x;
                    long y = (x)*N;
                    m = y;
                   // System.out.println(y);
                    while(y>0)
                    {
                        long d = y%10;
                        //System.out.println(d);
                        int ret = Arrays.binarySearch(S,(int)d);
                        if(ret<0)
                        {
                            S[(int)d]=(int)d;
                        }
                       y=y/10;
                    }
                    //for(int z=0;z<10;z++)
                    //System.out.print(S[z]);
                    //System.out.println();
                }while(Arrays.equals(S,s)==false);
                System.out.println("Case #"+(t+1)+": "+m);

           }
           else
           System.out.println("Case #"+(t+1)+": "+"INSOMNIA");
        }
        }
    }

