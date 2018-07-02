package methodEmbedding.Standing_Ovation.S.LYD1629;

import java.io.FileReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class X
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileReader fin = new FileReader("C:\\Users\\DubyWinks\\Documents\\NetBeansProjects\\Cognizance\\src\\input.txt");
        Scanner in = new Scanner(fin);
        PrintWriter fout = new PrintWriter("C:\\Users\\DubyWinks\\Documents\\NetBeansProjects\\Cognizance\\src\\output.txt");
        int testcases;
        
        testcases = in.nextInt();

        for (int t=1; t<=testcases; ++t)
        {
            int len, max, sum=0, result=0;
            max = in.nextInt();
            String s = in.next();
            len = s.length();
            
            for(int i=0; i<len; ++i)
            {
                int k = s.charAt(i)-'0';
                if(sum<i && k>0)
                {
                    result += i-sum;
                    sum = i;
                }
                sum += k;
            }
            fout.println("Case #" + t + ": " + result);
        }

        fin.close();
        fout.close();
    }
}
