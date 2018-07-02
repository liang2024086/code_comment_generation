package methodEmbedding.Magic_Trick.S.LYD1249;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
/**
 *
 * @author Hamza
 */

public class GoogleCodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
    {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new FileReader("A-small-attempt2.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("A-small-attempt2.out"));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        
        for (int i = 1; i <= T; i++)
        {
            int ans1 = Integer.parseInt(br.readLine());
            String[][] options1 = new String[4][];
            for (int j = 0; j < 4; j++)
            {
                options1[j] = br.readLine().split(" ");
            }
            
            int ans2 = Integer.parseInt(br.readLine());
            String[][] options2 = new String[4][];
            for (int j = 0; j < 4; j++)
            {
                options2[j] = br.readLine().split(" ");
            }
            
            int answer = 0;
            for (int a = 0; a < 4; a++)
            {
                for (int b = 0; b < 4; b++)
                {
                    if (options1[ans1-1][a].equals(options2[ans2-1][b]) && answer == 0)
                        answer = Integer.parseInt(options1[ans1-1][a]);
                    else if (options1[ans1-1][a].equals(options2[ans2-1][b]))
                        answer = -1;
                }
            }
            
            if (answer == 0)
                bw.write("Case #"+i+": Volunteer cheated!\n");
            else if (answer == -1)
                bw.write("Case #"+i+": Bad magician!\n");
            else
                bw.write("Case #"+i+": "+answer+"\n");
			
			bw.flush();
        }
		br.close();
		bw.close();
    }
}
