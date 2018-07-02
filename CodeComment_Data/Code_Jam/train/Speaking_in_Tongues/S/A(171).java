package methodEmbedding.Speaking_in_Tongues.S.LYD524;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.io.FileInputStream;

/**
 *
 * @author imgps
 */
public class A {
    public static void main(String args[]) throws Exception{
        int testCases;
        Scanner sc = new Scanner(new FileInputStream("A-small-attempt1.in"));
        testCases = Integer.parseInt(sc.nextLine());
        
        String arr[] = new String[testCases];
        for(int i =0 ; i < testCases; i++){
            arr[i] = sc.nextLine();
        }
        for(int i =0 ; i < testCases; i++){
            String mul[] = arr[i].split(" ");
	    System.out.print("Case #"+(i+1)+": ");
            for(int j=0;j<mul.length;j++){
                char a[] = mul[j].toCharArray();
                int k=0;
                while(k<a.length){
                    switch(a[k]){
                        case 'a':
                            System.out.print('y');
                            break;
                        case 'b':
                            System.out.print('h');
                            break;
                        case 'c':
                            System.out.print('e');
                            break;
                        case 'd':
                            System.out.print('s');
                            break;
                        case 'e':
                            System.out.print('o');
                            break;
                        case 'f':
                            System.out.print('c');
                            break;
                        case 'g':
                            System.out.print('v');
                            break;
                        case 'h':
                            System.out.print('x');
                            break;
                        case 'i':
                            System.out.print('d');
                            break;
                        case 'j':
                            System.out.print('u');
                            break;
                        case 'k':
                            System.out.print('i');
                            break;
                        case 'l':
                            System.out.print('g');
                            break;
                        case 'm':
                            System.out.print('l');
                            break;
                        case 'n':
                            System.out.print('b');
                            break;
                        case 'o':
                            System.out.print('k');
                            break;
                        case 'p':
                            System.out.print('r');
                            break;
                        case 'q':
                            System.out.print('z');
                            break;
                        case 'r':
                            System.out.print('t');
                            break;
                        case 's':
                            System.out.print('n');
                            break;
                        case 't':
                            System.out.print('w');
                            break;
                        case 'u':
                            System.out.print('j');
                            break;
                        case 'v':
                            System.out.print('p');
                            break;
                        case 'w':
                            System.out.print('f');
                            break;
                        case 'x':
                            System.out.print('m');
                            break;
                        case 'y':
                            System.out.print('a');
                            break;
                        case 'z':
                            System.out.print('q');
                            break;
                        default:
                    }
                    k++;
                }
                System.out.print(" ");
            }
	    System.out.println();
        }
       
    }
}
