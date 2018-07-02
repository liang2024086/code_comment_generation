package methodEmbedding.Standing_Ovation.S.LYD1529;

/*
 * Google Code Jam 2015
 * Pablo Giudice
 *This is the main entry point for the program for problem #1
 */

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * MainClass
 * @author pgiu
 */
public class MainClass {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException, IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        //Change the class that solves the single unit
        SingleProblemSolver r = new Problem1();
        //String filename = "sample";
        String filename = "A-small-attempt0"; // this produces the correct output!!
        //String filename = "A-large-practice";
        r.setInputFileName(filename + ".in");
        r.setOutputFileName(filename + ".out");

        r.openInputFile();
        r.openOutputFile();

        while (r.getNextCase()) {

            r.doWork();
            r.writeOutput();

        }

        r.close();
    }
}
