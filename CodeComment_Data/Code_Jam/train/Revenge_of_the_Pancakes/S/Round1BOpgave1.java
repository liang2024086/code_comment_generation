package methodEmbedding.Revenge_of_the_Pancakes.S.LYD963;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Round1BOpgave1
{
    public static void main(String[] args)
    {
        try
        {
            Scanner input = new Scanner(new FileInputStream("A-small-in.txt"));
            Formatter output = new Formatter("A-small-out.txt");
            
            int T = input.nextInt();
            String stack;
            char[] stackAsCharArray;
            int stackSize;
            int counter;
            char indexChar;
            
            for (int i = 0; i < T; i++)
            {
                stack = input.next();
                stackAsCharArray = stack.toCharArray();
                stackSize = stackAsCharArray.length;
                counter = 0;
                indexChar = stackAsCharArray[0];
                for (int j=0; j<stackSize; j++)
                {
                    if (stackAsCharArray[j] != indexChar)
                    {
                        // flip stack
                        counter++;
                        indexChar = (indexChar == '-' ? '+' : '-');
//                        for(int k=0; k<j; k++)
//                           stackAsCharArray[k] = (stackAsCharArray[k]== '-' ? '+' : '-');
                    }
                }
                if (indexChar == '-')
                    counter++;
                output.format("Case #%d: %s \n", i + 1, counter+"");
                
//                while (index > 0 && stackAsCharArray[index] == '+')
//                    index--;
//                if (index != 0)
//                {
//                    //flip stack
//                    int k = index;
//                    for(int j=0; j<index; j++)
//                    {
//                        newStack[j] = (stackAsCharArray[k] == '-' ? '+' : '-');
//                        k--;
//                    }
//                    for(int j=index; j<stackSize; j++)
//                        newStack[j] = '+';
//                }
//                output.format("Case #%d: %s \n", i + 1, nextN+"");
            }

            if (output != null && input != null)
            {
                output.close();
                input.close();
            }

        } catch (FileNotFoundException ex)
        {
            System.err.println("An error has occured.");
            System.exit(1);
        }
    }
}
