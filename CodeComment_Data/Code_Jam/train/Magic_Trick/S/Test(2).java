package methodEmbedding.Magic_Trick.S.LYD587;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YASARA
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Test {
  
public static void main(String[] args) throws IOException {
 String str; 
 BufferedReader br = new BufferedReader(new FileReader("data.txt"));
 BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
 int[][] Data1 = new int[4][4];
 int[][] Data2 = new int[4][4];
 int Repeat;
 int k;
 str=br.readLine(); 
 str.trim();
 Repeat= Integer.parseInt(str);
  str=br.readLine();
 for(k=0;k<Repeat;k++){
        str.trim();
        int Row= Integer.parseInt(str);            
        int j=0;
        while(j<4){        
            str=br.readLine();
             String[] splited=str.split("\\s");               
             for(int i=0;i<splited.length;i++){                
                 splited[i].trim();
                 Data1[j][i]=Integer.parseInt(splited[i]);                
                  }                 
             j++;
         }        
        str=br.readLine();  
        int Row2= Integer.parseInt(str);            
        str=br.readLine();
        j=0;
        while(j<4){      
             String[] splited=str.split("\\s");             
             for(int i=0;i<splited.length;i++){              
                 splited[i].trim();
                  Data2[j][i]=Integer.parseInt(splited[i]);
                  
                  }               
             str=br.readLine();
             j++;
         } 
    int Found=0,item=0;
    for( int i=0;i<4;i++){
      for(  j=0;j<4;j++){        
          if(Data1[Row-1][i]==Data2[Row2-1][j]){
            Found++;           
            item=Data1[Row-1][i];
            }
        }
      }     
    if(Found==1){
        System.out.print("Case #"+(k+1)+": "+item+"\n");
        bw.write("Case #"+(k+1)+": "+item);
        bw.newLine();
    }
    else  if(Found>1){
        System.out.print("Case #"+(k+1)+": "+"Bad magician!\n");
        bw.write("Case #"+(k+1)+": "+"Bad magician!");
         bw.newLine();
    }
    else  if(Found==0){
        System.out.print("Case #"+(k+1)+": "+"Volunteer cheated!\n");
        bw.write("Case #"+(k+1)+": "+"Volunteer cheated!");
        bw.newLine();
    }
    else{
        System.out.print("Case #"+(k+1)+": "+"error\n");
        bw.write("Case #"+(k+1)+": "+"error");
        bw.newLine();
    }
     }
 bw.close();
    }  
}



    



