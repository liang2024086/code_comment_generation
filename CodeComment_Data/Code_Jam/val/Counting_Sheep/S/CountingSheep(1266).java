package methodEmbedding.Counting_Sheep.S.LYD1218;

import java.util.*;
import java.io.*;
public class CountingSheep {
    public static void main(String[] args) throws Exception{
        FileInputStream  fis = new  FileInputStream("/Users/sunny/test/google_code_jam/counting_sheep.txt");
        PrintWriter out = new PrintWriter("/Users/sunny/test/google_code_jam/counting_sheep_out.txt");
        
        Scanner scanner = new Scanner(fis);
        int testCaseCnt = scanner.nextInt();
        for(int i=0; i<testCaseCnt; i++){
            int n = scanner.nextInt();
            Set<Integer> set = new HashSet<>();
            if(n ==0){
                System.out.println("Case #"+(i+1)+": INSOMNIA");
                out.println("Case #"+(i+1)+": INSOMNIA");
            }else{
                int cnt = 1;
                boolean isPrint = false;
                while(true){
                    int origin = 0;
                    int num = cnt * n;
                    origin = num;
                    while(num > 0){
                        set.add(num%10);
                        
                        if(set.size() == 10) {
                            System.out.println("Case #"+(i+1)+": "+origin);
                            out.println("Case #"+(i+1)+": "+origin);
                            isPrint = true;
                            break;
                        }
                        num = num/10;
                    }
                    cnt++;
                    if(isPrint) break;
                }
                
            }
            
        }
        out.close();
        fis.close();
        scanner.close();
        
        
    }
}

