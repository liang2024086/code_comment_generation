package methodEmbedding.Speaking_in_Tongues.S.LYD1578;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * user: ryan.moore
 * date: 4/14/12
 */
public class CodeJamQualifications {

    public static void main(String [] args) throws Exception {

        String in = CodeJamUtil.readFileAsString("/Users/ryanmoore/dev/misc/GCJ1/src/in.txt");

        String blah = "3\n" +
        "ejp mysljylc kd kxveddknmc re jsicpdrysi\n" +
        "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd\n" +
        "de kr kd eoya kw aej tysr re ujdr lkgc jv";

        List<String> lineList = CodeJamUtil.parseInputToList(in);

        List<String> resultLineList = new ArrayList<String>();

        for (String string : lineList) {

            List<String> charArray = new ArrayList<String>();
            for(int i=0; i< string.length(); i++ ) {

                charArray.add(string.substring(i, i+1));
            }

            String result ="";
            for (String ch4r : charArray) {

                result = result + CodeJamUtil.doMap(ch4r.toUpperCase().charAt(0));
            }

            resultLineList.add(result);
        }

        try {

            FileWriter fstream = new FileWriter("out.txt");
            BufferedWriter out = new BufferedWriter(fstream);

            for (int i = 0; i < resultLineList.size(); i ++) {

                out.write("Case #" + (i + 1) + ": " + resultLineList.get(i).toLowerCase() + "\n");
            }

            out.close();

        } catch (IOException e) {

            System.out.println(":'(");
        }

    }


}
