package methodEmbedding.Counting_Sheep.S.LYD1704;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class q1
{
    public static void main(String[] args) throws IOException 
     {
//        Scanner sc = new Scanner(new File("IO/A-test.in"));FileWriter fw = new FileWriter("IO/A-test-op.out");
        Scanner sc = new Scanner(new File("IO/A-small.in"));FileWriter fw = new FileWriter("IO/A-small-op.out");
//        Scanner sc = new Scanner(new File("IO/A-large.in"));FileWriter fw = new FileWriter("IO/A-large-op.out");
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            System.out.println("case #" + (i + 1) + ": ");
            int n=sc.nextInt();int count=0;int d[]=new int[10];Arrays.fill(d,0);int ml=1;int temp=n;int res=n;
            System.out.println("->"+n);
            if(n==0)
            {System.out.println("INSOMNIA");fw.write("case #" + (i + 1) + ": "+"INSOMNIA");}
            else 
            {while(count!=10)
                {
                    temp=n*ml;res=temp;
                    while(temp!=0)
                    {
                        if(d[temp%10]==0&&count!=10)
                        {
                            d[temp%10]=1;
                            count++;
                            
                        }temp/=10;
                    }
                    ml++;
                    
                }System.out.println("#"+res);
                fw.write("case #" + (i + 1) + ": "+res);
            }
            
            System.out.println("");
            fw.write("\n");
        }
        fw.close();
     }
}
