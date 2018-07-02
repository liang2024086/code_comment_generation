package methodEmbedding.Counting_Sheep.S.LYD50;


import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import java.util.*;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String fileName = "testData.txt";

        String line = null;

        try
        {
            FileReader f = new FileReader(fileName);

            BufferedReader myReader = new BufferedReader(f);

            while((line = myReader.readLine()) != null) {
                int loop = Integer.parseInt(line);

                for(int i = 1; i <= loop; i++)
                {
                    line = myReader.readLine();

                    int number = Integer.parseInt(line);

                    int origNumber = number;

                    System.out.print("Case #" + i + ": ");

                    if(number == 0) {
                        System.out.println("INSOMNIA");
                    } else {
                        String myString;
                        boolean allFound = false;

                        Set<Integer> mySet = new HashSet<>();

                        int count = 1;

                        while(!allFound)
                        {
                            myString = Integer.toString(number);

                            String digit;

                            for(int j = 0; j < myString.length(); j++)
                            {
                                digit = ""+myString.charAt(j);
                                mySet.add(Integer.parseInt(digit));
                            }

                            if(mySet.size() == 10)
                            {
                                allFound = true;
                            } else {
                                count++;

                                number = origNumber * count;
                            }
                        }

                        System.out.println(number);
                    }
                }
            }
        } catch (Exception e)
        {
            //do nothing
        }
    }
}
