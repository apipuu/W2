import java.io.IOException;
import java.util.Scanner;

/**
 * <h1>Add Two Numbers!</h1>
 * The AddNum program implements an application that
 * simply adds two given integer numbers and Prints
 * the output on the screen.
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it
 * user friendly and it is assumed as a high quality code.
 * 
 * @author Afif Lutfianto
 * @version 1.0
 * @since 2022-08-29
 */

public class soal1 {

	public static void checked(String[] number) {
		// TODO Auto-generated method stub
		for(String num:number) {
			try {
				long x = Long.parseLong(num);
				System.out.println(x+" can be fitted in : ");
				if((Byte.MIN_VALUE <= x)& (x <= Byte.MAX_VALUE)) {
					System.out.println("* byte");
				}
				if((Short.MIN_VALUE <= x) & (x <= Short.MAX_VALUE)) {
					System.out.println("* short");
				}
				if((Integer.MIN_VALUE <= x) & (x <= Integer.MAX_VALUE)) {
					System.out.println("* int");
				}
				if((Long.MIN_VALUE <= x) & (x <= Long.MAX_VALUE)) {
					System.out.println("* long");
				}
			} catch (NumberFormatException e) {
				System.out.println(num + "can't be fitted anywhere.");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner myObj =  new Scanner(System.in);
		String[] number = new String[myObj.nextInt()];
		myObj.nextLine();
		for (int i=0; i < number.length; i++) {
			number[i] = myObj.nextLine();
		}
		myObj.close();
		checked(number);
	}

}
