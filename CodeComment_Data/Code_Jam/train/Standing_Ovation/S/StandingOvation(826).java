package methodEmbedding.Standing_Ovation.S.LYD218;


import java.util.Scanner;

public class StandingOvation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i = 1; i <= testCases; i++) {
            int maxShyness = sc.nextInt();
            String shyAudCount = sc.nextLine();
            int standingPeople = 0;
            int answer = 0;
            for (int j = 1; j <= maxShyness+1; j++) {
                int peopleWithThisShyness = shyAudCount.charAt(j) - '0';
                int requiredStandingPeople = j - 1;
                if (standingPeople < requiredStandingPeople) {
                    answer += requiredStandingPeople - standingPeople;
                    standingPeople = requiredStandingPeople;
                }
                standingPeople += peopleWithThisShyness;
            }
            System.out.println("Case #" + i + ": " + answer);
        }
        sc.close();
    }
}
