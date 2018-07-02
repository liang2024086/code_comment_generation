package methodEmbedding.Magic_Trick.S.LYD1950;

import java.io.*;

/**
 * Created by Jasmin on 12.04.14.
 */
public class Main {

    public static void main(String args[]){

        String fileName = args[0];

        BufferedReader br;
        BufferedWriter bw;

        int testno;

        String input1 = "";
        String input2 = "";

        int line1;
        int line2;

        int[] number1 = new int[4];
        int[] number2 = new int[4];


        try{
            br = new BufferedReader(new FileReader(new File(fileName)));

            testno = Integer.parseInt(br.readLine());

            for(int i = 0; i < testno; i++){

                int result = 0;

                line1 = Integer.parseInt(br.readLine());
                for(int j = 0; j < line1; j++){
                    input1 = br.readLine();
                }
                int counter = 0;
                for(String number : input1.split(" ")){
                    number1[counter] = Integer.parseInt(number);
                    counter++;
                }
                while(line1 < 4){
                    br.readLine();
                    line1++;
                }

                line2 = Integer.parseInt(br.readLine());
                for(int k = 0; k < line2; k++){
                    input2 = br.readLine();
                }
                counter = 0;
                for(String number : input2.split(" ")){
                    number2[counter] = Integer.parseInt(number);
                    counter++;
                }
                while(line2 < 4){
                    br.readLine();
                    line2++;
                }

                outerloop:
                for(int l = 0; l < 4; l++){
                    for(int m = 0; m < 4; m++){
                        if(number1[l] == number2[m]){
                            if(result == 0){
                                result = number1[l];
                            }else{
                                System.out.println("Case #" + (i+1) + ": Bad magician!");
                                result = -1;
                                break outerloop;
                            }
                        }
                    }
                }

                if(result == 0){
                    System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
                }else if(result > 0){
                    System.out.println("Case #" + (i+1) + ": " + result);
                }


            }

        }catch(IOException e){
            System.out.println("File not found");
            return;
        }

    }
}
