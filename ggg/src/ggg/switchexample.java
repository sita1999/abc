package ggg;

import java.util.Scanner;

public class switchexample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Choice 1");
			break;
		case 2:
			System.out.println("Choice 2");
			break;
		case 3:
			System.out.println("Choice 3");
			break;
		case 4:
			System.out.println("Choice 4");
			break;
			default:
				System.out.println("Deault");
		}
	}
}
