package methodEmbedding.Speaking_in_Tongues.S.LYD1571;

import java.util.HashMap;
import java.util.Scanner;


public class SpeakingInTongues {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<Character,Character> replacer = new HashMap<Character,Character>();
        replacer.put('z', 'q');
        replacer.put('y', 'a');
        replacer.put('x', 'm');
        replacer.put('w', 'f');
        replacer.put('v', 'p');
        replacer.put('u', 'j');
        replacer.put('t', 'w');
        replacer.put('s', 'n');
        replacer.put('r', 't');
        replacer.put('q', 'z');
        replacer.put('p', 'r');
        replacer.put('o', 'k');
        replacer.put('n', 'b');
        replacer.put('m', 'l');
        replacer.put('l', 'g');
        replacer.put('k', 'i');
        replacer.put('j', 'u');
        replacer.put('i', 'd');
        replacer.put('h', 'x');
        replacer.put('g', 'v');
        replacer.put('f', 'c');
        replacer.put('e', 'o');
        replacer.put('d', 's');
        replacer.put('c', 'e');
        replacer.put('b', 'h');
        replacer.put('a', 'y');
        replacer.put(' ', ' ');
        int cases = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0;i<cases;i++){
            String str = scanner.nextLine();
            for(int j = 0;j<str.length();j++){
                str = str.substring(0,j)+replacer.get(str.charAt(j))+str.substring(j+1);
            }
            System.out.println("Case #"+(i+1)+": "+str);
        }
    }
}
