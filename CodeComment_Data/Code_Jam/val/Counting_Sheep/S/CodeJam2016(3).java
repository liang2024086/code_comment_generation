package methodEmbedding.Counting_Sheep.S.LYD1314;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author David
 */
public class CodeJam2016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        int t, n;
        t = Integer.parseInt(cin.readLine());
        for (int i=1; i<=t; i++) {
            int x = 0;
            boolean[] seen = new boolean[10];
            n = Integer.parseInt(cin.readLine());;
            System.out.print("Case #" + i + ": ");
            if (n == 0)
                System.out.println("INSOMNIA");
            else {
                boolean seenall;
                
                do {
                    x++;
                    seenall = true;
                    for (int a=0; a<10; a++)
                    {
                        if (Integer.toString(n*x).contains(Integer.toString(a))) {
                            seen[a]=true;
                        }
                        if (seen[a]==false) {
                            seenall = false;
                        }
                    }
                    if (seenall) {
                        System.out.println(n*x);
                    }
                } while (!seenall);
            }

        }

    }
    
}
