package methodEmbedding.Counting_Sheep.S.LYD148;


import java.util.Scanner;

/**
 *
 * @author Gagandeep Rangi
 */
public class Sheep {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        
        for(int i=0; i<cases; i++){
            int[] check = {1,2,3,4,5,6,7,8,9,0};
            int count =0;
            int temp = 0;
            int last=0;
            int no = in.nextInt();
            String noString = ""+no;
            
            if(no == 0){
                System.out.println("Case #1: INSOMNIA");
            }else{
                for(int k=0; k<noString.length(); k++){
                    for(int j=0; j<10; j++){
                        if(Integer.parseInt(""+noString.charAt(k)) == check[j]){
                            last = no;
                            check[j]= -1;
                            count++;
                        }
                    }
                }
                
                boolean f=true;
                 for(int l =1; l<1000000; l++){
                     temp = no*(l+1);
                     noString = ""+temp;
                     for(int k=0; k<noString.length(); k++){
                        for(int j=0; j<10; j++){
                            if(Integer.parseInt(""+noString.charAt(k)) == check[j]){
                                last = temp;
                                check[j]= -1;
                                count++;
                            }
                        }
                    }
                     if(count==10){
                               f=false;
                               break;
                            }
                 }
                 if(f == false){
                         System.out.println("Case #"+(i+1)+":"+" "+last);
                     }
            }
            
        }
    }
    
}
