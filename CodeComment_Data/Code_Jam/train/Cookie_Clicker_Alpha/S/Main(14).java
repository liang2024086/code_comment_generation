package methodEmbedding.Cookie_Clicker_Alpha.S.LYD610;


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write  your code here
        Scanner scanner = new Scanner(new FileInputStream("input.txt"));

        PrintWriter out = new PrintWriter("out3.txt");

        int t = Integer.valueOf(scanner.nextLine());
        int count = 0;

        for(int i = 0; i < t; i++) {
            count++;

            String[] mas = scanner.nextLine().split(" ");
            double c = Double.valueOf(mas[0]);
            double f = Double.valueOf(mas[1]);
            double x = Double.valueOf(mas[2]);


            List<Double> res = new ArrayList<Double>();
            double farm = 0;
            for(int j = 0; j < x/c ; j++){
                double rest = x / (2 + j*f);

                if (c>x)
                    res.add(rest);
                else
                    res.add(farm+rest);

                farm += c/(2 + j * f);


            }

            Double result = Collections.min(res);


            out.println(String.format("Case #%s: %s", count, result));
            System.out.println(String.format("Case #%s: %s", count, result));



        }

        out.close();


    }



}
