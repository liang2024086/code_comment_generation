package methodEmbedding.Standing_Ovation.S.LYD408;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author saratkiran
 */
class Codejam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter("new_file.txt");
        String no_tries = br.readLine();
        int no_t = Integer.parseInt(no_tries);
        for (int j = 0; j < no_t; j++) {
            String[] t = br.readLine().split("\\s+");
            int chefs = Integer.parseInt(t[0]);

            int[] sam = new int[t[1].length()];
            for (int i = 0; i < t[1].length(); i++) {
                sam[i] = t[1].charAt(i) - '0';
            }
            int present_sum = 0;
            int req = 0;
            for (int i = 0; i < sam.length; i++) {
                if (present_sum < i && sam[i] != 0 && i != 0) {
                    int temp = i - present_sum;
                    req += temp;
                    present_sum += temp;
                }
                present_sum += sam[i];
            }
            out.println("Case #"+(j+1)+": "+req);
            System.out.println("Case #"+(j+1)+": "+req);
            
        }
        out.close();
    }
}
