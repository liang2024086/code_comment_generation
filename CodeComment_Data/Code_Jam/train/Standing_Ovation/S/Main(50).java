package methodEmbedding.Standing_Ovation.S.LYD741;


import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import qualificationRound.QualificationRound;


public class Main {

  public static void main(String[] args) throws Exception {

    String inputFilename = "A-small-attempt1.in";
    String outputFilename = "A-small-attempt1.out";

    Path inputFile = Paths.get(Main.class.getResource("/" + inputFilename).getPath());
    Path outputFile = Paths.get("/home/avi/Desktop/" + outputFilename);

    Scanner Scanner = new Scanner(inputFile);

    System.out.println(new Date().toString() + ": Starting..");

    List<String> output = null;

    output = QualificationRound.A(Scanner);
//    output = QualificationRound.B(Scanner);
//    output = QualificationRound.C(Scanner);

    System.out.println(new Date().toString() + ": " + output);

    Files.deleteIfExists(outputFile);
    Files.createFile(outputFile);
    Files.write(outputFile, output, Charset.forName("UTF-8"), StandardOpenOption.CREATE,
                StandardOpenOption.WRITE);
  }

}
