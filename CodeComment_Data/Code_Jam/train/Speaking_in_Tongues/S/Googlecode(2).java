package methodEmbedding.Speaking_in_Tongues.S.LYD154;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Googlecode {

    public static void main(String[] args) throws Exception {
        char english[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char googlerese[] = {'y', 'n', 'f', 'i', 'c', 'w', 'l', 'b', 'k', 'u', 'o', 'm', 'x', 's', 'e', 'v', 'z', 'p', 'd', 'r', 'j', 'g', 't', 'h', 'a', 'q'};
        char curLine[];
        BufferedReader fl = new BufferedReader(new FileReader("A-small-attempt0.in"));
        BufferedWriter bf = new BufferedWriter(new FileWriter("output.txt"));
        String line;
        int j,i,k=0;
        
        outer1:
        while ((line = fl.readLine()) != null) {
            k++;
            
            if(k==1)
                continue outer1;
            
            bf.write("Case #"+(k-1)+": ");
            
            
            curLine = line.toCharArray();

            outer2:
            for (i = 0; i < curLine.length; i++) {
                for (j = 0; j < 26; j++) {
                    if (curLine[i] == googlerese[j]) {
                        bf.write(english[j]);
                        break;
                    }
                }
                
                if (j == 26) {
                    bf.write(curLine[i]);
                    continue outer2;
                }
            }
            bf.write("\n");
        }

        bf.close();
    }
}
