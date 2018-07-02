package methodEmbedding.Magic_Trick.S.LYD215;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mancha
 */
public class magic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedWriter write = new BufferedWriter(new FileWriter("src/magic.out"));
        Scanner leer = new Scanner(new File("src/A-small-attempt0.in"));
        short T, firstA, secondA;
        short cards[][] = new short[2][4];
        String aux[];
        T = Short.parseShort(leer.nextLine());
        int i, j, k;
        for (i = 0; i < T; i++) {
            firstA = Short.parseShort(leer.nextLine());
            for (j = 0; j < 4; j++) {
                if ((j + 1) == firstA) {
                    aux = leer.nextLine().split(" ");
                    for (k = 0; k < 4; k++) {
                        cards[0][k] = Short.parseShort(aux[k]);
                    }
                } else {
                    leer.nextLine();
                }
            }
            secondA = Short.parseShort(leer.nextLine());
            for (j = 0; j < 4; j++) {
                if ((j + 1) == secondA) {
                    aux = leer.nextLine().split(" ");
                    for (k = 0; k < 4; k++) {
                        cards[1][k] = Short.parseShort(aux[k]);
                    }
                } else {
                    leer.nextLine();
                }
            }
            //Revisar cards
            short matches=0;
            short match=0;
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 4; k++) {
                    if(cards[0][j]==cards[1][k]){
                        matches++;
                        match=cards[0][j];
                        if(matches>1){
                            j=4;
                            //System.out.println("Case #"+(i+1)+": Bad magician!");
                            write.write("Case #"+(i+1)+": Bad magician!\n");
                            break;
                        }
                    }
                }
            }
            if(matches==1){
                //System.out.println("Case #"+(i+1)+": "+match);
                write.write("Case #"+(i+1)+": "+match+"\n");
            }else{
                if(matches==0){
                    //System.out.println("Case #"+(i+1)+": Volunteer cheated!");
                    write.write("Case #"+(i+1)+": Volunteer cheated!\n");
                }
            }
        }
        write.close();
    }

}
