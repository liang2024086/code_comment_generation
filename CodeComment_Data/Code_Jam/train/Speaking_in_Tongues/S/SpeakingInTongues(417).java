package methodEmbedding.Speaking_in_Tongues.S.LYD439;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.io.*;
/**
 * Google Code Jam 2012 
 * Problem A: Speaking In Tongues 
 * @author STEVEN
 * step.v4n@gmail.com
 */
public class SpeakingInTongues {

    public static int c;
    public static int cases;
    public static String result="";
    public static byte buffer[];
    public static String str;
    public static String tmp;
    public static int x=1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {                    
            OutputStream fout = new FileOutputStream("A-small-attempt1.out");            
            FileReader fr = new FileReader("A-small-attempt1.in");
            BufferedReader br = new BufferedReader(fr);             
            Scanner source = new Scanner(br);
            cases = source.nextInt();           
            source.nextLine();
            for (int i=0;i<cases;i++)
            {                                       
                str = source.nextLine();                
                //System.out.println(str);
                byte buf[] = str.getBytes();
                ByteArrayInputStream baf = new ByteArrayInputStream(buf);                
                while ((c=baf.read())!=-1)
                {
                switch (c) {
                    case 'e':
                        System.out.print('o');
                        result+="o";
                        break;
                    case 'j':
                        System.out.print('u');
                        result+="u";
                        break;
                    case 'p':
                        System.out.print('r');
                        result+="r";
                        break;
                    case 'm':
                        System.out.print('l');
                        result+="l";
                        break;
                    case 'y':
                        System.out.print('a');
                        result+="a";
                        break;
                    case 's':
                        System.out.print('n');
                        result+="n";
                        break;
                    case 'l':
                        System.out.print('g');
                        result+="g";
                        break;
                    case 'c':
                        System.out.print('e');
                        result+="e";
                        break;
                    case 'k':
                        System.out.print('i');
                        result+="i";
                        break;
                    case 'd':
                        System.out.print('s');
                        result+="s";
                        break;
                    case 'x':
                        System.out.print('m');
                        result+="m";
                        break;
                    case 'v':
                        System.out.print('p');
                        result+="p";
                        break;
                    case 'n':
                        System.out.print('b');
                        result+="b";
                        break;
                    case 'r':
                        System.out.print('t');
                        result+="t";
                        break;
                    case 'i':
                        System.out.print('d');
                        result+="d";
                        break;
                    case 'b':
                        System.out.print('h');
                        result+="h";
                        break;
                    case 't':
                        System.out.print('w');
                        result+="w";
                        break;
                    case 'h':
                        System.out.print('x');
                        result+="x";
                        break;
                    case 'w':
                        System.out.print('f');
                        result+="f";
                        break;
                    case 'a':
                        System.out.print('y');
                        result+="y";
                        break;
                    case 'o':
                        System.out.print('k');
                        result+="k";
                        break;
                    case 'u':
                        System.out.print('j');
                        result+="j";
                        break;
                    case 'g':
                        System.out.print('v');
                        result+="v";
                        break;
                    case 'f':
                        System.out.print('c');
                        result+="c";
                        break;
                    case 'z':
                        System.out.print('q');
                        result+="q";
                        break;
                    case 'q':
                        System.out.print('z');
                        result+="z";
                        break;
                    //case ' ':
                    //    System.out.print(' ');
                    //    result+=" ";
                    //    break;
                    default:
                        result+=(char)c;
                        break;
                }                
                }
                System.out.println(result);
                tmp = "Case #"+x+": "+result+"\n";
                x++;
                buffer = tmp.getBytes();
                fout.write(buffer);
                tmp = "";
                result = "";
            }
            source.close();
            br.close();
            fr.close();
            fout.close();
            
        } catch (IOException e)
        {
            
        }
    }
}
