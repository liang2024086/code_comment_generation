package methodEmbedding.Counting_Sheep.S.LYD497;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k,z=0,tr,itr;
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i=0; i<n; i++){
            tr=sc.nextInt();
            if (tr==0) {
                System.out.println("Case #"+(i+1)+": INSOMNIA");
                continue;
            }
            k=tr;
            itr=1;
            while (hs.size()<10){
                while (k >= 1) {
                    if (!(hs.contains(k%10))){
                        hs.add(k%10);
                    }

                    k/=10;
                }
                itr++;
                k=tr*itr;

            }
            hs.clear();
            System.out.println("Case #"+(i+1)+": "+(k-tr));
        }


    }
}
