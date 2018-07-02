package methodEmbedding.Revenge_of_the_Pancakes.S.LYD245;


import java.util.Scanner;


public class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        String s;
        in.nextLine();
        for (int i = 1; i <= T; i++)

        {

            s = in.nextLine().trim();
            int count = 0;
            boolean flag = false;
            if(s.charAt(0)=='-') {
                count = 1;
                flag = true;
            }
            for (int j = 0; j <s.length() ; j++) {
               if(s.charAt(j)=='-'){
                   if(!flag) count+=2;
                   flag = true;
               }
               else{
                   flag = false;

               }
            }
            System.out.printf("Case #%d: %d\n",i,count);



        }
    }
}
