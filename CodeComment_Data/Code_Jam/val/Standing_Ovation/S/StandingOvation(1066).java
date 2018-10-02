package methodEmbedding.Standing_Ovation.S.LYD596;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class StandingOvation {

    public static void main(String[] args) {
        FileInputStream fstream;
        BufferedReader br = null;
        String strLine;
        String caseLine;
        String cases;
        int noOfCases = 0;
        int sMax = 0;
        int noOfMember = 0;
        int sum;
        int minFriends;

        try {
            fstream = new FileInputStream(args[0]);
            br = new BufferedReader(new InputStreamReader(fstream));

            strLine = br.readLine();
            noOfCases = Integer.parseInt(strLine);

            for (int i = 1; i <= noOfCases; i++) {
                minFriends = 0;
                sum = 0;
                caseLine = br.readLine();
                cases = caseLine.substring(2);
                sMax = Character.getNumericValue(caseLine.charAt(0));
                for (int j = 0; j<= sMax ; j++) {
                    noOfMember = Character.getNumericValue(cases.charAt(j));
                    sum = sum + noOfMember;
                    if(sum < (j+1)) {
                        minFriends++;
                        sum++;
                    }
                }
                System.out.println("Case #"+i+": "+minFriends);
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception Occurred");
        }
        finally
        {
            try {
                br.close();
            }
            catch(Exception e) {
                System.out.println("Exception Occurred");
            }
        }
    }
}
