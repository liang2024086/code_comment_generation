package methodEmbedding.Standing_Ovation.S.LYD1882;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Anh Nguyen
 */
public class StandingOvation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
      Scanner sc = new Scanner(new FileReader("A-small-attempt0.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("A-small-attempt0.out"));
		
		int ntest = sc.nextInt();		
		for(int test=1;test<=ntest;++test) {
			
			int N = sc.nextInt();
			String M = sc.next();
                        char [] Shys = M.toCharArray();
                        
                        int standedSofar = 0;
                        int friendAdded = 0;
                                               
                        for(int i = 0; i < Shys.length ; i++)
                        {
                           int curent = Integer.parseInt(Shys[i]+"");
                            if(standedSofar >= i)
                            {
                                 standedSofar += curent;
                            }
                            else
                            {
                                int friendAddedSofar = (i - standedSofar);
                                friendAdded += friendAddedSofar;
                                standedSofar += friendAddedSofar;
                                standedSofar += curent;
                            }
                        }
			
                        
			pw.printf("Case #%d: %d\n", test, friendAdded);				
		}
		pw.close();
		sc.close();
	}

}
