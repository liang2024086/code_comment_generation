package methodEmbedding.Magic_Trick.S.LYD1527;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
*/
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author scottso
 */
public class Magictrick {

        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FileReader inFile = new FileReader("DATA1.txt");
        FileWriter outFile = new FileWriter("OUT1.txt");
        
         Scanner input = new Scanner(inFile);
         
         int cases;
         int selection;
         int count = 0;
         int card = 0;
         
         int table[][] = new int [4][4];
         int selectedRow[] = new int [4];
         
         cases = input.nextInt();
         
         for (int k = 0; k < cases; k++) {
         
         selection = input.nextInt() - 1;
         
         for (int i = 0; i < 4; i ++) { // Store inside table
             
             for (int j = 0; j < 4; j ++) {
                 
                 table[i][j] = input.nextInt();
         }
             
        }
         
         for (int i = 0; i < 4; i++) { // Store into array
             
             selectedRow[i] = table[selection][i];
             
         }
         
         selection = input.nextInt() - 1;
         
         for (int i = 0; i < 4; i ++) { // Store inside table
             
             for (int j = 0; j < 4; j ++) {
                 
                 table[i][j] = input.nextInt();
         }
             
        }
         
         for (int i = 0; i < 4; i ++) {
             for (int l = 0; l<4; l++) {
             
             if (selectedRow[i] == table[selection][l]) { 
               count ++; 
               card = selectedRow[i];
             }
             
             }
         }
         
//         for (int i = 0; i < 4; i ++) {
//             
//             System.out.println(selectedRow[i]);
//             System.out.println(table[selection][i]);
//         }
         
         if (count == 1) {
             
             outFile.write("Case #" + (k+1) + ": " + card + "\n");
             System.out.println(card);
     
         } else if (count > 1) {
             
             outFile.write("Case #" + (k+1) + ": Bad magician!\n");
             System.out.println("Bad magician!");
         
         } else {
             
             outFile.write("Case #" + (k+1) + ": Volunteer cheated!\n");
             System.out.println("Volunteer cheated!");
            
         }
        
         count = 0;
    }
         inFile.close();
        outFile.close();
    }
}
