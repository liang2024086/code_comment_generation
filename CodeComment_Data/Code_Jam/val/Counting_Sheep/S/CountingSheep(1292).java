package methodEmbedding.Counting_Sheep.S.LYD898;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CountingSheep {

    public static void main(String[] args) throws Exception {
        File file = new File("./src/com/google/codejam/A-small-attempt0.in");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder builder = new StringBuilder();
        String line = null;
        while((line = reader.readLine()) != null) {
            int testCases = Integer.valueOf(line);
            for(int index = 1; index <= testCases; index++) {
                int val = Integer.valueOf(reader.readLine());
                if(val==0){
                    System.out.println("Case #"+index+": INSOMNIA");
                    continue;
                }
                boolean[] num=new boolean[10];
                int size = 10;
                boolean passed = false;
                int i = 1;
                while(!passed){
                    int temp = i++ * val; 
                    while(temp>0){
                        int mod = temp%10;
                        if(!num[mod]){
                            num[mod]= true;
                            size--;
                            if(size==0){
                                break;
                            }
                        }
                        temp = temp/10;
                    }
                    if(size==0){
                        passed = true;
                    }
                }
                System.out.println("Case #"+index+": "+(--i*val));
            }
        }

    }

}
