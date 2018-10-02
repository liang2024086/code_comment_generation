package methodEmbedding.Speaking_in_Tongues.S.LYD1051;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new FileReader("in.txt"));
            PrintWriter out = new PrintWriter(new FileWriter("out.txt"), true);

            int n = in.nextInt();
            in.nextLine();
            for(int i = 1; i <= n; i++){
                String s = in.nextLine();
                System.out.println(s);
                out.print("Case #" + i + ": ");
                for(int j = 0; j < s.length(); j++){
                    char c = s.charAt(j);
                    switch (c){
                        case ' ':
                            out.print(" ");
                            break;
                        case 'a':
                            out.print("y");
                            break;
                        case 'b':
                            out.print("h");
                            break;
                        case 'c':
                            out.print("e");
                            break;
                        case 'd':
                            out.print("s");
                            break;
                        case 'e':
                            out.print("o");
                            break;
                        case 'f':
                            out.print("c");
                            break;
                        case 'g':
                            out.print("v");
                            break;
                        case 'h':
                            out.print("x");
                            break;
                        case 'i':
                            out.print("d");
                            break;
                        case 'j':
                            out.print("u");
                            break;
                        case 'k':
                            out.print("i");
                            break;
                        case 'l':
                            out.print("g");
                            break;
                        case 'm':
                            out.print("l");
                            break;
                        case 'n':
                            out.print("b");
                            break;
                        case 'o':
                            out.print("k");
                            break;
                        case 'p':
                            out.print("r");
                            break;
                        case 'q':
                            out.print("z");
                            break;
                        case 'r':
                            out.print("t");
                            break;
                        case 's':
                            out.print("n");
                            break;
                        case 't':
                            out.print("w");
                            break;
                        case 'u':
                            out.print("j");
                            break;
                        case 'v':
                            out.print("p");
                            break;
                        case 'w':
                            out.print("f");
                            break;
                        case 'x':
                            out.print("m");
                            break;
                        case 'y':
                            out.print("a");
                            break;
                        case 'z':
                            out.print("q");
                            break;
                    }
                }
                out.println();
            }
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
