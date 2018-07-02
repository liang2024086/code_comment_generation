package methodEmbedding.Magic_Trick.S.LYD1675;

import java.util.*;

class a{

    public static void main(String[] args){
            Scanner x =new Scanner(System.in);
            int t0=x.nextInt();
            int[] r1=new int[t0];
            for(int i=0;i<t0;i++)
            {
                int[][][] t=new int[4][4][2];
                int[] r = new int[2];
                for(int j=0;j<2;j++)
                {
                    r[j]=x.nextInt()-1;
                    for(int k=0;k<4;k++)
                        for(int l=0;l<4;l++)
                            t[k][l][j]=x.nextInt();
                }
                r1[i]=-1;
                for(int j=0;j<4;j++)
                {
                    for(int k=0;k<4;k++)
                    {
                        if(t[r[0]][j][0]==t[r[1]][k][1]&&r1[i]==-1)
                        {
                            r1[i]=t[r[0]][j][0];
                        }
                        else if(t[r[0]][j][0]==t[r[1]][k][1]&&r1[i]!=-1)
                        {
                            r1[i]=-2;
                        }
                    }
                }
            if(r1[i]==-1)
            System.out.println("Case #"+(i+1)+": Volunteer cheated!");
            else if(r1[i]==-2)
            System.out.println("Case #"+(i+1)+": Bad magician!");
            else
            System.out.println("Case #"+(i+1)+": "+r1[i]);
            }
    }
}
