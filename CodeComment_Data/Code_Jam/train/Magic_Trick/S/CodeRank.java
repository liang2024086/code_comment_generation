package methodEmbedding.Magic_Trick.S.LYD409;

import java.io.*;
import java.util.Scanner;
class CodeRank
{
    public static void main(String args[])throws IOException
    {
        
        File f = new File("D:/Ans.txt");
        Scanner sc = new Scanner(f);
        int t = sc.nextInt();
        int c=0;
        int a =0;
        int countfinal=0;
        for(int i =0;i<t;i++)
        {
           
            c=0;a=0;
            countfinal=0;
            int ans1 = sc.nextInt();
            int arr[]=new int[4];
            for(int j =0;j<16;j++)
            {
                int nummm = sc.nextInt();
                if(j>=((ans1-1)*4)&&(j<((ans1)*4)))
                arr[c++] = nummm;
            }
            int ans2= sc.nextInt();
            
            for(int k =0;k<16;k++)
            {
                int num = sc.nextInt();
                if(k>=((ans2-1)*4)&&(k<((ans1)*4)))
                {
                    for(int h =0;h<4;h++)
                        if(arr[h]==num)
                        {
                            countfinal++;
                            a = num;
                        }
                    }
                }
                System.out.print("Case #"+(i+1)+": ");
                
                if(countfinal==0)
                    System.out.println("Volunteer cheated!");
                else if(countfinal==1)
                    System.out.println(a);
                else
                    System.out.println("Bad magician!");
              
            }
        }
    }
            
                
