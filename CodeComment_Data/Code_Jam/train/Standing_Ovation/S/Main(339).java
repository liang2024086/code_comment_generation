package methodEmbedding.Standing_Ovation.S.LYD700;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        //double ini = System.currentTimeMillis();
        //System.setIn(new FileInputStream("input.in"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            String y = st.nextToken();

            int soma = 0, cont = 0;
            for (int j = 0; j < y.length(); j++) {
              
                int a = Character.getNumericValue(y.charAt(j));
                if (soma >= j) {
                    soma += a;
                  
                }
                
                if (a > 0) {
                    
                    boolean cd = true;
                    while (soma < j) {
                        cd = false;
                        cont++;                      
                        soma++;                   

                    }
                    if (!cd) {
                        soma += a;                        
                    }
                }

            }

            sb.append("Case #").append(i + 1).append(": ").append(cont).append("\n");
            
        }
        
        bw.write(sb.toString());
        bw.flush();

        //double fim = System.currentTimeMillis();
        //System.out.println((fim - ini) / 1000);
    }

}
