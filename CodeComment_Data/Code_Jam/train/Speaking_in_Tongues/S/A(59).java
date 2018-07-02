package methodEmbedding.Speaking_in_Tongues.S.LYD1232;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Hashtable;
import java.util.Scanner;

public class A {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (FileReader file = new FileReader("entrada3.in"); Scanner scanner = new Scanner(file)) {
            int T,i,j,l;
            String linea;
            Hashtable maps = new Hashtable();
            maps.put('e', 'o');
            maps.put('q', 'z');
            maps.put('y', 'a');
            maps.put('m', 'l');
            maps.put('s', 'n');
            maps.put('l', 'g');
            maps.put('j', 'u');
            maps.put('c', 'e');
            maps.put('p', 'r');
            maps.put('k', 'i');
            maps.put('d', 's');
            maps.put('x', 'm');
            maps.put('v', 'p');
            maps.put('n', 'b');
            maps.put('r', 't');
            maps.put('i', 'd');
            maps.put('b', 'h');
            maps.put('t', 'w');
            maps.put('a', 'y');
            maps.put('h', 'x');
            maps.put('w', 'f');
            maps.put('f', 'c');
            maps.put('o', 'k');
            maps.put('u', 'j');
            maps.put('g', 'v');
            maps.put('z', 'q');
            maps.put(' ', ' ');           
            T=Integer.parseInt(scanner.nextLine());
            System.setOut(new PrintStream("salida3.out"));
            for (i=1;i<=T;i++){
                linea=scanner.nextLine();
                l=linea.length();
                System.out.print("Case #"+i+": ");
                for (j=0;j<l;j++){
                    System.out.print(maps.get(linea.charAt(j)));
                }
                System.out.println();
            }
        }
        
    }
}
