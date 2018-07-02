package methodEmbedding.Magic_Trick.S.LYD1674;

import java.util.*;
import java.io.*;
class Codejam1
{
    public static void main(String args[])throws IOException
    {
        File file=new File("abc.txt");
        FileReader fr=new FileReader(file);
        Scanner in=new Scanner(fr);
        int cases=new Scanner(in.nextLine()).nextInt();
        int casecur=1;
        while(casecur<=cases)
        {int ans1=new Scanner(in.nextLine()).nextInt();
        int arr1[][]=new int [4][4];
        for(int i=0;i<4;i++)
        {
            Scanner a=new Scanner(in.nextLine());
            for(int j=0;j<4;j++)
            {
                arr1[i][j]=a.nextInt();
            }
        }
        
        int ans2=new Scanner(in.nextLine()).nextInt();
        int arr2[][]=new int [4][4];
        for(int i=0;i<4;i++)
        {
            Scanner a=new Scanner(in.nextLine());
            for(int j=0;j<4;j++)
            {
                arr2[i][j]=a.nextInt();
            }
        }
        int p=0;
        int c=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(arr1[ans1-1][i]==arr2[ans2-1][j])
                {p=arr1[ans1-1][i];
                c++;}
            }
        }
        
        if(c==1)
        {
            System.out.println("Case #"+casecur+": "+p);
        }
        else if(c>1)
        {
            System.out.println("Case #"+casecur+": Bad magician!");
        }
        else if(c<1)
        {
            System.out.println("Case #"+casecur+": Volunteer cheated!");
        }
        casecur++;
    }
    fr.close();
}
    }
