package methodEmbedding.Magic_Trick.S.LYD1480;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author ashu
 */
public class magictric {
    public static void main(String[] args) throws FileNotFoundException, IOException {
     BufferedReader br=new  BufferedReader(new FileReader("C:/uploads/new.txt"));

     BufferedWriter b=new BufferedWriter(new FileWriter("C:/uploads/result.txt",false));
           

  String s;
 String ar[]=new String[4];
 String ar1[]=new String[4];
int c=1;
 int arFirst[]=new int[4];
int arSecond[]=new int[4];
    int u=0;
   int first = 0,second=0;
     while ((s = br.readLine()) !=null ) {
     if(u==0){
         u++;
         continue;
     }
         if(u==1)
         {
             first=Integer.parseInt(s);
         first+=u;
         }
      if(u==first){
         ar=s.split(" ");
      }
      if(u==6){
          second=Integer.parseInt(s);
          second+=u;
      }

      if(u==second){
         ar1=s.split(" ");
        
      }
     u++;
    if(u==11){
       
        for(int x=0;x<4;x++)
        {
            arFirst[x] = Integer.parseInt(ar[x]);
           
        }
        for(int x=0;x<4;x++)
        {
            arSecond[x] = Integer.parseInt(ar1[x]);
           
        }
        int count=0,num=0;
        for(int x=0;x<4;x++){
            for(int y=0;y<4;y++){
            if(arFirst[x]==arSecond[y]){
                count++;
                num=arFirst[x];
            }
            }}

             if(count==0){
                   b.write("Case #"+c+": Volunteer cheated!");
               //     System.out.println("Case #"+c+": Volunteer cheated!");
             }
            else if (count == 1){
                b.write("Case #"+c+": "+num+"");
             //    System.out.println("Case #"+c+": "+num+"");
            }
                else{
                b.write("Case #"+c+": Bad magician!");
           //      System.out.println("Case #"+c+": Bad magician!");
                }
        b.newLine();
        c++;

    }
     u=u%11;
     if(u==0)
         u++;
        }
       b.flush();
            //close the file
            b.close();

    br.close();
    }
}
