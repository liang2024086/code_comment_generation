package methodEmbedding.Standing_Ovation.S.LYD1411;

import java.io.*;

/**
 * Created by Abdullah Shoaib on 4/12/14.
 */
public class ProgrammingQuestionSolver {

    public static void main(String args[]) {

        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("input.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {

            fileWriter = new FileWriter("output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader reader = new BufferedReader(fileReader);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        try {
            new Codejam15StandingOvation().solve(reader, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (fileReader != null){
            try {
                reader.close();
                fileReader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (fileWriter != null){
            try {
                writer.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


}
