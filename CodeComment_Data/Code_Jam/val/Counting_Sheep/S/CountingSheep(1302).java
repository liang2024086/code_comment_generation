package methodEmbedding.Counting_Sheep.S.LYD960;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CountingSheep {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.out"));
        int lines = Integer.valueOf(reader.readLine());
        
        for(int i=0; i<lines; i++){
            int n = Integer.parseInt(reader.readLine());
            int cInsomania = 0, init = n, prevNum = init, count = 0;
            int[] nums = {0,0,0,0,0,0,0,0,0,0};
            int total = 0;
            
            while(true){
                if(prevNum == init){
                    cInsomania++;
                }
                
                if(cInsomania > 5){
                    System.out.println("INSOMNIA");
                    writer.write("Case #" + (i+1) + ": INSOMNIA");
                    writer.newLine();
                    break;
                }
                
                char[] cNums = String.valueOf(init).toCharArray();
                
                for(int m=0; m<String.valueOf(init).length(); m++){
                    nums[Integer.parseInt(String.valueOf(cNums[m]))]++;
                }
                
                for(int z=0;z<10;z++){
                    System.out.print(nums[z] + " ");
                }
                
                for(int z=0;z<10;z++){
                    if(nums[z] != 0){
                        total++;
                    }
                }
                if(total >= 10){
                    System.out.println("\n****" + init + "****\n");
                    writer.write("Case #" + (i+1) + ": " + init);
                    writer.newLine();
                    break;
                }
                total=0;
                
                System.out.println("\n");
                init = n*++count;
            }
        }
        reader.close();
        writer.close();
    }
}
