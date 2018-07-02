package methodEmbedding.Standing_Ovation.S.LYD94;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tsadok on 11/04/2015.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        List<String> list = new ArrayList<String>();
        File file = new File("file.txt");
        BufferedReader reader = null;

        File fout = new File("out.txt");
        FileOutputStream fos = new FileOutputStream(fout);


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        try {

            /*String current = new File(".").getCanonicalPath();
            System.out.println("Current dir:"+current);
            String currentDir = System.getProperty("user.dir");
            System.out.println("Current dir using System:" +currentDir); */



            reader = new BufferedReader(new FileReader(file));
            String text = null;

            //reading T
            reader.readLine();

            int counter = 1;

            while ((text = reader.readLine()) != null) {
                String[] split = text.split(" ");
                int max = Integer.parseInt(split[0]);
                int sum = 0;
                int toAdd = 0;

                for (int i=0; i < max; i++)
                {
                    int n = Integer.parseInt( String.valueOf(split[1].charAt(i)));
                    sum +=n;
                    if (sum < i+1) {
                        toAdd += i - sum+1;
                        sum = i+1;
                    }
                }

                bw.write("Case #" + counter + ": " + toAdd);
                bw.newLine();

                System.out.println("Case #" + counter + ": " + toAdd);
                counter++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }

                bw.close();
            } catch (IOException e) {
            }
        }

        System.out.println(list.toString());
    }
}
