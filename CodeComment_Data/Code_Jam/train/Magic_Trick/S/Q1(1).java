package methodEmbedding.Magic_Trick.S.LYD294;

 
import java.io.FileNotFoundException;
import java.io.FileReader; 
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Q1 {

	public static void main(String[] args) throws FileNotFoundException
	{ 
		Scanner sc = new Scanner(new FileReader("q1.in"));
		PrintWriter pw = new PrintWriter("q1.out");
		
		int n = sc.nextInt();
		sc.nextLine();
        for (int c=0; c<n; c++) {
            pw.print("Case #" + (c+1) + ": ");
            int n1 = sc.nextInt();
            sc.nextLine();
            for ( int i = 1; i < n1 ; i++)
            	sc.nextLine();
            ArrayList<Integer> firstfour = new ArrayList<Integer>();
            for ( int i = 1; i <=4 ;i++)
            {
            	firstfour.add(sc.nextInt());
            }
            sc.nextLine();
            for ( int i = 1; i <= 4-n1 ; i++)
            	sc.nextLine();
            int counter = 0;
            int result = 0;
            int n2 = sc.nextInt();
            sc.nextLine();
            for ( int i = 1; i < n2 ; i++)
            	sc.nextLine();
            for ( int i = 1; i <=4 ;i++)
            {
            	int current = sc.nextInt();
            	if ( firstfour.contains(new Integer(current)))
            	{
            		result = current;
            		counter++;
            	}
            }
            sc.nextLine();
            for ( int i = 1; i <= 4-n2 ; i++)
            	sc.nextLine();
            if ( counter == 1)
            {
            	pw.print(result+"\n");
            }
            else if ( counter == 0)
            {
            	pw.print("Volunteer cheated!"+"\n");
            }
            else
            {
            	pw.print("Bad magician!"+"\n");
            }
        }
        pw.println();
        pw.flush();
        pw.close();
        sc.close();
		
	}
 
}
