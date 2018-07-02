package methodEmbedding.Counting_Sheep.S.LYD552;

import java.util.ArrayList;
import java.util.Scanner;

public class QR_A
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        ArrayList numbers=new ArrayList();
        for(int x=0;x<10;x++)
            numbers.add(x);
        ArrayList num2=new ArrayList();
        for(int x=1;x<=T;x++)
        {
            long N=scan.nextLong();
            if(N==0)
            {
                System.out.println("Case #"+x+": INSOMNIA");
                continue;
            }
            long last=N;
            while(!num2.containsAll(numbers))
            {
                String s=Long.toString(last);
                for(int i=0;i<s.length();i++)
                {
                    if(!num2.contains((int) (s.charAt(i)-48)))
                        num2.add((int) (s.charAt(i)-48));
                }
                last+=N;
            }
            System.out.println("Case #"+x+": "+(last-N));
            num2.clear();
        }
    }
}

