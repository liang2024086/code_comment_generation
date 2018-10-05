package methodEmbedding.Speaking_in_Tongues.S.LYD816;


import edu.uwec.cs.genacje.codejam.speakingintongues.GooglereseTranslator;
import edu.uwec.cs.genacje.codejam.utilities.objects.IoMgr;
import edu.uwec.cs.genacje.codejam.utilities.objects.StringFormatter;

/**
 *
 * @author James Genac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hi");
        IoMgr io = new IoMgr("A-small-attempt0.in");
        System.out.println("Hi2");

        int linecount = 1;
        long start = 0;
        io.rls(); // eat first line
        String in = "";
        long totalTime = System.currentTimeMillis();

        while (io.ready()) {
            in = io.rls();


            start = System.currentTimeMillis();

            io.wlf("Case #"+linecount+": " + GooglereseTranslator.translateString(in));
            System.out.println("Case " + linecount + " took " + (System.currentTimeMillis()-start) + " ms.");
            linecount++;
        }


       io.close();
//        IoMgr io = new IoMgr("C-large-practice.in");
//
//        String in = "";
//        String orig = "welcome to code jam";
//        //String orig = "foo";
//        StringCombinationFinder scf = null;
//
//        int linecount = 1;
//        long start = 0;
//        io.rls(); // eat first line
//
//        long totalTime = System.currentTimeMillis();
//
//        while (io.ready()) {
//            in = io.rls();
//
//
//            start = System.currentTimeMillis();
//
//            //io.wlf(StringCombinationFinder.substrsRec(orig, in)+"");
//
//            //io.wlf("Case "+linecount+": " + StringCombinationFinder.substrsRec2(orig, in)+"");
//
//            //io.wlf("Case "+linecount+": " + StringCombinationFinder.substrs3(orig, in));
//            io.wlf("Case #"+linecount+": " + StringFormatter.lastNChars(StringCombinationFinder.substrs4(orig, in).toString(), "0", 4));
//            System.out.println("Case " + linecount + " took " + (System.currentTimeMillis()-start) + " ms.");
//            linecount++;
//        }
//
//
//       io.close();
//       System.out.println("Total run time: " + (System.currentTimeMillis()-totalTime));
//
//       System.out.println("Done");
        
    }
}
