package methodEmbedding.Standing_Ovation.S.LYD911;


import java.util.*;

public class StandingOvation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int smax, sum, req;
        String smax1;
        for(int i = 0; i<t; i++){
            smax = sc.nextInt();
            smax1 = sc.next();
            sum = Integer.parseInt(smax1.charAt(0)+"");
            req = 0;
            
            for(int j = 1; j<smax1.length()/**/; j++){
                if(Integer.parseInt(smax1.charAt(j)+"") >= 1){
                    if(j<=sum){
                        sum += Integer.parseInt(smax1.charAt(j)+"");
                    }else{
                        req += j-sum;
                        sum = j+Integer.parseInt(smax1.charAt(j)+"");
                    }
                }
            }
            System.out.println("Case #"+(i+1)+": "+req);//
        }
    }    
}
