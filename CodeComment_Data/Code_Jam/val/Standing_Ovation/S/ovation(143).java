package methodEmbedding.Standing_Ovation.S.LYD540;

import java.io.*;


/**
 * Created by Anthony Dinh on 4/11/2015.
 */
public class ovation {

    public static void main(String[] args) throws IOException
    {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("A-small-attempt3.in"));

        PrintWriter pr = new PrintWriter("output.out");

        int numInputs = Integer.parseInt(br.readLine());

        for (int currInput = 1 ; currInput <= numInputs; currInput++)
        {
            String currLine = br.readLine();
            String[] currLineSplit = currLine.split("\\s");

            int maxShyness = Integer.parseInt(currLineSplit[0]);


            char[] temp = currLineSplit[1].toCharArray();
            int[] audience = new int[temp.length];

            for (int i = 0 ; i < temp.length; i++)
                audience[i] = temp[i] - '0';

            int numPeopleClapping = 0;
            int numPeopleToBring = 0;

            for (int currShyness  = 0 ; currShyness <= maxShyness; currShyness++)
            {
                if (numPeopleClapping >= maxShyness)
                {
                    break;
                }

                if (numPeopleClapping < currShyness && audience[currShyness] != 0)
                {
                    numPeopleToBring += (currShyness - numPeopleClapping);
                    numPeopleClapping += numPeopleToBring + audience[currShyness];
                }

                else
                {
                    numPeopleClapping += audience[currShyness];
                }


            }

            //System.out.println("Case #" + currInput + ": " + numPeopleToBring);
            pr.println("Case #" + currInput + ": " + numPeopleToBring);


        }
        pr.close();
    }
}
