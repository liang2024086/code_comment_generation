package methodEmbedding.Revenge_of_the_Pancakes.S.LYD595;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int t = in.nextInt();
        in.nextLine(); // Skip the \n after the nr of cases

        for (int i = 1; i <= t; ++i) {
            PancakeStack pancakeStack = new PancakeStack(in.nextLine());

            System.out.println("Case #" + i + ": " + pancakeStack.numberOfFlips());
        }
    }
}
