package methodEmbedding.Revenge_of_the_Pancakes.S.LYD311;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        //TODO switch to smart before submit
        Solver solver = new BruteForceSolver();

        Scanner sc = new Scanner(new File("b.in"));
        //read data
        String[] test = new String[sc.nextInt()];
        for (int i = 0; i < test.length; ++i) {
            test[i] = sc.next();
        }
        sc.close();
        //solution
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < test.length; ++i) {
            int result = solver.solve(test[i]);
            sb.append("Case #").append(i + 1).append(": ")
                    .append(result).append("\r\n");
        }
        //write solution
        PrintWriter pw = new PrintWriter(new File("b.out"));
        pw.print(sb.toString());
        pw.close();
    }
}
