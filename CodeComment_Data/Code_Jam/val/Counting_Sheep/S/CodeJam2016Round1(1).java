package methodEmbedding.Counting_Sheep.S.LYD1259;

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
public class CodeJam2016Round1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        try (BufferedReader br = new BufferedReader(new FileReader("A-small.in")))
		{

			int I = Integer.parseInt( br.readLine() );
                        int i = 1;
                        boolean full = false;
			while ( i <= I ) {
                            
                                full = false;
                                int nums[] = {0,0,0,0,0,0,0,0,0,0};
                                int n = Integer.parseInt( br.readLine() );
                                if ( n == 0 ){
                                    
                                    try {
                                        FileWriter writer = new FileWriter("A-small.out", true);
                                        if ( i == I ){
                                            writer.write("Case #" + i + ": INSOMNIA");
                                        } else {
                                            writer.write("Case #" + i + ": INSOMNIA\n");
                                        }
                                        writer.close();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                } else {
                                    
                                    int number = n;
                                    int n2 = n;
                                    while ( !full ){
                                        
                                        while (number > 0) {
                                            
                                            nums[number % 10] = 1;
                                            number = number / 10;
                                        }
                                        n2 = n2 + n;
                                        number = n2;
                                        full = true;
                                        for (int j = 0; j < 10; j++){
                                            
                                            if ( nums[j] == 0){
                                                
                                                full = false;
                                            }
                                        }
                                    }
                                    try {
                                        FileWriter writer = new FileWriter("A-small.out", true);
                                        if ( i == I ){
                                            writer.write("Case #" + i + ": " + (n2 - n) );
                                        } else {
                                            writer.write("Case #" + i + ": " + (n2 - n) + "\n");
                                        }
                                        writer.close();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
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
