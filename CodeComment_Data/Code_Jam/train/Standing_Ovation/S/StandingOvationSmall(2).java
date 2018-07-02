package methodEmbedding.Standing_Ovation.S.LYD2055;




import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;


/**
 *
 * @author Luca
 */
public class StandingOvationSmall {
    public static void main(String[]args){
		File file = new File("A-small-attempt6.in");
		try{
        Scanner scan= new Scanner (file);
        int tot_test= scan.nextInt();
        int ct=0;
        int shyMax = 0;
        int shyTot;
		 Writer writer= new BufferedWriter(new OutputStreamWriter(
			                new FileOutputStream("filename7.txt"), "ASCII"));;
        for(ct=0;ct<tot_test;ct++){




			System.out.println("CASE : "+ ct);
			int sommatoria=0;
            shyMax=scan.nextInt();
            shyTot=scan.nextInt();

            int n=shyTot;
            int mod=10;
            int div=1;
            int need=0;
            int [] arrN= new int[shyMax+1];
           	for(int j=0;j<=shyMax;j++)
           		arrN[j]=0;
            for(int j=shyMax;j>=0;j--){
            	arrN[j]=(n%mod)/div;
            	mod*=10;
                div*=10;
			}
            for(int j=0;j<=shyMax;j++){

					if(sommatoria+need<j)need=need+(j-(sommatoria+need));
					sommatoria+=arrN[j];
            }
					writer.append("Case #"+(ct+1)+": "+(need)+"\n");


		}

		writer.close();
        }catch(IOException ex) {ex.printStackTrace();}
}
}
