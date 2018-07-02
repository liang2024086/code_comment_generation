package methodEmbedding.Counting_Sheep.S.LYD452;

import java.util.*;
class CountingSheep{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        for(int c = 0 ; c < testCases ; c++) {
            int n = input.nextInt();
            if(n == 0)
                System.out.println("Case #" + Integer.toString(c + 1) + ": INSOMNIA");
            else {
                HashSet<Character> hash = new HashSet<Character>();
                for(int p = 1 ; n < 1000000 ; p++) {
                    String s = Integer.toString(n * p);
                    for(int i = 0 ; i < s.length() ; i++) 
                        hash.add(s.charAt(i));
                    if(hash.size() == 10) {
                        System.out.println("Case #" + Integer.toString(c + 1) + ": " + Integer.toString(n * p));
                        break;
                    }
                }
            }
        }
        input.close();
    }
}
