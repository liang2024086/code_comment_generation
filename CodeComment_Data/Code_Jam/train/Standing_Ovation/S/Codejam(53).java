package methodEmbedding.Standing_Ovation.S.LYD283;



import java.util.Scanner;


public class Codejam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++){
            
            int maxshy = sc.nextInt();
            String str = sc.nextLine().trim();
            
            int[] arr = new int[maxshy+1];
            int tot = 0;
            for(int j=0; j<arr.length; j++){
                arr[j]= Integer.parseInt(str.substring(j, j+1));
                tot += arr[j];
              
            }
            
            int b = (maxshy - (tot - arr[maxshy])>0) ? maxshy - (tot - arr[maxshy]): 0;
            
            int temp = maxshy-1;
            while(temp >0){
                
                int tot2 = 0;
                for(int k=0; k<temp; k++){
                    tot2 += arr[k];
                }
                
               b += (temp - (tot2+b) > 0) ? temp -(tot2+b) : 0;
               
              temp--;
            }
            
            System.out.println("Case #"+(i+1)+": "+b);
            
            
        }
        
    }
    
}
