package methodEmbedding.Counting_Sheep.S.LYD1191;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class CountingSheep{

  public static void main(String[] args)throws IOException{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int t=Integer.parseInt(br.readLine());
     
     for(int i=1; i<=t; i++){
           int n=Integer.parseInt(br.readLine());
           //Only zero gives insomia
           if(n==0){
              System.out.println("Case #"+i+": INSOMNIA");
           }
           else{
           int[] digits=new int[10];
           for(int j=0; j<digits.length; j++)
               digits[j]=0;
           // all numbers will be covered under n*100
           int m=0; 
           for(int j=1; j<100; j++){
               m+=n; //m is the jth multiple of n
               boolean flag=true;
               for(int k=0; k<digits.length; k++){
                    if(digits[k]==0){
                        flag=false;
                        //check if m contains 'k'
                        int temp=m;
                        while(temp>0){
                            if(temp%10==k){
                               //System.out.println("Contains "+k+"at multiple"+j);                               
                               digits[k]=1;
                               break;
                            }
                            temp=temp/10;
                        }
                    }
               }
               if(flag){
                    System.out.println("Case #"+i+": "+(m-n));
                    break;
               }
                  
           }
         }
     } 
  }
}
