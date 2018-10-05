package methodEmbedding.Speaking_in_Tongues.S.LYD648;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Kumudu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String out="";
        Scanner in = new Scanner(System.in);
        String read = in.nextLine();
        int N = Integer.valueOf(read);
        for (int i = 0; i < N; i++) {
            read = in.nextLine();
            out = "";
            for (int j = 0; j < read.length(); j++) {
                char ct = read.charAt(j);
                switch (ct){
                    case 'y':
                        out = out + "a";
                        break;
                    case 'n':
                        out = out + "b";
                        break;
                    case 'f':
                        out = out + "c";
                        break;
                    case 'i':
                        out = out + "d";
                        break;
                    case 'c':
                        out = out + "e";
                        break;
                    case 'w':
                        out = out + "f";
                        break;
                    case 'l':
                        out = out + "g";
                        break;
                    case 'b':
                        out = out + "h";
                        break;
                    case 'k':
                        out = out + "i";
                        break;
                    case 'u':
                        out = out + "j";
                        break;
                    case 'o':
                        out = out + "k";
                        break;
                    case 'm':
                        out = out + "l";
                        break;
                    case 'x':
                        out = out + "m";
                        break;
                    case 's':
                        out = out + "n";
                        break;
                    case 'e':
                        out = out + "o";
                        break;
                    case 'v':
                        out = out + "p";
                        break;
                    case 'z':
                        out = out + "q";
                        break;
                    case 'p':
                        out = out + "r";
                        break;
                    case 'd':
                        out = out + "s";
                        break;
                    case 'r':
                        out = out + "t";
                        break;
                    case 'j':
                        out = out + "u";
                        break;
                    case 'g':
                        out = out + "v";
                        break;
                    case 't':
                        out = out + "w";
                        break;
                    case 'h':
                        out = out + "x";
                        break;
                    case 'a':
                        out = out + "y";
                        break;
                    case 'q':
                        out = out + "z";
                        break;
                    default:
                        out =out + " ";
                        break;
                }
            }
            System.out.println("Case #"+(i+1)+": "+out);
        }

    }

}
