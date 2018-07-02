package methodEmbedding.Magic_Trick.S.LYD1445;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

        
        
public class Magician {

   
    public static void main(String[] args) {
  int number; 
  int row1;
  int row2;
  String thecard = "";
  try
  {
  FileInputStream in = new FileInputStream("test.txt");
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
  String strLine;
  String firstRow ="";
  String secondRow = "";
  strLine = br.readLine();
  int count = 0;
  String[] firstArray;
  String[] secondArray;
  int num = 1;
  number = Integer.parseInt(strLine);
  
  
  //number = number * 10;
  
  while(num < number+1)
  {
   //(strLine = br.readLine())!= null
   strLine = br.readLine();
   row1 = Integer.parseInt(strLine);
   for(int i = 0; i < 4 ; i++)
   {
       strLine = br.readLine();
       if(i+1 == row1)
       {
           firstRow = strLine;
       }
   }
   strLine = br.readLine();
   row2 = Integer.parseInt(strLine);
   for(int i = 0; i < 4 ; i++)
   {
       strLine = br.readLine();
       if(i+1 == row2)
       {
           secondRow = strLine;
       }
   }     
 String delims = "[ ]+";
 firstArray = firstRow.split(delims);
 secondArray = secondRow.split(delims);
   //firstRow = firstRow.replaceAll("\\s+","");
   for(int j = 0 ; j < 4 ; j++)
   {
       for(int i = 0; i < 4 ; i++)
       {
       
        if(firstArray[j].equals(secondArray[i]))       
        {
            thecard = firstArray[j];
            count++;
        }
       }
   }
   if(count==1)
       System.out.println("Case #"+num+": " + thecard);
   if(count > 1)
       System.out.println("Case #"+num+": Bad magician!");
   if(count==0)
       System.out.println("Case #"+num+": Volunteer cheated!");
   
   count=0;
   num++;
  }
 
  
  }catch(Exception e){
   System.out.println(e);
  }
    }
}
