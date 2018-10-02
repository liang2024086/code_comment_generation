package methodEmbedding.Standing_Ovation.S.LYD191;

import java.util.*;
import java.lang.Math;
public class StandingOvation{
    static int counter;
  public static void main(String[] args){

    Scanner inp=new Scanner(System.in);
    int t=inp.nextInt();
    int[][] ins=new int[t][];
    for(int i=0;i<t;i++){
        int n=inp.nextInt();
        String s=inp.next();
        char[] s1=s.toCharArray();
        ins[i]=new int[n+1];
        for(int j=0;j<s1.length;j++){
         ins[i][j]=Character.getNumericValue(s1[j]);
        }
    }
    for (int i=0;i<t;i++){
        counter=0;
        int sum=ins[i][0];
        for(int k=1;k<ins[i].length;k++){
            int q=k-sum;
            if(q>0) {
                sum+=q;
                counter+=q;
            }
            sum+=ins[i][k];
        }
        int r=i+1;
       System.out.println("Case #"+r+": "+counter);
      }
    }
}
