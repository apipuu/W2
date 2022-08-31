import java.util.Scanner;
public class Soal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		String str1,str2;
		str1= obj.nextLine();
		str2= obj.nextLine();
		
		System.out.println(str1.length() + str2.length());
		
		if(str1.charAt(0) < str2.charAt(0)) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
				
		}
		
		System.out.println(str1.substring(0, 1).toUpperCase() + str1.substring(1) 
		+ " " + str2.substring(0, 1).toUpperCase() + str2.substring(1));
	}

}
