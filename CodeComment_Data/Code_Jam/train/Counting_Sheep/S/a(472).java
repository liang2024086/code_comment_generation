package methodEmbedding.Counting_Sheep.S.LYD760;

import java.util.*;
import java.io.*;

public class a {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());

        for (int i = 0; i < count; i++) {
            String line = reader.readLine();
            long n = Long.parseLong(line);
            boolean done[] = new boolean[10];

            int found = 0;
        	int answer = 1;
        	while (answer <= 1000000)
        	{
        		long test = answer * n;

	            String sTest = test+"";
	            for (char c : sTest.toCharArray()) {
	            	int d = ((int)c)-(int)'0';
	            	if (!done[d]) {
	            		done[d] = true;
	            		found++;
	            	}
	            }

	            if (found >= 10)
	            	break;

        		answer++;
        	}

        	if (found >= 10)
            	System.out.printf("Case #%d: %d\n", i+1, answer * n);
            else
            	System.out.printf("Case #%d: INSOMNIA\n", i+1);
        }
    }
}
