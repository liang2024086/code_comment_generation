package methodEmbedding.Standing_Ovation.S.LYD159;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class A {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        Scanner sc = null;
        try {
            sc = new Scanner(new File("A-small-attempt0.in"));
            bw = new BufferedWriter(new FileWriter("output.out"));
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                char[] values = sc.next().toCharArray();
                for(int j=0;j<=n;j++) values[j] -= 48;
                int standing = values[0];
                int invitations = 0;
                for(int j=1;j<=n;j++){
                    if(j>standing){
                        invitations += (j-standing);
                        standing = j;
                    }
                    standing += values[j];
                }
                bw.write("Case #"+(i+1)+": ");
                bw.write(String.valueOf(invitations));
                bw.newLine();
                bw.flush();
            }
        } catch (IOException ex) {
            Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                sc.close();
                bw.close();
            } catch (Exception ex) {
                Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
