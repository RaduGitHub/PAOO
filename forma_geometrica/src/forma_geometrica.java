import forma_geometrica.*;
import java.io.*;
//import java.io.IOException;
//import java.util.Scanner;
//import java.io.IOException;
//import java.io.PrintWriter;

public class forma_geometrica {
	public static void main(String[] args) {
		File file = new File("src\\forma_geometrica\\input.txt");

		Double x1, x2, x3, x4;
		Double y1, y2, y3, y4;
		Double raza;

		forma[] arr = new forma[4];

		// Scanner input = new Scanner(file);
		Reader cititor;
		BufferedReader br = null;

		try {
			cititor = new FileReader(file);
			br = new BufferedReader(cititor);
		} catch (IOException ex) {
			System.out.println("Error");
		}
		try {
		x1 = Double.parseDouble(br.readLine());
		y1 = Double.parseDouble(br.readLine());
		x2 = Double.parseDouble(br.readLine());
		y2 = Double.parseDouble(br.readLine());
		x3 = Double.parseDouble(br.readLine());
		y3 = Double.parseDouble(br.readLine());
		x4 = Double.parseDouble(br.readLine());
		y4 = Double.parseDouble(br.readLine());
		arr[0] = new dreptunghi(x1, y1, x2, y2, x3, y3, x4, y4);

		x1 = Double.parseDouble(br.readLine());
		y1 = Double.parseDouble(br.readLine());
		raza = Double.parseDouble(br.readLine());
		arr[1] = new cerc(x1, y1, raza);

		x1 = Double.parseDouble(br.readLine());
		y1 = Double.parseDouble(br.readLine());
		x2 = Double.parseDouble(br.readLine());
		y2 = Double.parseDouble(br.readLine());
		x3 = Double.parseDouble(br.readLine());
		y3 = Double.parseDouble(br.readLine());
		x4 = Double.parseDouble(br.readLine());
		y4 = Double.parseDouble(br.readLine());
		arr[2] = new patrat(x1, y1, x2, y2, x3, y3, x4, y4);

		x1 = Double.parseDouble(br.readLine());
		y1 = Double.parseDouble(br.readLine());
		x2 = Double.parseDouble(br.readLine());
		y2 = Double.parseDouble(br.readLine());
		x3 = Double.parseDouble(br.readLine());
		y3 = Double.parseDouble(br.readLine());
		x4 = Double.parseDouble(br.readLine());
		y4 = Double.parseDouble(br.readLine());
		arr[3] = new patrat(x1, y1, x2, y2, x3, y3, x4, y4);
		}catch(IOException ex) {
			System.out.println("Error");
		}
		// System.out.println(arr[0].arie());
		for (int i = 0; i < 4; i++) {
			double distanta = arr[i].arie();
			System.out.println(distanta);
			distanta = arr[i].perimetru();
			System.out.println(distanta);
		}
	}
}
