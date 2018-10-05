package methodEmbedding.Magic_Trick.S.LYD596;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author And
 */
public class MagicTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedWriter out=new BufferedWriter(new FileWriter("out.txt"));
        Scanner scanner=new Scanner(System.in);
        int cases=scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cases; i++) {
            out.write("Case #"+(i+1)+": ");
            int row=scanner.nextInt();
            HashSet<Integer> mapa=new HashSet<>();
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    int n=scanner.nextInt();
                    if(j==(row-1))
                    {
                        mapa.add(n);
                    }
                }
            }
            row=scanner.nextInt();
            int cont=0;
            int key=0;
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    int num=scanner.nextInt();
                    if(j==(row-1))
                    {
                        if(mapa.contains(num))
                        {
                            cont++;
                            key=num;
                        }
                    }
                }
            }
            if(cont==1)
                out.write(""+(key));
            else if(cont>1)
                out.write("Bad magician!");
            else 
            {
                out.write("Volunteer cheated!");
            }
            out.newLine();
            mapa.clear();
        }
        out.close();
    }
}
