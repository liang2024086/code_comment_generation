package methodEmbedding.Counting_Sheep.S.LYD37;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ECC
 */
public class CodeJam16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader rd = new BufferedReader(new FileReader("a.txt"));
        String line = "";
        int testCase = Integer.parseInt(rd.readLine());
        for (int i = 0; i < testCase; i++) {
            int number = Integer.parseInt(rd.readLine());
            if(number == 0){
                System.out.println("Case #"+(i+1)+": INSOMNIA");
                continue;
            }
            int done = 0;
            int k = 0;
            for (k  = 1; done!=0x7FE; k++) {
                int result = number*k;
                int t = 1 << (result%10)+1;
                done = done|t;
                while((result = result/10)!= 0)
                {
                    t = 1 << (result%10)+1;
                    if(t == 9) 
                        System.out.println("Case #"+((i+1))+": " + (k - 1));
                        
                    done = done|t;
                }
            }
                System.out.println("Case #"+((i+1))+": " + number*(k - 1));
        }
    }

}
