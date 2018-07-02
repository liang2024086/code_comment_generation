package methodEmbedding.Magic_Trick.S.LYD2178;

import java.util.*;
import java.io.*;
public class MagicTrickA
{
    public static void main(String[] args)
    {
        File f = new File("input.txt");
        int q1 = 0;
        int q2 = 0;
        int[][] fir = new int[4][4];
        int[][] sec = new int[4][4];
        if(f.exists())
        {
            String line = null;
            try{
                FileReader r = new FileReader("input.txt");
                BufferedReader b = new BufferedReader(r);
                line = b.readLine();
                int reps = Integer.parseInt(line);
                for(int i = 1; i < reps+1; i++)
                {
                    line = b.readLine();
                    q1 = Integer.parseInt(line)-1;
                    for(int j = 0; j < 4; j++)
                    {
                        line = b.readLine();
                        fir[j][0] = Integer.parseInt(line.substring(0,line.indexOf(" ")));
                        line = line.substring(line.indexOf(" ")+1);
                        fir[j][1] = Integer.parseInt(line.substring(0,line.indexOf(" ")));
                        line = line.substring(line.indexOf(" ")+1);
                        fir[j][2] = Integer.parseInt(line.substring(0,line.indexOf(" ")));
                        line = line.substring(line.indexOf(" ")+1);
                        fir[j][3] = Integer.parseInt(line);
                    }
                    line = b.readLine();
                    q2 = Integer.parseInt(line)-1;
                    for(int j = 0; j < 4; j++)
                    {
                        line = b.readLine();
                        sec[j][0] = Integer.parseInt(line.substring(0,line.indexOf(" ")));
                        line = line.substring(line.indexOf(" ")+1);
                        sec[j][1] = Integer.parseInt(line.substring(0,line.indexOf(" ")));
                        line = line.substring(line.indexOf(" ")+1);
                        sec[j][2] = Integer.parseInt(line.substring(0,line.indexOf(" ")));
                        line = line.substring(line.indexOf(" ")+1);
                        sec[j][3] = Integer.parseInt(line);
                    }
                    int num = 0;
                    int yay = 0;
                    for(int n = 0; n < 4; n++)
                    {
                        for(int m = 0; m < 4; m++)
                        {
                            
                            int on = fir[q1][n];
                            int tw = sec[q2][m];
                            if(on == tw)
                            {
                                yay = on;
                                num++;
                            }
                        }
                    }
                    if(num==0)
                        System.out.print("Case #" + i + ": Volunteer cheated!\n");
                    else if(num==1)
                        System.out.print("Case #" + i + ": " + yay + "\n");
                    else if(num>1)
                        System.out.print("Case #" + i + ": Bad magician!\n");
                }
            }
            catch(IOException e)
            {
            }
        }
    }
}
