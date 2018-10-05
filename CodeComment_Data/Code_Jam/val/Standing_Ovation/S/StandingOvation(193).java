package methodEmbedding.Standing_Ovation.S.LYD1671;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author buyaa
 */
public class StandingOvation {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new  BufferedReader(new FileReader("audience.txt"));
            int lineNumber = Integer.parseInt(reader.readLine());
            for(int l =1; l<=lineNumber; l++){
                String line = reader.readLine();
                String [] splitted = line.split(" ");
                char[] audience = splitted [1].toCharArray();
                int standing = Integer.valueOf(String.valueOf(audience[0]));
                int friendsNeeded = 0;
                int maxShyness = Integer.valueOf(splitted[0]);
                for(int i=1; i<=maxShyness; i++){
                    int current = Integer.valueOf(String.valueOf(audience[i]));
                    if(current>0){ 
                        if(standing>=i){
                            standing += current;
                        }else{
                            friendsNeeded+=i-standing;
                            standing+=i-standing;
                            standing+=current;
                        } 
                    }
                }
                System.out.printf("Case #%d: %d\n", l, friendsNeeded);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
