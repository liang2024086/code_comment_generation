package methodEmbedding.Speaking_in_Tongues.S.LYD958;

import java.util.Hashtable;

public class Tongues {
    
    
    public static void main(String[] args) {
        
        // Input files
        String file_trainingcode = "trainingcode.txt";
        String file_trainingdecode = "trainingdecode.txt";
        String file_testing = "testing.txt";
        In in_traincode = new In(file_trainingcode);
        In in_traindecode = new In(file_trainingdecode);
        In in_test = new In(file_testing);
        char c, d;
        int i = 1;
        
        // Mapping
        Hashtable<Character, Character> ht = new Hashtable<Character, Character>();
        int lines = in_traincode.readInt();
        
        // Read in training set
        while (!in_traincode.isEmpty()) {
            c = in_traincode.readChar();
            d = in_traindecode.readChar();
            ht.put(c, d);
        }
        
        // Decode testing set
        while (!in_test.isEmpty()) {
            c = in_test.readChar();
            if (ht.get(c) != null) d = ht.get(c);
            else d = '*';
            System.out.print(d);
            if (d == '\n') { 
                System.out.print("Case #" + i + ": ");
                i++;
            }
        }
    }
}
