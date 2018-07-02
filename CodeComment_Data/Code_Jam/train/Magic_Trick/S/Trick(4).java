package methodEmbedding.Magic_Trick.S.LYD1827;

import java.util.*;
import java.io.*;
class Trick
{
    public static void main(String args[])throws Exception
    {
        Scanner sn=new Scanner(new File("a_small.in"));
        PrintWriter p=new PrintWriter(new BufferedWriter(new FileWriter("asmall.txt")));
        int T=Integer.parseInt(sn.nextLine());
        int i,j;
        for(int t=1;t<=T;t++) {
            p.print("Case #"+t+": ");
            int a1=sn.nextInt();
            int ar1[][]=new int[4][4];
            for(i=0;i<4;i++) 
                for( j=0;j<4;j++)
                    ar1[i][j]=sn.nextInt();
            int a2=sn.nextInt();
            int ar2[][]=new int[4][4];
            for(i=0;i<4;i++) 
                for(j=0;j<4;j++)
                    ar2[i][j]=sn.nextInt();
            boolean f=false,c=false;
            int d=-1;
            for(i=0;i<4;i++) {
                for(j=0;j<4;j++) {
                    if(ar1[a1-1][i]==ar2[a2-1][j]) {
                        if(f) {
                            c=true;
                            break;
                        }
                        f=true;
                        d=j+1;
                    }
                }
                if(c)break;
            }
            if(c)p.println("Bad Magician!");
            else if(f)p.println(ar2[a2-1][d-1]);
            else p.println("Volunteer Cheated!");
        }
        p.close();
    }
}
