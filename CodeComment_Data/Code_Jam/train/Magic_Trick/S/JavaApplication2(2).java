package methodEmbedding.Magic_Trick.S.LYD645;



/**
 *
 * @author Devil's Home
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       String input = "D:\\gcjam\\s0.in";
       String output = "D:\\gcjam\\s2.txt";
       Scanner sc=new Scanner(new FileReader(input));
        PrintWriter pw = new PrintWriter(output);
        int row,i,j,k,match=0,flag=0,t,l;
        int arr[][]=new int[4][4];
        int a[]=new int[4];
        int b[]=new int[4];
        t=sc.nextInt();
       
        sc.nextLine();
        for(k=0;k<t;k++){
             l=k+1;
             flag=0;
             row=sc.nextInt();
             sc.nextLine();
             row=row-1;
             for(i=0;i<4;i++){
                 for(j=0;j<4;j++){
                     arr[i][j]=sc.nextInt();
                 }
                sc.nextLine();
             }
             for(i=0;i<4;i++){
                 a[i]=arr[row][i];
             }
             row=sc.nextInt();
             row-=1;
             sc.nextLine();
             for(i=0;i<4;i++){
                 for(j=0;j<4;j++){
                     arr[i][j]=sc.nextInt();
                 }
              if(k!=t-1)   
                sc.nextLine();
             }
             for(i=0;i<4;i++){
                 b[i]=arr[row][i];
             }
             for(i=0;i<4;i++){
               for(j=0;j<4;j++)
               {
                 if(a[i]==b[j])
                 {
                    flag++;
                    match=a[i];
                 }
               }
             }
     if(flag==0){
        pw.println("Case #"+ l +": Volunteer cheated!" );
         System.out.println("Case #"+ l +": Volunteer cheated" );
     }
     else
      {

        if(flag==1){
          pw.println("Case #"+l+": " +match);
          System.out.println("Case #"+l+": " +match);
        }
        else
        { 
          pw.println("Case #"+l+": Bad magician!");
          System.out.println("Case #:"+l+" Bad magician!");
        }
      }
     }
         pw.flush();
            pw.close();
            sc.close();
    }
  }

