package methodEmbedding.Speaking_in_Tongues.S.LYD809;


public class Main {

    public static void main(String[] args) {
	Translator tr = new Translator(System.in);
	int numChar = 0;
	int nChar = 0;
	while (nChar != 10) {
	    nChar = tr.read();
	    if (nChar != 10) {
		numChar = (nChar * 10) + nChar - 48;
	    }
	}
	for(int i = 1; (i <= numChar) && tr.hasNext(); i += 1) {
	    System.out.print("Case #" + i + ": ");
	    nChar = 0;
	    while((nChar != 10) && tr.hasNext()) {
		nChar = tr.read();
		System.out.printf("%c", nChar);
	    }
	}
    }
}
