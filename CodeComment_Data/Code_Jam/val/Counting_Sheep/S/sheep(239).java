package methodEmbedding.Counting_Sheep.S.LYD1050;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Sagar Bhatt
 */
public class sheep {
    
    public static void main(String[] args)throws IOException{
        
    int t;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    t=Integer.parseInt(br.readLine());
    int caseNo = 1;
    while(t!=0){
    int i=2;
    String N,n;
    String ans="INSOMNIA";
    n=br.readLine();
    N=n;
    boolean flag=true;
    //tracking visited number between 0 to 9
    int seen[] =new int[10];
    Arrays.fill(seen,0);
    //System.err.println("seenInitial"+Arrays.toString(seen));
    if(Integer.parseInt(n)==0){
    
        ans="INSOMNIA";
    }else{
    
    while(flag){
    
    
   for(int k=0;k<n.length();k++){
   
        int index=Character.getNumericValue(n.charAt(k));
    //    System.err.println("index"+index);
        seen[index]=1;
   }    
   // System.err.println("seen"+Arrays.toString(seen));
   int tempSeen[]=new int[10];
   System.arraycopy(seen, 0, tempSeen, 0, seen.length);
   Arrays.sort(tempSeen);
    //    System.err.println("seen"+Arrays.toString(seen));    
    //    System.err.print("tempSeen"+Arrays.toString(tempSeen));
   if(tempSeen[0]==0){
   
   int temp=Integer.parseInt(N)*i;
   n=String.valueOf(temp);
   //    System.err.println("n"+n);
   i++;
   }else{
   flag=false;
   
   
   }
    
    
    
    
    }
    ans=n;
    }
        System.out.println("Case #"+caseNo+": "+ans);
        caseNo++;
    t--;
    }
    
    }

}
