package methodEmbedding.Counting_Sheep.S.LYD381;




import java.util.Scanner;

public class JavaApplication49 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean num[];
        int t = sc.nextInt();
        int k,count,u ;
        for (int i = 0; i < t; i++) {
             int n = sc.nextInt();
              if(n==0){
                  System.out.println("Case #"+(i+1)+": INSOMNIA");
              }else{
                  num = new boolean[10]; 
                  u = 0;
                  count = 10;
                  for(int l = 1;l>0;l++){
                     u = n*l;
                     k = u;
                   while(k>0){
                     if(!num[k%10]){
                        count--;
                         num[k%10] = true;
                     }
                     k/=10;
                }
                   if(count==0)break;
                 }
                  System.out.println("Case #"+(i+1)+": "+u);
              }
        }
    }
    
}
