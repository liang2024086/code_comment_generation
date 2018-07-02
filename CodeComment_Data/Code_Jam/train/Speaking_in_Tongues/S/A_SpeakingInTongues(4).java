package methodEmbedding.Speaking_in_Tongues.S.LYD178;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco Peleato
 */
public class A_SpeakingInTongues {

    public static void main(String[] args) throws Exception {
        // Get the location of the input file
        String fileIn = JOptionPane.showInputDialog("Please insert the "
                + "location of the input file or hit Cancel to quit");
        if (fileIn == null) {
            System.exit(0);
        }

        Scanner filescan = null;

        // Exit if input file doesn't exist
        try {
            filescan = new Scanner(new File(fileIn));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "File not found");
            System.exit(0);
        }

        String currentLine;
        char currentChar;
        char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',' '};
        char[] googlerese = {'y', 'n', 'f', 'i', 'c', 'w', 'l', 'b', 'k', 'u', 'o', 'm', 'x',
            's', 'e', 'v', 'z', 'p', 'd', 'r', 'j', 'g', 't', 'h', 'a', 'q',' '};
        // Get the location of the output file
        String out = JOptionPane.showInputDialog("Please insert the "
                + "location of the output file or hit Cancel to quit");
        if (out == null) {
            System.exit(0);
        }
        PrintWriter outputFile = new PrintWriter(out);
        String outLine = "";
        int counter = 1;

        // While not EOF
        for (int cases = Integer.parseInt(filescan.nextLine()); cases > 0; cases--) {
            currentLine = filescan.nextLine();

            for (int i = 0; i < currentLine.length(); i++) {
                currentChar = currentLine.charAt(i);

                for (int j = 0; j < googlerese.length; j++) {
                    if (googlerese[j] == currentChar) {
                        outLine += english[j];
                        break;
                    }
                }
            }
            System.out.println("Case #" + counter + ": " + outLine);
            outputFile.println("Case #" + counter++ + ": " + outLine);
            outLine = "";
        }
        outputFile.close();
    }
}
