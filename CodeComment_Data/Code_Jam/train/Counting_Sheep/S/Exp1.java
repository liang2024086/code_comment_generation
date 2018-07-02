package methodEmbedding.Counting_Sheep.S.LYD598;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Created by admin on 09-Apr-16.
 */
public class Exp1 {

    public static void main(String[] args) {
        try {

            String url ="C:\\Users\\admin\\IdeaProjects\\Practice\\src\\edu\\ashish\\apac\\input.txt";

            FileInputStream fileInputStream = new FileInputStream(new File(url));
            byte[] b =  new byte[fileInputStream.available()];
            fileInputStream.read(b);

            String input = new String(b);
            StringTokenizer tokenizer = new StringTokenizer(input, "\r\n");

            int limit = Integer.parseInt(tokenizer.nextToken());
            int multiplier;
            int valueToPlayWith =0;
            int multipliedValue;

            boolean toContinue = true;
            boolean numbersArray[] = new boolean[10];
                numbersArray = new boolean[]{false,false,false,false,false,false,false,false,false,false};

            String temp;
            String toReturn = "error";



            for(int index = 1; index<=limit ; index++){//loop for iterating through all the inputs

                valueToPlayWith = Integer.parseInt(tokenizer.nextToken());

                if(valueToPlayWith == 0){
                    toReturn = "Case #1: INSOMNIA";
                    System.out.println(toReturn);
                    continue;
                }

                multiplier = 1;
                toContinue=true;

                numbersArray = new boolean[]{false,false,false,false,false,false,false,false,false,false};


                while(toContinue){//loop for iterating for Natural
                    multipliedValue = valueToPlayWith * multiplier++;
                    temp = multipliedValue + "";

                    for(int i= 0; i<temp.length(); i++){
                        int digit = Integer.parseInt(temp.charAt(i) + "");
                        numbersArray[digit] = true;
                    }

                    if((    numbersArray[0] && numbersArray[1] && numbersArray[2] &&numbersArray[3] &&numbersArray[4]
                            &&numbersArray[5] &&numbersArray[6] &&numbersArray[7] &&numbersArray[8] &&numbersArray[9]))
                    {toContinue = false;}

                    toReturn = multipliedValue + "";

                }





                System.out.println("Case #" + index + ": " + toReturn);

            }






        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
