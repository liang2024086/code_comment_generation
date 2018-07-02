package methodEmbedding.Speaking_in_Tongues.S.LYD497;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A {
    
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("src/" + args[0]));
            
            int n = Integer.parseInt(br.readLine());
            char[] a = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
        
            for (int i = 0; i != n; ++i) {
                String x = "";
                char[] f = br.readLine().toCharArray();

                System.out.print("Case #" + (i+1) + ": ");

                for (int k = 0; k != f.length; ++k)
                    if (f[k] == ' ')
                        System.out.print(" ");
                    else
                        System.out.print(a[f[k] - 'a']);

                System.out.println();
            }

        } catch (IOException e) {
            
            e.printStackTrace();
            
        } finally {
            
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
        }
    }
}
