package methodEmbedding.Counting_Sheep.S.LYD180;


import java.io.*;
import java.math.BigInteger;

/**
 * Created by praveen on 4/9/2016.
 */
public class Sheep
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\praveen\\Desktop\\A-small-attempt0.in"));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter write = new BufferedWriter(new FileWriter("C:\\Users\\praveen\\Desktop\\A-small-attempt0ans.in"));
        int t = Integer.parseInt(br.readLine()) , i , j ;
        BigInteger big = new BigInteger("0") , zero = new BigInteger("0") , N;
        boolean check[] , ans , b;
        long tmp;
        String s;
        for ( i = 0 ;i  < t; i++)
        {
            check = new boolean[10];
            ans = false;
            tmp = 1;
            N = new BigInteger(br.readLine());
            if ( N.equals(zero))
            {
                System.out.println("INSOMINA");
                write.write("Case #" + (i + 1) + ": " + "INSOMNIA");
                write.newLine();
            }
            else
            {
                while (!ans)
                {
                    big = N.multiply(new BigInteger(Long.toString(tmp)));
                    tmp++;
                    //System.out.println(big);
                    s = big.toString();
                    for ( j = 0 ;j < s.length() ; j++)
                    {
                        check[s.charAt(j) - '0'] = true;
                    }
                    b = true;
                    for ( j = 0 ; j < 10 ; j++)
                    {
                        if ( !check[j] )
                        {
                            b = false;
                        }

                    }
                    ans = b;
                }
                write.write("Case #"+(i+1)+": " + big);
                write.newLine();
                System.out.println(big);
            }

        }
        write.close();
    }
}
