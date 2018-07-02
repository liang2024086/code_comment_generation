package methodEmbedding.Speaking_in_Tongues.S.LYD0;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author milen.chechev
 */
public class Speeking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put('y', 'a');
        map.put('e', 'o');
        map.put('q', 'z');
        HashSet<Character> inputSet = new HashSet<Character>();
        HashSet<Character> outputSet = new HashSet<Character>();
        for(char ch = 'a' ; ch <='z'; ch++){
            if(!map.containsKey(ch)){
                inputSet.add(ch);
            }
            if(!map.containsValue(ch)){
                outputSet.add(ch);
            }
        }
        String input = "ejp mysljylc kd kxveddknmc re jsicpdrysi"+
"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd"+
"de kr kd eoya kw aej tysr re ujdr lkgc jv";
        String output = "our language is impossible to understand"+
"there are twenty six factorial possibilities"+
"so it is okay if you want to just give up";
        for(int i = 0 ; i < input.length();i++){
            if(inputSet.contains(input.charAt(i))){
                map.put(input.charAt(i), output.charAt(i));
                inputSet.remove(input.charAt(i));
                outputSet.remove(output.charAt(i));
            }
        }
        if(inputSet.size()==1 && outputSet.size()==1){
            map.put((Character)inputSet.toArray()[0],(Character)outputSet.toArray()[0]);
        }else if(inputSet.size() > 1){
            //the train data is not enough
        }
        Scanner in = new Scanner(new File("input.txt"));
        Formatter out = new Formatter(new File("output.txt"));
        int t = Integer.parseInt(in.nextLine());
        for(int k = 0 ; k < t; k++){
            String line = in.nextLine();
            StringBuilder b=new StringBuilder();
            for(int i = 0 ; i < line.length();i++){
                if(line.charAt(i)>'z' || line.charAt(i)<'a'){
                    b.append(line.charAt(i));
                }else{
                    b.append(map.get(line.charAt(i)));
                }
            }
            out.format("Case #%d: %s\n", k+1,b.toString());
        }
        out.close();

    }

}
