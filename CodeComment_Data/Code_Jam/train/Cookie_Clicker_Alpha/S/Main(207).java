package methodEmbedding.Cookie_Clicker_Alpha.S.LYD123;


public class Main {

    public static void main(String[] args) {

        ReadFile rf = new ReadFile("B-small-attempt0.in");
        WriteCase wc = new WriteCase("codejam2");

        int tests = Integer.valueOf(rf.readLine());
        for (int i = 0; i < tests; i++) {
            String[] tab = rf.readLine().split(" ");
            wc.addCase(String.valueOf(new CodeJam2(Double.valueOf(tab[0]),Double.valueOf(tab[1]),Double.valueOf(tab[2])).oblicz()));
        }

        wc.writeToFile();
        rf.close();
    }

}
