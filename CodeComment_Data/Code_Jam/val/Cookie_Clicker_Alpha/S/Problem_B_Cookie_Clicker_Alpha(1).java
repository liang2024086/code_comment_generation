package methodEmbedding.Cookie_Clicker_Alpha.S.LYD461;


import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: kamal
 * Date: 4/11/14
 * Time: 11:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class Problem_B_Cookie_Clicker_Alpha {
    public static void main(String[] args) throws IOException {

        //for reading from input file
        FileReader fileReader=new FileReader("G:\\2nd_year\\java\\inellij_progs\\src\\main\\java\\codejamqualificationround2014\\dataset\\B-small-attempt0.in");
        Scanner scanner=new Scanner(fileReader);

        //reads testcases
        long testcases=scanner.nextLong();
        long alltestcases=testcases;

        //for writong into output file
        FileWriter fileWriter=new FileWriter("G:\\2nd_year\\java\\inellij_progs\\src\\main\\java\\codejamqualificationround2014\\dataset\\output11.in");
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);


        while(testcases-->0){
            //start scanning testcases one by one
            //Long lvalue=scanner.nextLong(); for long
            //String svalue=scanner.next(); for string

            ////////////////////////// WORK HERE //////////////////////////////////////

            Double c,f,x;

            c=scanner.nextDouble();
            f=scanner.nextDouble();
            x=scanner.nextDouble();

            Double y,ey;
            ey=f*(x-c)/c;
            int n;
            n= (int) Math.ceil((ey-2)/f);
            //System.out.println(c);
            //System.out.println(f);
            //System.out.println(x);
            int i=0;
            double sum = 0;
            while(i<n){
                sum=sum+c/(2+i*f);
                i++;
            }

            sum=sum+x/(2+i*f);

            //int outputval=0;
            //output=solveProblem(); and get output value to be printed into output file

            //code for writing into output file
            bufferedWriter.write("Case #" + (alltestcases - testcases) + ": " + sum);
            bufferedWriter.newLine();
            //System.out.println("Case #"+(alltestcases-testcases)+": "+sum);

        }

        scanner.close();
        bufferedWriter.close();
        fileReader.close();
        fileWriter.close();
    }
}
