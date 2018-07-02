package methodEmbedding.Magic_Trick.S.LYD1625;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Alessio
 */
public class Magic {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner inFile = new Scanner(new FileReader("src/magic/A-small-attempt1.in"));
        
        //numbers of tests
        int T;
        T = inFile.nextInt();
        System.err.println(T);
        
        for(int s=0;s<T;s++){
            //first choice
            int a1;
            a1 = inFile.nextInt();
            int l1 = a1-1;
            System.err.println("Row: " + a1);
        
            //bidimensional array
            int [][] barr1 = new int [4][4];
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    barr1[i][j]=inFile.nextInt();
                }
            }
            //stampa bidimensional array
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    System.err.print(" " + barr1[i][j]);
                }
                System.err.println("");
            }
        
            //second choice
            int a2;
            a2 = inFile.nextInt();
            int l2=a2-1;
            System.err.println("Row: " + a2);
        
            //bidimensional array
            int [][] barr2 = new int [4][4];
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    barr2[i][j]=inFile.nextInt();
                }
            }
            //stampa bidimensional array
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    System.err.print(" " + barr2[i][j]);
                }
                System.err.println("");
            }
        
            //final test
            int flag=0;
            int num=0;
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    if(barr1[l1][i]==barr2[l2][j]){
                        flag++;
                        num = barr1[l1][i];
                    }
                }
            }
            //write on file
            File log = new File("log.txt");
            try{
                if(log.exists()==false){
                    System.err.println("We had to make a new file.");
                    log.createNewFile();
                }
                PrintWriter pw = new PrintWriter(new FileWriter(log, true));
                pw.print("Case #" + (s+1) + ": ");
                if(flag==1){
                    pw.println(num);
                }
                else if(flag>1){
                    pw.println("Bad magician!");
                }
                else{
                    pw.println("Volunteer cheated!");
                }
                pw.close();
            }
            catch(IOException e){
                System.err.println("Could not log!");
            }  
        }
    }
    
}
