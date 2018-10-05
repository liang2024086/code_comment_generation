package methodEmbedding.Revenge_of_the_Pancakes.S.LYD445;



import com.google.code.jam.reader.Reader;
import com.google.code.jam.writer.Writer;

/**
 * Created by kasoale on 09/04/16.
 */
public class Main {

    public static void main(String[] args){
        RevengePancake revengePancake = new RevengePancake();

        Reader reader = new Reader();
        reader.readInFile("in_test.txt");

        String result = "";
        for (int i = 0; i <Integer.parseInt(reader.getTestCaseNumbers()); i++) {
            revengePancake.setInputStack(reader.getStackIn().get(i));
            revengePancake.revenge();

            String caseNum = String.valueOf(i+1);
            result = "Case #"+caseNum+": "+revengePancake.getSostitutionNum();

            System.out.println(result);


            if(i != Integer.parseInt(reader.getTestCaseNumbers())-1){
                Writer.writeDataOnFileSmall(result+"\n");
            }else{
                Writer.writeDataOnFileSmall(result);
            }
        }

    }
}
