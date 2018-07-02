package methodEmbedding.Magic_Trick.S.LYD601;

import java.util.ArrayList;
import java.util.Scanner;

public class MagicTrick {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int ans1, ans2;
        Integer[][] array = new Integer[4][4];
        Integer[] temp = new Integer[4];
        String[] result = new String[T];
        for(int i=0;i<T;i++){
            ArrayList<Integer> answer = new ArrayList<Integer>();
        
            ans1 = s.nextInt();
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    array[j][k]=s.nextInt();
                }
            }
            for(int k=0;k<4;k++){
                    temp[k]=array[ans1-1][k];
            }
            ans2 = s.nextInt();
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    array[j][k]=s.nextInt();
                }
            }
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    if(temp[j]==array[ans2-1][k]){
                        answer.add(temp[j]);
                    }
                }
            }
            if(answer.size()==1){
                result[i] = Integer.toString(answer.get(0));
            }
            else if(answer.size()>1){
                result[i] = "Bad magician!";
            }
            else{
                result[i] = "Volunteer cheated!";
            }
        }
        for(int i=0;i<T;i++){
            System.out.println("Case #"+(i+1)+": "+result[i]);
        }
    }
}
