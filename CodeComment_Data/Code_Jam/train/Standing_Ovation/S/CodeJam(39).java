package methodEmbedding.Standing_Ovation.S.LYD790;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

/**
 * CODE JAM 2015
 */
public class CodeJam {


    public static void main(String[] args){
        InputStream resourceAsStream = CodeJam.class.getResourceAsStream("testpath.in");
        Scanner scanner=new Scanner(resourceAsStream);

        List<String> outputs=new ArrayList<>();
        int cases= scanner.nextInt();

        for(int i=0;i<cases;i++) {
            int index=i+1;

            int maxShy= scanner.nextInt();
            int parse=scanner.nextInt();

            List<Integer> shyList=new ArrayList<>();
            for(int k=0;k<maxShy+1;k++){
                shyList.add(parse % 10);
                parse/=10;
            }
            Collections.reverse(shyList);

            int sum=0;
            int answer=0;
            for(int shyness=0;shyness<maxShy+1;shyness++){
                int numberOfP = shyList.get(shyness);

                if(numberOfP>0 && sum<shyness){
                    shyList.set(shyness,numberOfP+shyness-sum);
                    answer+=(shyness-sum);
                }

                sum+=shyList.get(shyness);
            }


            outputs.add("Case #" + index + ": " + answer);
        }


        try {
            Files.write(Paths.get("output.txt"), outputs, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
