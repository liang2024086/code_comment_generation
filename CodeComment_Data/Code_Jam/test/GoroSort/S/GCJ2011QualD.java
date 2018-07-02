package method_all.GoroSort.S.LYD99;

import java.util.*;


public class GCJ2011QualD{
public  static void main(String args[]){

  Scanner s = new Scanner(System.in);
  int t = s.nextInt();

 for(int mon=1;mon<=t; mon++){
  int n = s.nextInt();
   int ans = 0;
   for(int i=1;i<=n;i++){
    if(s.nextInt()!=i) ans+=1;
   }
   System.out.println("Case #"+ mon+": "+ans);
 }

 }
}

