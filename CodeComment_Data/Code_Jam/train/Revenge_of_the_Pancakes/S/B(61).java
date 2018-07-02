package methodEmbedding.Revenge_of_the_Pancakes.S.LYD844;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author bartosz
 */
public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            String s = in.next();
            int flipps = 0;
            
            if(s.charAt(s.length()-1)=='-') flipps++;
            for(int j=s.length()-2;j>=0;j--){
                if(flipps % 2 == 0){
                    if(s.charAt(j)=='+')
                        continue;
                    if(s.charAt(j)=='-' && s.charAt(j+1)!='-' ){
                        flipps++;
                    }
                } else {
                    if(s.charAt(j)=='-')
                        continue;
                    if(s.charAt(j)=='+' && s.charAt(j+1)!='+'){
                        flipps++;
                    }
                }
            }
            System.out.println("Case #"+(i+1)+": "+flipps);
        }
    }
}
