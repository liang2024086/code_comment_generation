package methodEmbedding.Standing_Ovation.S.LYD509;

import codejam._15.qualification.*; //TODO: change so 1 change
//import codejam._14.qualification.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    static final String
            year = "2015",
            round = "qualification",

    question = "A",

    testCasesDir = "test-cases/" + year + "/" + round + "/" + question,
//            smallPractice = testCasesDir + "/" + question + "-small-practice.in",
            smallPractice = testCasesDir + "/" + question + "-small-attempt1.in",
            largePractice = testCasesDir + "/" + question + "-large-practice.in";


    public static void main(String[] args) throws FileNotFoundException {
        String fileName = null;
//        fileName = testCasesDir + "/1.in";
        fileName = smallPractice;
//        fileName = largePractice;

        Scanner scn;
        if (fileName != null) {
            scn = new Scanner(new File(fileName));
            if (fileName.equals(smallPractice) || fileName.equals(largePractice)) {
                // TODO: Buffered writer
                PrintStream out = new PrintStream(new FileOutputStream(fileName.substring(0, fileName.length() - 2) + "output"));
                System.setOut(out);
            }
        } else {
            scn = new Scanner(System.in);
        }

        A a = new A(scn); //TODO fix so only 1 change
//        B a = new B(scn);
//        C a = new C(scn);
//        D a = new D(scn);
    }

}
