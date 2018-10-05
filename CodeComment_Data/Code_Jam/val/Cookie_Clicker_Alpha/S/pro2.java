package methodEmbedding.Cookie_Clicker_Alpha.S.LYD146;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class pro2 {


        public static void main(String[] args) {
                BufferedReader br;
                BufferedWriter bw;
		StringTokenizer st;

		int T;
		double C, F, X;
		double val1, val2;
		double product;
		double time;
                try{
                        br = new BufferedReader(new InputStreamReader(System.in));
                        bw = new BufferedWriter(new OutputStreamWriter(System.out));

                        T = Integer.parseInt(br.readLine());
                        for(int i=0; i<T; i++){
				st = new StringTokenizer(br.readLine());
				C = Double.parseDouble(st.nextToken());
				F = Double.parseDouble(st.nextToken());
				X = Double.parseDouble(st.nextToken());

				product = 2;
				time = 0;

				while(true){
					val1 = X/product;
					val2 = C/product + X/(product+F);

					if( val1 <= val2 ){
						time += X/product;
						bw.write("Case #"+(i+1)+": "+time+"\n");
						break;
					}
					else{
						time += C/product;
						product += F;
					}
				}
                        }

	                br.close();
       			bw.close();
                }
                catch(Exception e){
                        ;
                }

        }
}
