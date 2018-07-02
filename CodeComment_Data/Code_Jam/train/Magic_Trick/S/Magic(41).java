package methodEmbedding.Magic_Trick.S.LYD1507;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Magic {
	public static void main (String[] args){
		Parser p = new Parser();
		BufferedWriter writer = null;
		File file = new File("res/output");
		 
		// if file doesnt exists, then create it
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			writer = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int c = p.getCase();
		for(int i = 0; i<c;i++){
			String[] a = p.getCards();
			String[] b = p.getCards();
			int r = p.compareCards(a, b);
			if(r==1){
				String result = String.format("Case #%d: %d", i+1, p.myCard());
				try {
					writer.write(result);
					writer.newLine();
					System.out.println(result);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if(r==0){
				String result = String.format("Case #%d: Volunteer cheated!", i+1);
				try {
					writer.write(result);
					writer.newLine();
					System.out.println(result);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				String result = String.format("Case #%d: Bad magician!", i+1);
				try {
					writer.write(result);
					writer.newLine();
					System.out.println(result);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		p.Close();
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
