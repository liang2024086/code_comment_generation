package methodEmbedding.Standing_Ovation.S.LYD768;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String line;
        ArrayList<String> lines = new ArrayList<String>();
        try {
            InputStream file = new FileInputStream("A-small-attempt2.in");
            InputStreamReader inputStreamReader = new InputStreamReader(file, Charset.forName("UTF-8"));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while((line = bufferedReader.readLine()) != null){
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.print("File was not found");
        } catch (IOException e) {
            System.out.print("problem reading file");
        }
        StandingOveation run = new StandingOveation(lines);
        ArrayList<String> outFileResult;
        outFileResult = run.getNeeded();
        File fileOut = new File("A-small2.out");
        int i = 1;
        try {
            FileOutputStream FOS = new FileOutputStream(fileOut);
            BufferedWriter buffWriter = new BufferedWriter(new OutputStreamWriter(FOS));
            for(String out: outFileResult) {
                buffWriter.write("Case #" + i + ": " + out);
                buffWriter.newLine();
                i++;
            }
            buffWriter.close();

        } catch (FileNotFoundException e) {
            System.out.print("File not found");
        } catch (IOException e) {
            System.out.print("buffered writer error");
        }

    }
    }

