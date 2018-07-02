package methodEmbedding.Cookie_Clicker_Alpha.S.LYD785;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		try{
			BufferedReader fileReader = new BufferedReader(new FileReader(new File(path + "/input" )));
			int noOfCases = Integer.parseInt(fileReader.readLine().trim());
			for(int i =1; i<=noOfCases; i++){
				String[] lines = fileReader.readLine().trim().split(" ");
				double C = Double.parseDouble(lines[0]);
				double F = Double.parseDouble(lines[1]);
				double X = Double.parseDouble(lines[2]);
				final double remainingX = X;
				double doneTime = 0;
				for(int n=0;true;n++){
					double xequator =  C*(2+F*n+F)/F;
					double xn;
					boolean success = false;
					if(remainingX <= xequator){
						xn = remainingX;
						success = true;
					} else{
						xn = C;
					}
					doneTime += xn/(2+(F*n));
					if(success)
						break;
				}
				System.out.println("Case #"+i+": "+ doneTime);
			}
		} catch (Exception e) {

		}
	}
}

