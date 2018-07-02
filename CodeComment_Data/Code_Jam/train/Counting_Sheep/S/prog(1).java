package methodEmbedding.Counting_Sheep.S.LYD729;

import java.io.*;

import java.util.*;



class Solution {

  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    int t=sc.nextInt();

    int count,m,prevm;

    for(int i=0;i<t;i++)

    {

      int[] a=new int[10];

      int n=sc.nextInt();  

      count=0;

      m=0;

      prevm=0;

      for(int j=1;;j++){

        if(m==n*j)

          break;

        m=n*j;

        prevm=m;

        if(m==0){

          if(a[0]==0){

             count++;

             a[0]=1;

          }

          break;

        }  

        while(m>0){

          int r=m%10;

          if(a[r]==0){

            count++;

            a[r]=1;

          }

          m=m/10;

        }

        if(count==10)

          break;

      }

      System.out.println("Case #"+(i+1)+": "+((count==10)?prevm:"INSOMNIA"));

    }

  }

}
