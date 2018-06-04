import java.util.Scanner;
public class Autori {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String x = input.nextLine();
		String output = x.substring(0, 1);
		for(int i = 0; i < x.length(); i++) {
			if(x.substring(i, i+1).equals("-") ) {
				output += x.substring(i+1, i+2);
			}
		}
		input.close();
		System.out.println(output);
	}
}
