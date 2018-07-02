package methodEmbedding.Speaking_in_Tongues.S.LYD1112;


import java.util.Scanner;

public final class SpeakingInTongues {
    private static final char[][] MAP = { { 'a', 'y' }, { 'b', 'n' },
	    { 'c', 'f' }, { 'd', 'i' }, { 'e', 'c' }, { 'f', 'w' },
	    { 'g', 'l' }, { 'h', 'b' }, { 'i', 'k' }, { 'j', 'u' },
	    { 'k', 'o' }, { 'l', 'm' }, { 'm', 'x' }, { 'n', 's' },
	    { 'o', 'e' }, { 'p', 'v' }, { 'q', 'z' }, { 'r', 'p' },
	    { 's', 'd' }, { 't', 'r' }, { 'u', 'j' }, { 'v', 'g' },
	    { 'w', 't' }, { 'x', 'h' }, { 'y', 'a' }, { 'z', 'q' } };

    private static final char[][] REV_MAP = { { 'a', 'y' }, { 'b', 'h' },
	    { 'c', 'e' }, { 'd', 's' }, { 'e', 'o' }, { 'f', 'c' },
	    { 'g', 'v' }, { 'h', 'x' }, { 'i', 'd' }, { 'j', 'u' },
	    { 'k', 'i' }, { 'l', 'g' }, { 'm', 'l' }, { 'n', 'b' },
	    { 'o', 'k' }, { 'p', 'r' }, { 'q', 'z' }, { 'r', 't' },
	    { 's', 'n' }, { 't', 'w' }, { 'u', 'j' }, { 'v', 'p' },
	    { 'w', 'f' }, { 'x', 'm' }, { 'y', 'a' }, { 'z', 'q' } };

    /**
     * @param args
     */
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	sc.useDelimiter("\n");
	int cases = sc.nextInt();
	for (int no = 1; no <= cases; no++) {
	    String line = sc.next();
	    System.out.print("Case #" + no + ": ");
	    for (int c = 0; c < line.length(); c++) {
		char c_ = line.charAt(c);
		if (c_ != ' ') {
		    c_ = REV_MAP[c_ - 97][1];
		}
		System.out.print(c_);
	    }
	    System.out.println();
	}
    }

}
