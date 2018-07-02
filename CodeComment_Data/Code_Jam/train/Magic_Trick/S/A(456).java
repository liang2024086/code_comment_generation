package methodEmbedding.Magic_Trick.S.LYD704;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class A {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner leer = new Scanner(new File("A-small-attempt0.in"));
        int t = leer.nextInt();
        int r1,r2, j, k, p, c;
        int m1[][] = new int[4][4];
        int m2[][] = new int[4][4];
        for (int i = 0; i < t; i++) {
            r1 = leer.nextInt();
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 4; k++) {
                    m1[j][k] = leer.nextInt();
                }
            }
            r2 = leer.nextInt();
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 4; k++) {
                    m2[j][k] = leer.nextInt();
                }
            }
            c = 0;
            p = -1;
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 4; k++) {
                    if(m1[r1-1][j] == m2[r2-1][k]){
                        c++;
                        p =  m1[r1-1][j];
                    }
                }
            }
            if(p == -1){
                System.out.println("Case #"+(i+1)+": "+ "Volunteer cheated!");
            }else{
                if(c == 1){
                    System.out.println("Case #"+(i+1)+": "+ p);
                }else{
                    System.out.println("Case #"+(i+1)+": "+ "Bad magician!");
                }
            }
            
        }
    }
    
}
