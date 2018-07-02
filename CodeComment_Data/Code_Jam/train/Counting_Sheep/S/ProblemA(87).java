package methodEmbedding.Counting_Sheep.S.LYD1634;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Igor Cha on 4/8/2016.
 */
public class ProblemA {
    public static void main(String[] args) throws FileNotFoundException
    {
        FileReader file = new FileReader("A-small-attempt0.in");
        Scanner in = new Scanner(file);

        //output file
        PrintWriter out = new PrintWriter("output.txt");

        int t; //number of test cases
        int n;//store number
        int counter;
        int current = 0;



        String s = new String();



        t = in.nextInt();
        //in.nextLine();


        for(int i = 1; i<=t; i++)
        {
            boolean f0 = false;
            boolean f1 = false;
            boolean f2 = false;
            boolean f3 = false;
            boolean f4 = false;
            boolean f5 = false;
            boolean f6 = false;
            boolean f7 = false;
            boolean f8 = false;
            boolean f9 = false;

            counter = 1;
            n = in.nextInt();
            //in.nextLine();

            if(n==0)
                out.println("Case #"+i+":"+" INSOMNIA");
            else{
                while(!(f0 && f1 && f2 && f3 && f4 && f5 && f6 && f7 && f8 && f9)) {
                    current = n*counter;
                    s = current +"";
                    for(int j=0; j<s.length(); j++) {
                        switch (s.charAt(j)) {
                            case '0': f0 = true;
                                break;
                            case '1': f1 = true;
                                break;
                            case '2': f2 = true;
                                break;
                            case '3': f3 = true;
                                break;
                            case '4': f4 = true;
                                break;
                            case '5': f5 = true;
                                break;
                            case '6': f6 = true;
                                break;
                            case '7': f7 = true;
                                break;
                            case '8': f8 = true;
                                break;
                            case '9': f9 = true;
                                break;
                        }
                    }
                    counter++;
                }
                out.println("Case #"+i+": " + current); //print result!

            }

        }
        in.close();
        out.close();
    }



}
