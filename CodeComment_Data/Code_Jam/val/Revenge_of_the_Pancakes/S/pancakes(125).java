package methodEmbedding.Revenge_of_the_Pancakes.S.LYD434;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Created by admin on 09.04.2016.
 */
public class pancakes {
    public static void main(String[] args) throws Throwable{
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\admin\\Desktop\\B-small-attempt0.in"));
        FileWriter writer = new FileWriter("C:\\Users\\admin\\Desktop\\B-small-attempt0.out");
        Integer T = Integer.parseInt(reader.readLine());
        Integer counter = 1;
        ArrayList<String> pancakes = new ArrayList<String>();
        Integer q = 0;
        while (q<T) {
            pancakes.add(reader.readLine());
            q++;
        }
        Integer i = 0;
        Integer counterFlip = 0;
        while (i<pancakes.size()){
            int[] mass = new int[pancakes.get(i).length()];
            for(int j = 0; j < mass.length; j++)
            {
                mass[j] = pancakes.get(i).charAt(j);
            }
            for(int current = 0; current <= mass.length; current++)
            {
                if(current==(mass.length)-1){
                    if(mass[mass.length-1]==45){
                        counterFlip++;
                        writer.write("Case #" + counter + ": " + counterFlip + "\n");
                        writer.flush();
                    }
                    else{
                        writer.write("Case #" + counter + ": " + counterFlip + "\n");
                        writer.flush();
                    }
                    counter++;
                    counterFlip=0;
                    break;
                }
                else if(mass[current+1]!=mass[current]){
                    counterFlip++;
                }
            }
            i++;
        }
    }
}
