package methodEmbedding.Standing_Ovation.S.LYD726;



import java.util.Scanner;


public class CodeJAM {

      public static void main(String[] args) {
        // TODO code application logic here
           String s;
           int slevel;
           int smax;
           int num;
           String smax1[] = new String[2];
           
           Scanner scan = new Scanner(System.in);
           Scanner sscan = new Scanner(System.in);
           num = scan.nextInt();
           int needed=0;
           int total;
           for( int i=0;i<num;i++){
               total =0;
               needed=0;
              smax = scan.nextInt();
              s = scan.nextLine();
              int substr[] = new int[smax+1];
              for(int j=1;j< smax+2;j++){
                  substr[j-1]=Integer.valueOf(s.substring(j, j+1));
              }
              int pp=0;
              for(int j=0;j<smax;j++){
                  total+= substr[j];
                  if(total < j+1){
                      needed= j+1 - total;
                       total+=needed;
                       pp+=needed;
                  }
              }
               System.out.println("Case #"+(i+1)+": "+pp);
           }
           
           
          
          
    }
    
}
