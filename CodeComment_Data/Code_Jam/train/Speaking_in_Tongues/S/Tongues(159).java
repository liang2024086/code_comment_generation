package methodEmbedding.Speaking_in_Tongues.S.LYD1466;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ZuoZhong
 */
public class Tongues {
    //a = 10, 11= b with character.getvalue

    public static void main(String[] args) throws FileNotFoundException, IOException {
        HashMap<Character, Character> translator = new HashMap();
        translator.put('a', 'y');//
        translator.put('b', 'h');//
        translator.put('c', 'e');//
        translator.put('d', 's');//
        translator.put('e', 'o');//
        translator.put('f', 'c');//
        translator.put('g', 'v');//
        translator.put('h', 'x');//
        translator.put('i', 'd');//
        translator.put('j', 'u');//
        translator.put('k', 'i');//
        translator.put('l', 'g');//
        translator.put('m', 'l');//
        translator.put('n', 'b');//
        translator.put('o', 'k');//
        translator.put('p', 'r');//
        translator.put('q', 'z'); 
        translator.put('r', 't');//
        translator.put('s', 'n');//
        translator.put('t', 'w');//
        translator.put('u', 'j');//
        translator.put('v', 'p');//
        translator.put('w', 'f');//
        translator.put('x', 'm');//
        translator.put('y', 'a');//
        translator.put('z', 'q');
        translator.put(' ', ' ');
        
        File file = new File("A-small-attempt0.in");
        File outputFile = new File("output.txt");
        BufferedReader in = new BufferedReader(new FileReader(file));
        BufferedWriter out = new BufferedWriter(new FileWriter(outputFile));
        String line = in.readLine();

        int caseNumber = Integer.parseInt(line);
        for(int count = 1; count <= caseNumber; count++){
            line = in.readLine();
            out.write("Case #" + count + ": ");
            System.out.print("Case #" + count + ": ");
            for(char c : line.toCharArray()){
                char translated = translator.get(c);
                out.write(translated);
                System.out.print(translated);
            }
            out.newLine();
            System.out.println();
        }
        
        out.close();
        in.close();
    }
}
