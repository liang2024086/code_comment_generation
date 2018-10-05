package methodEmbedding.Counting_Sheep.S.LYD920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

class sheep {
    public static void main(String[] args) throws IOException {

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(stdin.readLine());
		
		for (int a=0; a<T; a++) {

			int N = Integer.parseInt(stdin.readLine());
			HashMap digitsSeen = new HashMap<Integer, Boolean>() {
				{
					put(0, false);
					put(1, false);
					put(2, false);
					put(3, false);
					put(4, false);
					put(5, false);
					put(6, false);
					put(7, false);
					put(8, false);
					put(9, false);
				}
			};

			int i=1;
			String answer = "INSOMNIA";
			while (true) {
				boolean done = true;
				if (N == 0) break;
				int nextN = N*i;
				int tempN = nextN;
				while (tempN > 0) {
				    digitsSeen.put(tempN%10, true);
				    tempN = tempN / 10;
				}

				Iterator it = digitsSeen.entrySet().iterator();
			    while (it.hasNext()) {
			        Map.Entry pair = (Map.Entry)it.next();
			        boolean seen = (boolean) pair.getValue();
			        if (!seen) {
						done = false;
						break;
			        }
			    }

				if (done) {
					answer = "" + nextN;
					break;
				}
				i++;
			}
			System.out.println("Case #" + (a+1) + ": " + answer);
		}

    }
}

