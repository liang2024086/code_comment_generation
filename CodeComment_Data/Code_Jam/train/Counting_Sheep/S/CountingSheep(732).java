package methodEmbedding.Counting_Sheep.S.LYD218;


import java.io.*;

/**
 *  Problem A. Counting Sheep
 *  Qualification Round 2016
 */
public class CountingSheep {
    public static void main(String[] args) {

        String fileNameIn = "C:\\Users\\Jan\\IdeaProjects\\Coding\\out\\production\\Coding\\googlecodejam\\qualificationround2016\\input-output\\A-small-attempt0.in";

        String fileNameOut = "C:\\Users\\Jan\\IdeaProjects\\Coding\\out\\production\\Coding\\googlecodejam\\qualificationround2016\\input-output\\A-small-attempt0.out";

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileNameIn);
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Assume default encoding.
            FileWriter fileWriter = new FileWriter(fileNameOut);
            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            int t = Integer.parseInt(bufferedReader.readLine());

            for (int i=1; i<=t; i++) {
                int test = Integer.parseInt(bufferedReader.readLine());
                String result = "x";
                boolean[] check = {false, false, false, false, false, false, false, false, false, false};
                boolean checkTest = true;

                if (test == 0) {result = "INSOMNIA";}
                String temp;
                int test2 = test;
                while (result.equals("x")) {
                    temp = ""+test2;
                    for (int j = 0; j < temp.length(); j++) {
                        String c = ""+temp.charAt(j);
                        int b = Integer.parseInt(c);
                        check[b] = true;
                    }
                    for (int j = 0; j<10; j++) {
                        if (!check[j]) {checkTest = false;}
                    }
                    if (checkTest) {result = temp;}
                    checkTest = true;
                    test2+=test;
                }

                bufferedWriter.write("Case #" + i + ": " + result);
                bufferedWriter.newLine();
            }

            bufferedReader.close();
            bufferedWriter.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileNameIn + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading/writing file '" + fileNameIn + "' or '" + fileNameOut + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
}
