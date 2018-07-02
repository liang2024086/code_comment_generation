package methodEmbedding.Magic_Trick.S.LYD638;

import java.util.Scanner;
public class Main1 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int t1=in.nextInt();
        for (int i=0; i<t1; i++)
        {
            int r1=in.nextInt();
            int arr1[][]=new int[4][4];
            int arr2[][]=new int[4][4];
            for (int j=0; j<4; j++)
            {
                for (int k=0; k<4; k++)
                {
                    arr1[j][k]=in.nextInt();
               
                }
            }
            int r2=in.nextInt();
            for (int j=0; j<4; j++)
            {
                for (int k=0; k<4; k++)
                {
                    arr2[j][k]=in.nextInt();
               
                }
            }
            int count=0; int z=-1;
            for (int j=0; j<4; j++)
            {
                for (int k=0; k<4; k++)
                {
                    if (arr1[r1-1][j]==arr2[r2-1][k])
                    {
                        count+=1;
                        z=arr1[r1-1][j];
                    }
                }
            }
            if (count==1)
            {
                System.out.println("Case #"+(i+1)+": "+z);
            }
            else if (count>1)
            {
                System.out.println("Case #"+(i+1)+": "+"Bad magician!");
            }
            else if (count==0)
            {
                System.out.println("Case #"+(i+1)+": "+"Volunteer cheated!");
            }
        }
    }
}
