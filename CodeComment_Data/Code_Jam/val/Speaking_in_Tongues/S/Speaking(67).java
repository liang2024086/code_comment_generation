package methodEmbedding.Speaking_in_Tongues.S.LYD846;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Speaking {

    public static void main(String args[]) throws IOException {
        Scanner in = new Scanner(new File("speak.in.txt"));
        PrintWriter fw = new PrintWriter(new FileWriter( new File("speak.out")));
        String tran = "ejp mysljylc kd kxveddknmc re jsicpdrysirbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcdde kr kd eoya kw aej tysr re ujdr lkgc jv";
        String org = "our language is impossible to understandthere are twenty six factorial possibilitiesso it is okay if you want to just give up";
        int a[] = new int[26];
        for (int i = 0; i < tran.length(); i++) {
            if (Character.isLetter(tran.charAt(i))) {
                a[tran.charAt(i) - 'a'] = (org.charAt(i) - 'a');
            }
        }
        a['q' - 'a'] = ('z' - 'a');
        a['z' - 'a'] = ('q' - 'a');
        
        
        int cases = in.nextInt();
        in.nextLine();
        for (int c = 1; c <= cases; c++) {
            String output = "Case #" + c + ": ";
            String line = in.nextLine();
            for(int i = 0; i < line.length(); i++){
                if(line.charAt(i) == ' ') output += " ";
                
                else output += (char)(a[line.charAt(i) - 'a'] + 'a');
            }
            fw.println(output);
        }
        fw.close();
    }
}
