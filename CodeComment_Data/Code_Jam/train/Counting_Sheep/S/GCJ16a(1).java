package methodEmbedding.Counting_Sheep.S.LYD162;

import java.io.*;
import java.util.*;
class GCJ16a
{
    public static void main()throws IOException
    {
        int i,j,n;
        //reading from file
        FileReader fr = new FileReader("C:\\Users\\Surendra\\Downloads\\A-small-attempt0.txt");
        BufferedReader fbr = new BufferedReader(fr);
        //writing to file
        FileWriter fw = new FileWriter("C:\\Users\\Surendra\\Desktop\\output.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        int t = Integer.parseInt(fbr.readLine());
        System.out.println("t = " +t);
        if(t>0&&t<=100)
        {
            for (i = 1; i <= t; i++)
            {
                int arr[]={0,1,2,3,4,5,6,7,8,9};
                n = Integer.parseInt(fbr.readLine());
                if(n>-1&&n<=200)
                { 
                    int r=0;
                    int l=1;
                    boolean found = true;
                    for(int a=1;a<505;a++){
                        l = n*a;
                        found = true;
                        while(l>0)
                        {
                            r = l%10;
                            l = l/10;
                            arr[r] = -1;
                        }

                        for( j=0;j<10;j++)
                        {
                            if(arr[j] != -1)
                            {
                                found = false;
                                break;
                            }
                        }
                        if(found == true)
                        {
                            l = n*a;
                            break;
                        }
                    }
                    if(found == true)
                        pw.println("Case #" + i + ": " + l);
                    else
                        pw.println("Case #" + i + ": INSOMNIA");
                }
            }
            pw.close();
            bw.close();
            fw.close();
        }
    }
}
