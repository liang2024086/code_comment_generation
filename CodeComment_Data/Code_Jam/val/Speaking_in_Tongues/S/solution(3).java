package methodEmbedding.Speaking_in_Tongues.S.LYD992;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class solution {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        char a[] = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
        int t, j, i, k;
        char c;
        File file = new File("A-small-attempt0.in");
        FileReader fr = new FileReader(file);
        Scanner ob = new Scanner(fr);
        File outFile = new File("outFileSimple.txt");
        FileWriter outFilew = new FileWriter(outFile);
        //Scanner ob = new Scanner(System.in);
        t = Integer.parseInt(ob.nextLine());
        j = t;
        i = 0;
        String g[] = new String[t];
        while (i !=t) {
            g[i] = ob.nextLine();
            i++;
        }
        j = 0;
        while (j != t) {
            i=j+1;
            //System.out.print("Case #" + i + ": ");
            outFilew.append("Case #" + i + ": ");
            for (k = 0; k < g[j].length(); k++) {
                if (g[j].charAt(k) >= 'a' && g[j].charAt(k) <= 'z') {
                    c = a[g[j].charAt(k) - 'a'];
                    //System.out.print(c);
                    outFilew.append(c);
                } else {
                    //System.out.print(g[j].charAt(k));
                    outFilew.append(g[j].charAt(k));
                }
            }
            //System.out.println();
            outFilew.append("\n");
            j++;
        }
        outFilew.close();

    }
}
