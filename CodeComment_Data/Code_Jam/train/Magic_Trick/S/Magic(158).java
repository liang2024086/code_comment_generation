package methodEmbedding.Magic_Trick.S.LYD711;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Magic {

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


                ArrayList<String> row = new ArrayList<String>();

                int res = Integer.parseInt(line);

                for (int i = 1; i <= 4; i++) {
                    String thisLine = bufferedReader.readLine();
                    String[] sing = thisLine.split(" ");
                    if (i == res) {
                        for (String e : sing) {
                            row.add(e);
                        }

                    }
                }

                int res2 = Integer.parseInt(bufferedReader.readLine());
                int hit = 0;

                String d = "";
                for (int i = 1; i <= 4; i++) {
                    String thisLine = bufferedReader.readLine();

                    String[] sing = thisLine.split(" ");
                    if (i == res2) {
                        for (String e : sing) {

                            if (row.contains(e)) {
                                d = e;
                                hit++;
//                                System.out.println("yes");
                            }
                        }

                    }
                }

//                System.out.println(hit);
                if (hit == 1) {

                    writer.println("Case #" + x + ": "+ d);
                }else if(hit > 1){
                    writer.println("Case #" + x + ": Bad magician!" );
                }else if(hit == 0){
                    writer.println("Case #" + x + ": Volunteer cheated!" );
                }
                hit = 0;


                x++;


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
