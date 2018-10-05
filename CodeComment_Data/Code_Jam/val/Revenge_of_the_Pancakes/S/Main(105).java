package methodEmbedding.Revenge_of_the_Pancakes.S.LYD87;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 *
 * @author cristian.marind
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Character> a, b;
        int tam = Integer.parseInt(br.readLine());
        for (int i = 1; i <= tam; i++) {
            String txt = br.readLine();
            a = new LinkedList();
            for (int j = 0; j < txt.length(); j++) {
                a.add(txt.charAt(j));
            }
            boolean bool = true;
            int res = 0;
            int j = 0;
            while(a.get(j)=='-'){
                a.set(j, '+');
                j++;
                if (j >= a.size()) {
                    bool = false;
                    break;
                }
                bool = false;
            }
            if(!bool){
                res++;
            }
            bool = true;
            while(j < a.size()){
                if (a.get(j) == '-') {
                    res +=2;
                    while(j < a.size() && a.get(j) == '-'){
                        a.set(j, '+');
                        j++;
                    }
                }
                j++;
            }
            System.out.println("Case #"+i+": "+res);
        }
    }
}
    
