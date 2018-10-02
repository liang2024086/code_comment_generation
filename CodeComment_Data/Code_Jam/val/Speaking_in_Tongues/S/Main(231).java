package methodEmbedding.Speaking_in_Tongues.S.LYD206;


import codejam.is.TestRunner;

/**
 * Created with IntelliJ IDEA.
 * User: ofer
 * Date: 4/14/12
 * Time: 2:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    private static final String path = "C:\\Users\\his\\Desktop\\codejam\\files\\";
    private static final String filePrefix = "A-small-attempt0";

    private static final String inputFile = path + filePrefix + ".in";
    private static final String outputFile = path + filePrefix + ".out";


    public static void main(String[] args){


        TestRunner testRunner = new TestRunner();
        testRunner.runTests(inputFile, outputFile, ToungeTest.class);

//        Set<Character> set = map.keySet();
//       Iterator<Map.Entry<Character, Character>> iter = map.entrySet().iterator();
//        while (iter.hasNext()) {
//            Map.Entry<Character, Character> entry = iter.next();
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
    }
}
