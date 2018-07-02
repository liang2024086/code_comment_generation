package methodEmbedding.Speaking_in_Tongues.S.LYD1066;

import java.util.Scanner;

public class A {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int testCount = scanner.nextInt();
        scanner.nextLine();
        for (int test = 1; test <= testCount; test++){
            char[] linha = scanner.nextLine().toCharArray();
            String out = "";
            for (char c : linha){
                switch (c){
                    case 'y':
                        out=out+"a";
                        break;
                    case 'n':
                        out=out+"b";
                        break;
                    case 'f':
                        out=out+"c";
                        break;
                    case 'i':
                        out=out+"d";
                        break;
                    case 'c':
                        out=out+"e";
                        break;
                    case 'w':
                        out=out+"f";
                        break;
                    case 'l':
                        out=out+"g";
                        break;
                    case 'b':
                        out=out+"h";
                        break;
                    case 'k':
                        out=out+"i";
                        break;
                    case 'u':
                        out=out+"j";
                        break;
                    case 'o':
                        out=out+"k";
                        break;
                    case 'm':
                        out=out+"l";
                        break;
                    case 'x':
                        out=out+"m";
                        break;
                    case 's':
                        out=out+"n";
                        break;
                    case 'e':
                        out=out+"o";
                        break;
                    case 'v':
                        out=out+"p";
                        break;
                    case 'z':
                        out=out+"q";
                        break;
                    case 'p':
                        out=out+"r";
                        break;
                    case 'd':
                        out=out+"s";
                        break;
                    case 'r':
                        out=out+"t";
                        break;
                    case 'j':
                        out=out+"u";
                        break;
                    case 'g':
                        out=out+"v";
                        break;
                    case 't':
                        out=out+"w";
                        break;
                    case 'h':
                        out=out+"x";
                        break;
                    case 'a':
                        out=out+"y";
                        break;
                    case 'q':
                        out=out+"z";
                        break;
                    default:
                        out=out+c;
                }
            }
            System.out.println("Case #" + (test) + ": "+out);
        }
    }
}
