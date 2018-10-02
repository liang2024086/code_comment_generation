package methodEmbedding.Standing_Ovation.S.LYD606;


import java.util.Scanner;

public class prelim {

    static int T, N, K, Answer;

//    static StreamTokenizer in;
//    public static int readInt() throws IOException {
//        in.nextToken();
//        return (int) in.nval;
//    }// incomplete
    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("MaximalMatSubSeq.txt"));
//        Reader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
//        in = new StreamTokenizer(reader);
        T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            N = sc.nextInt();
            sc.useDelimiter("");
            int si, ans = 0, curr = 0;
            sc.next();
            for (int i = 0; i <= N; i++) {
                si = Character.getNumericValue(sc.next().charAt(0));
                if (si > 0) {
                    if (i > curr) {
                        ans += i - curr;
                        curr = i;
                    }
                    curr += si;
                }
            }
            sc.reset();
            System.out.println("Case #" + (tc + 1) + ": " + ans);
        }
    }
}
