package methodEmbedding.Speaking_in_Tongues.S.LYD354;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class speaking {
    public static void main(String[] args) {
        Map<Character, Character> mapping = new HashMap<Character, Character>();
        mapping.put('a', 'y');
        mapping.put('b', 'h');
        mapping.put('c', 'e');
        mapping.put('d', 's');
        mapping.put('e', 'o');
        mapping.put('f', 'c');
        mapping.put('g', 'v');
        mapping.put('h', 'x');
        mapping.put('i', 'd');
        mapping.put('j', 'u');
        mapping.put('k', 'i');
        mapping.put('l', 'g');
        mapping.put('m', 'l');
        mapping.put('n', 'b');
        mapping.put('o', 'k');
        mapping.put('p', 'r');
        mapping.put('q', 'z');
        mapping.put('r', 't');
        mapping.put('s', 'n');
        mapping.put('t', 'w');
        mapping.put('u', 'j');
        mapping.put('v', 'p');
        mapping.put('w', 'f');
        mapping.put('x', 'm');
        mapping.put('y', 'a');
        mapping.put('z', 'q');
        mapping.put(' ',' ');
        int T;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = reader.readLine();
            T= Integer.parseInt(input);
            List<String> inputStrings=new ArrayList<String>();
            List<String> outputStrings = new ArrayList<String>();
            while(T-->0)
            {
                input = reader.readLine();
                inputStrings.add(input);
            }
            for(String string:inputStrings)
            {
                char []outputString = string.toCharArray();
                for(int i=0;i<string.length();i++)
                {

                    char current = outputString[i];
                    outputString[i] = mapping.get(current);
                }
                outputStrings.add(String.valueOf(outputString));

            }
            int counter =1;
            for(String string:outputStrings)
            {
                System.out.println("Case #"+counter+": "+string);
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
