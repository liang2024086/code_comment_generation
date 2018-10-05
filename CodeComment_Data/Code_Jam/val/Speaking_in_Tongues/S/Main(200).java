package methodEmbedding.Speaking_in_Tongues.S.LYD1329;


import java.util.ArrayList;
import java.util.List;
import speakingintongues.translator.Translator;

public class Main {

    public static void main(String[] args) {

        List<String> teachData = IOUtil.readLines("teach-data");

        Translator translator = new Translator();
        translator.teach(teachData.get(0), teachData.get(1));
        translator.teach(teachData.get(2), teachData.get(3));
        translator.teach(teachData.get(4), teachData.get(5));
        
        translator.force('q','z');
        translator.force('z','q');

        String inputFile = "small-data-input";
        String outputFile = "small-data-output";

        List<String> exampleDataInput = IOUtil.readLines(inputFile);
        exampleDataInput.remove(0); //Discard first row

        List<String> exampleDataOutput = new ArrayList<String>();
        for (String indata : exampleDataInput) {
            exampleDataOutput.add(translator.translate(indata));
        }

        IOUtil.writeLines(outputFile, exampleDataOutput);

    }
}
