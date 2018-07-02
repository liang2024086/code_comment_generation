package methodEmbedding.Counting_Sheep.S.LYD731;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Shashank on 09/04/2016.
 */
public class Bleatrix {
    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int c = 1;
        while(c <=t){
            int j = 2;
            int n = scan.nextInt();
            int a[] = new int[10];
            for(int i=0;i<10;i++)
                a[i]=-1;
            if(n == 0) {
                System.out.println("Case #" + c + ": INSOMNIA");
                c++;
                continue;
            }
            int no = n;
            first: while(true){
                int num = no;
                while(num > 0){
                    int r = num %10;
                    if(a[r] == -1)
                    a[r] = r;
                    num = num/10;
                }
                for(int i=0;i<10;i++){
                    if(a[i]== -1)
                    {
                        no = n*j;
                        j++;
                        break;
                    }
                    else if (i == 9){
                        break first;
                    }
                }
            }
            System.out.println("Case #"+c+": "+ no);
            c++;
        }
    }
}
