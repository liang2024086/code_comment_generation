package methodEmbedding.Speaking_in_Tongues.S.LYD96;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GooglereseTranslator {

    public static void main(String[] args) {
        if(args.length <= 0 || args[0] == null) {
            System.out.println("You must enter a file to read");
            System.out.println("Usage: blah <filename>");
            System.exit(0);
        }

        TranslationMachine machine = new TranslationMachine();

        File argFile = new File(args[0]);
        try {
            Scanner googleSpeakScanner = new Scanner(argFile);
            String firstLine = googleSpeakScanner.nextLine();
            Integer linesToScan = new Integer(firstLine);
            for(int i = 1; i <= linesToScan; i++) {
                String googleSpeakLine = googleSpeakScanner.nextLine();
                System.out.println(String.format("Case #%d: %s", i, machine.translateString(googleSpeakLine)));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


}
