package methodEmbedding.Magic_Trick.S.LYD303;

import java.util.*;

public class Solution {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int c = 1;
        while(c <= cases) {
            int a1 = sc.nextInt();
            int a[] = new int[17];
            for(int i = 0; i < 4; ++i)
                for(int j = 0; j < 4; ++j) {
                    int curr = sc.nextInt();
                    if(i == a1 - 1)
                        a[curr]++;
                }
            
            int a2 = sc.nextInt();
            for(int i = 0; i < 4; ++i)
                for(int j = 0; j < 4; ++j) {
                    int curr = sc.nextInt();
                    if(i == a2 - 1)
                        a[curr]++;
                }
            
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int i = 0; i < a.length; ++i)
                if(a[i] == 2)
                    arr.add(i);
                    
            String response = "";
            
            if(arr.size() > 1)
                response = "Bad magician!";
            
            else if(arr.size() == 0)
                response = "Volunteer cheated!";
            
            else
                response = arr.get(0) + "";
            
            System.out.println("Case #" + (c++) + ": " + response);
        }
    }
}
