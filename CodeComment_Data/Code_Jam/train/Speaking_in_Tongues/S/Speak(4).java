package methodEmbedding.Speaking_in_Tongues.S.LYD568;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Speak {
    public Speak() {
        super();
    }

    public static void main(String[] args) throws FileNotFoundException,
                                                  IOException {
        Speak speak = new Speak();
        FileReader fr = new FileReader("A-small-attempt1.in");
        BufferedReader br = new BufferedReader(fr);
        String noofT = br.readLine();
        int noOfTestCases = Integer.parseInt(noofT);
        TreeMap mapping = new TreeMap();
        mapping.put('y','a');
        mapping.put('e','o');
        mapping.put('q','z');
        mapping.put('j','u');
        mapping.put('p','r');
        mapping.put('m','l');
        mapping.put('s','n');
        mapping.put('l','g');
        mapping.put('c','e');
        mapping.put('k','i');
        mapping.put('d','s');
        mapping.put('x','m');
        mapping.put('v','p');
        mapping.put('n','b');
        mapping.put('r','t');
        mapping.put('i','d');
       // mapping.put('p','r');
        mapping.put('g','v');
        mapping.put('w','f');
        mapping.put('h','x');
        mapping.put('f','c');
        mapping.put('t','w');
        mapping.put('a','y');
        mapping.put('o','k');
        mapping.put('u','j');
        mapping.put('b','h');
        mapping.put('z','q');
                
        
        for (int i=0;i<noOfTestCases;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String out = "";
            while(st.hasMoreTokens()){
                String tobeconverted = st.nextToken();
                for (int j=0;j < tobeconverted.length();j++){
                    out = out + mapping.get(tobeconverted.charAt(j));
                }
                out = out + " ";
            }
            String output = "Case #" + (i+1) + ": " + out.trim();
            System.out.println(output);
            
        }
    }
}
