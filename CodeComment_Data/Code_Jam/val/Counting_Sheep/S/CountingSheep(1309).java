package methodEmbedding.Counting_Sheep.S.LYD492;


import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc ;
		try{
			sc = new Scanner (new File("A-small-attempt1.in"));//////file name
			final Formatter f ;
			f = new Formatter("salma.out") ;
			while(sc.hasNext()){
				int t = sc.nextInt();
				for(int i=0 ; i<t ; i++){
					int x = sc.nextInt();
					if (x==0){f.format("Case #%d: INSOMNIA\n",i+1);}
					else{
						int count=0;
						boolean array[] = new boolean [10];
						int j;
						for(j=1 ; count<10 ; j++){
							int num = x*j;
							while (num!=0){
								if(array[num%10]==false){
									count++;
									array[num%10]=true;
								}
								num/=10;
							}
						}
						if (count==10){
							f.format("Case #%d: %d\n",i+1,x*(j-1));
							System.out.println(x*(j-1));
						}
					}
					
				}
			}
			f.close();
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
