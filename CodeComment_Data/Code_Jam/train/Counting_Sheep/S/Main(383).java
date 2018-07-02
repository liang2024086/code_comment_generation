package methodEmbedding.Counting_Sheep.S.LYD70;



import com.google.code.jam.reader.Reader;
import com.google.code.jam.writer.Writer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kasoale on 09/04/16.
 */
public class Main {

    public static void main(String[] args){
        //System.out.print("Start the google code jam 2016 ... ");

        CountingSheep countingSheep = new CountingSheep();

        Reader readerIn = new Reader();
        readerIn.readInFile("");

        String result = "";
        for (int i = 0; i <Integer.parseInt(readerIn.getTestCaseNumbers()) ; i++) {
            String caseNum = String.valueOf(i+1);
            result = "Case #"+caseNum+": "+countingSheep.lastSheepNumber(Integer.parseInt(readerIn.getNumbersIn().get(i)));
            System.out.println(result);
            if(i != Integer.parseInt(readerIn.getTestCaseNumbers())-1){
                Writer.writeDataOnFileSmall(result+"\n");
            }else{
                Writer.writeDataOnFileSmall(result);
            }

        }

    }
}
