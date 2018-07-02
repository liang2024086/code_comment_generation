package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1243;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cookies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
    Double a[]= new Double[3];   
    int j=0,i=0;
   
    Scanner inFile = new Scanner(new FileReader("B-small-attempt3.in"));
        
        //numbers of tests
        int T;
        T = inFile.nextInt();
        System.err.println(T);

        for(int s=0;s<T;s++){
        a[0] = inFile.nextDouble();
        a[1] = inFile.nextDouble();
        a[2] = inFile.nextDouble();
    
       double c=a[0],f=a[1],x=a[2],ris=0,cont=2,t=0;
       
       
       boolean bol=false;
            if(x/2<=c/2){
                    System.err.println("PRIMO!!!");
                  System.out.println("Case #" + (i+1) + ": " + x/2);
                  i++;
            }
            else{
                if (x/2<(x/(cont+f))+c/cont){
                    System.err.println("SECONDO");
                    System.out.println("Case #" + (i+1) +": 1.0000000");
                    i++;
                }
                else{
                    System.err.println("terzooo");
                    ris=(x/(cont+f))+c/cont;
                    t=t+(c/cont);
                    cont=cont+f;
                    while(bol!=true){
                        System.err.println("whileeee");
                   if (ris<(x/(cont+f))+c/cont+t){
                       System.err.println("iff");
                    bol=true;
                }
                   else{
                       System.err.println("elseee");
                       ris=(x/(cont+f))+c/cont+t;
                       t=t+(c/cont);
                    cont=cont+f;
                   }
                    } 
                }
                if(ris==0){
                    System.err.println("ceeeeeee");System.out.println("Case #" + (i+1) +": "+ x/2) ;
                        i++;}
                else {
                        System.err.println("volleeee"
                                + "");
                        System.out.println("Case #" + (i+1) +": "+ ris);
                i++;}
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
                if(ris==0){
                    pw.println(x/2);
                }
                else if(x/2<=c/2){
                    pw.println(x/2);
                }
                else{
                    pw.println(ris);
                }
                pw.close();
            }
            catch(IOException e){
                System.err.println("Could not log!");
            }  
            }    
    }
}  

