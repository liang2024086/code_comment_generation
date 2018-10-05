package methodEmbedding.Magic_Trick.S.LYD1968;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USUARIO
 */
public class MagicTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("input.txt")));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {

            int ans = Integer.parseInt(br.readLine()) - 1;
            int[][] cards = new int[4][4];

            for (int j = 0; j < cards.length; j++) {
                String[] line = br.readLine().split(" ");
                for (int k = 0; k < cards.length; k++) {
                    cards[j][k] = Integer.parseInt(line[k]);
                }

            }

            int ans2 = Integer.parseInt(br.readLine()) - 1;
            int[][] cards2 = new int[4][4];

            for (int j = 0; j < cards2.length; j++) {
                String[] line = br.readLine().split(" ");
                for (int k = 0; k < cards2.length; k++) {
                    cards2[j][k] = Integer.parseInt(line[k]);
                }

            }
            int chosen = -1;

            for (int j = 0; j < cards2.length; j++) {
                for (int k = 0; k < cards2.length; k++) {

                    if (cards[ans][j] == cards2[ans2][k]) {
                        if (chosen == -1) {
                            chosen = cards[ans][j];
                        } else {
                            chosen = -2;
                        }
                    }
                }
            }

            String res;

            switch (chosen) {
                case -1:
                    res = "Volunteer cheated!";
                    break;

                case -2:
                    res = "Bad magician!";
                    break;
                default:
                    res = String.valueOf(chosen);
            }

            System.out.println(
                    "Case #"
                    + (i + 1)
                    + ": "
                    + res
            );

        }

    }

}
