package methodEmbedding.Counting_Sheep.S.LYD1370;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
import java.util.List;
import java.lang.Integer;

/**
 *
 * @author Rana
 */
public class CountingSheeps {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File input = new File("A-small-attempt0.in");
        File output = new File("output_file.txt");
        FileWriter fw = new FileWriter(output);
        BufferedWriter bw = new BufferedWriter(fw);
        Scanner in = new Scanner(input);
        int T = in.nextInt();
        ArrayList<Integer> L = new ArrayList<Integer>();
        int N=0;
        int P=1;
        if(!output.exists())
        {
            output.createNewFile();
        }
        while(T!=0)
        {
            int k=0;
            N=in.nextInt();
            while(L.size()!=10)
            {
                if(N==0)
                {
                    bw.write("Case #"+P+": INSOMNIA");
                    bw.newLine();
                    P++;
                    break;
                }
                k++;
                int C=N*k;
                while(C!=0)
                {
                    int ad=C%10;
                    for(int j=0;j<L.size();j++)
                    {
                        if(L.get(j)==ad)
                        {
                            L.remove(j);
                        }   
                    }
                    L.add(ad);                    
                    C=C/10;
                    }
                }
                if(N!=0)
                {
                    bw.write("Case #"+P+": "+N*k);
                    bw.newLine();
                    P++;
                }
            L.clear();
            T--;
        }
        bw.close();
    }
    
}
