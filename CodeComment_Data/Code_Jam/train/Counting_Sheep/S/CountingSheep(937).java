package methodEmbedding.Counting_Sheep.S.LYD79;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIRAJ
 */
public class CountingSheep {
        public static void main(String args[])throws IOException
        {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int N[] = new int [200];
                int T,i;
                int arr[]=new int [10];
                for(int k=0;k<10;k++)
                                arr[k]=0;
                T = Integer.parseInt(br.readLine());
                for(i=0;i<T;i++)
                {
                        N[i] = Integer.parseInt(br.readLine());
                }
                for(i=0;i<T;i++)
                {
                        int name;
                        String n;
                        int j=0;
                        String fin="";
                        while(true)
                        {
                                j++;
                                n="";
                                name=N[i]*j;
                                n+=name;
                                //System.out.println(name);
                                while(name!=0)
                                {
                                        int dig = name%10;
                                        arr[dig]=1;
                                        name=name/10;
                                }
                                for(int k=0;k<10;k++)
                                {
                                        if(arr[k]==1)
                                                fin+=arr[k];
                                        else
                                                fin+="0";
                                }
                                //System.out.println(fin);
                                if(fin.compareTo("1111111111")==0)
                                {
                                        fin="";
                                         for(int k=0;k<10;k++)
                                                arr[k]=0;
                                        break;
                                }
                                else
                                {
                                         fin="";
                                         if(j>100)
                                         {
                                                 n="INSOMNIA";
                                                 break;
                                         }
                                }
                        }
                        System.out.println("Case #"+(i+1)+": "+n);
                }
        }
}
