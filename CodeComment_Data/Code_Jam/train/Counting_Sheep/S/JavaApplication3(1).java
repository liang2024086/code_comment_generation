package methodEmbedding.Counting_Sheep.S.LYD1657;



import java.util.Scanner;

public class JavaApplication3 {

        public static void main(String[] args) {
           

   
        Scanner in = new Scanner(System.in);
   int T = in.nextInt();
   
   for(int i=0;i<T;i++){
       int a[]=new int[10];
       int N=in.nextInt();
       
       boolean flag=true;
       if(N==0){
            System.out.println("Case #"+(i+1)+":"+"INSOMNIA");
            continue;
       }
       String s1="";
       int n1=N,n2;
       int h=1;
       while(true){
           n1=N;
        n1*=h;
        n2=n1;
        
           while(n1!=0){
                int g=n1%10;
                s1=s1+g;
                n1=n1/10;
                
           }
           if(s1.contains("0")&&s1.contains("1")&&s1.contains("2")&&s1.contains("3")&&s1.contains("4")&&s1.contains("5")&&s1.contains("6")&&s1.contains("7")&&s1.contains("8")&&s1.contains("9")){
              
               break;
           }
           h++;
       }
       System.out.println("Case #"+(i+1)+":"+n2);
   }
    
}
}
