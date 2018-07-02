package methodEmbedding.Speaking_in_Tongues.S.LYD283;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ESIEN
 */
public class A {


    public static void main(String[] args)throws java.io.IOException{
        java.util.Scanner fromFile = new java.util.Scanner(new java.io.File("input.txt"));
        java.io.PrintStream intoFile = new java.io.PrintStream("output.txt");
        char[] map = new char[26];
        map[0] = 'y';
        map[1] = 'h';
        map[2] = 'e';
        map[3] = 's';//d
        map[4] = 'o';
        map[5] = 'c';
        map[6] = 'v';
        map[7] = 'x';
        map[8] = 'd';
        map[9] = 'u';
        map[10] = 'i';//k
        map[11] = 'g';
        map[12] = 'l';//m
        map[13] = 'b';
        map[14] = 'k';
        map[15] = 'r';
        map[16] = 'z';//q
        map[17] = 't';
        map[18] = 'n';
        map[19] = 'w';
        map[20] = 'j';
        map[21] = 'p';//v
        map[22] = 'f';
        map[23] = 'm';
        map[24] = 'a';
        map[25] = 'q';
        int t = fromFile.nextInt();
        fromFile.nextLine();
        for (int test = 1 ; test <= t ; test++){
            intoFile.printf("Case #%d: ", test);
            char[] line = fromFile.nextLine().toCharArray();
            for (int i = 0 ; i < line.length ; i++)
                intoFile.print(line[i]==' '?' ':map[line[i]-97]);
            intoFile.println();
        }
    }

}
