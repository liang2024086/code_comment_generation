package methodEmbedding.Standing_Ovation.S.LYD1655;

import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseCount = Integer.parseInt(br.readLine());

        for(int i = 0; i < caseCount; i++){
            String[] testCase = br.readLine().split(" ");
            int[] audienceShyCount = new int[testCase[1].length()];

            for(int j = 0; j < testCase[1].length(); j++){
                audienceShyCount[j] = Integer.parseInt("" + testCase[1].charAt(j));
            }

            int audienceSoFar = 0;
            int reqFriends = 0;

            for(int j = 0; j < audienceShyCount.length; j++){
                if(audienceSoFar < j && audienceShyCount[j] != 0){
                    reqFriends += j - audienceSoFar;
                    audienceSoFar += reqFriends + audienceShyCount[j];
                } else{
                    audienceSoFar += audienceShyCount[j];
                }
            }

            System.out.println("Case #" + (i + 1) + ": " + reqFriends);

        }

        br.close();
    }
}
