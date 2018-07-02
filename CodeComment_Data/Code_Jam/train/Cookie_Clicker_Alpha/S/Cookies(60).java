package methodEmbedding.Cookie_Clicker_Alpha.S.LYD336;

import java.io.*;
import java.text.DecimalFormat;
public class Cookies {

    public static void main(String[] args) {

        String file = "a-small";
        String ext = ".in";
        String filePath = file + ext;
        String line;


        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            PrintWriter writer = new PrintWriter(file + "-sol.in", "UTF-8");
            int x = 1;
            int cases = Integer.parseInt(bufferedReader.readLine());


            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(" ");
                double farmPrice = Double.parseDouble(split[0]);
                double farmProduce = Double.parseDouble(split[1]);
                double maxCookies = Double.parseDouble(split[2]);
                double prod = 2;

                double secs = 0;
                double time = 0;
                double lastTime = 999999999;
                boolean flag = false;


                do {

                    time = (maxCookies / prod) + secs;
                    secs += farmPrice / prod;
                    prod += farmProduce;

                    if (lastTime > time) {
                        lastTime = time;
                    } else {
                        break;
                    }
                } while (true);

                writer.print("Case #"+ (x++)+": ");
                DecimalFormat df = new DecimalFormat("#.#######");
                writer.println(df.format(lastTime));



            }
            writer.close();
            bufferedReader.close();

        } catch (FileNotFoundException ex
                )

        {
            System.out.println(
                    "unable to open file '" + filePath + "'"
            );
        } catch (
                IOException ex
                )

        {
            ex.printStackTrace();
        }
    }
}
