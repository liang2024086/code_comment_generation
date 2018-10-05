package methodEmbedding.Speaking_in_Tongues.S.LYD1531;



import java.io.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static String str = "C:\\carl\\fileA.txt";
    static String text = "";
    
    static int N, C, A, B, L, count;
    
    

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Character, Character> ht = new HashMap();
        ht.put('y', 'a');
        ht.put('n', 'b');
        ht.put('f', 'c');
        ht.put('i', 'd');
        ht.put('c', 'e');
        ht.put('w', 'f');
        ht.put('l', 'g');
        ht.put('b', 'h');
        ht.put('k', 'i');
        ht.put('u', 'j');
        ht.put('o', 'k');
        ht.put('m', 'l');
        ht.put('x', 'm');
        ht.put('s', 'n');
        ht.put('e', 'o');
        ht.put('v', 'p');
        ht.put('z', 'q');
        ht.put('p', 'r');
        ht.put('d', 's');
        ht.put('r', 't');
        ht.put('j', 'u');
        ht.put('g', 'v');
        ht.put('t', 'w');
        ht.put('h', 'x');
        ht.put('a', 'y');
        ht.put('q', 'z');
        
        
    
        
        try {
            int caser = 1;
            count = 0;
            File file = new File(str);
            BufferedReader br = new BufferedReader(new FileReader(file));
            PrintWriter outer = new PrintWriter(new FileWriter("C:\\carl\\out.txt"));

            
            while((text = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(text);
                if(count == 0) {
                    N = Integer.parseInt(st.nextToken());
                    count++;
                } else  {
                    outer.print("Case #" + caser + ": ");
                    while(st.hasMoreTokens()) {
                        char[] temp = st.nextToken().toCharArray();
                        char[] met = new char[temp.length];
                        
                        //int i = 0;
                        for(int i = 0; i < temp.length; i++) {
                            char a = ht.get(temp[i]);
                            temp[i] = a;
                        }

                        for(char c : temp) {
                            outer.print(c);
                        }
                        outer.print(" ");
                        
                    }
                    outer.println("");
                    caser++;
                }
                
                
                
            }
            outer.close();
            
        } catch(IOException ex) {
            System.out.println("Error with IO you foooool");
        } catch(Exception ex) {
            System.out.println("Generic Error. Noob.");
            ex.printStackTrace();
        }
    }

}
