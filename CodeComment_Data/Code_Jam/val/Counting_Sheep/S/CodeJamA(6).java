package methodEmbedding.Counting_Sheep.S.LYD1034;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Sharky
 */
public class CodeJamA 
{ 

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        File input = new File("Input.txt");
        Scanner in = new Scanner(input);
        int cases = in.nextInt();
        //System.out.println(cases);
        //String[] casesarrayS = new String[cases];
        int[] casesarrayI = new int[cases];
        for(int loop=0; loop<cases; loop++)
        {
            casesarrayI[loop]=in.nextInt();
            /*casesarrayS[loop]=String.valueOf(casesarrayI[loop]);
            System.out.println(casesarrayS[loop]);*/
            //System.out.println(casesarrayI[loop]);
        }
        String count = null;
        int T = 0, counter = 1, length = 0, sum = 0;
        int check0, check1, check2, check3, check4, check5, check6, check7, check8, check9;
        while(T<cases)
        {
            check0=check1=check2=check3=check4=check5=check6=check7=check8=check9=0;
            while(counter<100)
            {
                count = String.valueOf(casesarrayI[T] * counter);
                //System.out.println("COUNT = " + count);
                length = count.length();
                for(int loop=0; loop<length; loop++)
                {
                    //System.out.println(count.charAt(loop));
                    if(count.charAt(loop) == '0')
                        check0 = 1;
                    if(count.charAt(loop) == '1')
                        check1 = 1;
                    if(count.charAt(loop) == '2')
                        check2 = 1;
                    if(count.charAt(loop) == '3')
                        check3 = 1;
                    if(count.charAt(loop) == '4')
                        check4 = 1;
                    if(count.charAt(loop) == '5')
                        check5 = 1;
                    if(count.charAt(loop) == '6')
                        check6 = 1;
                    if(count.charAt(loop) == '7')
                        check7 = 1;
                    if(count.charAt(loop) == '8')
                        check8 = 1;
                    if(count.charAt(loop) == '9')
                        check9 = 1; 
                }
                counter++;
                sum = check0+check1+check2+check3+check4+check5+check6+check7+check8+check9;
                if(sum==10)
                {
                    T++;
                    System.out.println("Case #" + (T) + ": " + count);
                    T--;
                    break;
                }
            }
            T++;
            counter = 1;
            if(sum<10)
                System.out.println("Case #" + (T) + ": INSOMNIA");
            //System.out.println("SUM = " + sum);
        }
    }
}
