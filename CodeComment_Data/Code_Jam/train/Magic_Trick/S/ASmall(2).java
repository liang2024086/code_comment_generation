package methodEmbedding.Magic_Trick.S.LYD352;


import java.io.*;
import java.util.*;

public class ASmall {

    public static void main(String[] args) throws IOException {
        File f = new File("/home/tonystark/Documentos/inputs/A-small-attempt0.in");
        BufferedReader entrada;
        entrada = new BufferedReader(new FileReader(f));
        
        int T = Integer.parseInt(entrada.readLine());
        int row1, row2;
        String[] items;
        int[] guess01, guess02;
        
        for (int i = 0; i < T; i++) {
           row1 = Integer.parseInt(entrada.readLine());           
           guess01 = new int[4];
           for (int m = 1; m < 5; m++) {                    
                if (row1 == m) {
                    items = entrada.readLine().split(" ");
                    for (int a = 0; a < items.length; a++)
                    guess01[a] = Integer.parseInt(items[a]);
                }
                else
                    entrada.readLine();
           }
                
           row2 = Integer.parseInt(entrada.readLine());
           guess02 = new int[4];
           for (int m = 1; m < 5; m++) {
                if (row2 == m) {
                    items = entrada.readLine().split(" ");
                    for (int a = 0; a < items.length; a++)
                    guess02[a] = Integer.parseInt(items[a]);
                }
                else
                    entrada.readLine();
           }
                
           Arrays.sort(guess01);
           Arrays.sort(guess02);
           
           int count = 0;
           int card = 0;
           for (int m = 0; m < 4; m++)               
                if (Arrays.binarySearch(guess02, guess01[m]) >= 0) {
                    card = guess01[m];
                    count++;
                }
           
           if (count == 1) System.out.println("Case #" + (i + 1) + ": " + card);
           else if (count == 0) System.out.println("Case #" + (i + 1) + ": " + "Volunteer cheated!");
           else System.out.println("Case #" + (i + 1) + ": " + "Bad magician!");
        }
        
    }
}
