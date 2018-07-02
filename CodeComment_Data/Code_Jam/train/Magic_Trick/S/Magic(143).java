package methodEmbedding.Magic_Trick.S.LYD1879;


import java.util.ArrayList;
import java.util.Scanner;

public class Magic {
    
    public static void main(String[] args) {
      int num1,row1,row2,i=0,cnt=0,num;
        ArrayList<Integer> array = new ArrayList<Integer>(); 
        ArrayList<Integer> array3 = new ArrayList<Integer>(); 
        int[] array1 = new int[4];
        int[] array2 = new int[4];
        
               Scanner s1 = new Scanner(System.in);
                do{
               num1 = s1.nextInt();
               if(num1<=0 && num1 >100){
                   System.out.println("enter number of itreration again");
               }}while(num1<=0 && num1 >100);
                Object[] ans = new Object[num1];
      while(i<num1){
          array.clear();
          array3.clear();
          cnt = 0;
            do{
              row1 = s1.nextInt();
              if(row1<0 || row1>4){
                  System.out.println("enter the row again");
              }
            }while(row1<0 || row1>4);
            for (int j = 0; j < 16; j++) {
                do{
                    num = s1.nextInt();
                    if(num<1 || num>16){
                        System.out.println("error try again from begining");
                        j=0;
                    }
                }while((num<1 || num>16));                   
                array.add(num);
            }
            for(int j=(row1-1)*4;j<row1*4;j++){
                array1[j%4] = array.get(j);
            }
            do{
               row2 = s1.nextInt();
               if(row2<0 || row2>4){
               System.out.println("enter the row again");
            }
               
           }while(row2<0 || row2>4);
            for (int j = 0; j < 16; j++) {
                do{
                    num = s1.nextInt();
                    if(num<1 || num>16){
                        System.out.println("error try again from begining");
                        j=0;
                    }
                }while((num<1 || num>16));                   
                array3.add(num);
                }
            for(int j=(row2-1)*4;j<row2*4;j++){
                array2[j%4] = array3.get(j);
            }
            
            for(int j=0;j<4;j++){
                for(int k = 0;k<4;k++){ 
                    if(array1[j]==array2[k]){
                        cnt++;
                        ans[i] = array1[j];
                    }
                    
                }
            }
            
            if(cnt==0)
                ans[i] = "Volunteer cheated!";
            else if(cnt>1)
                ans[i] = "Bad magician!";
             cnt = 0;
      i++;
      }
      i=0;
        System.out.print("\n");
      while(i<num1){
          System.out.println("Case #"+(i+1)+": "+ ans[i]);     
          i++;
      }
     }
    
}
