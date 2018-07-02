package methodEmbedding.Standing_Ovation.S.LYD76;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        //read in
        Scanner scnr = null;

        try {
            scnr = new Scanner(new File("A.in"));
        } catch(Exception e)
        {
            System.out.println(e);
            System.exit(-1);
        }


        int numTests = Integer.parseInt(scnr.nextLine());

        for(int i = 0; i < numTests; i++)
        {
            String input = scnr.nextLine();
            String[] inputArr = input.split(" ");

            int maxS = Integer.parseInt(inputArr[0]);

            //converts the second part of the input to an int array
            int[] numSeats = new int[inputArr[1].length()];

            for(int j = 0; j < numSeats.length; j++)
            {
                numSeats[j] = inputArr[1].charAt(j) - '0';
            }

            //now that the numbers are stored, compute how many friends we would need
            int friends = 0;
            int totalPeople = numSeats[0];

            //only add people if needed
            for(int j = 1; j < numSeats.length; j++)
            {
                if(totalPeople > maxS)
                {
                    break;
                }

                if(totalPeople < j)
                {
                    totalPeople++;
                    friends++;
                }

                totalPeople += numSeats[j];
            }

            //now print
            System.out.println("Case #" + (i + 1) + ": " + friends);
        }
    }
}
