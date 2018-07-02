package methodEmbedding.Speaking_in_Tongues.S.LYD1348;

import java.util.*;
import java.io.*;
public class Tester
{
    public static void main(String[]args) throws IOException
    {
        Scanner sc = new Scanner(new File("A-small-attempt1.in"));
        int num;
        num = sc.nextInt();
        sc.nextLine();
        String input[]  = new String[num];
        for(int i =0;i<num;i++)
        {
            input[i] = sc.nextLine();
        }
        for(int j=0;j<num;j++)
        {
        char[] myIn = input[j].toCharArray();
        System.out.print("Case #" + (j+1) + ": ");
        for(int i =0;i<input[j].length();i++)
        {
            switch(myIn[i])
            {
                case 'a':
                myIn[i] = 'y';
                break;
                case 'b':
                myIn[i] = 'h';
                break;
                case 'c':
                myIn[i] = 'e';
                break;
                case 'd':
                myIn[i] = 's';
                break;
                case 'e':
                myIn[i] = 'o';
                break;
                case 'f':
                myIn[i] = 'c';
                break;
                case 'g':
                myIn[i] = 'v';
                break;
                case 'h':
                myIn[i] = 'x';
                break;
                case 'i':
                myIn[i] = 'd';
                break;
                case 'j':
                myIn[i] = 'u';
                break;
                case 'k':
                myIn[i] = 'i';
                break;
                case 'l':
                myIn[i] = 'g';
                break;
                case 'm':
                myIn[i] = 'l';
                break;
                case 'n':
                myIn[i] = 'b';
                break;
                case 'o':
                myIn[i] = 'k';
                break;
                case 'p':
                myIn[i] = 'r';
                break;
                case 'q':
                myIn[i] = 'z';
                break;
                case 'r':
                myIn[i] = 't';
                break;
                case 's':
                myIn[i] = 'n';
                break;
                case 't':
                myIn[i] = 'w';
                break;
                case 'u':
                myIn[i] = 'j';
                break;
                case 'v':
                myIn[i] = 'p';
                break;
                case 'w':
                myIn[i] = 'f';
                break;
                case 'x':
                myIn[i] = 'm';
                break;
                case 'y':
                myIn[i] = 'a';
                break;
                case 'z':
                myIn[i] = 'q';
                break;
            }
        System.out.print(myIn[i]);
        }
        System.out.println();
    }
}
}
