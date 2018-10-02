package methodEmbedding.Magic_Trick.S.LYD1426;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class MagicTrick {

    public static void main(String[] args) throws Exception{
        //----------------------------------------------------------------------
        Scanner sc = new Scanner(new FileReader("c://code/input"));
        PrintWriter pw = new PrintWriter(new FileWriter("c://code/output"));
        //----------------------------------------------------------------------
        int T = sc.nextInt();
        for(int i = 1; i <= T; i++)
        {
            int A = sc.nextInt();
            int [] Ar = new int[4];
            for(int j=1;j<=4;j++)
            {
                if(j==A)
                {
                    Ar[0]=sc.nextInt();
                    Ar[1]=sc.nextInt();
                    Ar[2]=sc.nextInt();
                    Ar[3]=sc.nextInt();
                }
                else
                {
                    int aux;
                    aux=sc.nextInt();
                    aux=sc.nextInt();
                    aux=sc.nextInt();
                    aux=sc.nextInt();
                }
            }
            
            int B = sc.nextInt();
            int [] Br = new int[4];
            for(int j=1;j<=4;j++)
            {
                if(j==B)
                {
                    Br[0]=sc.nextInt();
                    Br[1]=sc.nextInt();
                    Br[2]=sc.nextInt();
                    Br[3]=sc.nextInt();
                }
                else
                {
                    int aux;
                    aux=sc.nextInt();
                    aux=sc.nextInt();
                    aux=sc.nextInt();
                    aux=sc.nextInt();
                }
            }
            
            int m = 0;
            int c = 0;
            for(int k=0; k<4;k++)
            {
                for(int l=0;l<4;l++)
                {
                    if(Ar[k]==Br[l])
                    {
                        m++;
                        c = Ar[k];
                    }
                }
                
                
            }
            if(m==1)
            {
                pw.print("Case #" + i + ": " + c);
            }
            else if(m==0)
            {
                pw.print("Case #" + i + ": " + "Volunteer cheated!");
            }
            else
            {
                pw.print("Case #" + i + ": " + "Bad magician!");
            }
            if(i!=T)
            {
                pw.print("\n");
            }

        }
        //----------------------------------------------------------------------
        pw.flush();
        pw.close();
        sc.close();
        //----------------------------------------------------------------------
    }
}
