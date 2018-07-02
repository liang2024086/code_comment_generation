package methodEmbedding.Magic_Trick.S.LYD1293;

import java.io.*;
import java.util.regex.Pattern;

public class Test2 {
    public static void main(String [] args) {

        String fileName = "A-small-attempt0.IN";
        String output="o.txt";

        String line = null;

        int cases=0;
         try 
         {
            
            FileReader fileReader = new FileReader(fileName);
            FileWriter fileWriter = new FileWriter(output);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);  

            
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            line = bufferedReader.readLine();
            cases=Integer.parseInt(line);
            System.out.printf("%d \n\n",cases);
            if(cases>=1&&cases<=100)
           {
             
             String[] b = new String[4];
             int[][] a = new int[4][4];
             int[][] c = new int[4][4];
            
             Pattern p = Pattern.compile("[\\s]+");	 
	      int i=0,j,row1,row2,loc=0;
	     
	              System.out.println( " " );


            for(int t=1;t<=cases;t++)
             {
               line = bufferedReader.readLine();  
               row1=Integer.parseInt(line);
               System.out.printf("%d \n\n",row1);
               i=0;
                while(i<=3)
               {
                line = bufferedReader.readLine(); 
                b = line.split(p.pattern());
                for (j = 0; j < 4; j++)
                 {
                   
	           a[i][j] = Integer.parseInt(b[j]);
	           System.out.print(a[i][j]+" ");
                   
	         }
                  System.out.println("\n");i++;
             
              
              }
             
              line = bufferedReader.readLine();  
               row2=Integer.parseInt(line);
               System.out.printf("%d \n\n",row2);
               i=0;
                while(i<=3)
               {
                line = bufferedReader.readLine(); 
                b = line.split(p.pattern());
                for (j = 0; j < 4; j++)
                 {
                   
	           c[i][j] = Integer.parseInt(b[j]);
	           System.out.print(c[i][j]+" ");
                   
	         }
                  System.out.println("\n");i++;
             
              
              }


             int flag=0;
             for(i=0;i<=3;i++)
             {for(j=0;j<=3;j++)
              {
               if(a[row1-1][i]==c[row2-1][j])
               {flag++;loc=i;}
              }
             }


        
           
            
             if(flag==1)
             {bufferedWriter.write("Case #"+t+": "+a[row1-1][loc]);
              bufferedWriter.newLine();
             }
             else if(flag>1)
             {bufferedWriter.write("Case #"+t+": "+"Bad Magician!");
              bufferedWriter.newLine();
             }
             else 
             {bufferedWriter.write("Case #"+t+": "+"Volunteer cheated!");
              bufferedWriter.newLine();
             }
          
        
       
	
            
          }
      			
        }
    bufferedWriter.close();
           
   bufferedReader.close();
      }         
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");				
        }
        catch(IOException ex) {   System.out.println("Error reading/writing file '"+ fileName + "'");					
            
            
        }
    }
}
