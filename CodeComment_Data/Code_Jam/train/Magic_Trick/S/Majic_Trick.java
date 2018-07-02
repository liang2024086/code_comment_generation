package methodEmbedding.Magic_Trick.S.LYD896;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ramshad
 */
public class Majic_Trick {
    
    public static void main(String[] args) {
        // TODO code application logic here
     int first_ans;
     int second_ans;
              int[][] order1=new int[4][4];
              int[][] order2=new int[4][4];
                 
     int count;
     try {
        Scanner sc=new Scanner(new BufferedReader(new FileReader("A-small-attempt0.in")));
        
        int T =sc.nextInt();
        if(1<=T && T<=100){
          
          
          PrintStream out = new PrintStream(new FileOutputStream("A-small-output.txt"));
          int cas=1;
          
          while( cas<=T && sc.hasNext() ){
              ArrayList a = new ArrayList(); 
              count=0;
              first_ans=sc.nextInt();
              if( 1<= first_ans && first_ans<=4){
              for(int i=0;i<4;i++){
                  for(int j=0;j<4;j++){
                      order1[i][j]=sc.nextInt();
                  }
              }
              second_ans=sc.nextInt();
              if( 1<= second_ans && second_ans<=4){
              for(int i=0;i<4;i++){
                  for(int j=0;j<4;j++){
                      order2[i][j]=sc.nextInt();
                  }
              }
              
              for(int i=0;i<4;i++){
                  for(int j=0;j<4;j++){
                  if(order1[first_ans-1][i]==order2[second_ans-1][j]){
                      a.add(order1[first_ans-1][i]);
                      //System.out.println(order1[first_ans-1][i]+":"+a.size());
                  }
                  }
              }
              if( a.isEmpty()){
              System.setOut(out);
              System.out.println("Case #"+cas+": "+"Volunteer cheated!");}
              else if(a.size()==1){
              System.setOut(out);
              System.out.println("Case #"+cas+": "+a.get(0));}
              else if(a.size()>1){
              System.setOut(out);
              System.out.println("Case #"+cas+": "+"Bad magician!");}
              
              } 
           }   
           cas++; 
      }
      }
     
      sc.close();
      
    } catch (Exception e) {
      // TODO Auto-generated catch block
    }
    
}
    
}
