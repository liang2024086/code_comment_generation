package methodEmbedding.Standing_Ovation.S.LYD1347;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws URISyntaxException, FileNotFoundException, IOException{
        URI uri = new URI("A-small-attempt.in");
        File input = new File(uri.getPath());
        File file = new File("result.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        try {

            Scanner sc = new Scanner(input);
            int inputSize = sc.nextInt(), maxLevel, currentLevel, sum, difference;
            String tmp ;

            for(int i = 1; i <= inputSize;i++){
                maxLevel = sc.nextInt();
                tmp = sc.next();
                sum = difference = 0;
                for(int j= 0; j <= maxLevel; j++){
                    currentLevel = Character.getNumericValue(tmp.charAt(j));
                    if(j> sum && currentLevel!=0){
                        difference += j - sum;
                        sum += j- sum;
                    }
                    sum += currentLevel;
                }
                bWriter.append("Case #"+i+": "+difference);
                bWriter.newLine();
            }
            bWriter.flush();
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    //String[] inputString = readDoc(input).split("\\r?\\n");
}
