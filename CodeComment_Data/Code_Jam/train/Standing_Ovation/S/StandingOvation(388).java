package methodEmbedding.Standing_Ovation.S.LYD1267;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StandingOvation {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(reader.readLine());
        for(int index=0; index<testCases;index++){
            String str = reader.readLine().split(" ")[1];
            int extraPeople = 0;
            int poolPeople = 0;
            for(int i=0; i<str.length();i++){
                int sittingPeople = Character.getNumericValue(str.charAt(i));
                int requiredPeople = i;
                if(poolPeople<requiredPeople){
                    extraPeople += requiredPeople-poolPeople;
                    poolPeople+=sittingPeople+requiredPeople-poolPeople;
                }
                else{
                    poolPeople+=sittingPeople;
                }
            }
            int j = index+1;
            System.out.println("Case #"+j+": "+extraPeople);
        }
        
    }
    
}
