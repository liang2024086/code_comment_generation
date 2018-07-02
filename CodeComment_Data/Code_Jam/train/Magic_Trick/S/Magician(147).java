package methodEmbedding.Magic_Trick.S.LYD521;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sanjnair on 12-Apr-14.
 */
public class Magician {

    public static void main(String[] args)
    {
        String[] inputFiles = {"D:\\Personal\\Code Jam\\Magician\\A-small-attempt0.in"};
        for(String inputFilePath:inputFiles)
        {
            String outputFilePath = inputFilePath.replace(".in", ".out");
            List<String> input = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath)))
            {
                String inputLine = br.readLine();

                while (inputLine != null)
                {
                    input.add(inputLine);
                    inputLine = br.readLine();
                }
            } catch (IOException io)
            {
                continue;
            }

            int testCases = Integer.parseInt(input.remove(0));

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(outputFilePath))))
            {
                for (int counter = 1; counter <= testCases; counter++)
                {
                    int firstChoice = Integer.parseInt(input.remove(0));
                    List<Integer> first = new ArrayList<>(4);

                    for (int i = 1; i <= 4; i++)
                    {
                        if(i == firstChoice)
                        {
                            String[] arr = input.remove(0).split(" ");
                            for (int j = 0; j <4; j++)
                            {
                                first.add(Integer.parseInt(arr[j]));
                            }
                        } else
                        {
                            input.remove(0);
                        }
                    }

                    int secondChoice = Integer.parseInt(input.remove(0));
                    List<Integer> second = new ArrayList<>(4);

                    for (int i = 1; i <= 4; i++)
                    {
                        if(i == secondChoice)
                        {
                            String[] arr = input.remove(0).split(" ");
                            for (int j = 0; j <4; j++)
                            {
                                second.add(Integer.parseInt(arr[j]));
                            }
                        } else
                        {
                            input.remove(0);
                        }
                    }

                    first.retainAll(second);

                    if(first.size() == 1)
                    {
                        bw.write("Case #"+counter+": "+first.get(0)+"\n");
                    } else if (first.size() == 0)
                    {
                        bw.write("Case #"+counter+": Volunteer cheated!\n");
                    } else
                    {
                        bw.write("Case #"+counter+": Bad magician!\n");
                    }


                }
            } catch (IOException io)
            {
                io.printStackTrace();
            }
        }
    }
}
