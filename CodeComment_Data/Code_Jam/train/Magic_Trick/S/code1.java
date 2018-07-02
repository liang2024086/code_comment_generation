package methodEmbedding.Magic_Trick.S.LYD1359;

import java.util.*;

public class code1{
  public static void main(String[] args){
    int size = 4;
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int i=0;i<T;i++){
      int ans1 = sc.nextInt()-1;
      int[][] arr1 = new int[size][size];
      for(int j=0;j<size;j++){
        for(int k=0;k<size;k++){
          arr1[j][k]=sc.nextInt();
        }
      }
      int ans2 = sc.nextInt()-1;
      int[][] arr2 = new int[size][size];
      for(int j=0;j<size;j++){
        for(int k=0;k<size;k++){
          arr2[j][k]=sc.nextInt();
        }
      }
      
      int count=0;
      int num=0;
      for(int j=0;j<size;j++){
        for(int k=0;k<size;k++){         
          if(arr1[ans1][j]==arr2[ans2][k]){
            count++;
            num=arr1[ans1][j];
          }
        }
      }
      int temp = i+1;
      if(count==1){
        System.out.println("Case #"+temp+": "+num);
      }else if(count>1){
        System.out.println("Case #"+temp+": Bad magician!");
      }else{
        System.out.println("Case #"+temp+": Volunteer cheated!");
      }
      
    }    
  }
}
