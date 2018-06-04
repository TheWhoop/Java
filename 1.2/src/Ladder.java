import java.util.Scanner;
public class Ladder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int h = input.nextInt();
		int v  = input.nextInt();
		double vRadians = (v*Math.PI)/180;
		input.close();
		System.out.println( (int)( h/Math.sin(vRadians) )+1	);
	}
}