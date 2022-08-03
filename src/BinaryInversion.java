import java.util.Scanner;

public class BinaryInversion {

	public static void main(String[] args) {
		System.out.print("Enter a number between 0 and 127");
		Scanner input = new Scanner(System.in);
		int b = input.nextByte();

		//close Scanner object
		input.close();
	}

	private static String getBinary( int n) {
		String s = Integer.toBinaryString(n);


		return s;
	}

	public static int binaryInvert(int b) {
		int r = 0;

		return r;
	}
}
