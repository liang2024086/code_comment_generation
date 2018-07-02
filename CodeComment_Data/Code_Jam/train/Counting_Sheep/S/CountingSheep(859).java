package methodEmbedding.Counting_Sheep.S.LYD1210;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author brdamy004
 */
public class CountingSheep {
    
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("A-small-attempt0.in");
        Scanner scan = new Scanner(file);
        int num = Integer.parseInt(scan.nextLine());
        String[] output = new String[num];
        for (int i=1; i<=num; i++){
            int N = Integer.parseInt(scan.nextLine());
            if (N == 0){
                output[i-1] = "Case #" + Integer.toString(i) + ": INSOMNIA";
            }
            else{
                boolean foundAll = false;
                ArrayList<Integer> numbers = new ArrayList();
                int lastNumber = 0;
                int counter = 1;
                String numString = "";
                while (foundAll == false){
                    lastNumber = counter * N;
                    counter++;
                    numString = Integer.toString(lastNumber);
                    for (int j=0; j<numString.length(); j++){
                        int temp = Integer.parseInt(numString.substring(j, j+1));
                        if (numbers.isEmpty()){
                            numbers.add(temp);
                        }
                        else if (!numbers.contains(temp)){
                            numbers.add(temp);
                        }
                    }
                    if (numbers.size() == 10){
                        output[i-1] = "Case #" + Integer.toString(i) + ": " + Integer.toString(lastNumber);
                        foundAll = true;
                    }
                }
            }
        }
        for (int i=0; i<num; i++){
            System.out.println(output[i]);
        }
    }
}
