package methodEmbedding.Speaking_in_Tongues.S.LYD1362;



import java.util.*;
import java.io.*;

class SpeakingInTongues{
    static String inname = "A-small-attempt0.in";    // input file name here
    static String outname = "A-small-attempt0.out";  // output file name here
    static int n, c, d;
	//static char[] map = {'y','n','f','i','c','w','l','b','k','u','o','m','x','s','e','v','z','p','d','r','j','g','t','h','a','q'};
    static char[] map = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
    public static void main(String[] args){
        try{
            Scanner in = new Scanner(new BufferedReader(new FileReader(inname)));
        	//Scanner in = new Scanner(System.in);
            BufferedWriter out = new BufferedWriter(new FileWriter(outname));
            int t = in.nextInt();
            in.nextLine();
            for (int cas = 1; cas <= t; cas++){
                String g = in.nextLine();
                String eng = "";
                for (int i = 0; i < g.length(); i++){
                	if (g.charAt(i) == ' ') eng += " ";
                	else eng += map[g.charAt(i)-'a'];
                }
                //System.out.print("Case #" + cas + ": " + eng + "\n");
                out.write("Case #" + cas + ": " + eng + "\n");
            }
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
