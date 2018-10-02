package methodEmbedding.Revenge_of_the_Pancakes.S.LYD649;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




class Main {
    public static void main(String args[]) throws IOException{


        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


        int T=Integer.parseInt(br.readLine());


        for(int i=0; i<T; i++){

		char[] input = br.readLine().toCharArray();


		int flips = 0;


		char lastChar = input[input.length-1];
		if(lastChar == '-') flips++;
		for(int j=input.length-2; j>=0; j--){
			if(input[j] != lastChar ){

				lastChar = input[j];

				flips++;
	
		}

		}
	        System.out.println("Case #"+(i+1)+": " + flips);


	 }


    }
}
