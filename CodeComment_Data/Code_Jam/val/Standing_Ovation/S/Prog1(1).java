package methodEmbedding.Standing_Ovation.S.LYD1584;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Prog1{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        int Smax;
        int NoOfPeople;
        int result;
        int loop=1;
        String Shy;
        while(loop<=T){
            result=0;
            String temp[]=br.readLine().split(" ");
            Smax=Integer.parseInt(temp[0]);
            Shy=temp[1];
            int i=1;
            NoOfPeople=Shy.charAt(0)-48;
            while(i<Shy.length()){
                int num=Shy.charAt(i)-48;
                if(num!=0){
                    if(NoOfPeople<i){
                        result+=i-NoOfPeople;
                        NoOfPeople=i+num;
                    }
                    else{
                        NoOfPeople+=num;
                    }
                }
                i++;
            }
            System.out.println(String.format("Case #%d: %d", loop,result));
            loop++;
        }
    }
}
