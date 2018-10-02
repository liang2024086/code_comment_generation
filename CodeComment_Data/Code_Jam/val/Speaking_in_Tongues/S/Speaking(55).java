package methodEmbedding.Speaking_in_Tongues.S.LYD314;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class Speaking {
    public static void main(String[] args){
        BufferedReader bf;
        FileReader fl;
        FileWriter f2;
        try {
            fl = new FileReader("C:\\A-small-attempt0.in");
            f2 = new FileWriter("C:\\A-small-attempt0.out");
            bf = new BufferedReader(fl);
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
            for (int i = 0; i < num; i++) {
                f2.append("Case #"+(i+1)+": ");
                System.out.print("Case #"+(i+1)+": ");
                String linea = bf.readLine();
                for (int j = 0;j<linea.length();j++) {
                    char car = linea.charAt(j);
                    switch(car) {
                        case'a':
                            f2.append('y');
                            System.out.print("y");
                            break;
                        case'b':
                            f2.append('h');
                            System.out.print("h");
                            break;
                        case'c':    
                            f2.append('e');
                            System.out.print("e");
                            break;
                        case'd':
                            f2.append('s');
                            System.out.print("s");                        
                            break;
                        case'e':    
                            f2.append('o');
                            System.out.print("o");
                            break;
                        case'f':    
                            f2.append('c');
                            System.out.print("c");
                            break;
                        case'g':    
                            f2.append('v');
                            System.out.print("v");
                            break;
                        case'h':    
                            f2.append('x');
                            System.out.print("x");
                            break;
                        case'i':    
                            f2.append('d');
                            System.out.print("d");
                            break;
                        case'j':    
                            f2.append('u');
                            System.out.print("u");
                            break;
                        case'k':    
                            f2.append('i');
                            System.out.print("i");
                            break;
                        case'l':    
                            f2.append('g');
                            System.out.print("g");
                            break;
                        case'm':    
                            f2.append('l');
                            System.out.print("l");
                            break;
                        case'n':    
                            f2.append('b');
                            System.out.print("b");
                            break;
                        case'o':    
                            f2.append('k');
                            System.out.print("k");
                            break;
                        case'p':    
                            f2.append('r');
                            System.out.print("r");
                            break;
                        case'q':    
                            f2.append('z');
                            System.out.print("z");
                            break;
                        case'r':    
                            f2.append('t');
                            System.out.print("t");
                            break;
                        case's':    
                            f2.append('n');
                            System.out.print("n");
                            break;
                        case't':    
                            f2.append('w');
                            System.out.print("w");
                            break;
                        case'u':    
                            f2.append('j');
                            System.out.print("j");
                            break;
                        case'v':    
                            f2.append('p');
                            System.out.print("p");
                            break;
                        case'w':    
                            f2.append('f');
                            System.out.print("f");
                            break;
                        case'x':    
                            f2.append('m');
                            System.out.print("m");
                            break;
                        case'y':    
                            f2.append('a');
                            System.out.print("a");
                            break;
                        case'z':    
                            f2.append('q');
                            System.out.print("q");
                            break;
                        case' ':    
                            f2.append(' ');
                            System.out.print(" ");
                                        }
            }
            f2.append("\r\n");
            System.out.print("\n");
   
        }
        fl.close();
        f2.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Speaking.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(Speaking.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
               
    }
}

