package methodEmbedding.Speaking_in_Tongues.S.LYD936;


import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 4/15/12
 * Time: 1:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class GoogleCodeJam {
    public static void main(String[] arg) throws IOException {
        FileInputStream fis = new FileInputStream("G:\\A-small-attempt6.in");
        DataInputStream dis = new DataInputStream(fis);
        int t = Integer.parseInt(dis.readLine());
        File file = new File("G:\\output.txt");
        PrintWriter pw = new PrintWriter(file);
        StringBuffer sb;
        String str;
        int tcase = 1;
        while (t > 0) {
            str = dis.readLine();
            sb = new StringBuffer(str);
            for (int i = 0; i < sb.length(); ++i) {
                if (sb.charAt(i) == 'a')
                    sb.setCharAt(i, 'y');
                else if (sb.charAt(i) == 'b')
                    sb.setCharAt(i, 'h');
                else if (sb.charAt(i) == 'c')
                    sb.setCharAt(i, 'e');
                else if (sb.charAt(i) == 'd')
                    sb.setCharAt(i, 's');
                else if (sb.charAt(i) == 'e')
                    sb.setCharAt(i, 'o');
                else if (sb.charAt(i) == 'f')
                    sb.setCharAt(i, 'c');
                else if (sb.charAt(i) == 'g')
                    sb.setCharAt(i, 'v');
                else if (sb.charAt(i) == 'h')
                    sb.setCharAt(i, 'x');
                else if (sb.charAt(i) == 'i')
                    sb.setCharAt(i, 'd');
                else if (sb.charAt(i) == 'j')
                    sb.setCharAt(i, 'u');
                else if (sb.charAt(i) == 'k')
                    sb.setCharAt(i, 'i');
                else if (sb.charAt(i) == 'l')
                    sb.setCharAt(i, 'g');
                else if (sb.charAt(i) == 'm')
                    sb.setCharAt(i, 'l');
                else if (sb.charAt(i) == 'n')
                    sb.setCharAt(i, 'b');
                else if (sb.charAt(i) == 'o')
                    sb.setCharAt(i, 'k');
                else if (sb.charAt(i) == 'p')
                    sb.setCharAt(i, 'r');
                else if (sb.charAt(i) == 'r')
                    sb.setCharAt(i, 't');
                else if (sb.charAt(i) == 's')
                    sb.setCharAt(i, 'n');
                else if (sb.charAt(i) == 't')
                    sb.setCharAt(i, 'w');
                else if (sb.charAt(i) == 'u')
                    sb.setCharAt(i, 'j');
                else if (sb.charAt(i) == 'v')
                    sb.setCharAt(i, 'p');
                else if (sb.charAt(i) == 'w')
                    sb.setCharAt(i, 'f');
                else if (sb.charAt(i) == 'x')
                    sb.setCharAt(i, 'm');
                else if (sb.charAt(i) == 'y')
                    sb.setCharAt(i, 'a');
                else if (sb.charAt(i) == 'z')
                    sb.setCharAt(i, 'q');
                else if (sb.charAt(i) == 'q')
                    sb.setCharAt(i, 'z');

            }
            // System.out.println(sb.toString());
            pw.println("Case #"+tcase+": "+sb.toString());
            ++tcase;
            --t;
        }
        dis.close();
        fis.close();
        pw.close();
    }
}
