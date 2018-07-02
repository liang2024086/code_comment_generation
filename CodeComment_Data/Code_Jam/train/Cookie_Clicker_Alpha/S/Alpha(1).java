package methodEmbedding.Cookie_Clicker_Alpha.S.LYD891;


/**
 * Created by john on 4/12/14.
 */
public class Alpha {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Provide input filename as only argument");
            System.exit(1);
        }
        InputReader reader = new InputReader(args[0]);
        int caseNo = 1;
        ClickerR c = reader.getClicker();
        while (c != null) {
            System.out.println("Case #" + caseNo++ + ": " + c.solve());
            c = reader.getClicker();
        }
    }
}
