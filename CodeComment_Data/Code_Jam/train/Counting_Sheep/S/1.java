package methodEmbedding.Counting_Sheep.S.LYD311;

import java.util.Scanner;
  
  
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cases = sc.nextInt();
        
        for(int i=0;i<cases;i++)
        {
        	int[] check = new int[10];
           	int input=sc.nextInt();
       		int input2=input;
       		int log10=10;

       		while(input2!=0){
       			input2=input2/10;
       			log10=10*log10;
       		}

			input2=input;
			
			int check2=10;

			System.out.println("input before::: "+input);
			System.out.println("input2 before::: "+input2);

			for(int j=0;check2!=0;j++){

				input2=(j+1)*input;

					while (input2 > 0) {
						int index=input2%10;
			  			check[index]+=1;
			   			input2 = input2 / 10;
					}
				
					for(int k=0;k<10;k++){
						if(check[k]>0)
						{
							check2=check2-1;;
						}
					}
					//?????? ???????????? ??????????????? ???????????? ??????
				if(check2==0){
				System.out.println("Case #"+i+": "+(j+1)*input);
				break;
				}
				check2=10;
				
				if(j>=log10){
					System.out.println("INSOMNIA");
					break;
				}
			}
			System.out.println("input after::: "+input);
			System.out.println("input2 after::: "+input2);

		}
   }
}
