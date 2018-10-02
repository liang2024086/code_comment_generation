package methodEmbedding.Standing_Ovation.S.LYD896;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int caseNo = 1; caseNo <= t; caseNo++) {
            String[] s = br.readLine().split(" ");
            int maxShyness = Integer.parseInt(s[0]);
            String shyPeopleString = s[1]; // place holder
            int extraFriends = 0;
            int totalStandingPeople = shyPeopleString.charAt(0) - '0';
            for (int shyIndex = 1; shyIndex <= maxShyness; shyIndex++) {
                int shyPeople = shyPeopleString.charAt(shyIndex)-'0';
                if (shyIndex > totalStandingPeople && shyPeople > 0) {
                    // since string ends in 0, no need to check if shyPeople>0
                    extraFriends += shyIndex - totalStandingPeople;
                    totalStandingPeople = shyIndex + shyPeople;
                } else {
                    totalStandingPeople += shyPeople;
                }
            }
            System.out.println("Case #" + caseNo + ": " + extraFriends);
        }

    }

}

