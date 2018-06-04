import java.util.Scanner;
public class Planina {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int iterations = input.nextInt();
		input.close();
		System.out.println(   (sidelength(iterations)+2)*(sidelength(iterations)+2)  );
	}
	public static int sidelength(int iterations) {
		if(iterations == 1) {
			return 1;
		}else {
			return 2*sidelength(iterations-1)+1;
		}
	}
}