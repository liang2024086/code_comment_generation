package methodEmbedding.Counting_Sheep.S.LYD355;


import java.util.List;

/**
 * Created by Federico on 09/04/2016.
 */
public class MainClass {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        fileReader.readFile();
        List<String> fileContent = fileReader.getFileContent();
        SheepSleaper sheepSleaper = new SheepSleaper(fileContent);
        sheepSleaper.countNumber();
        sheepSleaper.saveResult();
    }
}
