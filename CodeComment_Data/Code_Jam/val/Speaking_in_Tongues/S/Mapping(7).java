package methodEmbedding.Speaking_in_Tongues.S.LYD682;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: singh
 * Date: 14/4/12
 * Time: 7:04 AM
 * To change this template use File | Settings | File Templates.
 */
public class Mapping {
    static HashMap<Character,Character> map=new HashMap<Character, Character>();

    public static void main(String[] args) throws FileNotFoundException {
        map.put('a','y');
        map.put('b','h');
        map.put('c','e');
        map.put('d','s');
        map.put('e','o');
        map.put('f','c');
        map.put('g','v');
        map.put('h','x');
        map.put('i','d');
        map.put('j','u');
        map.put('k','i');
        map.put('l','g');
        map.put('m','l');
        map.put('n','b');
        map.put('o','k');
        map.put('p','r');
        map.put('q','z');
        map.put('r','t');
        map.put('s','n');
        map.put('t','w');
        map.put('u','j');
        map.put('v','p');
        map.put('w','f');
        map.put('x','m');
        map.put('y','a');
        map.put('z','q');

        Scanner sc=new Scanner(new File("C:\\Users\\singh\\Documents\\codejam\\inputA.in"));
        int testCases=Integer.parseInt(sc.nextLine());
        String outPut="";
        PrintWriter writer=new PrintWriter("C:\\Users\\singh\\Documents\\codejam\\out0.in");
        for(int iterator=0;iterator<testCases;iterator++)
        {
         StringBuffer currLine=new StringBuffer(sc.nextLine());
         for(int i=0;i<currLine.length();i++)
         {
             if(currLine.charAt(i)!=' ')
             {
              currLine.setCharAt(i,map.get(currLine.charAt(i)));
             }
         }
         writer.write("Case #"+(iterator+1)+": "+currLine+"\n");
        }
        writer.flush();
        writer.close();
    }
}
