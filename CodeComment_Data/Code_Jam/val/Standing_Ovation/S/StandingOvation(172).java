package methodEmbedding.Standing_Ovation.S.LYD1125;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class StandingOvation {
    public static void main (String[]arguments)throws IOException {
        FileInputStream fis = new FileInputStream("A-small-attempt0.in");
        DataInputStream in = new DataInputStream(fis);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int N=Integer.parseInt(br.readLine());
        int caseNo=1;        
        for (int g=0;g<N;g++){
            String []inputs = br.readLine().split(" ");
            int sMax=Integer.parseInt(inputs[0]);
            int num;
            //String sNo=inputs[1];
            char[]arr=inputs[1].toCharArray();            
            int P= arr.length-1;//dont forget
            System.out.print("Case #"+caseNo+": ");
            int []nums=new int[arr.length];
            for(int x=0;x<=P;x++){
              nums[x]=Character.getNumericValue(arr[x]);             
            }
            int zero=Arrays.binarySearch(nums, 0);
            int grace=0;
            int peeps=0;
            int diff=0;
            
               if(zero<0){
                   System.out.print(0);
               }else {
                   
                   for(int x=0;x<=P;x++){
                     if(nums[x]==0){
                         int pos= x;
                         int sum=0;
                         int add=0;
                   
                         for(int w=0;w<=pos;w++){
                             sum+=nums[w];                             
                         }
                         if(x<=sum){
                     
                             } else {
                                 diff=x-sum;
                     
                             }
                      
                     }      
                   
                   }
                for(int x=P;x>=0;x--){
                       
                    if(nums[x]==0&&x==0){
                        grace=1;
                       
                   }                    
                    if(nums[x]==0&&nums[x+1]!=0&&x!=0&&diff!=0){                        
                    peeps+=1;
                   break;                   
                }   
                }  
                   System.out.print(diff+peeps+grace);
               }        
            System.out.println();
            caseNo++;
        }
    }
}
