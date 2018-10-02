package methodEmbedding.Standing_Ovation.S.LYD1289;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class StandingOvation {

   
    public static void main(String[] args) throws Exception {
        boolean test = true;
        int anzCase;
        int j=0;
        int anzSpectators;
        int sum = 0;
        int x = 0;
        String input, values;
        String smax = "";
        FileReader fr = new FileReader("A-small-attempt.in");
        BufferedReader br = new BufferedReader(fr);

        PrintWriter writer = null;
        try {
            writer = new PrintWriter("output.in", "UTF-8");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        anzCase = Integer.parseInt(br.readLine());
        System.out.println(anzCase);
        
        for (int i = 0; i < anzCase; i++) {
            
            input = br.readLine();
            j=0;
            x=0;
            smax = input.substring(0, input.indexOf(' '));
            values = input.substring(input.indexOf(' ')+1);
            anzSpectators = Integer.parseInt(smax)+1;
            int[] specs = new int[anzSpectators];
            for (int k = 0; k < values.length(); k++) {
                //System.out.println(values.charAt(k));
                specs[k]=Integer.parseInt(values.charAt(k)+"");
                //System.out.print(specs[k]);
                
            }
            System.out.println("");
            sum = 0;
            for (int k = 0; k < specs.length; k++) {
                sum--;
                //System.out.println("Sum: " + sum);
                sum = sum +  specs[k];
                //System.out.println("Sum2: " + sum);
                if(sum<0){
                    x++;
                    sum = 0;
                }
            }
            System.out.println("Case #" + (i+1) +": " + x);
            writer.write("Case #" + (i+1) + ": " + x +"\n");
            writer.println();
        }

        writer.close();
    }

    
}
