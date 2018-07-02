package methodEmbedding.Standing_Ovation.S.LYD176;


import java.io.IOException;
//import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vinod Dosapati
 */
public class Code {

    public static void main(String[] args) throws IOException {

        //PrintWriter writer = new PrintWriter("C:\\Users\\Vinod Dosapati\\Desktop\\out.txt", "UTF-8");
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for (int i = 0; i < T; i++) {
            int len = s.nextInt();
            int[] arr = new int[len + 1];
            int stand;
            int need = 0;
//            for (int j = 0; j < arr.length; j++) {
//                arr[j] = s.nextInt();
//            }

            
            //
            String h = s.next();
            String[] k = h.split("");
            for (int j = 0; j < k.length; j++) {
                arr[j] = Integer.parseInt(k[j]);
                System.out.println(arr[j]);
            }
            //

            stand = arr[0];
            //System.out.println(arr[0]);
            for (int j = 1; j < arr.length; j++) {
                //System.out.println(arr[j]);
                if (stand >= j) {
                    stand = stand + arr[j];
                } else {

                    need = need + (j - stand);
                    stand = stand + (j - stand) + arr[j];
                }
                //System.out.println("-->"+need);
            }
            System.out.println("Case #" + (i + 1) + ": " + need);
            //writer.println("Case #" + (i + 1) + ": " + need);
        }
        //writer.close();
    }
}
