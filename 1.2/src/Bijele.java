import java.util.Scanner;
public class Bijele {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		int q = input.nextInt();
		int r = input.nextInt();
		int b = input.nextInt();
		int kn = input.nextInt();
		int p = input.nextInt();
		input.close();
		System.out.print( 1-k  +" " );
		System.out.print( 1-q  +" " );
		System.out.print( 2-r  +" " );
		System.out.print( 2-b  +" " );
		System.out.print( 2-kn +" " );
		System.out.print( 8-p  +" " );
	}
}
