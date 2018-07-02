package methodEmbedding.Magic_Trick.S.LYD33;

import java.util.Scanner;

public class JavaApplication5 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int row=0;
        int gridRow1[]=new int[4];
        int gridRow2[]=new int[4];
        int t=sc.nextInt();
        
        for(int k=1;k<=t;k++)
        {
            row=sc.nextInt();
            
            for(int i=1;i<=4;i++)
            {
                for(int j=0;j<4;j++)
                {
                     if(i==row)
                     {
                         gridRow1[j]=sc.nextInt();
                     }
                     else
                     {
                         sc.nextInt();
                     }

                }
            }
            
            row=sc.nextInt();
            
            for(int i=1;i<=4;i++)
            {
                for(int j=0;j<4;j++)
                {
                     if(i==row)
                     {
                         gridRow2[j]=sc.nextInt();
                     }
                     else
                     {
                         sc.nextInt();
                     }

                }
            }
            
            int count=0,val=0;
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<4;j++)
                {
                    if(gridRow1[i]==gridRow2[j])
                    {
                        val=gridRow2[j];
                        count++;
                    }
                }   
            }
            
            if(count==0)
            {
                System.out.println("Case #"+k+": Volunteer cheated!");
            }
            else
            {
                if(count==1)
                {
                    System.out.println("Case #"+k+": "+val);
                }
                else
                {
                    System.out.println("Case #"+k+": Bad magician!");
                }
            }       
            
        }
        
    }
}
