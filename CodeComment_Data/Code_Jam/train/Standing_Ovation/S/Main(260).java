package methodEmbedding.Standing_Ovation.S.LYD538;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {


        Scanner sc  =  new Scanner(System.in);
        File input = new File("A-small-attempt1.in.txt");
        Scanner sc3 = new Scanner(input);
        Scanner sc2  = new Scanner(System.in);
        sc3.useDelimiter(" ");


        int noOfTest = sc.nextInt();
        PrintWriter outFile;
        outFile = new PrintWriter("output.txt");
       // System.out.println(noOfTest + "No of tests");

        for (int i = 1; i<=noOfTest ; i++)
        {    int smax = sc3.nextInt();
           //  System.out.println("smax of "+i +" = "+smax);

            sc3.skip(" ");

          String arrayInt[] =  sc3.nextLine().split("");



            int total = 0;
            int added = 0;

            for(int j = 0; j<=smax; j++ ){
                if(total < j){
                    added++;
                    total = total + 1;



                }
                total = total + Integer.parseInt(arrayInt[j]);

            }


            outFile.println("Case #" +i+": "+ added );


            //System.out.println("Case #" +i+": "+ added );

        }
        outFile.close();


    }
}
