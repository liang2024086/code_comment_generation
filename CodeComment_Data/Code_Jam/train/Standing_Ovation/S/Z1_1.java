package methodEmbedding.Standing_Ovation.S.LYD1976;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Scanner;

public class Z1_1 {

    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("C:\\output.txt");
        BufferedWriter out = new BufferedWriter(fw);
        //String pathname = "C:\\Users\\YC14rp1\\Downloads\\z1.txt";
        String pathname = "C:\\Users\\YC14rp1\\Downloads\\A-small-attempt0.in";
        //String pathname = "C:\\Users\\YC14rp1\\Downloads\\D-large.in";
        Scanner scanner = new Scanner(new File(pathname));
        int tn = scanner.nextInt();
        scanner.nextLine();
        for (int ti = 1; ti <= tn; ti++) {
            int n = scanner.nextInt();
            String l = scanner.next();
            String s;
            int standing = 0;
            int added = 0;
            for (int z = 0; z < l.length(); z++) {
                String c = l.substring(z, z+1);
                Integer needZ = Integer.valueOf(c);
                if (needZ > 0) {
                    if (standing < z) {
                        added += z - standing;
                        standing = z;
                    }
                    standing += needZ;
                }
            }
            s = "Case #" + ti + ": " + added;
            System.out.println(s);
            out.write(s);
            out.write("\n");
        }
        out.close();
    }

}
