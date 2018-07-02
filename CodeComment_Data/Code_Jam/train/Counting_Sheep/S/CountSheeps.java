package methodEmbedding.Counting_Sheep.S.LYD543;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jose.rubalcaba
 */
public class CountSheeps {
    static final String FORMAT = "Case #%d: %s"; 
    public static void main(String[] args)throws IOException {
        //read the file
        BufferedReader reader = null;
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("output.txt"))); 
        try {
            reader = new BufferedReader(new FileReader("A-small-attempt1.in"));
            
            //read the first line 
            String line = reader.readLine();
            //parse 
            int testCases = Integer.parseInt(line);
            Set<Integer> set = null; 
            int counter = 1; 
            for (int i = 0; i < testCases; i++) {
                set = new HashSet<Integer>();
                //read the case 
                String number = reader.readLine(); // the test case 
                int value = Integer.parseInt(number); //parse to integer
                
                while (true) {
                    int cValue = value * counter; //multiplication of the test case and N 
                    if(value == cValue && counter != 1){
                        System.out.println(String.format(FORMAT, (i + 1), "INSOMNIA"));
                        writer.write(String.format(FORMAT, (i + 1), "INSOMNIA"));
                        writer.newLine(); 
                        counter = 1; 
                        break;
                    }
                    char[] array = String.valueOf(cValue).toCharArray(); //convert to char array
                    
                    for (int j = 0; j < array.length; j++) {
                        //if the array, converted to an int, is contained in the set 
                        if (!set.contains(Character.getNumericValue(array[j]))) {
                            set.add(Character.getNumericValue(array[j]));
                        }
                    }
                    
                    if (set.size() == 10) {
                        System.out.println(String.format(FORMAT, (i + 1), String.valueOf(cValue)));
                        writer.write(String.format(FORMAT, (i + 1), String.valueOf(cValue)));
                        writer.newLine(); 
                        counter = 1; 
                        break;
                    }
                    counter ++; 
                }

            }
            reader.close();
            writer.close(); 
        } catch (IOException ex) {

        } catch (NumberFormatException ex) {

        }
    }
}
