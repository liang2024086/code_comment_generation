package methodEmbedding.Counting_Sheep.S.LYD546;



import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int n;
        in.nextLine();
        for (int i = 1; i <= T; i++)

        {

            n = in.nextInt();
            if(n==0){
                System.out.printf("Case #%d: INSOMNIA\n",i);
                continue;
            }
            Set<Character> dic = new TreeSet<>();
            int j=1;
            int m;
            while(true){
               m= n*j;
                for(char c: Integer.toString(m).toCharArray()){
                    dic.add(c);
                    if(dic.size()==10){
                        break;
                    }
                }
                j++;
                if(dic.size()==10){
                    break;
                }
            }
            System.out.printf("Case #%d: %d\n",i,m);


        }
    }
}
