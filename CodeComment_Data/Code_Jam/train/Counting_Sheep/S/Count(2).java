package methodEmbedding.Counting_Sheep.S.LYD437;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Dewan on 09-04-2016.
 */
public class Count {
    public static void main(String args[])throws IOException{
       File input = new File(args[0]+".in");
        BufferedReader r = new BufferedReader(new FileReader(input));
        FileOutputStream output= new FileOutputStream(args[1]+".out");
        System.setOut(new PrintStream(output));
        
       
       // Scanner obj = new Scanner(System.in);
        int n = Integer.parseInt(r.readLine());
        //int[] a = new int[n];
        //for(int i=0;i<n;i++){
          //  a[i] = obj.nextInt();
        //}

        int[] out = new int[10];
        int count=0,arrcount;
        int rem;
        int abc = 0;
        while (count<=n-1)
        {
		int N=Integer.parseInt(r.readLine());
                for(int i=0;i<10;i++)
                    out[i]=999;
                arrcount=-1;
                    int i = count;
                if(N==0)
                {
                    System.out.println("Case #"+ ++i+": INSOMNIA");
                    count++;

                }
                else
                {
                    int temp = N;
                    int j =1;
                        while(temp!=0)
                        {
                            rem=  (temp%10);
                            if(out[rem]==999)
                            {
                                arrcount++;
                                if(arrcount==9)
                                {
                                    System.out.println("Case #"+ ++i+": "+abc);
                                    count++;
                                    break;
                                }
                                out[rem]=rem;
                            }
                            temp = temp/10;
                            if(temp==0)
                            {   j = j+1;
                                temp = j * N;
                                abc= temp;
                            }
                        }
                }

        }
    }
}
