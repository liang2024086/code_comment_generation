package methodEmbedding.Magic_Trick.S.LYD959;


import utils.FileTools;

public class Qualification2014A1 {
	public static void main(String[] args) {
		try {
			FileTools ft = new FileTools("A-small-attempt0.in");
			int T = Integer.parseInt(ft.in.readLine());
			String line;

			for (int i = 0; i < T; i++) {
				int answer1=Integer.parseInt(ft.in.readLine());
				int tmp1=answer1;
				while (tmp1>1){
					ft.in.readLine();
					tmp1--;
				}
				String line1=ft.in.readLine();
				tmp1=4-answer1;
				while(tmp1>0){
					ft.in.readLine();
					tmp1--;
				}

				int answer2=Integer.parseInt(ft.in.readLine());
				int tmp2=answer2;
				while (tmp2>1){
					ft.in.readLine();
					tmp2--;
				}
				String line2=ft.in.readLine();
				tmp2=4-answer2;
				while(tmp2>0){
					ft.in.readLine();
					tmp2--;
				}
				String[] cards1=line1.split(" ");
				String[] cards2=line2.split(" ");
				int samecard=0;
				String card="";
				for (String x:cards1){
					for(String y:cards2){
						if(x.equals(y)){
							samecard++;
							card=x;
							break;
						}
					}
				}
				String res="";
				if(samecard==0){
					res="Volunteer cheated!";
				}else if(samecard==1){
					res=card;
				}else{
					res="Bad magician!";
				}
				ft.out.write("Case #" + (i + 1) + ": " + res);

				System.out.println("Case #" + (i + 1) + ": " + res);
				ft.out.newLine();
//				ft.in.readLine();
			}

			ft.out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
