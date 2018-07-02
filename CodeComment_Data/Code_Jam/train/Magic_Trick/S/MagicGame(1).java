package methodEmbedding.Magic_Trick.S.LYD904;




import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class MagicGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            
            File file1=new File("input.in");
            File file2=new File("output.txt");
            Scanner scanner=new Scanner(file1);
            BufferedWriter writer=new BufferedWriter(new FileWriter(file2));
            int no_of_cases=scanner.nextInt();
            int[][] matrix1=new int [4][4];
            int[][] matrix2=new int [4][4];
            int firstRow=0,secondRow=0,result=0;
            
            for(int i=0;i<no_of_cases;i++)
            {
                int counter=0;
                firstRow=scanner.nextInt();
                for(int a=0;a<4;a++)
                    for(int b=0;b<4;b++)
                        matrix1[a][b]=scanner.nextInt();
                
                secondRow=scanner.nextInt();
                
                for(int a=0;a<4;a++)
                    for(int b=0;b<4;b++)
                        matrix2[a][b]=scanner.nextInt();
                
               for(int a=0;a<4;a++)
                   for(int b=0;b<4;b++)
                   {
                       if(matrix1[firstRow-1][a]==matrix2[secondRow-1][b])
                       { 
                           counter++;
                           if(counter==1)
                               result=a;
                       }
                   }
               if(counter==1)
               {
                   writer.write("Case #"+(i+1)+": "+matrix1[firstRow-1][result]);
                   writer.newLine();
                  //writer.write(null);
               }
               else if(counter==0)
               {
                   writer.write("Case #"+(i+1)+": Volunteer cheated!");
                   writer.newLine();
               }
               else
               {
                   writer.write("Case #"+(i+1)+": Bad Magician!");
                   writer.newLine();
               }
            }
           writer.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
         
    }
    
}
