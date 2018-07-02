package methodEmbedding.Magic_Trick.S.LYD484;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Class: Magic<br />
 * Date: 2014/04/12 20:40<br />
 * Description:<br />
 *
 * @author Laiping Zhou(sjtudesigner)
 */
public class Magic {

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter(new File("output.txt"));
        int cases = sc.nextInt();
        for (int times = 1;times <= cases;times++)
        {
            int[] array;
            int num;
            int result = 0;
            int result_num = 0;
            array = new int[4];

            num = sc.nextInt();
            for (int i = 0;i < num;i++)
                sc.nextLine();
            for (int i = 0;i < 4;i++)
            {
                array[i] = sc.nextInt();
            }

            System.out.println(array[0]);

            for (int i = num;i <= 4;i++)
                sc.nextLine();
            num = sc.nextInt();
            for (int i = 0;i < num;i++)
                sc.nextLine();
            for (int i = 0;i < 4;i++)
            {
                int temp = sc.nextInt();
                System.out.print(temp + " ");
                for (int j = 0;j < 4;j++)
                    if (array[j] == temp) { result++; result_num = temp; break; }
            }
            for (int i = num;i <= 4;i++)
                sc.nextLine();

            out.printf("Case #%d: ", times);
            if (result == 0) out.println("Volunteer cheated!");
            else if (result == 1) out.println(result_num);
            else out.println("Bad magician!");
        }
        out.close();
    }

}
