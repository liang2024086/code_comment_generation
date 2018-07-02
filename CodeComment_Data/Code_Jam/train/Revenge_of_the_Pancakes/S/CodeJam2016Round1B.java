package methodEmbedding.Revenge_of_the_Pancakes.S.LYD362;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Abdou
 */
public class CodeJam2016Round1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        try (BufferedReader br = new BufferedReader(new FileReader("B-small.in")))
		{

			int I = Integer.parseInt( br.readLine() );
                        int i = 1;
                        String s;
                        int size = 0;
                        int moin;
                        int j;
                        boolean was = false;
			while ( i <= I ) {
                               
                                was = false;
                                moin = 1;
                                s = br.readLine();
                                size = 0;
                                int n = 0;
                                if (s.charAt(0)=='+') moin = 0;
                                while ( size < s.length() ){
                                    
                                    if ( s.charAt(size) == '-' ){
                                        
                                        if ( !was ){
                                            
                                            n++;
                                            was = true;
                                        }
                                    } else {
                                        
                                        was = false;
                                    }
                                    size++;
                                }
                                j = 2 * n - moin;
                                try {
                                    FileWriter writer = new FileWriter("B-small.out", true);
                                    if ( i == I ){
                                        writer.write("Case #" + i + ": " + j );
                                    } else {
                                        writer.write("Case #" + i + ": " + j +"\n");
                                    }
                                    writer.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
				//System.out.println("Case #" + i + ": " + j + ", " + j2);
                                i++;
			}
                        //System.out.println("I = "+ I);

		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
}
