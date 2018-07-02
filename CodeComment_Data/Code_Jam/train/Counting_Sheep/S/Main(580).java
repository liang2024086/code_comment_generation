package methodEmbedding.Counting_Sheep.S.LYD558;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        long N = 0;
        //int[] all_digits = new int[]{0,1,2,3,4,5,6,7,8,9};
        ArrayList<Long> all_digits = new ArrayList<Long>(); //contains the digits 0 to 9

        ArrayList<Long> test_cases = new ArrayList<Long>(); // To add the test cases

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Samir Malpande\\Downloads\\A-small-attempt1.in"));
        String line= null;
        while ((line = reader.readLine()) != null){
            test_cases.add(Long.parseLong(line));
        }


        System.out.println(test_cases);

        for (int i=0;i<10;i++){
            all_digits.add((long) i);
        }



        System.out.println("Output");


        for(int x = 1 ; x <= test_cases.get(0); x++){
            ArrayList<Long> digits = new ArrayList<Long>();
            N = test_cases.get(x); // Set N to first Test Case

            if(N==0){

                System.out.print("Case #" + (x) + ": ");

                System.out.println("INSOMNIA");
                //System.out.print(N + "\t"+"\t");
                continue;
            }



            // Multiply N with nos from 1 to ... and loop until all digits are added or 200 times
            for (int i=1; ; i++){
                ArrayList<Long> n_digits = new ArrayList<Long>();
                long num = i * N;  //1

                /*if (i > 200) {
                    System.out.println("INSOMNIA");
                    break;
                }*/

                if (!digits.contains(num)){

                    if (num >= 10){
                        long temp =  num;
                        while (temp > 0){
                            n_digits.add(temp % 10); //[1,0]
                            temp = temp / 10;
                        }

                        for (int j=0; j < n_digits.size(); j++){
                            if (!digits.contains(n_digits.get(j))){
                                digits.add(n_digits.get(j));
                            }
                        }
                        //System.out.println(digits);


                    }
                    else {
                        digits.add(num); //[5]
                        //System.out.println(digits);
                    }


                }
                Collections.sort(digits);

                if (digits.equals(all_digits)){

                    System.out.print("Case #" + (x) + ": ");

                    System.out.println(N);

                    break;
                }



            }
            continue;

        }




    }
}
