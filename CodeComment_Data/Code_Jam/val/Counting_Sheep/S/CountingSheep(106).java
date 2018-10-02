package methodEmbedding.Counting_Sheep.S.LYD587;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aniqmakhani
 */
public class CountingSheep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        // TODO code application logic here
        Scanner input = new Scanner(new File("A-small-attempt0.in"));
        PrintWriter writer = new PrintWriter("output.in", "UTF-8");
        ArrayList record = new ArrayList();
        int totalCase = input.nextInt();//T
        
        int check = 0;
        
        int caseNo = 1;
        for (int i = 0; i < totalCase; i++) {//loop for each test case

            int N = input.nextInt();//N
 
            int out = N;
            int j = 2;

            while(true){
                String StringN = Integer.toString(out);
                int x = 0;
                while(x < StringN.length()){
                    if(!(record.contains(Character.getNumericValue(StringN.charAt(x))))){
                        record.add(Character.getNumericValue(StringN.charAt(x)));
                    }
                    x++;
                }

                out = N * j;
                j++;
                if(out==0){
                    writer.println("Case #" + caseNo + ": INSOMNIA");
                    caseNo++;
                    break;
                }
                else{
                    for (int k = 0; k < 10; k++) {
                        if(record.contains(k))//if all digit not seen 
                            check++;
                    }
                }
                if(check == 10){
                    writer.println("Case #" + caseNo + ": " + (out-N));
                    caseNo++;
                    break;
                }
                check = 0;
            }
            record.clear();
        }
        writer.close();
    }   
}  

