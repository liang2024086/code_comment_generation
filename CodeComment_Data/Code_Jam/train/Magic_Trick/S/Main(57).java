package methodEmbedding.Magic_Trick.S.LYD708;


import java.io.*;

/**
 * Created by danim_000 on 4/13/14.
 */
public class Main {

    public static void main(String [ ] args){
        //read from file line by line
        String file_name = "input.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(file_name));
            File file = new File("outfinal.txt");
            BufferedWriter output = new BufferedWriter(new FileWriter(file));


            String line = br.readLine();
            int nr_tests = Integer.parseInt(line);
            for(int i=1; i<= nr_tests; i++) {

                int nr_found = 0;
                // 0 - nu am gasit
                // -1 - duplicate
                // >0 found

                //citimi row
                line = br.readLine();
                int nr_row = Integer.parseInt(line);

                //citim 4x4
                String[] numbers_one = new String[5];
                for(int r=1; r<=4;r++){
                    line = br.readLine();
                    if(r == nr_row){
                        numbers_one = line.split(" ");
                    }
                }

                //citim row 2
                line = br.readLine();
                nr_row = Integer.parseInt(line);

                //citim 4x4
                for(int r=1; r<=4;r++){
                    line = br.readLine();
                    if(r == nr_row){
                        String[] numbers_two = line.split(" ");
                        for(String number_two:numbers_two){
                            for(String number_one:numbers_one){
                                if(number_one.equals(number_two)){
                                    if(nr_found == 0){
                                        nr_found = Integer.parseInt(number_one);
                                    } else {
                                        nr_found = -1;
                                    }
                                }
                            }
                        }
                    }
                }

                String out = "Case #" + i + ": ";
                if(nr_found == 0){
                    out += "Volunteer cheated!";
                } else if(nr_found == -1){
                    out += "Bad magician!";
                } else {
                    out += nr_found + "";
                }
                out += "\n";

                output.write(out);
                System.out.println(out);
            }
            br.close();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /**/


    }
}
