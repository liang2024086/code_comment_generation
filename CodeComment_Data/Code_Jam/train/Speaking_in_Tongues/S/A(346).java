package methodEmbedding.Speaking_in_Tongues.S.LYD883;

import java.util.Scanner;


public class A {
    public static final char[] let1 = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
    public static final char[] let2 = { 'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q',' '};

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        int cases;
        cases = in.nextInt();
        in.nextLine();
        
        for(int i = 0; i < cases; i ++ ) {
            String inputString;
            inputString = in.nextLine();
            
            String outputString = "";
            for( int k = 0; k < inputString.length(); k++ ) {
                for( int j = 0; j < 27; j++) {
                    if( inputString.charAt(k) == let1[j]) {
                        outputString += let2[j];
                        break;
                    }
                }
            }
            System.out.println("Case #" + (i+1) + ": " + outputString);
        }
    }
}
