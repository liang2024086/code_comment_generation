package methodEmbedding.Magic_Trick.S.LYD1881;

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.*;
class Solution
{
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(new File("A-small-attempt0.in"));
        OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream(new File("output.txt")));
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> firstarr=new ArrayList<Integer>();
            int ans=0;
            int count=0;
            int r1=Integer.parseInt(sc.nextLine());
            for(int j=0;j<4;j++)
            {
                if(r1==(j+1))
                {
                    firstarr.add(sc.nextInt());
                    firstarr.add(sc.nextInt());
                    firstarr.add(sc.nextInt());
                    firstarr.add(Integer.parseInt((sc.nextLine()).trim()));
                }
                else
                {
                    String trash=sc.nextLine();
                }
            }
            int r2=Integer.parseInt(sc.nextLine());
            for(int j=0;j<4;j++)
            {
                if(r2==(j+1))
                {
                    for(int k=0;k<3;k++)
                    {
                        int temp=sc.nextInt();
                        if(firstarr.contains(temp))
                        {
                            count++;
                            ans=temp;
                        }
                    }
                    int temp=Integer.parseInt((sc.nextLine()).trim());
                    if(firstarr.contains(temp))
                    {
                        count++;
                        ans=temp;
                    }
                }
                else
                {
                    String trash=sc.nextLine();
                }
            }
            String output="Case #"+(i+1)+": ";
            if(count==0)
            {
                output=output+"Volunteer cheated!\r\n";
            }
            else if(count==1)
            {
                output=output+ans+"\r\n";
            }
            else
            {
                output=output+"Bad magician!\r\n";
            }
            out.write(output);
        }
        out.close();
    }
}
