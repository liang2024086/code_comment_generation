package methodEmbedding.Magic_Trick.S.LYD2024;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Magic Trick
 * @author WaterFausett
 */
public class CodeJam_2014 {

    public static void main(String[] args) throws IOException {
        File filename = new File("A-small-attempt1.in");
        Scanner scan = new Scanner(filename);
        int cases = scan.nextInt();
        
        for(int i=0;i<cases; ++i)
        {
            int volCard = -1;
            int ans1 = scan.nextInt();
            int [] potentials = new int [8];
            for(int r=1;r<=4;++r)
            {
                if (ans1 == r)
                {
                    for (int c=0;c<4;++c)
                    {
                        potentials[c] = scan.nextInt();
                    }
                }
                else
                {
                    scan.nextInt();
                    scan.nextInt();
                    scan.nextInt();
                    scan.nextInt();
                }
            }
            int ans2 = scan.nextInt();
            for(int r=1;r<=4;++r)
            {
                if (ans2 == r)
                {
                    for (int c=4;c<8;++c)
                    {
                        potentials[c] = scan.nextInt();
                    }
                }
                else
                {
                    scan.nextInt();
                    scan.nextInt();
                    scan.nextInt();
                    scan.nextInt();
                }
            }
            
            int dupsFound = 0;
            for(int a=0;a<7;++a)
                for(int b=a+1;b<8;++b)
                    if (potentials[a] == potentials[b])
                    {
                        volCard = potentials[a];
                        ++dupsFound;
                    }
            
            System.out.print("Case #" + (i+1) + ": ");
            if (dupsFound == 1)
                System.out.println(volCard);
            else if (dupsFound < 1)
                System.out.println("Volunteer cheated!");
            else if (dupsFound > 1)
                System.out.println("Bad magician!");
        }
            scan.close();
    }
}
