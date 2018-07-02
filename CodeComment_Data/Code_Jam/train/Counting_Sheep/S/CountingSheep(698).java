package methodEmbedding.Counting_Sheep.S.LYD214;


import java.io.*;

public class CountingSheep {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new FileReader("src/A-small-attempt1.in"));
		int testCases = Integer.parseInt(reader.readLine());
		String thisLine = null;
		int j = 1;
		BufferedWriter bw = new BufferedWriter(new FileWriter("src/out.txt"));
		while ((thisLine = reader.readLine()) != null) {
			long N = Integer.parseInt(thisLine);
			long number = 0;
			boolean N1 = false;
			boolean N2 = false;
			boolean N3 = false;
			boolean N4 = false;
			boolean N5 = false;
			boolean N6 = false;
			boolean N7 = false;
			boolean N8 = false;
			boolean N9 = false;
			boolean N0 = false;
			String towrite = null;
			int i=1;
			for(i=1;i<100000;i++){
				if(N1 && N2 && N3 && N4 && N5 && N6 && N7 && N8 && N9 && N0){
					break;
				}
				else{
					number = i*N;
					long temp = number;
					while(temp > 0){
						long num = temp%10;
						if(num == 1){
							N1=true;
						} else if(num == 2){
							N2=true;
						} else if(num == 3){
							N3=true;
						} else if(num == 4){
							N4=true;
						} else if(num == 5){
							N5=true;
						} else if(num == 6){
							N6=true;
						} else if(num == 7){
							N7=true;
						} else if(num == 8){
							N8=true;
						} else if(num == 9){
							N9=true;
						} else if(num == 0){
							N0=true;
						}
						temp=temp/10;
					}
				}
			}
			if(i<100000){
				towrite = ("case #"+j+": "+number);
			} else{
				towrite = ("case #"+j+": INSOMNIA");
			}
			j++;
			  bw.write(towrite);
			  bw.newLine();
		}
		bw.close();
	}
}
