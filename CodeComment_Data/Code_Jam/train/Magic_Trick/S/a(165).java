package methodEmbedding.Magic_Trick.S.LYD1141;

import java.util.*;

public class a
{
    public static void main (String [] args)
    {
        int state = 0;
        int no_rds = 0;
        int [] board1 = new int[4];
        int [] board2 = new int[4];

        Scanner sc =  new Scanner(System.in);
        no_rds = sc.nextInt();
        for(int rd=1; rd<=no_rds; rd++)
        {
            state = 0;
            int soln = -1;
            int row1 = sc.nextInt();
            for(int r=0; r<4; r++)
            for(int c=0; c<4; c++)
            if(r+1==row1)
                board1[c] = sc.nextInt();
            else
                sc.nextInt();

            int row2 = sc.nextInt();
            for(int r=0; r<4; r++)
            for(int c=0; c<4; c++)
            if(r+1==row2)
                board2[c] = sc.nextInt();
            else
                sc.nextInt();

            
            for(int r=0; r<4; r++)
            for(int c=0; c<4; c++)
                if(board1[r]==board2[c])
                {
                    soln=board1[r];
                    state++;
                }

            

            switch(state)
            {
                case 1:
                    System.out.printf("Case #%d: %d\n",rd,soln);
                    break;
                case 0:
                    System.out.printf("Case #%d: Volunteer cheated!\n",rd);
                break;
                default:
                    System.out.printf("Case #%d: Bad magician!\n",rd);
                break;
            }

        }
    }
}
