package methodEmbedding.Standing_Ovation.S.LYD1998;

import java.util.*;
public class Main {
public static void main(String [] args){
         Scanner in=new Scanner(System.in);
         int t=in.nextInt();
         StringBuilder sb=new StringBuilder();
         for(int test=1;test<=t;test++){
         int smax=in.nextInt();
         String str=in.next();
         long check=str.charAt(0)-48;
         long ans=0;
         for(int i=1;i<str.length();i++){
         	if(check < i){
         		ans+=i-check;
         		check+=i-check;
         }
         check+=str.charAt(i)-48;
         }
         
         sb.append("Case #" + test+": "+ans);
         sb.append('\n');
}
System.out.print(sb);
}
}
