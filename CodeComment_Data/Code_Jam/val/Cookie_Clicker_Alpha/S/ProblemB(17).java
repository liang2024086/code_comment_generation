package methodEmbedding.Cookie_Clicker_Alpha.S.LYD247;

import java.io.*;
import java.util.StringTokenizer;

public class ProblemB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int test = Integer.parseInt(st.nextToken());
        for (int testNo = 1; testNo <= test ; testNo++) {
            st = new StringTokenizer(br.readLine());
            double c = Double.parseDouble(st.nextToken());
            double f = Double.parseDouble(st.nextToken());
            double x = Double.parseDouble(st.nextToken());
            double init = 2;
            double total = 0.0;
            while (true){
                double div = c / init;
                double target = x / init;
                double temp = div + (x / (init + f));
                if (temp < target){
                    total += div;
                    init += f;
                }
                else {
                    total += target;break;
                }
            }
            out.print("Case #" + "" + testNo + ": " + total + "\n");
        }
        out.close();
    }
}
