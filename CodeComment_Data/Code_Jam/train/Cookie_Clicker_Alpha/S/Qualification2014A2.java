package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1625;


import java.text.DecimalFormat;

import utils.FileTools;

public class Qualification2014A2 {
	public static void main(String[] args) {
		try {
			FileTools ft = new FileTools("B-small-attempt0.in");
			int T = Integer.parseInt(ft.in.readLine());
			String line;

			for (int i = 0; i < T; i++) {
				line=ft.in.readLine();
				
				String[] l=line.split(" ");
				Double c=Double.parseDouble(l[0]);
				Double f=Double.parseDouble(l[1]);
				Double x=Double.parseDouble(l[2]);
				Integer farm=Double.valueOf(x/c-2/f).intValue();
				Double totaltime=0.0;
				for(int j=0;j<farm;j++){
					totaltime+=c/(j*f+2);
				}
				if(farm<0){
					farm=0;
				}
				totaltime+=x/(farm*f+2);
				DecimalFormat df = new DecimalFormat("#.0000000");
				ft.out.write("Case #" + (i + 1) + ": "+df.format(totaltime) );

				System.out.println("Case #" + (i + 1) + ": "+df.format(totaltime));
				ft.out.newLine();
//				ft.in.readLine();
			}

			ft.out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
