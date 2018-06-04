import java.util.Scanner;
public class Faktor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int f  = input.nextInt();
		input.close();
		System.out.println( a*(f-1)+1 );
	}
}