package methodEmbedding.Counting_Sheep.S.LYD89;


import java.util.Scanner;

public class sheep {

	public static void main(String[] args) {
		int t, c = 0;
		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		while ((c++) < t) {
			int a[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, sum = 0, count = 2;
			int n, temp, temp1 = 0;
			n = in.nextInt();
			if (n == 0)
				System.out.println("Case #" + c + ": INSOMNIA");
			else {
				temp = n;
				while (temp != 0) {

					if (a[temp % 10] == 0) {
						a[temp % 10]++;
						sum += temp % 10;
						if (sum == 45 && a[0] == 1) {
							System.out.println("Case #" + c + ": " + temp1);
							temp = 0;
						}
					}

					temp = temp / 10;
					if (temp == 0)
						if (sum == 45 && a[0] == 1)
							break;
						else
							temp = temp1 = n * (count++);
				}
			}
		}

	}

}
