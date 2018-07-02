package methodEmbedding.Magic_Trick.S.LYD1815;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Magic {
    
    public static void main(String[] args) throws IOException {
        int i,k,j,l=0,cardNo=-1,ans1,ans2,cases,match_found;
        int [][] arrangement=new int[4][4],arrangement2=new int[4][4];
        Scanner sc=new Scanner(new File("A-small-attempt0.in"));
        cases=sc.nextInt();
        for(k=1;k<=cases;k++)
        {
            match_found=0;
            ans1=(sc.nextInt())-1;
            for(i=0;i<4;i++)
            {
                for(j=0;j<4;j++)
                {
                    arrangement [i][j]=sc.nextInt();
                }
            }
            ans2=(sc.nextInt())-1;
            for(i=0;i<4;i++)
            {
                for(j=0;j<4;j++)
                {
                    arrangement2 [i][j]=sc.nextInt();
                }
            }
            for(i=0;i<4;i++)
            {   
                for(j=0;j<4;j++)
                {
                    if(arrangement[ans1][i]==arrangement2[ans2][j])
                    {
                      match_found++;
                      cardNo=arrangement[ans1][i]; 
                    }   
                }
            }
            if(match_found==1)
            {
                System.out.println("Case #"+k+": "+cardNo);
            }
            else if(match_found>1)
            {
                System.out.println("Case #"+k+ ": "+"Bad magician!");
            }
            else
            {
                System.out.println("Case #"+k+ ": "+"Volunteer cheated!");
            }
            
        }
     sc.close();    
    }
    
}
