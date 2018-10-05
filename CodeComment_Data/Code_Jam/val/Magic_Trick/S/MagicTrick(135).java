package methodEmbedding.Magic_Trick.S.LYD1798;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MagicTrick {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
        Scanner sc = new Scanner(new File("A-small.in"));
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int row = sc.nextInt();
            int arr[] = new int[4];
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    int aux = sc.nextInt();
                    if(j == row-1)arr[k] = aux;
                }
            }
            int count = 0;
            int number = 0;
            row = sc.nextInt();
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    int aux = sc.nextInt();
                    if(j == row-1){
                        for (int l = 0; l < 4; l++) {
                            if(aux == arr[l]){
                                count++;
                                number = aux;
                                break;
                            }
                        }
                    }
                }
            }
            bw.write("Case #" + (int)(i+1) + ": ");
            if(count == 0)bw.write("Volunteer cheated!");
            else if(count == 1) {
                bw.write(String.valueOf(number));
            }else bw.write("Bad magician!");
            bw.newLine();
        }
        bw.close();
    }
}
