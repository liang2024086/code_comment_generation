package methodEmbedding.Speaking_in_Tongues.S.LYD411;

import java.util.Scanner;

/**
 * Speaking in Tongues [http://code.google.com/codejam]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        byte T; // para el numero de casos
        char[] G; // para el texto de entrada
        String G_RES; // para el texto a traducir
        byte t; // para los bucles de T
        byte i; // para los caracteres de G

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        T = Byte.parseByte(Lee.nextLine());
        for(t = 1; t <= T; t++){
            System.out.print("Case #" + t + ": ");
            G = Lee.nextLine().toCharArray();
            G_RES = "";
            for(i = 0; i < G.length; i++){
                switch(G[i]){
                    case 'a':
                        G_RES += 'y';
                        break;
                    case 'b':
                        G_RES += 'h';
                        break;
                    case 'c':
                        G_RES += 'e';
                        break;
                    case 'd':
                        G_RES += 's';
                        break;
                    case 'e':
                        G_RES += 'o';
                        break;
                    case 'f':
                        G_RES += 'c';
                        break;
                    case 'g':
                        G_RES += 'v';
                        break;
                    case 'h':
                        G_RES += 'x';
                        break;
                    case 'i':
                        G_RES += 'd';
                        break;
                    case 'j':
                        G_RES += 'u';
                        break;
                    case 'k':
                        G_RES += 'i';
                        break;
                    case 'l':
                        G_RES += 'g';
                        break;
                    case 'm':
                        G_RES += 'l';
                        break;
                    case 'n':
                        G_RES += 'b';
                        break;
                    case 'o':
                        G_RES += 'k';
                        break;
                    case 'p':
                        G_RES += 'r';
                        break;
                    case 'q':
                        G_RES += 'z';
                        break;
                    case 'r':
                        G_RES += 't';
                        break;
                    case 's':
                        G_RES += 'n';
                        break;
                    case 't':
                        G_RES += 'w';
                        break;
                    case 'u':
                        G_RES += 'j';
                        break;
                    case 'v':
                        G_RES += 'p';
                        break;
                    case 'w':
                        G_RES += 'f';
                        break;
                    case 'x':
                        G_RES += 'm';
                        break;
                    case 'y':
                        G_RES += 'a';
                        break;
                    case 'z':
                        G_RES += 'q';
                        break;
                    case ' ':
                        G_RES += ' ';
                        break;
                }
            }
            System.out.println(G_RES);
        }
    }
}
