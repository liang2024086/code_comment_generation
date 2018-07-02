package methodEmbedding.Standing_Ovation.S.LYD1773;


import java.io.*;
public class Standing_Ovation {
    public static void main(String[] args) throws Exception {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
          String s[]=br.readLine().split(" ");
          int sm=Integer.parseInt(s[0]),c=0,w=0;
          for (int j=0;j<s[1].length();j++){
              int x=Character.getNumericValue(s[1].charAt(j));
                 if((j>c) && (x!=0)){
                     w=w+j-c;
                     c=c+w;
                 }
              c=c+x; 
          }
            System.out.println("Case #"+(i+1)+": "+w);
        }
    }    
}
