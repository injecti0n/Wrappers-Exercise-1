package wrappers;

import java.util.Scanner;

public class wrapApp {

	public static void main(String[] args) {
		
				
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.next();
		int i = Integer.parseInt(input);
		Integer integerObject = new Integer(i);
		integerObject +=5;
		System.out.println(integerObject.SIZE);
		System.out.println(integerObject.BYTES);


	}

}
