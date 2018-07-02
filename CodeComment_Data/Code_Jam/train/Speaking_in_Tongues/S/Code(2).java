package methodEmbedding.Speaking_in_Tongues.S.LYD614;

import java.io.*;

class Code {
	public static void main(String args[]) throws IOException {
		int inputCharAscii;
		int countCase = 49;
		FileInputStream fin;
		FileOutputStream fout;
		try {
			
			try {
				fin = new FileInputStream(args[0]);
			} catch (FileNotFoundException e) {
				System.out.println(e);
				return;
			}
			try {
				fout = new FileOutputStream(args[1]);
			} catch (FileNotFoundException e) {
				System.out.println(e);
				return;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			return;
		}
		try {
			do {
				inputCharAscii = fin.read();
				if (inputCharAscii != -1) {

					if ((inputCharAscii == 10)&&(countCase-48<31)) {
						fout.write(10);
						fout.write(67);
						fout.write(97);
						fout.write(115);
						fout.write(101);
						fout.write(32);
						fout.write(35);
						if(countCase<57){
						fout.write((countCase));
						}
						else{
							int unitDigit=(countCase-48)%10;
							int tenthsDigit=(countCase-48)/10;
							fout.write(tenthsDigit+48);
							fout.write(unitDigit+48);
						}
						fout.write(58);
						fout.write(32);
						countCase++;

					} else {

						if (inputCharAscii == (int)'a')
						{
							fout.write((int)'y');
						}
						else if (inputCharAscii == (int)'b')
						{
							fout.write((int)'h');
						}
						
						else if (inputCharAscii == (int)'c')
						{
							fout.write((int)'e');
						}
						else if (inputCharAscii == (int)'d')
						{
							fout.write((int)'s');
						}
						else if (inputCharAscii == (int)'e')
						{
							fout.write((int)'o');
						}
						else if (inputCharAscii == (int)'f')
						{
							fout.write((int)'c');
						}
						else if (inputCharAscii == (int)'g')
						{
							fout.write((int)'v');
						}
						else if (inputCharAscii == (int)'h')
						{
							fout.write((int)'x');
						}
						else if (inputCharAscii == (int)'i')
						{
							fout.write((int)'d');
						}
						else if (inputCharAscii == (int)'j')
						{
							fout.write((int)'u');
						}
						else if (inputCharAscii == (int)'k')
						{
							fout.write((int)'i');
						}
						else if (inputCharAscii == (int)'l')
						{
							fout.write((int)'g');
						}
						else if (inputCharAscii == (int)'m')
						{
							fout.write((int)'l');
						}
						else if (inputCharAscii == (int)'n')
						{
							fout.write((int)'b');
						}
						else if (inputCharAscii == (int)'o')
						{
							fout.write((int)'k');
						}
						else if (inputCharAscii == (int)'p')
						{
							fout.write((int)'r');
						}
						else if (inputCharAscii == (int)'q')
						{
							fout.write((int)'z');
						}
						else if (inputCharAscii == (int)'r')
						{
							fout.write((int)'t');
						}
						else if (inputCharAscii == (int)'s')
						{
							fout.write((int)'n');
						}
						else if (inputCharAscii == (int)'t')
						{
							fout.write((int)'w');
						}
						else if (inputCharAscii == (int)'u')
						{
							fout.write((int)'j');
						}
						else if (inputCharAscii == (int)'v')
						{
							fout.write((int)'p');
						}
						else if (inputCharAscii == (int)'w')
						{
							fout.write((int)'f');
						}
						else if (inputCharAscii == (int)'x')
						{
							fout.write((int)'m');
						}
						else if (inputCharAscii == (int)'y')
						{
							fout.write((int)'a');
						}
						else if (inputCharAscii == (int)'z')
						{
							fout.write((int)'q');
						}
						else if (inputCharAscii >47 && inputCharAscii<58)
						{
							
						}
						
					else{
							fout.write(inputCharAscii);
					}
					}
				}
			} while (inputCharAscii != -1);
		} catch (IOException e) {
			System.out.println(e);
		}
		fin.close();
		fout.close();
	}
}
