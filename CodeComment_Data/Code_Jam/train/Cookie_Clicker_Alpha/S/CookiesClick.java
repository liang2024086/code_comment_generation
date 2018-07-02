package methodEmbedding.Cookie_Clicker_Alpha.S.LYD751;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class CookiesClick {

    public static void main(String[] args) {

        BufferedReader in;
        try {
            FileWriter fstream = new FileWriter("C:\\Users\\Krishna\\IdeaProjects\\java1\\src\\output1.out");
            BufferedWriter out = new BufferedWriter(fstream);

            in = new BufferedReader(new FileReader("C:\\Users\\Krishna\\IdeaProjects\\java1\\src\\B-small-attempt0.in"));
            int noOfTests = Integer.parseInt(in.readLine());


            for(int i=0;i<noOfTests;i++)
            {
                double prev_sum = 0.0;
                double sum = 0.0;

                double increment = 2.0, a=0.0;
                String str = in.readLine();
                StringTokenizer tokenizer = new StringTokenizer(str, " ");

                double C = Double.parseDouble(tokenizer.nextToken());	//30
                double F = Double.parseDouble(tokenizer.nextToken());	//2
                double X = Double.parseDouble(tokenizer.nextToken());	//100

                prev_sum = X/increment;
                while(true)
                {
                    a += C/increment;
                    increment += F;
                    sum = a +  X/increment;
                    if(prev_sum < sum)
                        break;
                    prev_sum = sum;
                }

                out.write("Case #"+(i+1)+": "+prev_sum+"\n");
                //System.out.println("Case #"+(i+1)+": "+prev_sum+"\n");

            }

            in.close();
            out.close();
        }
        catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
