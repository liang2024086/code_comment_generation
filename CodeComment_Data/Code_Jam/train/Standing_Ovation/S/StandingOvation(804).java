package methodEmbedding.Standing_Ovation.S.LYD1638;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class StandingOvation {
    public static void main(String [] args) {
        try {
            BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

            String tmp = bReader.readLine();
            int T = Integer.parseInt(tmp);
            int added, curr_persons, x, to_be_added;
            for (int i=1; i<=T; i++) {
                tmp = bReader.readLine();
                String shy_vals = tmp.split(" ")[1];

                added = 0; curr_persons = Character.getNumericValue(shy_vals.charAt(0));
                for (int j=1; j<shy_vals.length(); j++) {
                    x = Character.getNumericValue(shy_vals.charAt(j));
                    to_be_added = 0;
                    if (curr_persons < j)
                        to_be_added = j - curr_persons;
                    added += to_be_added;
                    curr_persons += (x + to_be_added);
                }
                System.out.println("Case #" + i+ ": " + added);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
