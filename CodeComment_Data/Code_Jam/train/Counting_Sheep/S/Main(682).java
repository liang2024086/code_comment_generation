package methodEmbedding.Counting_Sheep.S.LYD675;


import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    File f = new File("A-small-attempt0.in");
        BufferedReader reader = new BufferedReader( new FileReader(f));
        String line = reader.readLine();
        int caseNumber = Integer.parseInt(line);

        for(int k = 0; k < caseNumber;k++) {
            line = reader.readLine();
            int N = Integer.parseInt(line);
            int i = 1;
            boolean done = false;
            boolean[] seen = new boolean[10];
            while(!done){
                int name = N * i;
                if(name == 0) {
                    System.out.println("Case #" + (k+1) + ": INSOMNIA" );
                    done = true;
                    continue;
                }

                String nameStr = name +"";
                for(int l = 0; l < nameStr.length();l++){
                    seen[Integer.parseInt(nameStr.charAt(l)+ "")] = true;
                }

                done = seen[0];
                for(int n = 1; n < 10; n++) {
                    done &= seen[n];
                }

                if(done) {
                    System.out.println("Case #" + (k+1) + ": " + name);
                }

                i++;
            }
        }

    }
}
