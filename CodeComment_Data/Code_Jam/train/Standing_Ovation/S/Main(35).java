package methodEmbedding.Standing_Ovation.S.LYD629;


import java.util.Scanner;

/**
 * Created by User on 4/10/2015.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();// number of cases
        //System.out.print("t="+t);
        in.nextLine();
        for(int i=1;i<=t;i++){
            String caseStr =  in.nextLine();
            //System.out.println("caseStr[" + i + "]=" + caseStr);
            int max = Integer.parseInt(caseStr.split(" ")[0]);
            //System.out.println("max=" + max);
            String num = caseStr.split(" ")[1];
            //System.out.println("num=" + num);
            int [] arr = new int[max+1];

            for(int j=0;j<num.length();j++){
                arr[j] = Character.getNumericValue(num.charAt(j));
                //System.out.println("arr"+j+"]="+ arr[j]);
            }
            int [] sum = new int[max+1];
            int count=0;
            for(int k=1;k<=max;k++){
                sum[k] = sum[k-1]+arr[k-1];
                if(sum[k] < k){
                    count += (k-sum[k]);
                    sum[k]+=(k-sum[k]);
                }
            }

            System.out.println("Case #"+i+": "+count);

        }

    }
}
