package methodEmbedding.Speaking_in_Tongues.S.LYD26;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Johanes
 */
public class Satu {

    public static void main(String[] args) throws IOException {
        //Scanner masuk = new Scanner(System.in);
	BufferedReader rd1 = new BufferedReader(new InputStreamReader(System.in));
        int ulang = Integer.parseInt(rd1.readLine());
        for (int i = 1; i <= ulang; i++) {
           // BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            String input = rd1.readLine();
            //input = input.toLowerCase();
            String output="";
            System.out.print("Case #" + i + ": ");
            StringTokenizer tok = new StringTokenizer(input);
//            while(tok.hasMoreTokens())
            for(int r=0;r<input.length();r++)
            {
                
            char []now = input.toCharArray();
            //for (int j = 0; j < now.length; j++) {
                switch (now[r]) {
                    case 'y':
                        output = output + ("a");
                        break;
                    case 'n':
                        output = output + ("b");
                        break;
                    case 'f':
                        output = output + ("c");
                        break;
                    case 'i':
                        output = output + ("d");
                        break;
                    case 'c':
                        output = output + ("e");
                        break;
                    case 'w':
                        output = output + ("f");
                        break;
                    case 'l':
                        output = output + ("g");
                        break;
                    case 'b':
                        output = output + ("h");
                        break;
                    case 'k':
                        output = output + ("i");
                        break;
                    case 'u':
                        output = output + ("j");
                        break;
                    case 'o':
                        output = output + ("k");
                        break;
                    case 'm':
                        output = output + ("l");
                        break;
                    case 'x':
                        output = output + ("m");
                        break;
                    case 's':
                        output = output + ("n");
                        break;
                    case 'e':
                        output = output + ("o");
                        break;
                    case 'v':
                        output = output + ("p");
                        break;
                    case 'z':
                        output = output + ("q");
                        break;
                    case 'p':
                        output = output + ("r");
                        break;
                    case 'd':
                        output = output + ("s");
                        break;
                    case 'r':
                        output = output + ("t");
                        break;
                    case 'j':
                        output = output + ("u");
                        break;
                    case 'g':
                        output = output + ("v");
                        break;
                    case 't':
                        output = output + ("w");
                        break;
                    case 'h':
                        output = output + ("x");
                        break;
                    case 'a':
                        output = output + ("y");
                        break;
                    case 'q':
                        output = output + ("z");
                        break;
                    case ' ':
                        //System.out.println("hahahaha");
                        output = output + (" ");
                        break;
                }
            //}
            //System.out.print(output);
            //output="";
            }
            System.out.println(output);
        }
    }

  
}
