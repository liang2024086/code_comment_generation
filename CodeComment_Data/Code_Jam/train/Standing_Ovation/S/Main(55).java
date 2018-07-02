package methodEmbedding.Standing_Ovation.S.LYD1032;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input=new Scanner(new File("a.in"));
        PrintWriter w=new PrintWriter("a.out");
        //Scanner input =new Scanner(System.in);
        int T=input.nextInt();
        input.nextLine();
        for (int t=0;t<T;t++){

            int max=input.nextInt();
            String s=input.next();
            char[]c=s.toCharArray();
            int l=s.length();
            int[] number =new int[l];
            int sum=0;
            int x=0;
            for (int i=0;i<l;i++){
                number[i]=c[i]-'0';
                x+=number[i];
                if( sum >= i){
                    sum+=number[i];
                }else{
                    sum+=(i-sum);
                    sum+=number[i];
                }
                }
          //  System.out.printf("Case #%d: %d\n",t+1,sum-x);
            w.printf("Case #%d: %d\n",t+1,sum-x);
        }
      w.close();
    }
}
