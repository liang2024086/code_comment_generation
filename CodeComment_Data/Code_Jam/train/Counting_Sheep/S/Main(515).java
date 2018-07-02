package methodEmbedding.Counting_Sheep.S.LYD53;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cas=1;
        outer: while (t--!=0){
            int n = sc.nextInt();
            String s = String.valueOf(n);
            BitSet mask = new BitSet(10);

            int j=2;
            int prev = 0;
            int k=n;
            while (mask.cardinality()!=10){
                for(int i=0;i<s.length();i++){
                    mask.set(Character.getNumericValue(s.charAt(i)));
                }
                prev =k;
                k= j*n;
                j++;
                if(prev==k){
                    System.out.println("Case #" +cas++ + ": INSOMNIA");
                    continue outer;
                }
                //System.out.println();

                s =String.valueOf(k);
            }

            System.out.println("Case #" +cas++ + ": " + prev );


        }


    }
}
