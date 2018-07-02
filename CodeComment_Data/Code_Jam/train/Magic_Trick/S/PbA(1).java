package methodEmbedding.Magic_Trick.S.LYD813;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 *
 * @author Abdellatif MIFTAHI
 */
public class PbA
{
    public static PrintWriter out;
    
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new FileReader("a.in"));
        out=new PrintWriter(new FileWriter("a.out"));
        Scanner s=new Scanner(in);
        int T=s.nextInt();
        int compt=1;
        int saut=0;
        int ch1,ch2;
        int cards[][] =new int[5][5];
        int cards2[][] = new int[5][5];
        //String cards[] = new String[5];
        //String cards2[] = new String[5];
        for(int i=1;i<=T;i++)
        {
            if(saut==0)
                saut++;
            else
                out.println();
            ch1=s.nextInt();
            cards[1][1]=s.nextInt();cards[1][2]=s.nextInt();cards[1][3]=s.nextInt();cards[1][4]=s.nextInt();
            cards[2][1]=s.nextInt();cards[2][2]=s.nextInt();cards[2][3]=s.nextInt();cards[2][4]=s.nextInt();
            cards[3][1]=s.nextInt();cards[3][2]=s.nextInt();cards[3][3]=s.nextInt();cards[3][4]=s.nextInt();
            cards[4][1]=s.nextInt();cards[4][2]=s.nextInt();cards[4][3]=s.nextInt();cards[4][4]=s.nextInt();
            ch2=s.nextInt();
            cards2[1][1]=s.nextInt();cards2[1][2]=s.nextInt();cards2[1][3]=s.nextInt();cards2[1][4]=s.nextInt();
            cards2[2][1]=s.nextInt();cards2[2][2]=s.nextInt();cards2[2][3]=s.nextInt();cards2[2][4]=s.nextInt();
            cards2[3][1]=s.nextInt();cards2[3][2]=s.nextInt();cards2[3][3]=s.nextInt();cards2[3][4]=s.nextInt();
            cards2[4][1]=s.nextInt();cards2[4][2]=s.nextInt();cards2[4][3]=s.nextInt();cards2[4][4]=s.nextInt();

            //String commonChars = cards[ch1].replace(" ", "").replaceAll("[^"+cards2[ch2]+"]","");
            int sol=0;
            int count=0;
            for(int j=1;j<=4;j++)
            {
                if(cards[ch1][1]==cards2[ch2][j] || cards[ch1][2]==cards2[ch2][j] || cards[ch1][3]==cards2[ch2][j] || cards[ch1][4]==cards2[ch2][j])
                {
                    sol=cards2[ch2][j];
                    count++;
                }
            }
            if(count==0)
                out.print("Case #"+compt+++": Volunteer cheated!");
            if(count==1)
                out.print("Case #"+compt+++": "+sol);
            if(count>1)
                out.print("Case #"+compt+++": Bad magician!");            
        }
              
        in.close();
        out.close();
  }
 
}
