package methodEmbedding.Standing_Ovation.S.LYD470;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dinkarpundir
 */
class StandingOvation {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] inputs;
        int sMax;
        String[] sStr;
        int length;
//        int[] s = new int[1000];
        int extraFriends;
        int sum;
        for(int i=0; i<T; i++){
            extraFriends = 0;
            sum = 0;
            inputs = br.readLine().split(" ");
            sMax = Integer.parseInt(inputs[0]);
            sStr = inputs[1].split("");
            length = sStr.length;
            for(int j=0;j<length; j++){
//                s[j] = Integer.parseInt(sStr[j]);
                if(Integer.parseInt(sStr[j]) != 0){
                    if(sum < j) {
                        extraFriends += (j-sum);
                        sum = j;
                    }
                    sum += Integer.parseInt(sStr[j]);
                }
            }
            System.out.println("Case #"+(i+1)+": "+ extraFriends);
            
        }
    }
}
